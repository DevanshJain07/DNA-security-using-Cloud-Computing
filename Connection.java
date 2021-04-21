package javaapplication;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedList;

import javax.swing.JTextArea;

public class Connection implements Runnable{
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    JTextArea textServer;
    private LinkedList<Socket> clients = new LinkedList<Socket>();
    String noms[] = {"Devansh", "Gaurav", "Mrinal"};
    private String connecter;
    private static int nb=0;   
    
    public Connection(Socket s,LinkedList client,JTextArea textServer ){
        socket = s;
        clients = client;
        this.textServer=textServer;
       
    }
      
    
    @Override
    public void run() {
        try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream()); 
            if(nb==0)
            textServer.setText("Server  "+"\n_________________________________________\n"+"server is Connected....\n"+"Devansh is connected... \n");
            else  if(nb==1){
            textServer.append("Devansh is connected... \n");
            textServer.append("Gaurav is connected... \n");}
            else if(nb==2){
            textServer.append("Devansh is connected... \n");
            textServer.append("Gaurav is connected... \n");
            textServer.append("Mrinal is connected... \n"); }
            
            out.writeUTF("Client  "+"\n_______________________________________________\n");
          
               nb++;
            while(true){
               String msg = in.readUTF();
                                 String[] t4=msg.split("@");
                                 String recipient=t4[1];
                                 String sender=t4[2];
                                 msg=t4[0];
                                  
	    			textServer.append(sender+" sends a message to: "+recipient+" \n");
                          for(int i=0;i<noms.length;i++){
                              if(noms[i].equals(recipient)){
	    		    	  out = new DataOutputStream(clients.get(i).getOutputStream());
	    		     out.writeUTF(sender+" :"+msg+"\n");  
                              }  
                                 if(noms[i].equals(sender)){
	    		    	  out = new DataOutputStream(clients.get(i).getOutputStream());
	    		     out.writeUTF("You :"+msg+"\n");  
                              }  
                              }
                                
            }
            } catch (IOException e) {
            for (int i = 0; i < clients.size(); i++) {
                if(clients.get(i) == socket){
                	clients.remove(i);
                    break;
                } 
            }
        }
    }
}
