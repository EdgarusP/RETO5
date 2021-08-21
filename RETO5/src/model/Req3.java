package model;

public class Req3 {
    private int idProyecto;
    private String pagado;
    private String clasificacion;

    public Req3(int idProyecto, String pagado, String clasificacion) {
        this.idProyecto = idProyecto;
        this.pagado = pagado;
        this.clasificacion = clasificacion;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Req3 [clasificacion=" + clasificacion + ", idProyecto=" + idProyecto + ", pagado=" + pagado + "]";
    }

}
