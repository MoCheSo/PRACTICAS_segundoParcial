package libro.cap07.rmi;

import libro.cap07.rmi.ObjetoRemotoImple;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {

    public static void main(String[] args) throws Exception {
// obtengo referencia a la registry del servidor (IP+PORT)
        Registry reg = LocateRegistry.getRegistry(2020);
// ubico el objeto remoto identicado por "OBJRemoto" 
        ObjetoRemoto objRemoto;
        objRemoto = (ObjetoRemoto) reg.lookup("con");
// invoco sus metodos como lo hago con cualquier otro objeto
        String saludo = objRemoto.obtenerSaludo("Pablo");
        System.out.println(saludo);
    }
}
