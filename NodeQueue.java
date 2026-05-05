package smt2.jobsheet11;

public class NodeQueue {
    Mahasiswa data;
    NodeQueue next;

    public NodeQueue(Mahasiswa data) {
        this.data = data;
        this.next = null;
    }
}
