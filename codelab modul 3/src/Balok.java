import java.util.Scanner;

public class Balok extends BangunRuang{

    Balok(String name) {
        super(name);
    }

    Scanner scanner = new Scanner(System.in);
    double panjang;
    double lebar;
    double tinggi;

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = ((panjang * lebar)+(panjang*tinggi)+(lebar*tinggi)) * 2;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = panjang*lebar*tinggi;
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}