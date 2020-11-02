package ba.unsa.etf.rpr;
// Ovo je komentar
public class Artikl {
    private String artikl;
    private int cijena;
    private String kod;

    public Artikl(String artikl, int cijena, String kod) {
        this.artikl = artikl;
        this.cijena = cijena;
        this.kod = kod;
    }

    public String getNaziv() {
        return artikl;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setNaziv(String artikl) {
        this.artikl = artikl;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }


}
