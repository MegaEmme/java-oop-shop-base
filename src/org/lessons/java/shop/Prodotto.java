package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    // caratteristiche tipiche => attributi
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;
    // capacità

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(9999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public BigDecimal getPrezzoBase() {
        return this.prezzo;
    }

    public BigDecimal getPrezzoIvato() {
        return prezzo.add(prezzo.multiply(iva));
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

}
