
package Biodata;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Penjualan {
    private final ArrayList<Barang> list_Barang;
    private double totalHarga;

    public Penjualan() {
        list_Barang = new ArrayList<>();
        totalHarga = 0;
    }

    public void tambahBarang(Barang barang) {
        list_Barang.add(barang);
        totalHarga += barang.getHarga();
        barang.setStok(barang.getStok() - 1);
    }

    public void tampilkanDetailPenjualan() {
        System.out.println("======= Detail Penjualan =======");
        for (Barang barang : list_Barang) {
            barang.tampilkanInfoBarang();
        }
        System.out.println("Total Harga: " + totalHarga);
    }

    public void tambahBarang2(Barang barang2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
