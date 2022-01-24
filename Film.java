package imdb;

public class Film {

    String naziv;
    String zanr;
    int godina;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Film () {};

    public Film (String naziv, String zanr, int godina) {
        this.naziv = naziv;
        this.zanr = zanr;
        this.godina = godina;
    }



}
