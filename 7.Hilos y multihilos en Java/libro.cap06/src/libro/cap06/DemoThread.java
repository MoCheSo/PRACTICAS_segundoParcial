/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap06;

/**
 *
 * @author monic
 */
public class DemoThread extends Thread {

    private String nombre;

    public DemoThread(String nombre) {
        this.nombre = nombre;
    }

    public void run() {
        try {
            int x = (int) (Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy: " + nombre + " (" + x + ")");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

