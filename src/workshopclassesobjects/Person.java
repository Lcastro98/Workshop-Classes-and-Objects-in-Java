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
     * Constructor: crea una instancia de la clase Person (persona).
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
     * Método accesor del atributo name (nombre de la persona).
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método modificador del atributo name (nombre de la persona).
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Se sobreescribe el método toString para presentar los datos de la persona de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "Datos de la Persona: " + "Nombre: " + name + "; Primer Apellido: " + lastName1 + "; Segundo Apellido: " + lastName2 + "; Fecha de Nacimiento: " + dateBirth + "; Altura: " + height + "; Peso: " + weight + '.';
    }
    
}
