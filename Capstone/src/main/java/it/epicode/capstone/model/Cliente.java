package it.epicode.capstone.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clienti")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Cliente {
	
	private String username;
	private String password;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<Videogioco> libreriaPersonale;
	@OneToOne(cascade = CascadeType.ALL)
	Carrello carrello;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<Fattura> listaFatture;

}
