/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

/**
 *
 * @author Lorena Castro
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    /**
     * Constructor: crea una instancia de la clase BankAccount.
     * @param accountNumber
     * @param activated 
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Método accesor del atributo activated (activada).
     * @return 
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Método modificador del atributo activated (activada).
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Se sobreescribe el método toString para presentar los datos de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        return "Cuenta Bancaria: " + "Número de Cuenta: " + accountNumber + "; Está activa: " + activated + '.';
    }
    
}
