package aed;

public class PilaSobreArreglo implements Pila {
    private int[] arreglo;
    private int capacidad;
    private int cantidad;

    public PilaSobreArreglo(int capacity) {
        arreglo = new int[capacity];
        capacidad = capacity;
    }

    public void push(int elem) {
        if (!isFull()) {
            arreglo[cantidad] = elem;
            cantidad ++;
        } else {
            throw new RuntimeException("Pila llena, hace falta desapilar");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int res = arreglo[cantidad-1];
            cantidad --;
            return res;
        } else {
            throw new RuntimeException("Pila vacia, hace falta apilar");
        }
    }

    public int top() {
        if (!isEmpty()) {
            return arreglo[cantidad-1];
        } else {
            throw new RuntimeException("Pila vacia, hace falta apilar");
        }
    }    

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == capacidad;
    }
}
