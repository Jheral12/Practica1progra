public class categoria {
    private int idcategorias;
    private String nombre;

    public categoria(int idcategorias, String nombre) {
        this.idcategorias = idcategorias;
        this.nombre = nombre;
    }

    public int getIdcategorias() {
        return idcategorias;
    }

    public void setIdcategorias(int idcategorias) {
        this.idcategorias = idcategorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
