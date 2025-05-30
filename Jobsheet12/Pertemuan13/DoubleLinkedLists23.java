package Jobsheet12.Pertemuan13;

public class DoubleLinkedLists23 {
    Node23 head;
    Node23 tail;

    public DoubleLinkedLists23() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa23 data) {
        Node23 newNode23 = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode23;
        } else {
            newNode23.next = head;
            head.prev = newNode23;
            head = newNode23;
        }
    }

    public void addLast(Mahasiswa23 data) {
        Node23 newNode23 = new Node23(data);
        if (isEmpty()) {
            head = tail = newNode23;    
        } else {
            tail.next = newNode23;
            newNode23.prev = tail;
            tail = newNode23;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa23 data) {
        Node23 current = head;

        // Cari Node23 dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node23 dengan NIM " + keyNim + " tidak ditemukan.");
            return;   
        }

        Node23 newNode23 = new Node23(data);

        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode23;
            newNode23.prev = current;
            tail = newNode23;    
        } else {
            //Sisispkan ditengah
            newNode23.next = current.next;
            newNode23.prev = current;
            current.next.prev = newNode23;
            current.next = newNode23;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        Node23 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;      
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
            
        }
        if (head == tail) {
            head = tail = null;
            
        }
    }

}
