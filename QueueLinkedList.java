package smt2.jobsheet11;

public class QueueLinkedList {
    private NodeQueue front;
    private NodeQueue rear;
    private int size;
    private final int KAPASITAS = 100;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= KAPASITAS;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan data.");
            return;
        }
        NodeQueue newNode = new NodeQueue(mhs);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan ke antrian.");
    }

    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dapat dipanggil.");
            return null;
        }
        Mahasiswa dipanggil = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Memanggil mahasiswa: " + dipanggil.nama);
        return dipanggil;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian terdepan    : ");
            front.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampilInformasi();
        }
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("=== Daftar Antrian ===");
            NodeQueue temp = front;
            int no = 1;
            while (temp != null) {
                System.out.print(no + ". ");
                temp.data.tampilInformasi();
                temp = temp.next;
                no++;
            }
        }
    }
}
