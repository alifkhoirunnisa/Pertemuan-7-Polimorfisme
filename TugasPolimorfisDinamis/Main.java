/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisDinamis;

/**
 *
 * @author UsEr
 */
public class Main {
    public static void main (String[]args){
        
        Sayur sayur = new Sayur();
        Bayam bayam = new Bayam("Hijau","bayam");
        Terong terong = new Terong("Ungu","Terong");
        Tomat tomat = new Tomat("Merah","Tomat");
        Wortel wortel = new Wortel("Orange","Wortel");

       bayam.Warna();
       bayam.Nama();
       terong.Warna();
       terong.Nama();
       tomat.Warna();
       tomat.Nama();
       wortel.Warna();
       wortel.Nama();
    }
}
