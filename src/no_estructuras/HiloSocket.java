/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_estructuras;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pc
 */
public class HiloSocket extends Thread{
    
    @Override
    public void run(){
        enviar();
    }
        public void enviar(){
        while(true){
            try {
                ServerSocket server = new ServerSocket(5000);
                Socket envio = server.accept();
                ObjectOutputStream en = new ObjectOutputStream(envio.getOutputStream());
                en.writeObject(jfmLibros.libros);
                envio.close();
                server.close();
                
            } catch (IOException ex) {
                Logger.getLogger(jfmLibros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
