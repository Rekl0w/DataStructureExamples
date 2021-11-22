package uygulama.ödev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DiziIslemleri {

    public static void main(String[] args) throws IOException {
     
        int diziUzunluk = 5;
        Sınıf s = new Sınıf(diziUzunluk);
        
        int girilenSayi = 0;
        String harf = "";
        int sonuc = 0;
        int sayi = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("Diziye ekleme yapmak: 1");
            System.out.println("Diziden eleman silme: 2");
            System.out.println("Dizide arama yapma: 3");
            System.out.println("Dizide eleman güncelleme: 4");
            System.out.println("Diziyi yazdırma: 5");
            
            girilenSayi = Integer.valueOf(br.readLine());
            
            switch(girilenSayi){
                case 1:
                    System.out.print("\nEklemek istediğiniz harfi giriniz:");
                    harf = String.valueOf(br.readLine());
                    s.ekleme(harf);
                    s.yazdir();
                    break;
                case 2:
                    System.out.print("\nSilmek istediğiniz harfi giriniz:");
                    harf = String.valueOf(br.readLine());
                    s.sil(harf);
                    s.yazdir();
                    break;
                case 3:
                    System.out.print("\nAramak istediğiniz harfi giriniz:");
                    harf = String.valueOf(br.readLine());
                    sonuc = s.arama(harf);
                    if (sonuc == -1){
                        System.out.print("\nAradığınız harf bulunamadı.");
                    }else{
                        System.out.print("\nAradığınız harf " + sonuc + ". indisdedir.");
                    }
                    s.yazdir();
                    break;
                case 4:
                    System.out.print("\nGüncellemek istediğiniz indisi giriniz:");
                    sayi = Integer.valueOf(br.readLine());
                    System.out.print("\nYazmak istediğiniz harfi giriniz:");
                    harf = String.valueOf(br.readLine());
                    s.guncelle(sayi,harf);
                    s.yazdir();
                    break;
                case 5:
                    s.yazdir();
                    break;
            }
           
        } while (girilenSayi != 5);
    }

}
