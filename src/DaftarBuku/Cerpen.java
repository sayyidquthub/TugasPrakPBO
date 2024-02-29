/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaftarBuku;

import Interface.Disc;
/**
 *
 * @author JIHAN PUTRI RATU S
 */
public class Cerpen extends ListBooks implements Disc{

    public Cerpen(String idBuku, String judulBuku, String penulis, int tahunTerbit) {
        super(idBuku, judulBuku, penulis, tahunTerbit);
    }

    @Override
    public double harga() {
        return 50.000;
    }

    @Override
    public void detail_buku() {
        System.out.println("ID Buku         : " + this.idBuku);
        System.out.println("Judul Buku      : " + this.judulBuku);
        System.out.println("Karya           : " + this.penulis);
        System.out.println("Tahun Terbit    : " + this.tahunTerbit);
        System.out.println("Harga Awal (Rp) : " + this.harga());
        System.out.println("Diskon Buku(Rp) : " + this.Diskon());
        System.out.println("Total (Rp)      : " + (this.harga() - this.Diskon()));
    }

    @Override
    public double Diskon() {
       double diskon = 0.10;
       return diskon * this.harga();
    }
    
}
