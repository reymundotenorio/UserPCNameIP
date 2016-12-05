/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package direccionnombrepc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Reymundo Tenorio
 */
public class DireccionNombrePC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        
InetAddress localHost = InetAddress.getLocalHost();
System.out.println(System.getProperty("user.name"));
System.out.println(localHost.getHostName());
System.out.println(localHost.getHostAddress());
    }
    
}
