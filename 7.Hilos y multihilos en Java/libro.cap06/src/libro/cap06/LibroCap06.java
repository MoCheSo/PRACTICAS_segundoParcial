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
public class LibroCap06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DemoThread t1 = new DemoThread("Pedro");
        DemoThread t2 = new DemoThread("Pablo");
        DemoThread t3 = new DemoThread("Juan");
        t1.start();
        t2.start();
        t3.start();

    }

}
