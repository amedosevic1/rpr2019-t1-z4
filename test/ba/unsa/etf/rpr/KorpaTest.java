package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa;
    private int zauzeto=0;

    @BeforeEach //dobra praksa cesto
    void incijalizirajKorpu(){
        korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Hljeb", 1, "h01"));
    }

    @Test
    void test1() {
        assertTrue(korpa.dodajArtikl(new Artikl("Banana", 3, "p03")));
    }


    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }
}