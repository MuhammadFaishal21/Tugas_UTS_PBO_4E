
package Biodata;


public class Barang {
    private final String nama;
    private double harga;
    private int stok;
    private final Jenis_Barang jenis1;

    public Barang(String nama, double harga, int stok, Jenis_Barang jenis) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.jenis1 = jenis;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public Jenis_Barang getJenis() {
        return jenis1;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilkanInfoBarang() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Jenis Barang: " + jenis1.getNama());
        System.out.println("Keterangan: " + jenis1.getKeterangan());
    }

}
