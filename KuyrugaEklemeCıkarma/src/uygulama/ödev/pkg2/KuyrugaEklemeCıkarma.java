
package uygulama.ödev.pkg2;


public class KuyrugaEklemeCıkarma {
    
    
    public static void main(String[] args) {
        Araba a = new Araba();
        kuyruk k = new kuyruk(5);
        
        a.ArabaBilgileri("Toyota - Yaris - 2019");
        k.insert(a);
        k.print();
        
        k.insert("Hyundai - Accent - 2018");
        k.print();
        
        k.insert("Fiat - Egea - 2017");
        k.print();
       
        k.insert("Honda - Civic - 2010");
        k.print();
        
        k.insert("Renault - Megane - 2013");
        k.print(); 
        
        System.out.println("Çıkarılan araba "+ k.remove()+ ".");
        k.print();
        System.out.println("Çıkarılan araba "+ k.remove()+ ".");
        k.print(); 
       
        k.insert("Citroen - C4 - 2011");
        k.print();
       
        k.insert("Nissan - Qashqai - 2015");
        k.print();
       
    }
    
}
