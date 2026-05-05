package smt2.jobsheet11;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        QueueLinkedList antrian = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n====================================");
            System.out.println("  SISTEM ANTRIAN UNIT KEMAHASISWAAN ");
            System.out.println("====================================");
            System.out.println("1. Daftar Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Kelas : "); String kelas = sc.nextLine();
                    System.out.print("IPK   : "); double ipk = sc.nextDouble();
                    sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, kelas, ipk));
                    break;
                case 2:
                    Mahasiswa dipanggil = antrian.dequeue();
                    if (dipanggil != null) {
                        System.out.print("Data: ");
                        dipanggil.tampilInformasi();
                    }
                    break;
                case 3:  antrian.peekFront(); break;
                case 4:  antrian.peekRear(); break;
                case 5:  antrian.printQueue(); break;
                case 6:  System.out.println("Jumlah mengantre: " + antrian.getSize()); break;
                case 7:  System.out.println(antrian.isEmpty() ? "Antrian KOSONG." : "Antrian tidak kosong."); break;
                case 8:  System.out.println(antrian.isFull() ? "Antrian PENUH." : "Antrian belum penuh."); break;
                case 9:  antrian.clear(); break;
                case 0:  System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
