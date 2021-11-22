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
public class Araba {
    int yil;
    String marka;
    
    public Araba(int yil, String marka){
        this.yil = yil;
        this.marka = marka;
    }
    
    @Override
    public String toString(){
        return "[" + yil + "," + marka + "]";
    }
}
