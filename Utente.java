import java.util.ArrayList;

public class Utente {
    private String nome;
    private String idUtente;
    private ArrayList<Risorsa> risorseInPrestito;

    // Costruttore
    public Utente(String nome, String idUtente) {
        this.nome = nome;
        this.idUtente = idUtente;
        this.risorseInPrestito = new ArrayList<>();
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public ArrayList<Risorsa> getRisorseInPrestito() {
        return risorseInPrestito;
    }

    // Metodo per aggiungere una risorsa in prestito
    public void prestaRisorsa(Risorsa r) {
        risorseInPrestito.add(r);
    }

    // Metodo per visualizzare le risorse in prestito
    public void visualizzaRisorseUtente() {
        System.out.println("Utente: " + nome + " (ID: " + idUtente + ")");
        if (risorseInPrestito.isEmpty()) {
            System.out.println("Nessuna risorsa in prestito.");
        } else {
            for (Risorsa r : risorseInPrestito) {
                r.visualizzaDettagli();  // utilizzo del polimorfismo
            }
        }
    }
}
