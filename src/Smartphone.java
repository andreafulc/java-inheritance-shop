// Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria

public class Smartphone extends Prodotto{

    public String marca;
    public String modello;
    public String imei;
    public int memoria;

    public Smartphone(String nome, String marca, String modello, String imei, int memoria, double prezzo, double iva) {
        super(nome, marca, prezzo, iva);
        this.marca = marca;
        this.modello = modello;
        this.imei = imei;
        this.memoria = memoria;
    }

        
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    
}
