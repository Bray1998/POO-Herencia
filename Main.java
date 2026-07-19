java
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 20, "Ingeniería en Software");
        Profesor p1 = new Profesor("Carlos", 45, "Programación Orientada a Objetos");

        e1.mostrarInfo();
        p1.mostrarInfo();
    }
}
