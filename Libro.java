public class Libro extends Risorsa {

    private String autore;

    public Libro(String nome, int annoPubblicazione, int codice, String autore) {
        super(nome, annoPubblicazione, codice);
        this.autore = autore;

    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println("Autore: " + autore);

    }

}
