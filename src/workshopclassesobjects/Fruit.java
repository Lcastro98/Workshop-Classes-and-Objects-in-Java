/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;
import java.util.ArrayList;
/**
 *
 * @author Lorena Castro
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Constructor: Crea una instancia del objeto Fruit
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
     * 
     * @return 
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * 
     * @param colors 
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
