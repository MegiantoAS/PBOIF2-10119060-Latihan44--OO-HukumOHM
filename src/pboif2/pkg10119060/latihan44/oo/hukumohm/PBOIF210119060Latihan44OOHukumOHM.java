/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan44.oo.hukumohm;
import Baterai.Baterai;
/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Baterai
 */
public class PBOIF210119060Latihan44OOHukumOHM {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai objBaterai = new Baterai();
        
        Baterai objBaterai1 = new Baterai(3, 12);
        System.out.println("Kuat Arus : "+objBaterai1.getkuatArus ());
        System.out.println("hambatan : "+objBaterai1.gethambatan());
        System.out.println("Hasil Teganngan : "+objBaterai1.hitunTegangan());
        
    }
    
}
