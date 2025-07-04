package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        Prodotto latte = new Prodotto("latte", "fa bene", new BigDecimal(3.12), new BigDecimal(0.22));

        System.out.println("Prezzo base: " + latte.getPrezzoBase().setScale(2, RoundingMode.HALF_UP));
        System.out.println("Prezzo ivato: " + latte.getPrezzoIvato().setScale(2, RoundingMode.HALF_UP));
        System.out.println("Nome con codice: " + latte.getNomeEsteso());
        System.out.println("Descrizione: " + latte.getDescrizione());

        Prodotto biscotti = new Prodotto("biscotti", "biscotti con goccie di cioccolato", new BigDecimal(4.99),
                new BigDecimal(0.22));

        System.out.println("Prezzo base: " + biscotti.getPrezzoBase().setScale(2, RoundingMode.HALF_UP));
        System.out.println("Prezzo ivato: " + biscotti.getPrezzoIvato().setScale(2, RoundingMode.HALF_UP));
        System.out.println("Nome con codice: " + biscotti.getNomeEsteso());
        System.out.println("Descrizione: " + biscotti.getDescrizione());

        Prodotto pomodori = new Prodotto("pomodori", "frutto della pianta di pomodoro", new BigDecimal(7.99),
                new BigDecimal(0.22), new BigDecimal(7));

        System.out.println("Prezzo base: " + pomodori.getPrezzoBase().setScale(2, RoundingMode.HALF_UP));
        System.out.println("Prezzo ivato: " + pomodori.getPrezzoIvato().setScale(2, RoundingMode.HALF_UP));
        System.out.println("Nome con codice: " + pomodori.getNomeEsteso());
        System.out.println("Descrizione: " + pomodori.getDescrizione());
        System.out.println("Indice di gradimento: " + pomodori.getIndiceGradimento());

    }
}
