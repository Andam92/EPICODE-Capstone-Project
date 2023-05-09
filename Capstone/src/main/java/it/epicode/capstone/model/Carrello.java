package it.epicode.capstone.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carrello")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Carrello {
	
	@OneToOne
	Cliente cliente;
	@OneToMany(cascade = CascadeType.ALL)
	List<Videogioco> acquisti;

}
