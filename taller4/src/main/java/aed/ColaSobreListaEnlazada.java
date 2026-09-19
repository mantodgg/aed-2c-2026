package aed;

public class ColaSobreListaEnlazada implements Cola {
    private Node head;
    private Node tail;
    private int capacidad;

    public ColaSobreListaEnlazada() {
        head = null;
        tail = null;
    }

    public void enqueue(int elem) {
        Node nuevo = new Node(elem);
        if (head == null) {
            head = nuevo;
            tail = nuevo;
            head.next = null;
        } else if (!isFull()) {
            nuevo.next = null;
            tail.next = nuevo;
            tail = nuevo;
        } else {
            throw new RuntimeException("Cola llena, hace falta desencolar");
        }
    }

    public int dequeue() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int front() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int rear() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int longitud () {
        int longitud = 0;
        Node actual = head;
        while (actual != null) {
            longitud ++;
            actual = actual.next;
        }
        return longitud;
    }

    public boolean isFull() {
        return longitud() == capacidad;
    }
}
