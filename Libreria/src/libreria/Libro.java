/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Objects;

/**
 *
 * @author 77873875
 */
public class Libro {
   
    private String titolo;
    private String autore;
    private String casaEditrice;
    private String genere;
    private String codice;
    /**
     * 
     * @param titolo 
     * @param autore 
     * @param casaEditrice
     * @param genere
     * @param codice codice ISBN del libro
     */

    public Libro(String titolo, String autore, String casaEditrice, String genere, String codice) {
        this.titolo = titolo;
        this.autore = autore;
        this.casaEditrice = casaEditrice;
        this.genere = genere;
        this.codice = codice;
    }
    public Libro(Libro libro) {
        this.titolo = libro.titolo;
        this.autore = libro.autore;
        this.casaEditrice = libro.casaEditrice;
        this.genere = libro.genere;
        this.codice = libro.codice;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
    public String getAutore() {
        return autore;
    }
 
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Libro)) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titolo, other.titolo)) {
            return false;
        }
        if (!Objects.equals(this.autore, other.autore)) {
            return false;
        }
        if (!Objects.equals(this.casaEditrice, other.casaEditrice)) {
            return false;
        }
        if (!Objects.equals(this.genere, other.genere)) {
            return false;
        }
        if (!Objects.equals(this.codice, other.codice)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titolo=" + titolo + ", autore=" + autore + ", casaEditrice=" + casaEditrice + ", genere=" + genere + ", codice=" + codice + '}';
    }
    
    
}
