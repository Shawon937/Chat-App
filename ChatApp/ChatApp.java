/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Abrar
 */
public class ChatApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try{
            
        ServerSocket serverSocket = new ServerSocket(1235);
        Socket connectionSocket = serverSocket.accept();
        System.out.println("Enter any sentences...");
        DataInputStream in = new DataInputStream(connectionSocket.getInputStream()); 
        DataOutputStream out = new DataOutputStream(connectionSocket.getOutputStream());
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(System.in));
        //String sentence = inFromClient.readLine();
       
         String line = "";
         String lineout = "";
 
            // reads message from client until "Over" is sent
            while (!line.equals("Over"))
            {
                   //
                try{
                    line = in.readUTF();
                    System.out.println("from client...."+line);
                    lineout = inFromClient.readLine();
                    out.writeUTF(lineout);
                    //out.flush();
                }catch(IOException i)
                {
                    System.out.println(i);
                }
                
            }
            System.out.println("Closing connection");
 
            // close connection
            connectionSocket.close();
            //in.close();
        
       
        
}
    catch(IOException ex){
        System.out.println("unable to attach..." + ex);
}
    }
    
}
