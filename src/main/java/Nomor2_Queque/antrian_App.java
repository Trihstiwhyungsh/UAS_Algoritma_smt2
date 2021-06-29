
package Nomor2_Queque;

public class antrian_App {
    public static void main(String[] args) {
        String nama = "Tri Hesti Wahyuningsih";
        antrian Antrian = new antrian(10);
        
        Antrian.enqueue(50);
        Antrian.display();
        Antrian.enqueue(60);
        Antrian.display();
        System.out.println("nilai yang paling depan = " + Antrian.peek());
        System.out.println("nama saya adalah " + nama);
        System.out.println();
        Antrian.enqueue(70);
        Antrian.display();
        System.out.println("nilai yang dikeluarkan = " +Antrian.peek());
        Antrian.dequeue();
        Antrian.display();
        
        System.out.println("nilai yang yang paling depan = " +Antrian.peek());
    }
    
}   




