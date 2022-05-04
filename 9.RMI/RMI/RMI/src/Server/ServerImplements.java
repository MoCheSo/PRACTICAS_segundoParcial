/*******************************************************************************
 * ServerImplements.java
 * JDCH
 * 
 * Este programa es el que implementa los metodos del remote interface 
*******************************************************************************/
package Server;

import RMI.RemoteInterface;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{
    
    public ServerImplements() throws Exception{
        super();
    }
    public int suma(int x, int y){
        return(x+y);
    }
    public int resta(int x, int y){
        return(x-y);
    }
    public int multiplicacion(int x, int y){
        return(x*y);
    }
    public int division(int x, int y){
        return(x/y);
    }
    public int potencia (int x, int y){
        return(int)(Math.pow(x, y));
    }
}
