/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

/**
 * La clase Smartphone permite obtener datos relevantes de un celular.
 * @author Lorena Castro
 */
public class Smartphone {
    protected String brand;
    protected String model;
    public String operatingSystem;
    protected String processor;
    protected String RAM;
    public String storage;
    
    /**
     * Constructor: crea una instancia de la clase Smartphone.
     * @param brand
     * @param model
     * @param operatingSystem
     * @param processor
     * @param RAM
     * @param storage 
     */
    public Smartphone(String brand, String model, String operatingSystem, String processor, String RAM, String storage) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    /**
     * Método accesor del atributo brand (marca del celular).
     * @return 
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Método modificador del atributo brand (marca del celular).
     * @param brand 
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Se sobreescribe el método toString para presentar las características del celular de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "Características del Celular: " + "Marca: " + brand + "; Modelo: " + model + "; Sistema Operativo: " + operatingSystem + "; procesador: " + processor + "; RAM: " + RAM + "; Almacenamiento:" + storage + '.';
    }
    
    
}
