
package uygulama.ödev.pkg2;

import java.util.Arrays;


public class kuyruk {
    
    private int head;
    private int tail;
    private int es;
    private Object[] dizi;
    
    public kuyruk(int KuyrukBoyutu){
        this.head = 0;
        this.tail = 0;
        this.dizi = new Object[KuyrukBoyutu];
    }
    
    public void insert(Object ArabaBilgileri){
        
        if ( !this.isFull()){
            if (this.tail == this.dizi.length){
                this.tail = 0;
            }
            this.dizi[tail++] = ArabaBilgileri;
            this.es++;
        }else{
            System.out.println("Kuyruk dolu!"+ArabaBilgileri+"eklenemedi.");
        }
    }
    
    public Object remove(){
        
        if ( !this.isEmpty()){
            Object temp = this.dizi[this.head++];
            if (this.head == this.dizi.length){
                this.head = 0;
            }
            this.es--;
            return temp;
           
        }else{
            System.out.println("Kuyruk boş!");
            return "i";
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
    
    public Object peek(){
        
        if ( !this.isEmpty()){
            return this.dizi[this.tail-1];
        }else{
            System.out.println("Kuyruk boş!");
            return "i";
        }
    }
}
