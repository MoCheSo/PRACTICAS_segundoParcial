/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap06.prodcons;

/**
 *
 * @author monic
 */
public class LibroCap06Prodcons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor m = new Monitor(3);
        Productor p = new Productor(m, 6, 2000);
        Consumidor c = new Consumidor(m, 6, 4000);
        p.start();
        c.start();
    }
}
