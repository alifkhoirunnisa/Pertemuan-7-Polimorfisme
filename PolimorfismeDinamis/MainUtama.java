/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeDinamis;

/**
 *
 * @author UsEr
 */
public class MainUtama {
    public static void main (String[] args){
        
        BangunDatar bangundatar = new BangunDatar();
        Persegi persegi = new Persegi (5);
        Segitiga segitiga = new Segitiga (5,10);
        Lingkaran lingkaran = new Lingkaran (10);
        
        //panggil method luas dan keliling
        bangundatar.luas();
        bangundatar.keliling();
        
        System.out.println("Luas Persegi: " +persegi.luas());
        System.out.println("Keliling Persegi: " +persegi.keliling());
        System.out.println("Luas Persegi: " +persegi.luas());
        System.out.println("Keliling Persegi: " +persegi.keliling());
        
    }
    
}
