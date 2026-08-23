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
        boolean otroEsNull = (otro == null);

        if (otroEsNull) {
            return false;
        }

        boolean claseDistinta = otro.getClass() != this.getClass();

        if (claseDistinta) {
            return false;
        }
        
        Recordatorio otroRecordatorio = (Recordatorio) otro;
        return (otroRecordatorio.fecha.equals(this.fecha) && otroRecordatorio.horario.equals(this.horario) && otroRecordatorio.mensaje == this.mensaje); //recordar que los objetos no pueden ser comparados con == (hay que compararlos con .equals)
    }

}
