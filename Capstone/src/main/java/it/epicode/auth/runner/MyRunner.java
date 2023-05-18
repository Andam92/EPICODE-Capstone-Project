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
		Videogioco God_of_War = config.creaVideogioco("God of War", "https://drive.google.com/u/0/uc?id=1LhTcPJ-K9Fetro3gIPwAQpwiETgzjTgk", Categoria.NARRATIVO, "PlayStation", "SantaMonica",
				LocalDate.of(2022, 1, 14), 59.99);
		Videogioco Spider_Man = config.creaVideogioco("Marvel's Spider-Man", "https://drive.google.com/u/0/uc?id=14cr4fD05jAWM3ISVsP5p-4-c8HdCjEBK", Categoria.AZIONE, "PlayStation",
				"InsomniacGames", LocalDate.of(2022, 8, 12), 59.99);
		Videogioco Deep_Rock_Galactic = config.creaVideogioco("Deep Rock Galactic", "https://drive.google.com/u/0/uc?id=1WHlTQAICu4Ge7WBHbPYNpjfO53-2DXdr", Categoria.FPS,
				"Coffee Stain Publishing", "Ghost Ship Games", LocalDate.of(2020, 05, 13), 29.99);
		Videogioco Total_War_Warhammer_3 = config.creaVideogioco("Total War: WARHAMMER III", "https://drive.google.com/u/0/uc?id=1kxCpUR1Rl7KwgFDn1V3bs3YmTMf6nJLZ", Categoria.STRATEGIA,
				"SEGA", "Creative Assembly", LocalDate.of(2022, 2, 17), 59.99);
		Videogioco Among_Us = config.creaVideogioco("Among Us", "https://drive.google.com/u/0/uc?id=1jPu6damkHYGoHuMaXlTfEYP-qOv99816", Categoria.MULTIPLAYER, "Innersloth", "Innersloth",
				LocalDate.of(2018, 11, 16), 4.49);
		Videogioco The_Last_of_Us = config.creaVideogioco("The Last of Us", "https://drive.google.com/u/0/uc?id=1Wqp257Af3BfMt56KpVf5mq8tXJdD3NHT", Categoria.NARRATIVO, "PlayStation", "Naughty Dog",
				LocalDate.of(2023, 3, 28), 59.99);
		Videogioco NBA_2K23 = config.creaVideogioco("NBA 2K23", "https://drive.google.com/u/0/uc?id=1cM9Mg9o8JT6Un52F_UFP2kbMpuSkHcWA", Categoria.SPORT, "2K", "Visual Concepts",
				LocalDate.of(2022, 9, 8), 59.99);
		Videogioco Mount_Blade_Bannerlord = config.creaVideogioco("Mount&Blade: Bannerlord", "https://drive.google.com/u/0/uc?id=1AN4m5qNIYmomIvNbiGi-f23TOieV0mxM", Categoria.RPG, "TaleWorlds Entertainment", "TaleWorlds Entertainment",
				LocalDate.of(2022, 10, 25), 49.99);
		Videogioco Outer_Wilds = config.creaVideogioco("Outer Wilds", "https://drive.google.com/u/0/uc?id=1ihX2NbsYCzaJCnPqllHyG_pUaeND6TxC", Categoria.NARRATIVO, "Annapurna", "Mobius Digital",
				LocalDate.of(2020, 6, 18), 22.99);
		Videogioco Kingdom_Come = config.creaVideogioco("Kingdome Come", "https://drive.google.com/u/0/uc?id=1Sn2a_Q4wTHxO00jkuhODG8OmdkXd4kKg", Categoria.RPG, "Warhorse Studios", "Warhorse Studios ",
				LocalDate.of(2018, 2, 18), 29.99);
		
		
		

		// Salvo nel db		
		if(service.findAll().size() == 0) {			
			service.addVideogioco(God_of_War);
			service.addVideogioco(Spider_Man);
			service.addVideogioco(Deep_Rock_Galactic);
			service.addVideogioco(Total_War_Warhammer_3);
			service.addVideogioco(Among_Us);
			service.addVideogioco(The_Last_of_Us);
			service.addVideogioco(NBA_2K23);
			service.addVideogioco(Mount_Blade_Bannerlord);
			service.addVideogioco(Outer_Wilds);
			service.addVideogioco(Kingdom_Come);
		}
		
	}
	
	
		
	

}
