/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apotik1;

import Biodata.Barang;
import Biodata.Jenis_Barang;
import Biodata.Karyawan;
import Biodata.Pelanggan;
import Biodata.Pemasok;
import Biodata.Pemasukan;
import Biodata.Penjualan;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class Apotik1 {

    public static void main(String[] args) {
Karyawan karyawan1 = new Karyawan("Muhammad", "1234", "Muhammad Faishal", "Flamboyan", "Laki-laki", "082252173504");
karyawan1.tampilkanInfoKaryawan();

Jenis_Barang jenis1 = new Jenis_Barang("Obat Keras", "Obat yang harus diberikan sesuai resep dokter");
jenis1.tampilkanInfoJenisBarang();

Jenis_Barang jenis = new Jenis_Barang("Obat Keras", "Obat yang harus diberikan sesuai resep dokter");
Barang barang1 = new Barang("Paracetamol", 15000, 100, jenis);
Barang barang2 = new Barang("Amoxicillin", 25000, 50, jenis);

Penjualan penjualan1 = new Penjualan();
penjualan1.tambahBarang(barang1);
penjualan1.tambahBarang(barang2);
penjualan1.tampilkanDetailPenjualan();


Pelanggan pelanggan1 = new Pelanggan("Ahmad", "Jl. Merdeka No. 10", "08123456789");
System.out.println(pelanggan1.getNama()); // Output: Ahmad
System.out.println(pelanggan1.getAlamat()); // Output: Jl. Merdeka No. 10
System.out.println(pelanggan1.getTelepon()); // Output: 08123456789

pelanggan1.setTelepon("08111111111");
System.out.println(pelanggan1.getTelepon()); // Output: 08111111111


 Pemasok pemasok1 = new Pemasok("PT. ABC", "Jl. Merdeka No. 10", "08123456789");
        System.out.println("Nama Pemasok: " + pemasok1.getNama());
        System.out.println("Alamat Pemasok: " + pemasok1.getAlamat());
        System.out.println("Nomor Telepon Pemasok: " + pemasok1.getNomorTelepon());
    }




    }

