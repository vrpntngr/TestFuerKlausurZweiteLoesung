package org.example.testen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PunkteZaehlerTest {

    // TODO schreiben Sie die fehlenden Tests
    @Test
    public void listeMitEinemElement() {
        List<Spielkarte> karten = new ArrayList<>();
        karten.add(new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ));

        PunkteZaehler p = new PunkteZaehler();
        int result = p.getSummePunkte(karten);

        int expected = 11;

        assertEquals(expected, result);
    }

    @Test
    public void listeMitMehrereElement() {
        List<Spielkarte> karten = new ArrayList<>();
        karten.add(new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ));
        karten.add(new Spielkarte(KartenWert.BUBE, KartenFarbe.PIK));
        karten.add(new Spielkarte(KartenWert.SIEBEN, KartenFarbe.HERZ));

        PunkteZaehler p = new PunkteZaehler();
        int result = p.getSummePunkte(karten);

        int expected = 13;

        assertEquals(expected, result);
    }

    // leere Liste
    // null
    // mehrere Elemente mit doppelten Karten

    @Test
    public void listeMitMehrereElementNurHerzZaehlen() {
        List<Spielkarte> karten = new ArrayList<>();
        karten.add(new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ));
        karten.add(new Spielkarte(KartenWert.BUBE, KartenFarbe.PIK));
        karten.add(new Spielkarte(KartenWert.SIEBEN, KartenFarbe.HERZ));

        PunkteZaehler p = new PunkteZaehler();
        int result = p.getSummePunkteFuerFarbe(KartenFarbe.HERZ, karten);

        int expected = 11;

        assertEquals(expected, result);
    }

    @Test
    public void listeMitMehrereElementNurHerzZaehlenMitMehrerenHerzen() {
        List<Spielkarte> karten = new ArrayList<>();
        karten.add(new Spielkarte(KartenWert.ASS, KartenFarbe.HERZ));
        karten.add(new Spielkarte(KartenWert.BUBE, KartenFarbe.PIK));
        karten.add(new Spielkarte(KartenWert.SIEBEN, KartenFarbe.HERZ));
        karten.add(new Spielkarte(KartenWert.BUBE, KartenFarbe.HERZ));

        PunkteZaehler p = new PunkteZaehler();
        int result = p.getSummePunkteFuerFarbe(KartenFarbe.HERZ, karten);

        int expected = 13;

        assertEquals(expected, result);
    }

    // keine Herzkarte dann ist die Summe 0
    // leere Liste dann ist die Summe 0

}