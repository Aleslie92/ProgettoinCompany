import java.util.ArrayList;

public class Biblioteca {
    // Attributi privati
    private String nomeBiblioteca;
    private ArrayList<Risorsa> risorseDisponibili;
    private ArrayList<Utente> utenti;

    // Costruttore per inizializzare la biblioteca
    public Biblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.risorseDisponibili = new ArrayList<Risorsa>();
        this.utenti = new ArrayList<Utente>();
    }

    // Metodo per aggiungere una risorsa
    public void aggiungiRisorsa(Risorsa risorsa) {
        risorseDisponibili.add(risorsa);
    }

    // Metodo per aggiungere un utente
    public void aggiungiUtente(Utente utente) {
        utenti.add(utente);
    }

    // Metodo per stampare l'inventario completo
    public void stampaInventario() {
        System.out.println("Inventario della biblioteca \"" + nomeBiblioteca + "\":");
        for (Risorsa risorsa : risorseDisponibili) {
            risorsa.visualizzaDettagli(); // Polimorfismo dell'ereditarietà
        }
    }

    // Metodo per cercare risorse per titolo
    public ArrayList<Risorsa> cercaRisorsePerTitolo(String titolo) {
        ArrayList<Risorsa> trovate = new ArrayList<>();
        for (Risorsa risorsa : risorseDisponibili) {
            if (risorsa.getTitolo().toLowerCase().contains(titolo.toLowerCase())) {
                trovate.add(risorsa);
            }
        }
        return trovate;
    }
}