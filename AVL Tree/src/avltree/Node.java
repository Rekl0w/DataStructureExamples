
package avltree;

public class Node {

    double data;
    Node left;
    Node right;
    int height;

    public Node(double data) {
	
        this.data = data;
	this.height = 1;
	}

}