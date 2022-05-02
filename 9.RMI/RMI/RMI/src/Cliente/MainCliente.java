package Cliente;

import RMI.RemoteInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class MainCliente {

    public static void main(String[] args) {
        try {
            String valorA = JOptionPane.showInputDialog(null, "ingrese valor A");
            String valorB = JOptionPane.showInputDialog(null, "ingrese valor B");
            int A = Integer.parseInt(valorA);
            int B = Integer.parseInt(valorB);
            Registry miRegistro = LocateRegistry.getRegistry("127.0.0.1",1234);
            RemoteInterface s = (RemoteInterface) miRegistro.lookup("Matematicas");
            JOptionPane.showMessageDialog(null, "resultado suma " + s.suma(A,B));
            JOptionPane.showMessageDialog(null, "resultado suma " + s.resta(A,B));
            JOptionPane.showMessageDialog(null, "resultado suma " + s.multiplicacion(A,B));
            JOptionPane.showMessageDialog(null, "resultado suma " + s.division(A,B));
            JOptionPane.showMessageDialog(null, "resultado potencia "+A+"^"+B+" = "+ s.potencia(A,B));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
