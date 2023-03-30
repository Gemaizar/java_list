/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baju;

/**
 *
 * @author gemaa
 */
public class Baju {
    private String jenisBaju;
    boolean isAvailable;
    float hargaBarang;
    int idBarcode;
    
    //Constructor with parameter
    public Baju (String jenisBaju, boolean isAvailable, float hargaBarang, int idBarcode) {
        this.jenisBaju = jenisBaju;
        this.isAvailable = isAvailable;
        this.hargaBarang = hargaBarang;
        this.idBarcode= idBarcode;
    }
    
    public String getjenisBaju(){
        return this.jenisBaju;
    }
    
    public boolean getisAvailable(){
        return this.isAvailable;
    }
    
    public float gethargaBarang(){
        return this.hargaBarang;
    }
    
     public int getidBarcode(){
        return this.idBarcode;
    }
     
    //Setter    
    public void setBaju(String jenisBaju){
        this.jenisBaju = jenisBaju;
    }
    
    void displayListBaju(){
        System.out.println("====================");
        System.out.println("Jenis Baju : " + this.jenisBaju);
         if(this.isAvailable){
        System.out.println("Apakah Tersedia : Ya");
        } else {
        System.out.println("Apakah Tersedia : Tidak");
        }
        System.out.println("Harga Baju : "  + this.hargaBarang);
        System.out.println("Nomor Barcode : " + this.idBarcode);
    }
    
    @Override
    public String toString(){
        return "Jenis Baju: " + this.jenisBaju;
    }
}
