/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

/**
 *
 * @author Lorena Castro
 */
public class Smartphone {
    protected String marca;
    protected String modelo;
    public String sistemaOperativo;
    public String procesador;
    public String RAM;
    public String memoria;

    /**
     * Constructor: crea una instancia de la clase Smartphone.
     * @param marca
     * @param modelo
     * @param sistemaOperativo
     * @param procesador
     * @param RAM
     * @param memoria 
     */
    public Smartphone(String marca, String modelo, String sistemaOperativo, String procesador, String RAM, String memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.RAM = RAM;
        this.memoria = memoria;
    }

    /**
     * Método accesor del atributo Marca.
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método modificador del atributo Marca.
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
