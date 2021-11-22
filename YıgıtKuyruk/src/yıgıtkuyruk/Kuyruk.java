
package yıgıtkuyruk;

import java.util.Arrays;


public class Kuyruk {
    
    private int head;
    private int tail;
    private int es;
    private int[] dizi;
    
    public Kuyruk(int KuyrukBoyutu){
        this.head = 0;
        this.tail = 0;
        this.dizi = new int[KuyrukBoyutu];
    }
    
    public void insert(int yeni){
        
        if ( !this.isFull()){
            if (this.tail == this.dizi.length){
                this.tail = 0;
            }
            this.dizi[tail++] = yeni;
            this.es++;
        }else{
            System.out.println("Kuyruk dolu!"+yeni+"eklenemedi.");
        }
    }
    
    public int remove(){
        
        if ( !this.isEmpty()){
            int tmp = this.dizi[this.head++];
            if (this.head == this.dizi.length){
                this.head = 0;
            }
            this.es--;
            return tmp;
           
        }else{
            System.out.println("Kuyruk boş!");
            return -1;
        }
          
    }
    
    public boolean isFull(){
        return this.es == this.dizi.length;
    }
    
    public boolean isEmpty(){
        return this.es == 0;
    }
    
    public void print(){
        System.out.print("[");
        for(int i= this.head ; i < this.head + this.es ; i++ ){
            System.out.print(this.dizi[i%this.dizi.length]+" ");
        }
        System.out.print("] ------------- ");
        System.out.print(Arrays.toString(this.dizi)+ "\n");
    }
    
    public int peek(){
        
        if ( !this.isEmpty()){
            return this.dizi[this.tail-1];
        }else{
            System.out.println("Kuyruk boş!");
            return -1;
        }
    }
}
