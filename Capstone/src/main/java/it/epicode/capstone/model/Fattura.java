package it.epicode.capstone.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fatture")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Fattura {
	
	LocalDate dataAcquisto;
	@ManyToOne
	Cliente cliente;
	Carrello carrello;

}
