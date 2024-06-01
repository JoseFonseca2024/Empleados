abstract class Empleado {

    private String nombre;
    private String numIdentificación;

    public Empleado (String nombre, String numIdentificación) {
        this.nombre = nombre;
        this.numIdentificación = numIdentificación;
    }

    public String getnombre () {
        return nombre;
    }

    public String numIdentificación () {
        return numIdentificación;
    }

    public abstract double calcularSalario();

}
