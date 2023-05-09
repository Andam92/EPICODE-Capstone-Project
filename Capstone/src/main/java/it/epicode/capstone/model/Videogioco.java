package it.epicode.capstone.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "videogiochi")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Videogioco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titolo;
	private Categoria categoria;
	private String editore;
	private String casaProduzione;
	LocalDate dataPubblicazione;
	Double prezzo;

}
