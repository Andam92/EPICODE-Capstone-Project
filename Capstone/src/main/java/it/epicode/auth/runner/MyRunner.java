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
		Videogioco God_of_War = config.creaVideogioco("God of War",
				"https://drive.google.com/u/0/uc?id=1LhTcPJ-K9Fetro3gIPwAQpwiETgzjTgk", Categoria.NARRATIVO,
				"PlayStation", "SantaMonica", LocalDate.of(2022, 1, 14), 59.99, "Lasciatosi alle spalle la sua sete di vendetta verso gli dèi dell'Olimpo, Kratos ora vive nella terra delle divinità e dei mostri norreni. È in questo mondo ostile e spietato che dovrà combattere per la sopravvivenza e insegnare a suo figlio a fare lo stesso.");
		
		Videogioco Spider_Man = config.creaVideogioco("Marvel's Spider-Man",
				"https://drive.google.com/u/0/uc?id=14cr4fD05jAWM3ISVsP5p-4-c8HdCjEBK", Categoria.AZIONE, "PlayStation",
				"InsomniacGames", LocalDate.of(2022, 8, 12), 59.99, "La vita di Peter Parker e quella di Spider-Man entrano in collisione in una storia originale. Gioca nel ruolo di un Peter Parker ormai esperto, impegnato a combattere i supercriminali della New York Marvel. Lanciati attraverso quartieri colmi di vita sconfiggendo i nemici con eliminazioni epiche.");
		
		Videogioco Deep_Rock_Galactic = config.creaVideogioco("Deep Rock Galactic",
				"https://drive.google.com/u/0/uc?id=1WHlTQAICu4Ge7WBHbPYNpjfO53-2DXdr", Categoria.FPS,
				"Coffee Stain Publishing", "Ghost Ship Games", LocalDate.of(2020, 05, 13), 29.99, "Deep Rock Galactic è un FPS fantascientifico cooperativo con tostissimi nani spaziali, ambienti distruttibili al 100%, grotte generate proceduralmente e orde infinite di mostri alieni.");
		
		Videogioco Total_War_Warhammer_3 = config.creaVideogioco("Total War: WARHAMMER III",
				"https://drive.google.com/u/0/uc?id=1kxCpUR1Rl7KwgFDn1V3bs3YmTMf6nJLZ", Categoria.STRATEGIA, "SEGA",
				"Creative Assembly", LocalDate.of(2022, 2, 17), 59.99, "La cataclismica conclusione della trilogia di Total War: WARHAMMER è qui. Riunisci i tuoi eserciti e addentrati nel Regno del Caos, una dimensione di orrori indicibili dove il destino del mondo sarà deciso una volta per tutte. Sconfiggerai i tuoi demoni?… oppure li comanderai?");
		
		Videogioco Among_Us = config.creaVideogioco("Among Us",
				"https://drive.google.com/u/0/uc?id=1jPu6damkHYGoHuMaXlTfEYP-qOv99816", Categoria.MULTIPLAYER,
				"Innersloth", "Innersloth", LocalDate.of(2018, 11, 16), 4.49, "Uno spaziale party game di collaborazione e tradimenti per 4-15 giocatori, da giocare in locale oppure online.");
		
		Videogioco The_Last_of_Us = config.creaVideogioco("The Last of Us",
				"https://drive.google.com/u/0/uc?id=1Wqp257Af3BfMt56KpVf5mq8tXJdD3NHT", Categoria.NARRATIVO,
				"PlayStation", "Naughty Dog", LocalDate.of(2023, 3, 28), 59.99, "Riscopri la straordinaria narrazione e gli indimenticabili personaggi di The Last of Us™, vincitore di oltre 200 premi come Gioco dell'anno.");
		
		Videogioco NBA_2K23 = config.creaVideogioco("NBA 2K23",
				"https://drive.google.com/u/0/uc?id=1cM9Mg9o8JT6Un52F_UFP2kbMpuSkHcWA", Categoria.SPORT, "2K",
				"Visual Concepts", LocalDate.of(2022, 9, 8), 59.99, "Raccogli la sfida in NBA 2K23. Sfodera il tuo talento in MyCAREER. Metti insieme le All-Star con le leggende del passato in MyTEAM. Costruisci la tua eredità in MyGM o porta la NBA verso una nuova direzione in modalità MyLEAGUE.");
		
		Videogioco Mount_Blade_Bannerlord = config.creaVideogioco("Mount&Blade: Bannerlord",
				"https://drive.google.com/u/0/uc?id=1AN4m5qNIYmomIvNbiGi-f23TOieV0mxM", Categoria.RPG,
				"TaleWorlds Entertainment", "TaleWorlds Entertainment", LocalDate.of(2022, 10, 25), 49.99, "RPG di strategia/azione. Crea un personaggio, stabilisci contatti diplomatici, forgia, commercia e conquista territori in un vasto mondo medievale. Forma eserciti e lotta al fianco delle tue truppe in vaste battaglie in tempo reale che sfruttano un sistema di combattimento complesso e intuitivo.");
		
		Videogioco Outer_Wilds = config.creaVideogioco("Outer Wilds",
				"https://drive.google.com/u/0/uc?id=1ihX2NbsYCzaJCnPqllHyG_pUaeND6TxC", Categoria.NARRATIVO,
				"Annapurna", "Mobius Digital", LocalDate.of(2020, 6, 18), 22.99, "Titolo dell'anno 2019 per Giant Bomb, Polygon, Eurogamer e The Guardian, l'acclamato Outer Wilds è un gioco open world ambientato in un sistema solare intrappolato in un anello temporale senza fine.");
		
		Videogioco Kingdom_Come = config.creaVideogioco("Kingdome Come Deliverance",
				"https://drive.google.com/u/0/uc?id=1Sn2a_Q4wTHxO00jkuhODG8OmdkXd4kKg", Categoria.RPG,
				"Warhorse Studios", "Warhorse Studios ", LocalDate.of(2018, 2, 18), 29.99, "Kingdom Come: Deliverance è un gioco di ruolo open world con un’appassionante storia che ti farà vivere un’epica avventura nel Sacro Romano Impero. Vendica la morte dei tuoi genitori, respingi gli invasori del regno e influenza gli eventi con le tue scelte.");
		
		Videogioco Hogwarts_Legacy = config.creaVideogioco("Hogwarts Legacy",
				"https://drive.google.com/u/0/uc?id=1UHSLx2zqnPfQx62l0pk-ikjZu849-CLa", Categoria.RPG,
				"Warner Bros. Games", "Avalanche Software ", LocalDate.of(2023, 2, 10), 59.99, "Hogwarts Legacy è un coinvolgente gioco di ruolo d'azione open world. Prendi il controllo dell'azione e crea un'avventura tutta tua.");
		
		Videogioco We_Were_Here_Forever = config.creaVideogioco("We were here forever",
				"https://drive.google.com/u/0/uc?id=1foRKGhy1DWE0CDKUlDPSWkTIrpPPM8m9", Categoria.ROMPICAPO,
				"Total Mayhem Games", "Total Mayhem Games", LocalDate.of(2022, 5, 10), 17.99, "Ti risvegli imprigionato all'interno del sinistro Castle Rock: sei stato tradito o semplicemente non sei stato astuto? Scoprilo nella nuova avventura rompicapo coop della serie We Were Here! Riuscirai ad affrontare le oscure forze di questo regno o rimarrai intrappolato... per sempre?");
		
		Videogioco Dorf_Romantik = config.creaVideogioco("Dorf Romantik",
				"https://drive.google.com/u/0/uc?id=1vIB7UUuIIHYVIM6yy_Nmjw83qPgc6TlY", Categoria.ROMPICAPO,
				"Toukana Interactive", "Toukana Interactive", LocalDate.of(2022, 4, 28), 12.99, "Dorfromantik è un tranquillo gioco di costruzioni in cui si piazzano tegole esagonali per creare un paesaggio di villaggio in continua crescita. Esplora una varietà di biomi colorati, sblocca nuovi componenti e completa le missioni per dare vita al tuo mondo di gioco!");
		
		Videogioco Escape_Simulator = config.creaVideogioco("Escape Simulator",
				"https://drive.google.com/u/0/uc?id=1OqxHostTEvkQX9RHpiG_vYZye2dDzyGg", Categoria.ROMPICAPO,
				"Pine Studio", "Pine Studio", LocalDate.of(2021, 10,19), 14.99, "Rompicapo in prima persona che puoi giocare da solo o in co-op online (2-3 giocatori consigliati). Esplora una serie di escape room altamente interattive. Sposta mobili, raccogli ed esamina di tutto, spacca vasi e rompi serrature! Supporta le stanze comunità tramite l'editor di livelli.");
		
		Videogioco House_of_Davinci = config.creaVideogioco("The House of Davinci",
				"https://drive.google.com/u/0/uc?id=1zHf9w8lZRtaWw5_qUKqi2HzJpBCy97kQ", Categoria.ROMPICAPO,
				"Blue Brain Games", "Blue Brain Games", LocalDate.of(2022, 12,23), 19.99, "Il gran finale della trilogia di The House of Da Vinci è finalmente disponibile! Risolvi tanti enigmi e rompicapo ed esplora nuove favolose locazioni di incredibile bellezza.");
		
		Videogioco Inscryption = config.creaVideogioco("Inscryption",
				"https://drive.google.com/u/0/uc?id=1AUR_5XbNqH0W7HrDbQVWnLOcTN0_rOLh", Categoria.ROMPICAPO,
				"Devolver Digital", "Daniel Mullins Games", LocalDate.of(2021, 10,19), 19.99, "Inscryption è un'odissea fatta di cupe carte dark che fonde un roguelike deckbuilder, enigmi in stile escape-room e l'horror psicologico in un frullato di sangue. Ancora più oscuri sono i segreti iscritti sulle carte...");
		
		Videogioco Terrascape = config.creaVideogioco("Terrascape",
				"https://drive.google.com/u/0/uc?id=1x0xY8Tdl_31aknGl4d-fsfvdjmt6bPU8", Categoria.ROMPICAPO,
				"Toplitz Productions", "Bitfall Studios", LocalDate.of(2023, 4,5), 12.99, "In TerraScape costruirai la città dei tuoi sogni. Ogni pacchetto di carte di TerraScape offre una varietà di metodi e strutture per ampliare il tuo regno. Posiziona le carte con attenzione nel mondo virtuale per ottenere punti e ricevere nuove carte in ricompensa!");
		
		Videogioco The_Witcher_3_Wild_Hunt = config.creaVideogioco("The Witcher 3 - Wild Hunt",
				"https://drive.google.com/u/0/uc?id=1almL4KDj4h4_ip11Ghe3XUQNe4lHFKEy", Categoria.RPG,
				"CD PROJEKT RED", "CD PROJEKT RED", LocalDate.of(2015, 5,18), 29.99, "Vesti i panni di Geralt di Rivia, cacciatore di mostri, in una terra devastata dalla guerra e infestata da terribili creature. Il tuo contratto? Rintracciare Ciri, la Figlia della Profezia, un'arma vivente che può alterare il destino del mondo.");
		
		Videogioco Dark_Souls_3 = config.creaVideogioco("Dark Souls 3",
				"https://drive.google.com/u/0/uc?id=1ovlj-I6q8CgkcOrhGzI2HO35fquLWwgw", Categoria.RPG,
				"Bandai Namco", "FromSoftware", LocalDate.of(2016, 4,11), 59.99, "Dark Souls continua il suo percorso di innovazione in questo ultimo, ambizioso capitolo della saga acclamata da pubblico e critica. Preparati... e affronta l'oscurità!");
		
		Videogioco Dredge = config.creaVideogioco("Dredge",
				"https://drive.google.com/u/0/uc?id=1s-VdQ0kvSklroOvPxTVm8ISxJIrazBTW", Categoria.RPG,
				"Team17", "Black Salt Games", LocalDate.of(2023, 3,30), 24.99, "DREDGE è un'avventura di pesca per giocatore singolo con una corrente sinistra. Vendi i pesci, migliora la tua barca e draga le profondità alla ricerca di segreti sepolti da tempo. Esplora un arcipelago misterioso e scopri perché è meglio che certe cose restino dimenticate per sempre.");

		Videogioco New_World = config.creaVideogioco("New World",
				"https://drive.google.com/u/0/uc?id=1YlVkTlxXAOrnVyc-t7U0mt3TzZZTlQYj", Categoria.RPG,
				"Amazon Games", "Amazon Games", LocalDate.of(2021, 9,28), 38.99, "Scopri un emozionante MMO open-world ricco di pericoli e opportunità ambientato sull'isola soprannaturale di Aeternum in cui dovrai andare alla ricerca del tuo nuovo destino.");

		Videogioco Dark_Souls_Remastered = config.creaVideogioco("Dark Souls Remastered",
				"https://drive.google.com/u/0/uc?id=1v8V_sYt48GRhvpCkFzd9eLzILNOutty8", Categoria.RPG,
				"Bandai Namco", "QLOC", LocalDate.of(2018, 5,24), 39.99, "E poi venne il Fuoco. Rivivi l'esperienza che ha rivoluzionato il mondo dei videogiochi e dato vita a un nuovo genere. Esplora la terra di Lordran in una splendida versione rimasterizzata in altissima definizione a 60 fps.");

		Videogioco Boltgun = config.creaVideogioco("Warhammer: 40000 Boltgun",
				"https://drive.google.com/u/0/uc?id=1XSUBsKUU8tH9k9gzNVi0p87_6nzmUj2I", Categoria.FPS,
				"Focus Entertainment", "Auroch Digital", LocalDate.of(2023, 5, 23), 21.99, "Carica la tua Boltgun e scatenati col tuo arsenale da Space Marine in un tripudio di esplosioni, sprite, pixel e sangue in questa perfetta miscela tra l'azione frenetica di Warhammer 40.000 e l'elegante stile retrò degli sparatutto anni '90.");

		Videogioco Hunt_Showdown = config.creaVideogioco("Hunt Showdown",
				"https://drive.google.com/u/0/uc?id=1uHTK9eW1Y2ERi16P_IGS1hRrGgWeMR5n", Categoria.FPS,
				"Crytek", "Crytek", LocalDate.of(2019, 8, 27), 39.99, "Hunt: Showdown è un gioco in prima persona di caccia alle taglie PvP con potenti elementi PvE, dai creatori di Crysis. Ambientato negli angoli più oscuri del mondo, racchiude tutta l'emozione dei giochi di sopravvivenza in un formato basato su battaglie.");

		Videogioco Overwatch_2 = config.creaVideogioco("Overwatch 2",
				"https://drive.google.com/u/0/uc?id=1V7EsTYN7j6sUvLH3cGJXZTfiRVCByaBh", Categoria.FPS,
				"Blizzard Entertainment", "Iron Galaxy Studios", LocalDate.of(2020, 7, 15), 0.00, "Overwatch 2 è un gioco d'azione a squadre ambientato in un mondo dal futuro ottimistico, dove ogni scontro è il campo di battaglia 5v5 definitivo.");

		Videogioco Apex_Legends = config.creaVideogioco("Apex Legends",
				"https://drive.google.com/u/0/uc?id=1ZmA009swt7scBIURvJPnP-Q5wkMPRPCa", Categoria.FPS,
				"Electronic Arts", "Respawn Entertainment", LocalDate.of(2020, 11, 5), 0.00, "Apex Legends è il pluripremiato battle royale gratuito sviluppato da Respawn Entertainment. Scopri un elenco in continua espansione di personaggi leggendari dotati di potenti abilità, scegli la strategia perfetta per la tua squadra e lasciati sorprendere da un gameplay innovativo.");

		Videogioco Day_Z = config.creaVideogioco("Day Z",
				"https://drive.google.com/u/0/uc?id=1RN4F6XZGSKccs_9n8tKOl22_fDFlxegK", Categoria.FPS,
				"Bohemia Interactive", "Bohemia Interactive", LocalDate.of(2018, 12, 13), 39.99, "Quanto sopravviverai in un mondo post-apocalittico invaso da zombi infetti, lottando contro altri sopravvissuti per risorse limitate? Farai squadra con giocatori sconosciuti e vi darete man forte? Oppure sarai un lupo solitario per evitare colpi bassi? Questo è DayZ. Questa è la tua storia.");

		Videogioco System_Shock = config.creaVideogioco("System Shock",
				"https://drive.google.com/u/0/uc?id=1bihIbOaTbbUko1xtWIjBmEQJg5qjyO0L", Categoria.FPS,
				 "Prime Matter", "Nightdive Studios", LocalDate.of(2023, 5, 23), 39.99, "Carica la tua Boltgun e scatenati col tuo arsenale da Space Marine in un tripudio di esplosioni, sprite, pixel e sangue in questa perfetta miscela tra l'azione frenetica di Warhammer 40.000 e l'elegante stile retrò degli sparatutto anni '90.");

				

		// Salvo nel db
		if (service.findAll().size() == 0) {
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
			service.addVideogioco(Hogwarts_Legacy);
			service.addVideogioco(We_Were_Here_Forever);
			service.addVideogioco(Dorf_Romantik);
			service.addVideogioco(Escape_Simulator);
			service.addVideogioco(House_of_Davinci);
			service.addVideogioco(Inscryption);
			service.addVideogioco(Terrascape);
			service.addVideogioco(The_Witcher_3_Wild_Hunt);
			service.addVideogioco(Dark_Souls_3);
			service.addVideogioco(Dredge);
			service.addVideogioco(New_World);
			service.addVideogioco(Dark_Souls_Remastered);
			service.addVideogioco(Boltgun);
			service.addVideogioco(Hunt_Showdown);
			service.addVideogioco(Overwatch_2);
			service.addVideogioco(Apex_Legends);
			service.addVideogioco(Day_Z);
			service.addVideogioco(System_Shock);
			
		}

	}

}
