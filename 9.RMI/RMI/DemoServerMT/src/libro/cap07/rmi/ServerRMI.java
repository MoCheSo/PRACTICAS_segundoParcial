package libro.cap07.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {

    public static void main(String[] args) throws RemoteException {
        ObjetoRemotoImple obj = new ObjetoRemotoImple();        
        try {            
            Registry reg = LocateRegistry.getRegistry(2020);            
            reg.rebind("con", obj);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println("Falla de coneccion");
            System.out.println(e.toString());
        }
    }
}
