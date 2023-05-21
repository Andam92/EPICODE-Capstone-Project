package it.epicode.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.service.UserService;

@RestController
@RequestMapping("/pippo")
@CrossOrigin(origins = "*", maxAge = 3600)
public class NewController {
	
	@Autowired UserService userService;
	
	 @PostMapping("/add-one/{id}")
	 @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
		public ResponseEntity<?> addToLibrary(@PathVariable Long id, @RequestBody Videogioco vg){
			try {
				return new ResponseEntity<>(userService.addVideogiocoSingolo(vg, id), HttpStatus.OK);
				
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}

}
