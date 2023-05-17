/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biodata;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Penjualan2 {
    private final ArrayList<Barang> listBarang;
    private double totalHarga;

    public Penjualan2() {
        listBarang = new ArrayList<>();
        totalHarga = 0;
    }

    public void tambahBarang2(Barang barang) {
        listBarang.add(barang);
        totalHarga += barang.getHarga();
        barang.setStok(barang.getStok() - 1);
    }

    public void tampilkanDetailPenjualan() {
        System.out.println("======= Detail Penjualan =======");
        for (Barang barang : listBarang) {
            System.out.println("Nama Barang: " + barang.getNama());
            System.out.println("Harga Satuan: " + barang.getHarga());
            System.out.println("Jumlah Beli: 1");
            System.out.println("Subtotal: " + barang.getHarga());
            System.out.println();
        }
        System.out.println("Total Harga: " + totalHarga);
    }
}

