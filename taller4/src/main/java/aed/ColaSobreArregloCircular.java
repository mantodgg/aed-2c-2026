package aed;

public class ColaSobreArregloCircular implements Cola {
    private int[] arreglo;
    private int capacidad;
    private int cantidad;
    private int head;
    private int tail;

    public ColaSobreArregloCircular(int i) {
        arreglo = new int[i];
        capacidad = i;
        cantidad = 0;
        head = 0;
        tail = 0;
    }

    // Inserta en el final (tail)
    public void enqueue(int elem) {
        if (!isFull()) {
            arreglo[tail] = elem;
            tail = (tail + 1) % arreglo.length;
            cantidad ++;
        } else {
            throw new RuntimeException("Cola llena, hace falta desencolar");
        }
    }

    // Obtiene el elemento del frente (head)
    public int dequeue() {
        if (!isEmpty()) {
            int res = arreglo[head];
            head = (head + 1) % arreglo.length;
            cantidad --;
            return res;
        } else {
            throw new RuntimeException("Cola vacia, hace falta encolar");
        }
    }

    // Obtiene el elemento del frente (head)
    public int front() {
        return arreglo[head];
    }

    // Obtiene el elemento del final (tail)
    public int rear() {
        return arreglo[tail];
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == capacidad;
    }
}
