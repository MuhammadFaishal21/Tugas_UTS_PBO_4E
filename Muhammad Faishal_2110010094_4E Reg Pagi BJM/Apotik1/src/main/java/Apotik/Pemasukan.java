/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biodata;

import java.sql.Date;



/**
 *
 * @author ACER
 */
public class Pemasukan {
    private Date tanggal;
    private Barang barang;
    private int jumlah;
    private double harga;

    public Pemasukan( Date tanggal, Barang barang, int jumlah, double harga) {
        this.tanggal = tanggal;
        this.barang = barang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public Pemasukan(Date date, Barang barang, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
