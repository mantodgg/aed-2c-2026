package aed;

public class Agenda {
    private Fecha fechaActual;
    private ArregloRedimensionableDeRecordatorios recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        this.recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String res = this.fechaActual.toString() + "\n=====\n";
        for (int j = 0; j < recordatorios.longitud(); j++) {
            Recordatorio rec = this.recordatorios.obtener(j);
            if (rec.fecha().equals(fechaActual())) { //me funcionaba mal porque no vale usar == para objetos
                res = res + rec.toString() + "\n";
            }
        };
        return res;
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia(); 
    }

    public Fecha fechaActual() {
        return this.fechaActual;
    }

}
