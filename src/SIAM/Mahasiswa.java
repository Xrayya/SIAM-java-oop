package SIAM;

import java.util.ArrayList;

class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;

    static ArrayList<String> NIM_LIST = new ArrayList<String>();

    Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;

        NIM_LIST.add(nim);
    }

    public void display() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("NIM\t: " + this.nim);
        System.out.println("Prodi\t: " + this.prodi);
    }
}
