package javaapplication;

 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

 
import javax.swing.JTextArea; 

public class Server implements Runnable {

       public static JTextArea textServer;
public Server( JTextArea textServer){
 
    this.textServer=textServer;
}

    //itialiser le port et le nombre maximum de connexions acceptées par le serveur
	private final int port = 12345;
      private DataInputStream in;
    private DataOutputStream out;
    //Nous créons une liste de sockets, où nous allons stocker les sockets qui sont connectés
    private LinkedList<Socket> clients = new LinkedList<Socket>();
   

    public void listen(){
        try {
            ServerSocket server = new ServerSocket(12345);
            while(true){
               
               textServer.setText("Server  "+"\n_________________________________________\n"+"server is Connected....\n");
                
                Socket s = server.accept();
                clients.add(s);
               
                Runnable  run = new Connection(s,clients,textServer);
                Thread t = new Thread(run);
                t.start();
             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

@Override
public void run() {
listen();
	
}
}

