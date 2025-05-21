// Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
// Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smartphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
// Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString(), oppure di un metodo a vostra scelta che restituisca una stringa, per restituire le informazioni da stampare per ogni classe)

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto[] carrello = new Prodotto[10];
        int count = 0;

        while (true) {
            System.out.println("Inserisci il tipo di prodotto (1: Smartphone, 2: Televisore, 3: Cuffie, 0: Esci): ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline rimasto

            if (scelta == 0) {
                break;
            }

            if (count >= carrello.length) {
                System.out.println("Carrello pieno!");
                break;
            }

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeSmartphone = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marcaSmartphone = scanner.nextLine();
                    System.out.print("Modello: ");
                    String modelloSmartphone = scanner.nextLine();
                    System.out.print("IMEI: ");
                    String imeiSmartphone = scanner.nextLine();
                    System.out.print("Memoria (GB): ");
                    int memoriaSmartphone = scanner.nextInt();
                    System.out.print("Prezzo: ");
                    double prezzoSmartphone = scanner.nextDouble();
                    System.out.print("IVA (%): ");
                    double ivaSmartphone = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il newline rimasto

                    carrello[count++] = new Smartphone(nomeSmartphone, marcaSmartphone, modelloSmartphone, imeiSmartphone, memoriaSmartphone, prezzoSmartphone, ivaSmartphone);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeTelevisore = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marcaTelevisore = scanner.nextLine();
                    System.out.print("Dimensioni: ");
                    String dimensioniTelevisore = scanner.nextLine();
                    System.out.print("Smart (true/false): ");
                    boolean smartTelevisore = scanner.nextBoolean();
                    System.out.print("Prezzo: ");
                    double prezzoTelevisore = scanner.nextDouble();
                    System.out.print("IVA (%): ");
                    double ivaTelevisore = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il newline rimasto

                    carrello[count++] = new Televisori(nomeTelevisore, marcaTelevisore, prezzoTelevisore, ivaTelevisore, dimensioniTelevisore, smartTelevisore);
                    break;  

                case 3:

                    System.out.print("Nome: ");
                    String nomeCuffie = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marcaCuffie = scanner.nextLine();
                    System.out.print("Colore: ");
                    String coloreCuffie = scanner.nextLine();
                    System.out.print("Wireless (true/false): ");
                    boolean wirelessCuffie = scanner.nextBoolean();
                    System.out.print("Prezzo: ");
                    double prezzoCuffie = scanner.nextDouble();
                    System.out.print("IVA (%): ");
                    double ivaCuffie = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il newline rimasto

                    carrello[count++] = new Cuffie(nomeCuffie, marcaCuffie, prezzoCuffie, ivaCuffie, coloreCuffie, wirelessCuffie);
                    break;

                default:

                    System.out.println("Scelta non valida. Riprova.");
                    break;

            }

        }

        System.out.println("Carrello:");

        for (int i = 0; i < count; i++) {
            System.out.println(carrello[i].toString());
        }
        scanner.close();

    }
    

   
}
                
            
        


