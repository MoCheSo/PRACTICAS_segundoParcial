/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import RMI.RemoteInterface;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author juanc
 */
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{
    
    public ServerImplements() throws Exception{
        super();
    }
    @Override
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
