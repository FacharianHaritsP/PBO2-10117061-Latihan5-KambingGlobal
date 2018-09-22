/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan5.kambingglobal;

/**
 *
 * @author Fachrian Harits Pratama
 * Nama                 : Fachrian Harits Pratama
 * Kelas                : PBO2
 * NIM                  : 10117061
 * Deskripsi program    : Program ini berisi program  dengan variabel instance
 */
public class PBO210117061Latihan5KambingGlobal {

//Variabel jumlahKambing menjadi variabel instance

 int jumlahKambing = 88 ;
 
//Menthod untuk menampilkan jumlah kambing
public void getJumlahKambing(){
    System.out.println("Jumlah Kambing: " + jumlahKambing);
}
public void tambahKambing(){
    jumlahKambing = jumlahKambing +5;
    System.out.println("jumlah kambing setelah ditambah: " + jumlahKambing);
}   
public static void main(String[] args) {
    PBO210117061Latihan5KambingGlobal Kambingsusu = new 
            PBO210117061Latihan5KambingGlobal();
    
    //menampilkan jumlah kambing yang ada saat program  pertama x berjalan
    Kambingsusu.getJumlahKambing();
    
    //menambah satu kambing
    Kambingsusu.tambahKambing();
    
    //menampilkan jukah kambing
    Kambingsusu.getJumlahKambing();
    
    }
    
}
