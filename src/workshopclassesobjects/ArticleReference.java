/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshopclassesobjects;

/**
 * La clase ArticleReference recopila los datos que se necesitan para realizar su referencia en APA, siguiendo el orden estipulado por esta norma.
 * @author Lorena Castro
 */
public class ArticleReference {
    public String autors;
    public int yearArticle;
    protected String title;
    private String journal;
    private int volumeJournal;
    private int numberJournal;
    private int pages;
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

    public ArticleReference(String autors, int yearArticle, String title, String journal, int volumeJournal, int numberJournal, int pages) {
        this.autors = autors;
        this.yearArticle = yearArticle;
        this.title = title;
        this.journal = journal;
        this.volumeJournal = volumeJournal;
        this.numberJournal = numberJournal;
        this.pages = pages;
    }
    
    

    /**
     * Método accesor del atributo journal (revista).
     * @return 
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Método accesor del atributo volumeJournal (volumen de la revista).
     * @return 
     */
    public int getVolumeJournal() {
        return volumeJournal;
    }

    /**
     * Método accesor del atributo numberJournal (número de la revista).
     * @return 
     */
    public int getNumberJournal() {
        return numberJournal;
    }

    /**
     * Método accesor del atributo pages (página del artículo en la revista).
     * @return 
     */
    public int getPages() {
        return pages;
    }
    
    /**
     * Método accesor del atributo DOI (Identificador del artículo en su versión digital).
     * @return 
     */
    public String getDOI() {
        return DOI;
    }

    /**
     * Se sobreescribe el método toString para estructurar la referencia del artículo científico.
     * @return 
     */
    @Override
    public String toString() {
        return "La referencia del artículo científico es: " + autors + ".(" + yearArticle + "). " + title + ". " + journal + ". " + volumeJournal + "(" + numberJournal + "), " + pages + "." + (DOI==null?"":" DOI: " + DOI);
    }

}