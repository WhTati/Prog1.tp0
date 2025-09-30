public class App {
    public static void main(String[] args) {

        Carrera ingenieria = new Carrera("Ingeniería");

        Estudiante est1 = new Estudiante("Juan", "Perez", 20, "Ingeniería", 0);
        Estudiante est2 = new Estudiante("Maria", "Gomez", 22, "Ingeniería", 0);
        Estudiante est3 = new Estudiante("", "", 15, "Ingeniería", 12); // Datos inválidos
        Estudiante est4 = new Estudiante("Ana", "Martinez", 23, "Ingeniería", 0);

        Materia mat1 = new Materia("Matematica", "MAT101", 6, 8.5f);
        Materia mat2 = new Materia("Fisica", "FIS101", 5, 9.0f);
        Materia mat3 = new Materia("Quimica", "QUI101", 4, 7.5f);

        est1.agregarMateria(mat1);
        est1.agregarMateria(mat2);
        est1.calcularPromedio();

        est2.agregarMateria(mat2);
        est2.agregarMateria(mat3);
        est2.calcularPromedio();

        est4.agregarMateria(mat1);
        est4.agregarMateria(mat3);
        est4.calcularPromedio();

        if (est1.getNombre() != null && !est1.getNombre().isEmpty()) ingenieria.agregarEstudiante(est1);
        if (est2.getNombre() != null && !est2.getNombre().isEmpty()) ingenieria.agregarEstudiante(est2);
        if (est4.getNombre() != null && !est4.getNombre().isEmpty()) ingenieria.agregarEstudiante(est4);

        ingenieria.listarEstudiantes();

        Estudiante buscado = ingenieria.buscarEstudiante("Maria");
        if (buscado != null) {
            System.out.println("\nSe encontró a " + buscado.getNombre() +
                               " con promedio: " + buscado.getPromedio());
        }

        if (est3.getNombre() == null || est3.getNombre().isEmpty()) {
            System.out.println("\nEstudiante con datos inválidos: no se puede agregar ni mostrar.");
        }
    }
}
