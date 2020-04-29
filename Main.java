import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	
	Scanner tastiera= new Scanner(System.in);
	Server S= new Server();
    String address;
    String port;
    String app;
    String dati;
    
    System.out.printf("Inserisci l'indirizzo IP del Client C1\n");
    address=tastiera.nextLine();
    System.out.printf("Inserisci il numero di porta di C1\n");
    port=tastiera.nextLine();
    Client C1= new Client(address, port,"C1");// creazione client 1
    C1.connect();
    S.accept();
    C1.ACK();
    
    System.out.printf("Inserisci l'indirizzo IP del Client C2\n");
    address=tastiera.nextLine();
   System.out.printf("Inserisci il numero di porta di C2\n");
    port=tastiera.nextLine();
    Client C2= new Client(address, port, "C2");// creazione client 2
    C2.connect();
    S.accept();
    C2.ACK();
    
    System.out.printf("Inserisci l'indirizzo IP del Client C3\n");
    address=tastiera.nextLine();
    System.out.printf("Inserisci il numero di porta di C3\n");
    port=tastiera.nextLine();
    Client C3= new Client(address, port, "C3");// creazione client 3
    C3.connect();
    S.accept();
    C3.ACK();
    
    
    
        do{
            dati=C1.write();
            S.recieve(dati);
            System.out.printf("\nInserire 'quit' per chiudere la comunicazione --- Inserire 'no quit' per continuare la comunicazione\n");            app=tastiera.nextLine();
        }while(app.equals("no quit"));
        C1.close();
        S.close();
        
        do{
            dati=C2.write();
            S.recieve(dati);
            System.out.printf("\nInserire 'quit' per chiudere la comunicazione --- Inserire 'no quit' per continuare la comunicazione\n");
            app=tastiera.nextLine();
        }while(app.equals("no quit"));
        C2.close();
        S.close();
        
        do{
            dati=C3.write();
            S.recieve(dati);
            System.out.printf("\nInserire 'quit' per chiudere la comunicazione --- Inserire 'no quit' per continuare la comunicazione\n");            app=tastiera.nextLine();
        }while(app.equals("no quit"));
        C3.close();
        S.close();
     
	}
}
