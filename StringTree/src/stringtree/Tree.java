
package stringtree;


public class Tree {
    
    Node root;
    
    public Tree(){
        this.root = null;
    
    }

    
    public void insert(String a){
        this.root = this.insertRecursive(this.root, a);
        
    }
    
    private Node insertRecursive(Node current, String a){
        if(current == null){
            return new Node(a);
        }
        
       if( a == "+" ){
            current.left = new Node(a);
        }else if( a == "6" ){
            current.right = new Node(a);
        }else if( a == "5" ){
            current.left.left = new Node(a);
        }else if( a == "4" ){
            current.left.right = new Node(a);
        }
            
        return current;
    }
       
    public void iot(){
        inOrderTraversalRec(this.root);
    }
    
    public void inOrderTraversalRec(Node current){
        if( current != null){
            inOrderTraversalRec(current.left);
            System.out.println(current.key + " ");
            inOrderTraversalRec(current.right);
        }
        
    }

    public void printTree(){
        System.out.println(this.root);
    }
    
}
