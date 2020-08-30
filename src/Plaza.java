public class Plaza {
    private int idPlaza;
    private Vuelo vuelo;
    private categoria categoria;
    private int numeroPlaza;
    private double tarifa;

    public Plaza(int idPlaza, Vuelo vuelo, categoria categoria, int numeroPlaza, double tarifa) {
        this.idPlaza = idPlaza;
        this.vuelo = vuelo;
        this.categoria = categoria;
        this.numeroPlaza = numeroPlaza;
        this.tarifa = tarifa;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public categoria getcategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
