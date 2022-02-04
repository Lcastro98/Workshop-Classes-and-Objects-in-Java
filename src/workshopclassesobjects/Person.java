/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;
import java.util.Date;
/**
 * 
 * @author Lorena Castro
 */
public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public float weight;

    /**
     * Constructor crea una instancia de la clase Person
     * @param name
     * @param lastName1 
     * @param lastName2
     * @param dateBirth
     * @param height
     * @param weight 
     */
    
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, float weight) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        this.weight = weight;
    }
    
    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
