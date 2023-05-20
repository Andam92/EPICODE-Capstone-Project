package it.epicode.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.auth.entity.User;
import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.repository.UserRepository;
import it.epicode.auth.repository.VideogiocoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired UserRepository userRepo;
	@Autowired VideogiocoRepository videogiocoRepo;
	
	public Videogioco addVideogiocoToList(Videogioco vg, Long id){
		User u = userRepo.findById(id).get();
		u.getLibreriaPersonale().add(vg);
		userRepo.save(u);
		return vg;		
	}
	
	public List<User> findAll(){
		if(userRepo.findAll().size() > 0) {
			return userRepo.findAll();
		} else {
			System.out.println("Lista utenti vuota!");
		}
		return null;
	}
	
	public User findByUsername(String username) {
		if(!userRepo.existsByUsername(username)) {
			throw new EntityNotFoundException("Nessun utente con questo username");
			} 				
			 return userRepo.findByUsername(username).get();
			}
	}

