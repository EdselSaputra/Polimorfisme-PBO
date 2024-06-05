package polimorfisme;

public class main{
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        int pilihan = 2;

        switch (pilihan) {
            case 1:
                bangunDatar = new Persegi(4);
                System.out.println("Luas Persegi: " + bangunDatar.hitungLuas());
                break;
            case 2:
                bangunDatar = new PersegiPanjang(5, 3);
                System.out.println("Luas Persegi Panjang: " + bangunDatar.hitungLuas());
                break;
            case 3:
                bangunDatar = new Lingkaran(10);
                System.out.println("Luas Lingkaran: " + bangunDatar.hitungLuas());
                break;
            default:
                System.out.println("Salah Input");
        }
    }
}