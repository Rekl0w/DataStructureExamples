/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll;

/**
 *
 * @author Rekl0w
 */
public class LL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba a = new Araba(2000, "Honda");
        Araba b = new Araba(2010, "Mercedes");
        Araba c = new Araba(2020, "Toyota");
        Araba d = new Araba(1995, "Saab");
        Araba e = new Araba(2005, "Opel");
        Araba f = new Araba(2007, "Mustang");
        
        BagliListe bl = new BagliListe();
        bl.siraliEkle(a);
        bl.printForward();
        bl.siraliEkle(b);
        bl.printForward();
        bl.siraliEkle(c);
        bl.printForward();
        bl.sonrasinaEkle(bl.first, d);
        bl.printForward();
        bl.sonrasinaEkle(bl.last, e);
        bl.printForward();
        bl.sonrasinaEkle(bl.first.next.next.next, f);
        bl.printForward();
        
        System.out.println("--------------------");
        
        
        
    }
    
}
