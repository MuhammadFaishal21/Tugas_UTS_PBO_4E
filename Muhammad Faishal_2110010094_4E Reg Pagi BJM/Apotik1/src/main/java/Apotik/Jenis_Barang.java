
package Biodata;


public class Jenis_Barang {
    private final String nama;
    private String keterangan;

    public Jenis_Barang(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void tampilkanInfoJenisBarang() {
        System.out.println("Jenis_Barang: " + nama);
        System.out.println("Keterangan: " + keterangan);
    }

}
