/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor_cliente_rpc;

public class Resta {
    //Método de resta
    public String resta(String a, String b){
    return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }
}