package aed;

public class Recordatorio {
    private Fecha fecha;
    private Horario horario;
    private String mensaje;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.fecha = new Fecha(fecha);
        this.horario = new Horario(horario.hora(),horario.minutos());
        this.mensaje = mensaje;
    }

    public Horario horario() {
        return new Horario(this.horario.hora(),this.horario.minutos());
    }

    public Fecha fecha() {
        return new Fecha(this.fecha);
    }

    public String mensaje() {
        return this.mensaje;
    }

    @Override
    public String toString() {
        return this.mensaje + " @ " + this.fecha + " " + this.horario;
    }

    @Override
    public boolean equals(Object otro) {
        // Implementar
        return true;
    }

}
