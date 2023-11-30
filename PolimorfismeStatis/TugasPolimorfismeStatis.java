/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeStatis;

/**
 *
 * @author UsEr
 */
public class TugasPolimorfismeStatis {
    static int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    // Metode untuk menghitung luas persegi panjang
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        int luasPersegi = hitungLuas(5);
        int luasPersegiPanjang = hitungLuas(4, 6);

        System.out.println("Luas Persegi: " + luasPersegi);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
    }
}
