// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di "utilità" per fare in modo che:
// - esistano almeno due costruttori diversi
// - il codice prodotto sia accessibile solo in lettura
// - gli altri attributi siano accessibili sia in lettura che in scrittura
package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    // attributi

    private final int codice; // accessibile solo in lettura tramite comando final
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;
    private BigDecimal indiceGradimento;

    // costruttori

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(9999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, BigDecimal indiceGradimento) {
        Random rand = new Random();
        this.codice = rand.nextInt(9999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.indiceGradimento = indiceGradimento;
    }

    // metodi getter e setter

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public void setPrezzoBase(BigDecimal prezzoBase) {
        this.prezzo = prezzoBase;
    }

    public BigDecimal getPrezzoIvato() {
        return prezzo.add(prezzo.multiply(iva));
    }

    // setPrezzoIvato è inutile in quanto è sempre uguale al prezzo moltiplicato per
    // 0.22

    public BigDecimal getIndiceGradimento() {
        return this.indiceGradimento;
    }

    public void setIndiceGradimento(BigDecimal indiceGradimento) {
        this.indiceGradimento = indiceGradimento;
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

}
