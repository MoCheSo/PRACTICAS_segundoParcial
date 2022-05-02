/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RMI;

import java.rmi.Remote;

/**
 *
 * @author juanc
 */
public interface RemoteInterface extends Remote{
    public int suma (int x, int y)throws Exception;
    public int resta (int x, int y)throws Exception;
    public int multiplicacion (int x, int y)throws Exception;
    public int division (int x, int y)throws Exception;
    public int potencia (int x, int y)throws Exception;
    
    
}
