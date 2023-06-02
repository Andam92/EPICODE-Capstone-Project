# EPICODE-Capstone-Project
Backend section of my final project in EPICODE

Important: database name must be "capstone"

Implementare un sistema di backend che simuli il gestionale di un e-commerce di videogiochi. I clienti devono poter acquistare un videogioco tramite un carrello virtuale e una volta effettuato l'acquisto il sistema deve poter inviare una fattura con la data d'acquisto, la lista dei prodotti e il totale. Ogni cliente ha un catalogo personale di giochi, che si aggiorna dopo ogni acquisto.

// Oggetti

Cliente
String username;
String password;
List<Videogioco> libreriaPersonale;
Carrello carrello;  
List<Fattura> listaFatture;  
  
Videogioco 
String titolo;
Categoria categoria;  
String editore;
LocalDate dataPubblicazione;
Double prezzo;
  
Carrello
Cliente cliente;  
List<Videogioco> acquisti;
  
Fattura
LocalDate dataAcquisto;
Cliente cliente;  
Carrello carrello;
  
