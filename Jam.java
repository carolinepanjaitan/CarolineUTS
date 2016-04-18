package perhitunganjam;

public class Jam {

    int hh, mm, dd;

    public Jam() {
    }
    

    public Jam(int hh, int mm, int dd) {
        this.hh = hh;
        this.mm = mm;
        this.dd = dd;
    }
    
    int convertJamToMenit(int jam) {
        int menit;
        menit = jam * 60;
        return menit;
    }
    
    int convertJamToDetik(int jam) {
        int detik;
        return detik = jam * 3600;
    }
    
    int convertMenitToDetik(int menit) {
        int detik;
        return detik = menit * 60;
    }
    
    int convertDetikToMenit(int detik) {
        int menit;
        return menit = detik / 60;
    }
    
    int convertDetikToJam(int detik) {
        int jam;
        return jam = detik / 3600;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }
}
