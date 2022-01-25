package SIAM;

class MataKuliah {
    private String nama;
    private String kode;
    private int sks;
    private float nilaiAngka;
    private float nilaiHuruf;

    MataKuliah(String nama, String kode, int sks) {
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
    }

    public void display() {
        System.out.println("Nama matkul\t: " + this.nama);
        System.out.println("Kode matkul\t: " + this.kode);
        System.out.println("SKS\t\t: " + this.sks);
    }
}
