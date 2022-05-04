/*******************************************************************************
 * MainCliente.java
 * JDCH
 * 
 * Este programa es el main de cliente 
*******************************************************************************/
package Cliente;

import RMI.RemoteInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class MainCliente {

    public static void main(String[] args) {
        try {
            String valorA = JOptionPane.showInputDialog(null, "ingrese valor A");
            String valorB = JOptionPane.showInputDialog(null, "ingrese valor B");
            int A = Integer.parseInt(valorA);
            int B = Integer.parseInt(valorB);
            Registry miRegistro = LocateRegistry.getRegistry("127.0.0.1",1234);
            //obtiene en que direccion se va a conectar y en que puerto para hacer las solicitudes correspondientes
            RemoteInterface s = (RemoteInterface) miRegistro.lookup("Matematicas");
            //devuelve la referencia al objeto remoto usada en el servidor 
            JOptionPane.showMessageDialog(null, "resultado suma A + B\n" + s.suma(A,B));
            JOptionPane.showMessageDialog(null, "resultado restando A - B\n" + s.resta(A,B));
            JOptionPane.showMessageDialog(null, "resultado multiplicando A x B\n" + s.multiplicacion(A,B));
            JOptionPane.showMessageDialog(null, "resultado dividiendo A / B\n" + s.division(A,B));
            JOptionPane.showMessageDialog(null, "resultado potencia A ^ B\n"+ s.potencia(A,B));
            //System.out.println("resultado suma A + B\n" + s.suma(A,B));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
