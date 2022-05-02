package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {

    public static void main(String[] args) {

        try {
            Registry miRegristry = LocateRegistry.createRegistry(1234);
            miRegristry.rebind("Matematicas", new ServerImplements());
            System.out.println("Servidor encendido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
