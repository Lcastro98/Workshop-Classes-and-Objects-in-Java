/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

import java.util.ArrayList;
/**
 * La clase Fruit permite describir las caracteristicas de la fruta que se cree en cuanto su nombre, peso promedio y posibles colores.
 * @author Lorena Castro
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Constructor: Crea una instancia del objeto Fruit (fruta).
     * @param name
     * @param averageWeight
     * @param colors 
     */
 
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    
    /**
     * Método accesor del atributo colors (colores de la fruta).
     * @return 
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método modificador del atributo colors (colores de la fruta).
     * @param colors 
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Se sobreescribe el método toString para presentar los datos de la fruta de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "La fruta " + name + " tiene un peso promedio de " + averageWeight + "gr y puede tener los siguientes colores " + colors + ".";
    }
    
    
}
