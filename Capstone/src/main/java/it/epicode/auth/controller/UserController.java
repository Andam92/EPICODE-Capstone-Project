package it.epicode.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.service.UserService;

@RestController
@RequestMapping("/checkout")
public class UserController {
	
	@Autowired UserService service;
	
	@PostMapping("/{id}/buy")
	public ResponseEntity<?> addToLibrary(@PathVariable Long id, @RequestBody List<Videogioco> carrello){
		try {
			return new ResponseEntity<>(service.addVideogiocoToList(carrello, id), HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
