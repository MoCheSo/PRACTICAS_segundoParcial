package cliente_servidor_rpc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Vector;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.XmlRpcClient;

public class Cliente {

    public static void main(String[] args) {
        String x = "", y = "";
        Object resultado;
        try {
            //Declaramos nuestra IP del servior y el puerto
            XmlRpcClient client = new XmlRpcClient("http://192.168.1.101:8080");
            //Creamos un vestor para guardar los parametros
            Vector<String> parametros = new Vector<String>();

            JOptionPane.showMessageDialog(null, "Conectado al servidor");
            while (true) {
                String menu = JOptionPane.showInputDialog(null, "Elige la operacion:\n"
                        + "1.-Suma\n"
                        + "2.-Resta\n"
                        + "3.-Multiplicacion\n"
                        + "4.-Salir\n", "Cliente servidor RPC", JOptionPane.DEFAULT_OPTION
                );

                switch (menu) {
                    case "1":
                        x = JOptionPane.showInputDialog(null, "Primer número", "Suma", JOptionPane.QUESTION_MESSAGE);
                        y = JOptionPane.showInputDialog(null, "Segundo número", "Suma", JOptionPane.QUESTION_MESSAGE);
                        //
                        parametros.addElement(x);
                        parametros.addElement(y);
                        //Se ejecuta el metodo suma mediante la conexión al servidor
                        resultado = client.execute("miServidorRPC.suma", parametros);

                        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                        parametros.clear();
                        break;
                    case "2":
                        x = JOptionPane.showInputDialog(null, "Primer número", "Resta", JOptionPane.QUESTION_MESSAGE);
                        y = JOptionPane.showInputDialog(null, "Segundo número", "Resta", JOptionPane.QUESTION_MESSAGE);

                        parametros.addElement(x);
                        parametros.addElement(y);
                        //Se ejecuta el metodo resta mediante la conexión al servidor
                        resultado = client.execute("RPC.resta", parametros);

                        JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                        parametros.clear();
                        break;

                    case "3":
                        x = JOptionPane.showInputDialog(null, "Primer número", "Multiplicacion", JOptionPane.QUESTION_MESSAGE);
                        y = JOptionPane.showInputDialog(null, "Segundo número", "Multiplicacion", JOptionPane.QUESTION_MESSAGE);

                        parametros.addElement(x);
                        parametros.addElement(y);
                        //Se ejecuta el metodo multiplicacion mediante la conexión al servidor
                        resultado = client.execute("mulRPC.multiplicacion", parametros);

                        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resultado);
                        parametros.clear();
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "Saliendo", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                        break;

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }

}
