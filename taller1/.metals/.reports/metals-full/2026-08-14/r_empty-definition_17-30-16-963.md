error id: file://<WORKSPACE>/src/main/java/aed/Funciones.java:java/lang/String#length().
file://<WORKSPACE>/src/main/java/aed/Funciones.java
empty definition using pc, found symbol in pc: java/lang/String#length().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1840
uri: file://<WORKSPACE>/src/main/java/aed/Funciones.java
text:
```scala
package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt(x*x + y*y);
    }

    boolean esPar(int n) {
        return n % 2 == 0;
    }

    boolean esBisiesto(int n) {
        boolean res = false;
        if ((n % 4 == 0 && n % 10 != 0) || n % 400 == 0) {
            res = true;
        }
        return res;
    }

    int factorialIterativo(int n) {
        int res = 1;
        for (int i = n; i > 1; i--) {
            res *= i;
        }
        return res;
    }

    int factorialRecursivo(int n) {
        if (n < 2) {
            return 1;
        }
        else {
            return factorialRecursivo(n-1) * n;
        }
    }

    boolean esPrimo(int n) {
    if (n < 2) {
        return false;
    }
    for (int i = n-1; i > 1; i--) {
        if (n % i == 0) {   
            return false;
            } 
        }
    return true;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int n:numeros) {
            res += n;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                return i;
            }
        }
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (!esPar(numeros[i])) {
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if (s1.@@length() > s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return a || b && !(a && b);
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;

        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > xs [i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = 0;
        for (int i = 0; i <= xs.length; i++) {
            if (xs[i] > res) res = i;
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = false;
        for (int x : xs) {
            if (x > 0) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#length().