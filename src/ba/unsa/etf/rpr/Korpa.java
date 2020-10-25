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
        int cijena=0;
        for(Artikl t:artikliKupca){
            cijena+=t.getCijena();
        }
        return cijena;
    }
}
