/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshopclassesobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author lcast
 */
public class WorkshopClassesObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date dB = new Date(1998, 2, 24);
        Person p = new Person("Lorena", "Castro", "Manzano", dB, 1.64f, 54f);
        
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Verde", "Amarillo", "Marrón"));
        Fruit f = new Fruit("Pera", 250, colors);
        
        BankAccount bA = new BankAccount(123456789, true);

        ArticleReference ar = new ArticleReference("Ibarra, R., Castillo, J., Trujillo, P., García, C., Yanac, R. y Pando, B", 2021, "Enseñanza-aprendizaje de programación de computadoras: avances en la última década", "Revista Científica", 42, 3, 290, "10.14483/23448350.18339");
        
        Product pr = new Product(7702120131321L, "Suave gold", "Contiene 50 pañuelos triple hoja, tiene un peso deto de 66g y el tamaño de cada pañuelo es de 14cm x 21cm", 4000);
        
        Smartphone s = new Smartphone("Xiaomi", "Mi A3", "Android 11", "Qualcomm Snapdragon 665 GPU Adreno 610", "4 GB LPDDR4X","64 / 128 GB + microSD hasta 256GB");
        
        System.out.println(p + "\n" + f + "\n" + bA + "\n" + ar + "\n" + pr + "\n" + s);
    }
    
}
