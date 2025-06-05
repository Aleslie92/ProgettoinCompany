public class Rivista extends Risorsa {

    private int numeroRivista;

    public Rivista(String nome, int annoPubblicazione, int codice, int numeroRivista) {
        super(nome, annoPubblicazione, codice);
        this.numeroRivista = numeroRivista;
    }

    public int getNumeroRivista() {
        return numeroRivista;
    }

    public void setNumeroRivista(int numeroRivista) {
        this.numeroRivista = numeroRivista;
    }

    @Override
    public void visualizzaDettagli() {
        super.visualizzaDettagli();
        System.out.println("Numero della rivista: " + numeroRivista);
    }
}
