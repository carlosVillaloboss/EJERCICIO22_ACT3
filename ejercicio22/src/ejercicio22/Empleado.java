package ejercicio22;

public class Empleado {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    public String mostrarDatos() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual > 450000) {
            return "Nombre: " + nombre + "\nSalario Mensual: " + salarioMensual;
        } else {
            return "Nombre: " + nombre;
        }
    }
}

