package aed;

public class Fecha { //declaro una nueva clase
    private int dia;//atributo 
    private int mes;//atributo

    public Fecha(int dia, int mes) { //constructor
        this.dia = dia;
        this.mes = mes;
    }



    public Integer dia() { //metodo devuelve el dia de fecha
        return this.dia;
    }

    public Integer mes() { //metodo devuelve el mes de fecha
        return this.mes;
    }

    public String toString() {
        return this.dia + "/" + this.mes;
    }

    public void incrementarDia() {
        if (this.dia == diasEnMes(this.mes)) {
            this.dia = 1;
            if(this.mes != 12) {
                this.mes ++;
            }
            else {
                this.mes = 1;
            }
        }
        else {
            this.dia ++;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

    @Override
    public boolean equals(Object otra) {
        boolean otraEsNull = (otra == null);
    
        if(otraEsNull) {
            return false;
        }

        boolean claseDistinta = otra.getClass() != this.getClass();

        if(claseDistinta) {
            return false;
        }

        Fecha otraFecha = (Fecha) otra;
        return (otraFecha.dia == this.dia && otraFecha.mes == this.mes);
    }
    
    public Fecha(Fecha fecha) { 
        dia = fecha.dia;
        mes = fecha.mes;    
    }
}
