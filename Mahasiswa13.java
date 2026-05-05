package smt2.jobsheet11;

public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa13() {}

    public Mahasiswa13(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-15s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}
