/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap06_6.pkg2.pkg1;

/**
 *
 * @author monic
 */
public class LibroCap06_621 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread t1 = new Thread(new DemoThread("Pedro"));
        Thread t2 = new Thread(new DemoThread("Pablo"));
        Thread t3 = new Thread(new DemoThread("Juan"));
        t1.start();
        t2.start();
        t3.start();
    }

}
