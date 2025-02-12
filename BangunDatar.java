/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class BangunDatar {
    protected final double pi = Math.PI;
    public void Segitiga(int alas, int tinggi, int sisimiring){
        double luassegitiga = (alas*tinggi)/2;
        double kelilingsegitiga = alas+tinggi+sisimiring;
        System.out.println("Luas Segitiga: "+luassegitiga);
        System.out.println("Keliling Segitiga: "+kelilingsegitiga);
    }
    public void Lingkaran(double jari){
        double luaslingkaran = pi*jari*jari;
        double kelilinglingkaran = 2*pi*jari;
        System.out.println("Luas Lingkaran: "+luaslingkaran);
        System.out.println("Keliling Lingkaran: "+kelilinglingkaran);
    }
    public void PersegiPanjang(int panjang, int lebar){
        double luaspp = panjang*lebar;
        double kelilingpp = (2*panjang)+(2*lebar);
        System.out.println(" Luas Persegi Panjang: "+luaspp);
        System.out.println(" Keliling Persegi Panjang: "+kelilingpp);
    }
    public void Persegi (int sisi){
        double luasp = sisi*sisi;
        double kelilingp = 4*sisi;
        System.out.println("Luas Persegi: "+luasp);
        System.out.println("Keliling Persegi: "+kelilingp);
    }    
}