/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

/**
 *
 * @author Lorena Castro
 */
public class ArticleReference {
    public String autors;
    public int yearArticle;
    public String title;
    public String journal;
    protected int volumeJournal;
    protected int numberJournal;
    protected int pages;
    private String DOI;

    /**
     * Constructor: crea una instancia de la clase ArticleReference.
     * @param autors 
     * @param yearArticle
     * @param title
     * @param journal
     * @param volumeJournal
     * @param numberJournal
     * @param pages
     * @param DOI Identificador de objeto digital.
     */
    public ArticleReference(String autors, int yearArticle, String title, String journal, int volumeJournal, int numberJournal, int pages, String DOI) {
        this.autors = autors;
        this.yearArticle = yearArticle;
        this.title = title;
        this.journal = journal;
        this.volumeJournal = volumeJournal;
        this.numberJournal = numberJournal;
        this.pages = pages;
        this.DOI = DOI;
    }

    /**
     * Método accesor del atributo DOI (Identificador del artículo en su versión digital).
     * @return 
     */
    public String getDOI() {
        return DOI;
    }

    
    /**
     * Método modificador del atributo DOI (Identificador del artículo en su versión digital).
     * @param DOI 
     */
    public void setDOI(String DOI) {
        this.DOI = DOI;
    }

    /**
     * Se sobreescribe el método toString para estructurar la referencia del artículo científico.
     * @return 
     */
    @Override
    public String toString() {
        return "La referencia del artículo científico es: " + autors + ".(" + yearArticle + "). " + title + ". " + journal + ". " + volumeJournal + "(" + numberJournal + "), " + pages + ". DOI: " + DOI;
    }

}