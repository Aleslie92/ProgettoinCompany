public class Ebook extends Risorsa {

    private String formato;

    public Ebook(String nome, int annoPubblicazione, int codice, String formato) {
        super(nome, annoPubblicazione, codice);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println("Formato: " + formato);
    }

}
