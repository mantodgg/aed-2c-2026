package aed;

public class ColaSobreArregloCircular implements Cola {
    private int[] arreglo;
    private int capacidad;
    private int cantidad;
    private int frente;

    public ColaSobreArregloCircular(int i) {
        arreglo = new int[i];
        capacidad = i;
        cantidad = 0;
        frente = 0;
    }

    // Inserta en el final (tail)
    public void enqueue(int elem) {
        if (!isFull()) {
            arreglo[cantidad] = elem;
            cantidad ++;
        } else {
            throw new RuntimeException("Cola llena, hace falta desencolar");
        }
    }

    // Obtiene el elemento del frente (head)
    public int dequeue() {
        
    }

    // Obtiene el elemento del frente (head)
    public int front() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    // Obtiene el elemento del final (tail)
    public int rear() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public boolean isFull() {
        return cantidad == capacidad;
    }
}
