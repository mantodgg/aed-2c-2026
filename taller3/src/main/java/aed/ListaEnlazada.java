package aed;

public class ListaEnlazada<T> {
    // Completar atributos privados
    private Nodo primero;
    private Nodo ultimo;

    private class Nodo {
        T valor;
        Nodo siguiente;
        Nodo anterior;
        Nodo(T v) {valor = v;}
    }

    public ListaEnlazada() {
        primero = null;
        ultimo = null;
    }

    public int longitud() {
        int longitud = 0;
        Nodo actual = primero;
        while (actual != null) {
            longitud += 1;
            actual = actual.siguiente;
        }
        return longitud;
    }

    public void agregarAdelante(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (primero == null) {
           primero = nuevo;
           ultimo = nuevo;
           primero.siguiente = null;
           primero.anterior = null;
        } else {
            nuevo.anterior = null;
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
        

    }

    public void agregarAtras(T elem) {
        Nodo nuevo = new Nodo(elem);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
            primero.siguiente = null;
            primero.anterior = null;
        } else {
            nuevo.anterior = ultimo;
            nuevo.siguiente = null;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public T obtener(int i) {
        int contador = 0;
        Nodo res = primero;
        while (contador != i) {
            contador += 1;
            res = res.siguiente;
        }
        return res.valor;
    }

    public void eliminar(int i) {
        Nodo nodo = primero;
        int contador = 0;
        while (i != contador) {
            nodo = nodo.siguiente;
            contador += 1;
        }
        
        if (nodo.anterior != null) {
            nodo.anterior.siguiente = nodo.siguiente;
        } else {
            primero = nodo.siguiente;
        }

        if (nodo.siguiente != null) {
            nodo.siguiente.anterior = nodo.anterior;
        } else {
            ultimo = nodo.anterior;
        };
    }

    public void modificarPosicion(int indice, T elem) {
        Nodo nodo = primero;
        int contador = 0;
        while (indice != contador) {
            nodo = nodo.siguiente;
            contador += 1;
        }
        nodo.valor = elem;
    }

    public ListaEnlazada(ListaEnlazada<T> lista) {
        primero = null;
        ultimo = null;
        Nodo nodo = lista.primero;
        while (nodo != null) {
            agregarAtras(nodo.valor);
            nodo = nodo.siguiente;
        }
    }
    
    @Override
    public String toString() {
        String string = "[";
        Nodo nodo = primero;
        if (nodo != null) {
            string += nodo.valor;
            nodo = nodo.siguiente;
        }
        while (nodo != null) {
            string += ", " + nodo.valor;
            nodo = nodo.siguiente;
        } 
        string += "]";
        return string;
    }

    public class ListaIterador{
    	private Nodo proximo; 
        private Nodo previo;

        ListaIterador(Nodo inicio) {
            proximo = inicio;
            if (inicio != null) {
                previo = inicio.anterior;
            }
            previo = null;
        }

        public boolean haySiguiente() {
            return proximo != null;
        }
        
        public boolean hayAnterior() {
	        return previo != null;
        }

        public T siguiente() {
            T valor = proximo.valor;
            previo = proximo;
            proximo = proximo.siguiente;
            return valor;
        }
        

        public T anterior() {
            T valor = previo.valor;
            proximo = previo;
            previo = previo.anterior;
            return valor;
        }
    }

    public ListaIterador iterador() {
	    return new ListaIterador(primero);
    }

}
