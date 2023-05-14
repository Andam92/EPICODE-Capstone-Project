package it.epicode.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.repository.VideogiocoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class VideogiocoService {
	
	@Autowired VideogiocoRepository repo;
	
	public String addVideogioco(Videogioco v) {
		repo.save(v);
		return "Videogioco aggiunto al DB";
	}
	
	public List<Videogioco> findAll(){
		if(repo.findAll().size() == 0) {
			throw new EntityNotFoundException("Lista vuota");
		} else return repo.findAll();
	}
	
	public String deleteVideogiocoByID(Videogioco v) {
		if (repo.existsById(v.getId())){
			repo.deleteById(v.getId());
			return "Videogioco cancellato dal db";
		} else {
			throw new EntityNotFoundException();
		} 
	}
}
