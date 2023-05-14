package it.epicode.auth.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.epicode.auth.configuration.VideogiocoConfig;
import it.epicode.auth.entity.Categoria;
import it.epicode.auth.entity.Videogioco;
import it.epicode.auth.service.VideogiocoService;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	VideogiocoConfig config;
	@Autowired
	VideogiocoService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Creo videogiochi
		Videogioco God_of_War = config.creaVideogioco("God of War", "https://drive.google.com/file/d/1Z9EDmj_HDxH5phPDWpnK9nbqY292_q86/view?usp=share_link", Categoria.NARRATIVO, "PlayStation", "SantaMonica",
				LocalDate.of(2022, 01, 14), 59.99);
		Videogioco Spider_Man = config.creaVideogioco("Marvel's Spider-Man", null, Categoria.AZIONE, "PlayStation",
				"InsomniacGames", LocalDate.of(2022, 8, 12), 59.99);
		Videogioco Deep_Rock_Galactic = config.creaVideogioco("Deep Rock Galactic", null, Categoria.FPS,
				"Coffee Stain Publishing", "Ghost Ship Games", LocalDate.of(2020, 05, 13), 29.99);
		Videogioco Total_War_Warhammer_3 = config.creaVideogioco("Total War: WARHAMMER III", null, Categoria.STRATEGIA,
				"SEGA", "Creative Assembly", LocalDate.of(2022, 02, 17), 59.99);
		Videogioco Among_Us = config.creaVideogioco("Among Us", null, Categoria.MULTIPLAYER, "Innersloth", "Innersloth",
				LocalDate.of(2018, 11, 16), 4.49);

		// Salvo nel db
	service.addVideogioco(God_of_War);
	service.addVideogioco(Spider_Man);
	service.addVideogioco(Deep_Rock_Galactic);
	service.addVideogioco(Total_War_Warhammer_3);
	service.addVideogioco(Among_Us);

		// Elimino
		// service.deleteVideogioco(v);
	}

}
