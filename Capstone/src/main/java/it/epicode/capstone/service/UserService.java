package it.epicode.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.auth.entity.User;
import it.epicode.capstone.repository.UserRepo;
import jakarta.persistence.EntityExistsException;

@Service
public class UserService {
	
	@Autowired UserRepo repo;
	
	public User salvaCliente(User u) {
		if(!repo.existsByEmail(u.getEmail())) {			
			repo.save(u);
			System.out.println("Cliente salvato nel DB");
			return u;
		} else {
			throw new EntityExistsException("Email già esistente, inserire un'altra email!");
		}
		
	}
	
	public List<User> getAll(){
		return repo.findAll();
	}

}
