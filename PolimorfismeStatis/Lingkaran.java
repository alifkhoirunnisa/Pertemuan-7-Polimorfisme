/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeStatis;

/**
 *
 * @author UsEr
 */
public class Lingkaran {
    //menghitung luas menggunakan jari2
    float luas(float jarijari){
        return (float) (Math.PI * jarijari * jarijari);
    }
    
    double luas(double diameter){
        return (double) (Math.PI * diameter * 1/4 );
    }
    
    public static void main (String[] args){
        
        Lingkaran L = new Lingkaran();
        
        float jari2 = 10;
        float d = 100;
        
        System.out.println("Luas Lingkaran Dengan Jari-Jari = " + L.luas(jari2));
        System.out.println("Luas Lingkaran Dengan Jari-Jari = " + L.luas(d));
    }
}
