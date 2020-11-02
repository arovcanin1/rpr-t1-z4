package ba.unsa.etf.rpr;

public class Supermarket {

    Artikl[] artikli = new Artikl[1000];

    public void dodajArtikl (Artikl a) {

        for (int i = 0; i < artikli.length; i++) {
            if (artikli[i] == null) {
                artikli[i] = a;
                break;
            }
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {


        Artikl artikl = new Artikl("", 0, "");
        Artikl[] temp = new Artikl[1000];

        for (int i = 0; i < artikli.length; i++)
        {
            if (artikli[i].getKod().equals(kod) && i != 0) {
                artikl = artikli[i];
                System.arraycopy(artikli, 0, temp, 0, i-1);
                System.arraycopy(artikli, i+1, temp, i, 1000 - i - 1);
                artikli = temp;
                break;
            }

            else if (artikli[i].getKod().equals(kod) && i == 0) {
                artikl = artikli[i];
                System.arraycopy(artikli, 1, temp, 0, 1000 - 1);
                artikli = temp;
                break;
            }
        }

        return artikl;
    }


}
