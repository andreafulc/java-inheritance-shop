// Creare un nuovo progetto java-inheritance-shop
// Creare la classe Prodotto che gestisce i prodotti dello shop.
// Un prodotto è caratterizzato da:
// codice (numero intero)
// nome
// marca
// prezzo
// iva
// Lo shop gestisce diversi tipi di prodotto:
// Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
// Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
// Cuffie, caratterizzate dal colore e se sono wireless o cablate
// Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;   
    private double prezzo;
    private double iva;
    private double prezzoConIva;

    

    public Prodotto(String nome, String marca, double prezzo, double iva) {
        this.codice = getRandom();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
        this.prezzoConIva = getPrezzoConIva(prezzo, iva);

    }

    public int getRandom() {
        Random random = new Random();
         int codice = random.nextInt(Integer.MAX_VALUE);
        return codice;
    }

    public double getPrezzoConIva(double prezzo, double iva) {
        return prezzo + (prezzo * iva / 100);
    }

    public double getPrezzoConIva() {
        return prezzoConIva;

    }

    public double getPrezzoBase() {
        return prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    



    
   

   
    
}
