package ba.unsa.etf.rpr;

public class Supermarket {
    private int zauzeto = 0;

    private Artikl[] artikli = new Artikl[1000];

    @Override
    public String toString() {
        //izlistamo sve artikle
        //metoda koja vraca samo jedan string!
        String str = "";
        for (int i = 0; i < zauzeto; i++) {
            str += artikli[i].toString() + '\n';
        }
        return str;
    }

    public void dodajArtikl(Artikl noviArt) {
        //ljepse sa zagradama
        if (zauzeto != 1000) {
            artikli[zauzeto++] = noviArt;
        } else {
            System.out.println("Greska, puno je");
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for (int i = 0; i < zauzeto; i++) {
            if (artikli[i].getKod().equals(kod)) {
                Artikl pom = artikli[i];
                artikli[i] = artikli[zauzeto - 1];
                zauzeto--;
                return pom;
            }
        }
        return null;
    }
}
