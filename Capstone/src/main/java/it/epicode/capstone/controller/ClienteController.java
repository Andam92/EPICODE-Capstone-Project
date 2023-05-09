package it.epicode.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.auth.entity.User;
import it.epicode.capstone.service.UserService;

@RestController
@RequestMapping("/clienti")
public class ClienteController {
	
	@Autowired UserService service;
	
	@GetMapping
	public ResponseEntity<?> listaClienti(){
		try {
			return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping
	public ResponseEntity<?> salvaCliente(User c){
		try {
			return new ResponseEntity<User>(service.salvaCliente(c), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
}
