public class EmpleadoTiempoCompleto extends Empleado {

    private double SalarioAnual;

    public EmpleadoTiempoCompleto (String nombre, String numIdentificación, double SalarioAnual) {
        super(nombre, numIdentificación);
        this.SalarioAnual = SalarioAnual;
    }

    @Override
    public double calcularSalario() {
        return SalarioAnual/12;
    }
}
