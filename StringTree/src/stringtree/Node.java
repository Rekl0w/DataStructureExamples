/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtree;

/**
 *
 * @author Batuhan
 */
public class Node {
    
    String key;
    Node right;
    Node left;
    
    public Node(String value){
        
        this.key = key;
        this.right = right;
        this.left = left;
    }


    @Override
    public String toString(){
        return "[" + key + ", " + (left == null ? "-" : left) + ", " + (right == null ? "-" : right) + "] ";
    }
}
