package aed;

public class ColaSobreListaEnlazada implements Cola {
    private Node head;
    private Node tail;

    public ColaSobreListaEnlazada() {
        head = null;
        tail = null;
    }

    public void enqueue(int elem) {
        Node nuevo = new Node(elem);
        if (isEmpty()) {
            head = nuevo;
            tail = nuevo;
            head.next = null;
        } else {
            nuevo.next = null;
            tail.next = nuevo;
            tail = nuevo;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Cola vacia, hace falta encolar");
        } else {
            int res = head.data;
            head = head.next;
            tail.next = null;
            return res;
        }
    }

    public int front() {
        return head.data;
    }

    public int rear() {
        return tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false;
    }
}
