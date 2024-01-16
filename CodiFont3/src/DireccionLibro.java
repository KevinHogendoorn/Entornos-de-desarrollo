import java.util.ArrayList;

public class DireccionLibro {
    private int codigo;
    private ArrayList<Persona> persona;

    public DireccionLibro(int codigo, ArrayList<Persona> persona) {
        this.codigo = codigo;
        this.persona = persona;
    }

    public DireccionLibro(int codigo) {
        this.codigo = codigo;
        this.persona = new ArrayList<>();
    }
}
