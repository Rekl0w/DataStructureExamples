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
public class Node {
    Araba araba;
    Node next;
    Node prev;
    
    public Node(Araba araba){
        this.araba = araba;
        this.next = null;
        this.prev = null;
    }
    
    @Override
    public String toString(){
        return "[" + araba + "]";
    }
}
