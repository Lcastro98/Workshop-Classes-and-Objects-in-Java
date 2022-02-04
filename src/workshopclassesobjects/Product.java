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
    protected long UPC;
    public String name;
    public String description;
    private long price;

    /**
     * Constructor: crea una instancia de la clase Product.
     * @param UPC código de barras de un producto.
     * @param name
     * @param description
     * @param price 
     */
    public Product(long UPC, String name, String description, long price) {
        this.UPC = UPC;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Método accesor del atributo name (nombre del producto).
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método modificador del atributo name (nombre del producto).
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método accesor del atributo description (descripción del producto).
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método modificador del atributo description (descripción del producto).
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método accesor del atributo price (precio del producto).
     * @return 
     */
    public long getPrice() {
        return price;
    }

    /**
     * Método modificador del atributo price (precio del producto).
     * @param price 
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * Se sobreescribe el método toString para presentar los datos de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "Datos del Producto: " + "UPC: " + UPC + "; Nombre: " + name + "; Descripción: " + description + "; Precio: " + price + '.';
    }
    
}
