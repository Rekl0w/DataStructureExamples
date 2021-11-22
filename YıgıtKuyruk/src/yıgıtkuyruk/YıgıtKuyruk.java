
package yıgıtkuyruk;


public class YıgıtKuyruk {
    

    
    public static void main(String[] args) {
    /*   Stack s = new Stack(5);
       
       s.print();
       
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);
       
       s.print();
       System.out.println("Çıkarılan eleman "+ s.pop()+ ".");
       s.print();
       System.out.println("Çıkarılan eleman "+ s.pop()+ ".");
       s.print();
       
       s.print();
       s.pop();
       s.print();
       s.pop();
       s.print();
       s.pop();
       s.print();
       s.pop(); */
    
        Kuyruk k = new Kuyruk(10);
        
        k.insert(1);
        k.print();
        k.insert(2);
        k.print();
        k.insert(3);
        k.print();
        k.insert(4);
        k.print();
        k.insert(5);
        k.print();
        
       k.print();
       System.out.println("Çıkarılan eleman "+ k.remove()+ ".");
       k.print();
       System.out.println("Çıkarılan eleman "+ k.remove()+ ".");
       k.print();
    
    
       
    }
    
}
