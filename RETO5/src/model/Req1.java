package model;

public class Req1 {
    private int total;
    private int idProyecto;
    private String pagado;
    private String proveedor;

    public Req1(int total, int idProyecto, String pagado, String proveedor) {
        this.total = total;
        this.idProyecto = idProyecto;
        this.pagado = pagado;
        this.proveedor = proveedor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Req1 [idProyecto=" + idProyecto + ", pagado=" + pagado + ", proveedor=" + proveedor + ", total=" + total
                + "]";
    }
}
