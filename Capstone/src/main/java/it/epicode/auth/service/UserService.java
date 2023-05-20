package it.epicode.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.auth.entity.User;
import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.repository.UserRepository;
import it.epicode.auth.repository.VideogiocoRepository;

@Service
public class UserService {
	
	@Autowired UserRepository userRepo;
	@Autowired VideogiocoRepository videogiocoRepo;
	
	public List<Videogioco> addVideogiocoToList(List<Videogioco> carrello, Long id){
		User u = userRepo.findById(id).get();
		u.getLibreriaPersonale().addAll(carrello);
		userRepo.save(u);
		return carrello;
		
	}

}
