package polimorfisme;

public class Lingkaran extends BangunDatar {
    private double diameter;
    private static final double pi = 3.14;

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double hitungLuas() {
        double jariJari = diameter / 2;
        return pi * jariJari * jariJari;
    }
}