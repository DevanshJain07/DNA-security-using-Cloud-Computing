
package javaapplication;

 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import static javaapplication.Application.jTextArea3;
 
import javax.swing.JTextArea;


public class Client implements Runnable{
    private Socket client;
    public static String noms;
    private DataInputStream in;
    private DataOutputStream out;
    private int port = 12345;
    private String host = "localhost";
    private String messages = "";
   
    JTextArea textClient;
    public static ArrayList<String> ch =new ArrayList(); 
    public Client(JTextArea textClient, String nom,String host){
    	
        this.host=host;
        this.textClient = textClient;
        try {
           
            client = new Socket(host,port);
            jTextArea3.append("Server  \n"+"_________________________________________\n"+nom+" is connected\n");
            
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
        
    @Override
    public void run() {
        try{
            while(true){
            	messages += in.readUTF();
            	textClient.setText(messages);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void sendermsg(String msg){
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    	
    }
    
