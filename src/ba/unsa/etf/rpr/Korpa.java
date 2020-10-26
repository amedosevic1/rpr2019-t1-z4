package ba.unsa.etf.rpr;

public class Korpa {
    private int zauzeto = 0;

    private Artikl[] artikliKupca = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        //provjera jel korpa puna
        if (zauzeto != 50) {
            artikliKupca[zauzeto++] = a;
            return true;
        } else {
            System.out.println("Greska, ne mozes vise kupiti");
            return false;
        }

    }

    public Artikl[] getArtikli() {
        return artikliKupca;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < zauzeto; i++) {
            if (artikliKupca[i].getKod().equals(kod)) {
                Artikl pom = artikliKupca[i];
                artikliKupca[i] = artikliKupca[zauzeto - 1];
                zauzeto--;
                return pom;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;

        // Moj komenatar zašto ne koristiti rangovsku ovdje:

        /*for (Artikl t : artikliKupca)
            if (t != null) // Greska1: posto su neki artikli prazni od ukupnog mjesta, pokazuju na null, moramo provjeriti to!
                cijena += t.getCijena();

                Greska2: ovako nemamo stanje o trenutnom stanju, tjst zauzetom broju mjesta. Rangovskom sracunamo cijenu
                svih artikala koji su prosli korpom, cak i oni koji su izbaceni.

                */

        for(int i=0; i<zauzeto; i++){
            cijena+=artikliKupca[i].getCijena();
        }

        return cijena;
    }
}
