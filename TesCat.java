/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tescat;

import java.util.Scanner;

/**
 *
 * @author M S I
 */
public class TesCat {

    public static void main(String[] args) {  
       
        Scanner  masukan = new Scanner(System.in);   
        Cat moly = new Cat(); 
        System.out.println("============================");
        System.out.println("Masukan Data Kucing Anda!! ");
        System.out.println("============================"); 
        System.out.print("Masukan Nama Kucing adalah ");
        String namabaru=masukan.nextLine();
        moly.setName(namabaru);
        
 
        System.out.print("Masukan Berat Kucing(satuan kg) adalah ");
        double berat=masukan.nextDouble();
        masukan.nextLine();
        moly.setWeight(berat);  
        
        System.out.print("Masukan Umur Kucing adalah ");
        String umur= masukan.nextLine();  
        moly.setAge(umur); 
        
      
        System.out.print("Masukan Ras Kucing adalah ");
        String rasbaru=masukan.nextLine(); 
        moly.setRas(rasbaru); 
        
        System.out.print("Masukan Kelamin kucing adalah ");
        String kelaminbaru=masukan.next();   
        moly.setKelamin(kelaminbaru);
       
        masukan.nextLine();
        System.out.print("Masukan Warna Mata Kucing adalah "); 
        String warnaMatabaru=masukan.nextLine();  
        moly.setWarnaMata(warnaMatabaru);
        
         
        System.out.print("Masukan Warna Rambut kucing adalah ");
        String warnaRambutbaru=masukan.nextLine(); 
        moly.setWarnaRambut(warnaRambutbaru);
        
         
        System.out.println("            ");
        
       //Outputan atau Hasil dari masukan 
       System.out.println("============================");
       System.out.println("Tampilan dari hasil masukan ");
       System.out.println("============================");
       System.out.println("Nama Kucing adalah " +moly.getName()); 
       System.out.println("Berat badan kucingku adalah " +moly.getWeight());    
       System.out.println("Umur Kucingku adalah " +moly.getAge());   
       System.out.println("Ras Kucingku adalah " +moly.getRas());   
       System.out.println("Kelamin kucingku adalah " +moly.getKelamin()); 
       System.out.println("Warna Mata Kucingku adalah " +moly.getWarnaMata());  
       System.out.println("warnaRambutbaru = " +moly.getWarnaRambut()); 
    }

    
}
