
package Nomor1_Stack;

public class Tumpukan_App {
    public static void main (String [] args){     
    String nama = "Tri Hesti Wahyuningsih";
    
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(10);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("nilai teratas = " + tumpukan.peek());
        System.out.println("Nama saya adalah " + nama);
        System.out.println("Nilai yang dihapus = " + tumpukan.peek());
        tumpukan.pop();
        tumpukan.baca();
        System.out.println();
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
               
   }
    
}


