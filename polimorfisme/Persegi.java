package polimorfisme;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}