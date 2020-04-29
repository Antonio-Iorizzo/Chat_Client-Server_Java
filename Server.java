class Server{
    private String address;
    private String port;
    
    public Server(){                 //creazione socket del server
        this.address="143.60.67.89"; //classe B
        this.port="10000";
    }
    
    public String get_address(){
        return this.address;
    }
    
    public String get_port(){
        return this.port;
    }
    
    public void accept(){
        System.out.printf("Richiesta accettata-->Connessione aperta[Lato server][SYN=1 ACK=1]\n");
    }
    
    public void recieve(String messaggio){
        System.out.printf("Messaggio ricevuto-->%s\n",messaggio);
    }
    
    public void close(){
        System.out.printf("Richiesta di chiusura ricevuta-->Connessione chiusa[INVIO ACK=1]\n\n");
    }
}