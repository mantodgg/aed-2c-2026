package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] recordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        this.recordatorios = new Recordatorio[0]; // tenemos que crear el arreglo de recordatorios con una longitud si o si (no puede ser null)
    }

    public int longitud() {
        return recordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoArray = new Recordatorio[recordatorios.length + 1];
        for (int j = 0; j < recordatorios.length; j++) {
            nuevoArray[j] = recordatorios[j]; 
        }
        nuevoArray[recordatorios.length] = i;
        this.recordatorios = nuevoArray;
    }

    public Recordatorio obtener(int i) {
        return this.recordatorios[i];
    }

    public void quitarAtras() {
        Recordatorio[] nuevoArray = new Recordatorio[recordatorios.length - 1];
        for (int j = 0; j < recordatorios.length - 1; j++) {
            nuevoArray[j] = recordatorios[j];
        }
        this.recordatorios = nuevoArray;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        this.recordatorios[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) { //constructor por copia
        this.recordatorios = new Recordatorio[vector.longitud()]; 
        for (int j = 0; j < vector.longitud(); j++) { //copia uno a uno los elementos de otro arreglo
            this.recordatorios[j] = vector.recordatorios[j];
        }
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        return new ArregloRedimensionableDeRecordatorios(this); //this referencia al objeto en si mismo
    }
}
