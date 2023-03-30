/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baju;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
/**
 *
 * @author gemaa
 */
public class Main {

    /**
     * @return 
     */
    private static final Scanner input = new Scanner(System.in);
    
    public static int menu(){
        System.out.println("Menu List: ");
        System.out.println("1. Show All Data Clothes");
        System.out.println("2. Insert Clothes");
        System.out.println("3. Update Clothes");
        System.out.println("4. Delete Clothes");
        System.out.println("5. Search Clothes");
        System.out.println("Enter The Selected Number");
        int pilihan = input.nextInt();
        input.nextLine(); // utk membuang newline (enter)
        return pilihan;
    }
    
    public static void text(String messages){ 
        // program 
    }
    
    public static void main(String[] args) {
        
        Baju kaos = new Baju("kemeja", true, 120000, 12345);
        
        List<Baju> listBaju = new ArrayList<>();
        
        listBaju.add(kaos);
        
        Scanner scan = new Scanner(System.in);
        
        boolean isRunning =  true;
        
        int menu; 
        char ulang;
        
        do {
            menu = menu();
            switch(menu){
                case 1 : 
                    System.out.println("List Clothes");
                    for(Baju baju:listBaju){
                        baju.displayListBaju();
                    }
                    String input1 = input.nextLine();
                    text(input1);
                    break;
                case 2 : 
                    System.out.println("Add Clothes");
                    while(isRunning){
                        System.out.println("Insert Clothes Type");
                        String jenisBaju = scan.next();
                        if(jenisBaju.equalsIgnoreCase("quit")){
                         menu();
                         break;
                        }
                        System.out.println("Are clothes Available? Answer true = yes/ false = no ");
                        boolean isAvailable = scan.nextBoolean();
                        System.out.println("Enter The Price of The Item");
                        float hargaBarang = scan.nextFloat();
                        System.out.println("Enter Barcode Id");
                        int idBarcode = scan.nextInt();
                        Baju baju = new Baju(jenisBaju, isAvailable, hargaBarang, idBarcode);
                        listBaju.add(baju);
                    }
                    String input2 = input.nextLine();
                    text(input2);
                    break;
                case 3 :
                    System.out.println("Update Clothes");
                    String input3 = input.nextLine();
                    text(input3);
                    break;
               case 4 :
                    System.out.println("Delete Clothes");
                    while(isRunning){
                        String jenisBaju = scan.next();
                        if(jenisBaju.equalsIgnoreCase("quit")){
                            break;
                        }
//                        Baju baju = new Baju(jenisBaju);
//                        listBaju.remove(baju);
                    }
                    String input4 = input.nextLine();
                    text(input4);
                    break;
                case 5 :
                    System.out.println("Search Clothes");
                    String input5 = input.nextLine();
//                    text(input5);
//                    List<Baju> result = listBaju.stream().filter(a -> a.getjenisBaju()
//                            .equalsIgnoreCase(input5)).collect(Collectors.);
                        List<Baju> result = listBaju.stream().filter(a -> a.getjenisBaju().equalsIgnoreCase(input5))
                        .collect(Collectors.toList());
                            if (listBaju.size() == 0) {
                              System.out.println("Clothes Not Found!!!");
                            } else {
                            for (Baju b : listBaju) {
                              b.introduce();
                        }
                      }
                        
                break;
                default :
                    System.out.println("Not Found");
                }
                
                System.out.println("Do you want to choose another menu (y/t)?");
                ulang = input.next().charAt(0);
            } while (ulang!= 't');
    }    
        
        //add
//        System.out.println("List Clothes");
//        listBaju.add(kaos1);
//        listBaju.add(kaos2);
//        listBaju.add(kemeja1);
//        
//        System.out.println(listBaju);
//        System.out.println();
//        
//        //edit
//        System.out.println("Update Clothes");
//        listBaju.set(1, kaos1);
//        System.out.println(listBaju);
//        System.out.println();
//        
//        //delete
//        System.out.println("Remaining Clothes");
//        listBaju.remove(1);
//        System.out.println(listBaju);
//        System.out.println();
//        
//        //access member
//        System.out.println("Search Baju");
//        Baju rincianBaju = listBaju.get(0);
//        rincianBaju.displayListBaju();
//        System.out.println();

        
        
    }
