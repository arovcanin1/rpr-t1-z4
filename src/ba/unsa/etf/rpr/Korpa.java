package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl artikl) {

        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] == null) {
                artikli[i] = artikl;
                break;
            }
        }

        if (artikli.length > 50) {
            return false;
        }

        return true;
    }



    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena = 0;

        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] != null) {
                ukupna_cijena = ukupna_cijena + artikli[i].getCijena();
            }
        }

        return ukupna_cijena;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        Artikl artikl = new Artikl("", 0, "");
        Artikl[] temp = new Artikl[50];

        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i].getKod().equals(kod) && i != 0) {
                artikl = artikli[i];
                System.arraycopy(artikli, 0, temp, 0, i-1);
                System.arraycopy(artikli, i+1, temp, i, 50 - i - 1);
                artikli = temp;
                break;
            }

            else if (artikli[i].getKod().equals(kod) && i == 0) {
                artikl = artikli[i];
                System.arraycopy(artikli, 1, temp, 0, 50 - 1);
                artikli = temp;
                break;
            }
        }

        return artikl;
    }



}

