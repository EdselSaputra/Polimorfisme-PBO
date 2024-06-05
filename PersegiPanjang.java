package polimorfisme;

public class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}
