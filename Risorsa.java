public class Risorsa {

    private String nome;
    private int annoPubblicazione;
    private int codice;

    public Risorsa(String nome, int annoPubblicazione, int codice) {
        this.nome = nome;
        this.annoPubblicazione = annoPubblicazione;
        this.codice = codice++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void visualizzaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Anno di pubblicazione: " + annoPubblicazione);
        System.out.println("Codice: " + codice);
    }

}
