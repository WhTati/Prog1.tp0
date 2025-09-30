import java.util.ArrayList;

public class Estudiante {
   private String nombre;
   private String apellido;
   private int edad;
   private String carrera;
   private float promedio;
   private ArrayList<Materia> materias;

    public Estudiante() {
        materias = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, float promedio) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        this.carrera = carrera;
        setPromedio(promedio);
        materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) { 
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
        }
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) { 
            this.apellido = apellido;
        } else {
            System.out.println("Error: El apellido no puede estar vacio");
            
        }
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 16) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 16");
        }
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio debe estar entre 0 y 10");
            
        }
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    public void agregarMateria(Materia materia) {
        if (materia != null) {
            materias.add(materia);
        } else {
            System.out.println("Error: La materia no puede ser nula");
        }
    }
    public void calcularPromedio() {
        if (materias.isEmpty()) {
            System.out.println("No hay materias para calcular el promedio");
            promedio = 0;
            return;
        }
        float suma = 0;
        for (Materia m : materias) {
            suma += m.getCalificacion();
        }
        promedio = suma / materias.size();
    }
}