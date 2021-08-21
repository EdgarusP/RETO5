package model;

public class Req2 {
    private String fechaInicio;
    private int financiable;
    private int estrato;
    private double porcetaje;

    public Req2(String fechaInicio, int financiable, int estrato, double porcetaje) {
        this.fechaInicio = fechaInicio;
        this.financiable = financiable;
        this.estrato = estrato;
        this.porcetaje = porcetaje;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFinanciable() {
        return financiable;
    }

    public void setFinanciable(int financiable) {
        this.financiable = financiable;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getPorcetaje() {
        return porcetaje;
    }

    public void setPorcetaje(double porcetaje) {
        this.porcetaje = porcetaje;
    }

    @Override
    public String toString() {
        return "Req2 [estrato=" + estrato + ", fechaInicio=" + fechaInicio + ", financiable=" + financiable
                + ", porcetaje=" + porcetaje + "]";
    }

    
}
