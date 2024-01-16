import java.util.ArrayList;

public class Direccion {
    private String calle;
    private String ciudad;
    private int codigoPostal;
    private ArrayList<Persona> persona;

    public Direccion(String calle, String ciudad, int codigoPostal, ArrayList<Persona> persona) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.persona = persona;
    }

    public Direccion(String calle, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.persona = new ArrayList<>();
    }
}
