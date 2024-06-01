public class App {
    public static void main(String[] args) throws Exception {
        Empleado[] empleados=new Empleado[2];

        empleados[0]=new EmpleadoTiempoCompleto("Juan Perez", "1234", 48000);
        empleados[1]=new EmpleadoMedioTiempo("Maria Lopez", "5678", 15, 20);

        for (Empleado empleado:empleados){
            System.out.println("Empleado: "+empleado.getnombre()+", Salario Mensual: $"+empleado.calcularSalario());
        }

        System.out.println(" ");
        
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: "+empleados[i].getnombre()+", Salario Mensual: $"+empleados[i].calcularSalario());
        }
    }
}
