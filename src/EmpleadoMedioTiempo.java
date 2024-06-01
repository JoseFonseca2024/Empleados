public class EmpleadoMedioTiempo extends Empleado{

    private double salarioPorHora;
    private int horasTrabajadasporSemana;

    public EmpleadoMedioTiempo (String nombre, String numIdentificación, double salarioPorHora, int horasTrabajadasporSemana) {
        super(nombre, numIdentificación);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadasporSemana = horasTrabajadasporSemana;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadasporSemana * 4;
    }
}
