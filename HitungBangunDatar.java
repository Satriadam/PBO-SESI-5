
import java.util.Scanner;

public class HitungBangunDatar {
    
    
    
    
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
    
         System.out.println("---Isikan Pilihan---");
         System.out.println("1. Bujur Sangkar");
         System.out.println("2.Persegi Panjang");
         
         int pilihan = sc.nextInt ();
         if(pilihan==1){
             BujurSangkar bs = new BujurSangkar(10);
             int luas = bs.hitungluas();
             int keliling = bs.hitungKeliling();
             System.out.println("Luas Bujur Sangkar :" + luas);
             System.out.println("Keliling Bujur Sangkar :" + keliling);
            }
         if(pilihan == 2){
             PersegiPanjang bs = new PersegiPanjang(30,25);
             int luaspersegi = bs.hitungluaspersegi();
             int kelilingpersegi = bs.hitungKelilingpersegi();
             System.out.println("luas persegi panjang :" + luaspersegi);
             System.out.println("keliling persegi panjang :" + kelilingpersegi);
          
         }
         else {
             System.out.println("input salah");}
         
    
}
}
