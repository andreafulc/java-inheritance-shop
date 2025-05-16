// Cuffie, caratterizzate dal colore e se sono wireless o cablate

public class Cuffie extends Prodotto{

    private String colore;
    private boolean wireless;
    private String tipo;


    public Cuffie(String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore () {
        return colore;
    }

    public void setColore (String colore) {
        this.colore = colore;
    }

    public boolean isWireless () {
        return wireless;
    }

    public void setWireless (boolean wireless) {
        this.wireless = wireless;
    }

    public String getTipo () {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }


}
