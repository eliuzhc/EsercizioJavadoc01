/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author 77873875
 */
public class Libreria {
    private Libro []libri;
    private final int dimensione;

    /**
     * 
     * @param dimensione: set numero di libri che la libreria può contenere
     */
    public Libreria(int dimensione) {
        libri=new Libro[dimensione];
        this.dimensione= dimensione;
    }

    public Libro getLibro(int i) {
        return libri[i];
    }

    public void setLibro(Libro libro) {
        for (int i=0 ; i<dimensione; i++)
            if (libri[i]==null){
                libri[i]=libro;
                return;
            }
    }
    
    
}
