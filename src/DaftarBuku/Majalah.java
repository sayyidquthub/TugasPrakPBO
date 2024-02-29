/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaftarBuku;

/**
 *
 * @author JIHAN PUTRI RATU S
 */
public class Majalah extends ListBooks{

    public Majalah(String idBuku, String judulBuku, String penulis, int tahunTerbit) {
        super(idBuku, judulBuku, penulis, tahunTerbit);
    }

    @Override
    public double harga() {
        return 25.000;
    }

    @Override
    public void detail_buku() {
        System.out.println("ID Buku         : " + this.idBuku);
        System.out.println("Judul Buku      : " + this.judulBuku);
        System.out.println("Karya           : " + this.penulis);
        System.out.println("Tahun Terbit    : " + this.tahunTerbit);
        System.out.println("Harga Awal (Rp) : " + this.harga());
        System.out.println("Diskon Buku(Rp) : 0");
        System.out.println("Total (Rp)      : " + this.harga());
    }
}
