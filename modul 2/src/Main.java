class Mahasiswa {
    static String universitas = "Nama Universitas"; // Ganti dengan nama universitas Anda
    String nim, nama, jurusan;

    Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    void tampilDataMahasiswa() {
        System.out.println("Detail Mahasiswa:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    static void tampilUniversitas() {
        System.out.println("Universitas: " + universitas);
    }
}