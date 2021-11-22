
package yıgıtkuyruk;

import java.util.Arrays;

public class Stack {
    
    private int es;
    private int[] dizi;
    
    public Stack(int StackSize){
        this.es = 0;
        this.dizi = new int[StackSize];
    }
    
    public void push(int yeni){
        
        if ( !this.isFull()){
            this.dizi[this.es] = yeni;
            this.es++;
        }else{
            System.out.println("Stack is full!"+yeni+"eklenemedi.");
        }
    }
    
    public int pop(){
        
        if ( !this.isEmpty()){
            int tmp = this.dizi[this.es-1];
            this.es--;
            return tmp;
        }else{
            System.out.println("Stack is empty!");
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
        for(int i=0 ; i < this.es ; i++ ){
            System.out.print(this.dizi[i]+" ");
        }
        System.out.print("] \n");
        System.out.println(Arrays.toString(this.dizi));
    }
    
    public int peek(){
        
        if ( !this.isEmpty()){
            return this.dizi[this.es-1];
        }else{
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    
    
}
