import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class main {
    private static final List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah meminta input integer

            switch (pilihan) {
                case 1:
                    tambahDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 3);
    }

    private static void tambahDataMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        while (nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka. Silakan coba lagi.");
            System.out.print("Masukkan NIM mahasiswa: ");
            nim = scanner.nextLine();
        }

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jurusan);
        daftarMahasiswa.add(mahasiswa);

        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }

    private static void tampilkanDataMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("\nData Mahasiswa:");
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                mahasiswa.tampilDataMahasiswa();
                System.out.println();
            }
        }
    }
}
