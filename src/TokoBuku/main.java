/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

import DaftarBuku.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author JIHAN PUTRI RATU S
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nama;
       int pilih = 0;
       int no;
   
        Scanner scn = new Scanner (System.in);
        ArrayList<ListBooks> daftarBuku = new ArrayList<>();
         
        System.out.println("Masukkan Nama Pemesan : ");
        nama = scn.nextLine();
        System.out.println("Daftar Jenis Buku : ");
        System.out.println("1. Novel");
        System.out.println("2. Biografi");
        System.out.println("3. Majalah");
        System.out.println("4. Cerpen");
        try {
        System.out.println("Masukkan Pilihan Anda : ");
        pilih = scn.nextInt();
        } catch (Exception error) {
           System.out.println(error.getMessage());
        } finally {
           switch (pilih) {
               case 1:
                   daftarBuku.add(new Novel("N101", "Laskar Pelangi", "Andrea Hirata", 2005));
                   break;
               case 2:
                   daftarBuku.add(new Biografi("B201", "S.K. Trimurti – Pejuang Perempuan Indonesia", "Ipong Jazimah", 2016));
                   break;
               case 3:
                   daftarBuku.add(new Majalah("M301", "Majalah Anak BOBO", "Lucia Triundari", 2002));
                   break;
               case 4:
                   daftarBuku.add(new Cerpen("C401", "Filosofi Kopi", "Dee Lestari", 2006));
                   break;
               default:
                   System.out.println("Pilihan Anda tidak Tersedia. Mohon Masukkan Pilihan dengan Benar.");
                   break;
           }
        }
        
        for(ListBooks b: daftarBuku){
            b.detail_buku();
        }
    }
}
