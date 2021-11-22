
package uygulama.ödev;


public class Sınıf {

    int toplamBoyut;
    int indis;
    int index;
    String[] Dizi;
    
  
    public Sınıf (int toplam){       
        this.toplamBoyut = toplam;
        this.Dizi = new String[toplam];
        indis=0;
    }
    
    public void ekleme(String a){
        if(this.indis < this.toplamBoyut ){
            this.Dizi[indis] = a;
            indis++;  
        }
        
    }
    
    public int arama(String a){        
        int index = -1;
        for (int i=0 ; i < indis ; i++){
            if(this.Dizi[i] == a){
                index = i;
            }
        }
        return index;
    }
    
    public void sil(String a){
        int index = this.arama(a);
        if (index != -1){
            while (index < this.indis-1){
                this.Dizi[index] = this.Dizi[index+1];
                index++;
                
            }
            indis--;
            System.out.println("Harf silinmiştir.");
        }else {
            System.out.println("Dizide bu harf mevcut değil.");
        }
        
    }
    
    public void guncelle(int a , String b){
        this.Dizi[a] = b; 
        System.out.println("İndis güncellenmiştir.");
    }
    
    
    
    public void yazdir(){
        System.out.print("Dizi: [");
        for (int i=0 ; i < indis ; i++){
            System.out.print(this.Dizi[i]+", ");
        }
       System.out.println("]\r");
    }
    
    
}




