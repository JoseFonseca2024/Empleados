public class App {
    public static void main(String[] args) throws Exception {

        Empleado[] empleados = new Empleado[4];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Perez", "123", 48000.00);
        empleados[1] = new EmpleadoMedioTiempo("Maria Lopez", "142", 15.0, 20);
        empleados[2] = new EmpleadoMedioTiempo("Pedro Sanchez", "785", 15.0, 12);
        empleados[3] = new EmpleadoTiempoCompleto("Juanito Pacheco", "458", 52000);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: "+empleados[i].getnombre()+ ", Salario Mensual: $"+empleados[i].calcularSalario());
        }
    }
}
