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
public abstract class ListBooks {

    public String idBuku;
    public String judulBuku;
    public String penulis;
    public int tahunTerbit;
    
    public abstract double harga();
    
    public abstract void detail_buku();
    
    public ListBooks(String idBuku, String judulBuku, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
}

