/*******************************************************************************
 * MainServer.java
 * JDCH
 * 
 * Este programa es el main de Server 
*******************************************************************************/
package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {

    public static void main(String[] args) {

        try {
            Registry miRegristry = LocateRegistry.createRegistry(1234);
            //esto sirve para recuperar referencias de objetos remotos
            //el createregistry digamos que abre el puerto donde se aceptan solicitudes
            miRegristry.rebind("Matematicas", new ServerImplements());
            //Reemplaza el enlace para lo especificado en este registro con la referencia remota proporcionada
            // en donde "matematicas es el nombre de la referencia del objetoremoto" y serverImplemts es la referecnia al objeto remoto
            System.out.println("Servidor encendido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
