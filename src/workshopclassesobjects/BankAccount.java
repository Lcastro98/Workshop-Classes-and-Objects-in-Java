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
     * 
     * @return 
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * 
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}
