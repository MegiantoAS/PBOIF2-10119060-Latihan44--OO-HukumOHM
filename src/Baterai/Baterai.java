/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baterai;

/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Baterai
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        System.out.println("======Hukum Ohm======");
        System.out.println("Kuat Arus yang mengalir [ada suatu kawat penghantar"
                            +" Akan berbandung lurus dengan beda potensial"
                            +" Pada Ujung-ujung kawat penghantar tersebut"
                            +" asalkan suhu kawat dijaga konstan");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getkuatArus(){
        return kuatArus;
    }
    
    public float gethambatan(){
        return hambatan;
    }
    
    public float hitunTegangan(){
        return kuatArus * hambatan;
    }
}
