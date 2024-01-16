public class Main {
    public static void main(String[] args) {
        DireccionLibro l1 = new DireccionLibro(414214);

        Direccion d1 = new Direccion("calle", "ciudad", 03570);

        Persona p1 = new Persona("Kevin", 633333333, "kevin@gmail.com", l1, d1);

        Pais pais1 = new Pais(1, "España");

        Estado estado1 = new Estado(12, "a", pais1);
    }
}