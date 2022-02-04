/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

/**
 *
 * @author Lorena Castro
 */
public class Product {
    protected int UPC;
    public String name;
    public String description;
    private long price;

    /**
     * Constructor: crea una instancia de la clase Product.
     * @param UPC
     * @param name
     * @param description
     * @param price 
     */
    public Product(int UPC, String name, String description, long price) {
        this.UPC = UPC;
        this.name = name;
        this.description = description;
        this.price = price;
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

    /**
     * 
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return 
     */
    public long getPrice() {
        return price;
    }

    /**
     * 
     * @param price 
     */
    public void setPrice(long price) {
        this.price = price;
    }
    
    
}
