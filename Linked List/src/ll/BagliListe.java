/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll;


public class BagliListe {
    Node first;
    Node last;
   
    public BagliListe(){
        this.first = null;
        this.last = null;
    }
    
    public void basaEkle(Araba a){
        Node n = new Node(a);
        
        if(this.first == null){
            this.last = n;
        }else{
            this.first.prev = n;
            n.next = this.first;
        }
        this.first = n;
    }
    
    public void sonaEkle(Araba a){
        Node n = new Node(a);
        
        if(this.first == null){
            this.first = n;
        }else{
            n.prev = this.last;
            this.last.next = n;
        }
        this.last = n;
    }
    
    public void sonrasinaEkle(Node s, Araba a){
        Node n = new Node(a);
        
        if(s == null){
            this.basaEkle(a);
        }else if(s == this.last){
            this.sonaEkle(a);
        }else{
            s.next.prev = n;
            n.prev = s;
            n.next = s.next;
            s.next = n;
        }
        
    }
    
    public void siraliEkle(Araba a){
        Node n = new Node(a);
        
        if(this.first == null){
           this.basaEkle(a);
        }else if( this.first.araba.yil > n.araba.yil ){
           this.basaEkle(a);
        }else {
            Node current = this.first;
            while ( current.next != null && current.next.araba.yil < n.araba.yil){
                current = current.next;
            }
            this.sonrasinaEkle(current, a);
        }
    }
    

    public void add(Araba a){
        Node n = new Node(a);
        if(this.first == null){
            this.first = n;
        }else{
            if(this.first.araba.yil > n.araba.yil){
                n.next = this.first;
                this.first = n;
            }else{
                Node tmp = first;
                while(tmp.next != null && tmp.next.araba.yil < n.araba.yil){
                tmp =tmp.next;
                }
               n.next = tmp.next;
               tmp.next = n;
            }
            
        }
    }
      
    public void printForward(){
        Node tmp = this.first;
        while(tmp != null){
            System.out.print(tmp.araba + "->");
            tmp = tmp.next;
        }
        System.out.println("");
    }
    
    public void printReverse(){
        Node tmp = this.last;
        while(tmp != null){
            System.out.print(tmp.araba + "<-");
            tmp = tmp.prev;
        }
        System.out.println("");
    }
}


