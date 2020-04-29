import java.util.Scanner;
class Client{
    private String address;
    private String port;
    private String nome;
    Scanner tastiera=new Scanner(System.in);
    
    public  Client(String address, String port, String nome){// creazione socket del client
        this.address=address; 
        this.port=port;
        this.nome=nome;
        System.out.printf("Creazione socket del client(%s) in corso, associazione indirizzi IP:%s e numero di porta:%s\n",this.nome,this.address,this.port);
    }
    
    public void connect(){
        Server s=new Server();
        System.out.printf("[%s]Voglio aprire una connessione con il server:%s su porta %s[Lato client][INVIO SYN=1 ACK=0]\n",this.nome,s.get_address(), s.get_port());
    }
    
    public void ACK(){
        System.out.printf("Risposta positiva dal server-->connessione aperta[Lato client(%s)][ACK=1]\n\n",this.nome);
    }
    
    public String write(){
        String dati;
        System.out.printf("[%s]Inserire il messaggio\n",this.nome);
        dati=tastiera.nextLine();
        return dati;
    }
    
    public void close(){
        System.out.printf("\nVoglio chiudere la comunicazione[%s][INVIO FIN=1]\n",this.nome);
    }
}