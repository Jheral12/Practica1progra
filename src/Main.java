import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente(  1,"Carlos","Peres","Vargas");

        //ciudad
        Ciudad cochabamba = new Ciudad(1,"cochabamba");
        Ciudad santaCruz = new Ciudad(1,"SantaCruz");
        Ciudad tarija = new Ciudad(1,"Tarija");

        //categoria
        categoria turista = new categoria(1,"Turista");

        //aeropuertos
        Aeropuerto jorgeWilstermann = new Aeropuerto("JW", "Jorge Wilstermann", cochabamba);
        Aeropuerto viruViru = new Aeropuerto("VV", "Viru Viru", santaCruz);
        Aeropuerto orielLea = new Aeropuerto("OL", "Oriel Lea Plaza", tarija);

        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BDA-158", Calendar.getInstance().getTime(), jorgeWilstermann, viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-159", Calendar.getInstance().getTime(), viruViru, orielLea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete = new Billete(1, Calendar.getInstance().getTime(), 650.5, carlos, cochabamba,tarija, turista, vuelos);

        System.out.println("Billete");
        System.out.println("=======");
        System.out.println("Id: " + billete.getIdBillete());
        System.out.println("Fecha: " + billete.getFechaEmision());
        System.out.println("Precio: " + billete.getPrecioTotal());
        System.out.println("Cliente: " + billete.getCliente().getNombre());
        System.out.println("Origen: " + billete.getOrigen().getNombre());
        System.out.println("Destino: " + billete.getDestino().getNombre());
        System.out.println("Categoria: " + billete.getcategoria().getNombre());
        System.out.println("Vuelos: ");
        for (Vuelo vuelo:billete.getVuelos()) {
            System.out.println("Codigo vuelo: " + vuelo.getCodigoVuelo() + " | Salida " + vuelo.getSalida() + " | Origen " + vuelo.getOrigen().getNombre() + " | Destino" + vuelo.getDestino().getNombre());
        }
    }

}
