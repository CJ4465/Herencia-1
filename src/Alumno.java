
public class Alumno extends Persona{
    public Alumno() {
        super();
        System.out.println("Se crea Alumno...");
        this.nombre = "Sin nombre";
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + this.nombre;
    }
}
