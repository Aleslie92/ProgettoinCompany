import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crea biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Digitale");

        // Crea risorse
        Libro libro1 = new Libro("Il nome della rosa", 1980, "L001", "Umberto Eco");
        Rivista rivista1 = new Rivista("Nature", 2023, "R001", 120);
        Ebook ebook1 = new Ebook("Java per Tutti", 2022, "E001", "PDF");

        // Aggiungi risorse alla biblioteca
        biblioteca.aggiungiRisorsa(libro1);
        biblioteca.aggiungiRisorsa(rivista1);
        biblioteca.aggiungiRisorsa(ebook1);

        // Crea utenti
        Utente utente1 = new Utente("Mario Rossi", "U001");
        Utente utente2 = new Utente("Giulia Bianchi", "U002");

        // Aggiungi utenti
        biblioteca.aggiungiUtente(utente1);
        biblioteca.aggiungiUtente(utente2);

        // Prestiti
        utente1.prestaRisorsa(libro1);
        utente1.prestaRisorsa(ebook1);
        utente2.prestaRisorsa(rivista1);

        // Stampa inventario biblioteca
        System.out.println("\n--- Risorse Disponibili ---");
        biblioteca.visualizzaInventario();

        // Stampa risorse di ogni utente
        System.out.println("\n--- Risorse in prestito agli utenti ---");
        utente1.visualizzaRisorseUtente();
        utente2.visualizzaRisorseUtente();

        // Ricerca risorsa per titolo
        System.out.println("\n--- Ricerca per titolo 'Java per Tutti' ---");
        Risorsa trovata = biblioteca.cercaRisorsaPerTitolo("Java per Tutti");
        if (trovata != null) {
            trovata.visualizzaDettagli();
        } else {
            System.out.println("Risorsa non trovata.");
        }
    }
}
