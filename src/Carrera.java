import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarEstudiante(Estudiante est) {
        if (est != null) {
            estudiantes.add(est);
        } else {
            System.out.println("Error: Estudiante nulo");
        }
    }

    public void listarEstudiantes() {
        System.out.println("Estudiantes de la carrera " + nombre + ":");
        for (Estudiante est : estudiantes) {
            System.out.println("- " + est.getNombre() + " " + est.getApellido() + " | Promedio: " + est.getPromedio());
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante est : estudiantes) {
            if (est.getNombre().equalsIgnoreCase(nombre)) {
                return est;
            }
        }
        System.out.println("Estudiante " + nombre + " no encontrado.");
        return null;
    }
}
