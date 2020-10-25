package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    private String naziv, kod;
    private int cijena;

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.kod = kod;
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    @Override
    public boolean equals(Object o) {
        Artikl artikl = (Artikl) o;
        return this.getKod().equalsIgnoreCase(artikl.getKod());
    }

    @Override
    public String toString() {
        return getNaziv() + " " + getCijena() + " " + getKod();
    }
}
