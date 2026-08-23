package aed;

public class Horario {
    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return this.hora;
    }

    public int minutos() {
        return this.minutos;
    }

    @Override
    public String toString() {
        // Implementar
        return this.hora + ":" + this.minutos;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otroEsNull = (otro == null);
        
        if(otroEsNull) {
            return false;
        }

        boolean claseDistinta = otro.getClass() != this.getClass();

        if(claseDistinta) {
            return false;
        }

        Horario otroHorario = (Horario) otro;
        return (otroHorario.hora == this.hora && otroHorario.minutos == this.minutos);
    }

}
