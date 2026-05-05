package smt2.jobsheet11;

import java.util.Scanner;

public class SLLMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList13 sll = new SingleLinkedList13();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("=== Mahasiswa ke-" + (i + 1) + " ===");
            System.out.print("NIM   : "); String nim = sc.nextLine();
            System.out.print("Nama  : "); String nama = sc.nextLine();
            System.out.print("Kelas : "); String kelas = sc.nextLine();
            System.out.print("IPK   : "); double ipk = sc.nextDouble();
            sc.nextLine();
            sll.addLast(new Mahasiswa13(nim, nama, kelas, ipk));
            sll.print();
        }

        sc.close();
    }
}
