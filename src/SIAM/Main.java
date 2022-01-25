package SIAM;

class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Azhary", "215150400111015", "Sistem Informasi");
        mahasiswa1.display();

        MataKuliah matkul1 = new MataKuliah("Pemrograman Dasar", "0001", 4);
        matkul1.display();
    }
}
