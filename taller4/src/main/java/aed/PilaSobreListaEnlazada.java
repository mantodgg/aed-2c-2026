package aed;

public class PilaSobreListaEnlazada implements Pila {
    private Node head;
    private Node tail;

    public PilaSobreListaEnlazada() {
        head = null;
        tail = null;
    }

    public void push(int elem) {
        Node nuevo = new Node(elem);
        if (isEmpty()) {
            head = nuevo;
            tail = nuevo;
            head.next = null;
        } else {
            tail.next = null;
            nuevo.next = nuevo;
            tail = nuevo;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacia, hace falta apilar");
        } 
        int res = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node actual = head;
            while (actual.next != tail) {
                actual = actual.next;
            }
            actual.next = null;
            tail = actual;
        }
        return res;

    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacia, hace falta apilar");
        } else {
            return tail.data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return false;
    }
}
