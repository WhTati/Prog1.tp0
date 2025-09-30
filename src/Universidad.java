import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String direccion;
    private ArrayList<Estudiante> estudiantes;

    public Universidad() {
        estudiantes = new ArrayList<>();
    }

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void agregarEstudiante(Estudiante est) {
        if (est != null) {
            estudiantes.add(est);
        } else {
            System.out.println("Error: Estudiante nulo");
        }
    }
}
