/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Helmy Krisdin Garcia
 */
public class BangunRuang extends BangunDatar{
    public void Balok(int panjang, int lebar, int tinggi){
        double luaspermukaanb = 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
        double volumeb = panjang*lebar*tinggi;
        System.out.println("Luas Permukaan Balok: "+luaspermukaanb);
        System.out.println("Volume Balok: "+volumeb);
    }
    public void Prisma(int luasalas, int selimut, int tinggi){
        double luaspermukaanp = (2*luasalas)+selimut;
        double volumep = luasalas*tinggi;
        System.out.println("Luas Permukaan Prisma: "+luaspermukaanp);
        System.out.println("Volume Prisma: "+volumep);
    }
    public void Tabung(int jari, int tinggi){
        double luaspermukaant = (2*pi*jari*jari)+(2*pi*jari*tinggi);
        double volumet = (pi*jari*jari*tinggi);
        System.out.println("Luas Permukaan Tabung: "+luaspermukaant);
        System.out.println("Volume Tabung: "+volumet);
    }
    public void Kubus(int jari){
        double luaspermukaank = 6*jari*jari;
        double volumek = jari*jari*jari;
        System.out.println("Luas Permukaan Kubus: "+luaspermukaank);
        System.out.println("Volume Kubus: "+volumek);
    }
    
}
