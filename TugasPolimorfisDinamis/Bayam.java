/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisDinamis;

/**
 *
 * @author UsEr
 */
public class Bayam extends Sayur{
    String Warna;
    String Nama;
    
    public Bayam (String warna, String nama){
        this.Warna = warna;
        this.Nama = nama;
    }
    
    @Override
     void warna(){
        System.out.println("Warna Sayur Bayam"+ Warna);
    }
     @Override
    void Nama(){
        System.out.println("Nama Sayur Bayam"+ Nama);
    
}

    void Warna() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
