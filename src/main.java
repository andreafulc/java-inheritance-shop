public class main {

    public static void main(String[] args) {
        
        Smartphone iphone = new Smartphone("iPhone 14", "Apple", "iPhone 14", "123456789012345", 128, 999.99, 22);

        System.out.println("Nome: " + iphone.getNome());
        System.out.println("Marca: " + iphone.getMarca());
        System.out.println("Modello: " + iphone.getModello());
        System.out.println("IMEI: " + iphone.getImei());
        System.out.println("Memoria: " + iphone.getMemoria() + " GB");
        System.out.println("Prezzo: " + iphone.getPrezzoBase() + " €");
        System.out.println("Prezzo con IVA: " + iphone.getPrezzoConIva() + " €");
        System.out.println("Codice: " + iphone.getCodice());

    
        System.out.println("----------------------------------");

        Televisori Samsung = new Televisori("Samsung QLED", "Samsung", 1499.99, 22, "55 pollici", false);

        System.out.println("Nome: " + Samsung.getNome());
        System.out.println("Marca: " + Samsung.getMarca());
        System.out.println("Dimensioni: " + Samsung.getDimensioni());
        System.out.println("Smart: " + (Samsung.isSmart() ? "Sì" : "No"));
        System.out.println("Prezzo: " + Samsung.getPrezzoBase() + " €");
        System.out.println("Prezzo con IVA: " + Samsung.getPrezzoConIva() + " €");
        System.out.println("Codice: " + Samsung.getCodice());


        System.out.println("----------------------------------");

        Cuffie Bose = new Cuffie("Bose QuietComfort", "Bose", 349.99, 22, "Nero", false);

        System.out.println("Nome: " + Bose.getNome());
        System.out.println("Marca: " + Bose.getMarca());
        System.out.println("Colore: " + Bose.getColore());
        System.out.println("Wireless: " + (Bose.isWireless() ? "Sì" : "No"));
        System.out.println("Prezzo: " + Bose.getPrezzoBase() + " €");
        System.out.println("Prezzo con IVA: " + Bose.getPrezzoConIva() + " €");
        System.out.println("Codice: " + Bose.getCodice());


    }

}
