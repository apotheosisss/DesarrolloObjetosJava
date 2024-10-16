public class EmpleadoPorHora extends Empleado implements BonusCalculable {


    //Atributos horasTrabajadas, pagoPorHora
    private int horasTrabajadas;
    private double pagoPorHora;

    //Constructor 
    public EmpleadoPorHora(String IdEmpleado, String nombre, int horasTrabajadas, double pagoPorHora){
        // super(IdEmpleado, nombre, horasTrabajadas * pagoPorHora = sueldo);
        super(IdEmpleado, nombre, horasTrabajadas * pagoPorHora);
        this.horasTrabajadas= horasTrabajadas;
        this.pagoPorHora = pagoPorHora;

    }

    public double calcularSalario(){
        return horasTrabajadas * pagoPorHora + calcularBonus();
    }

    public double calcularBonus(){
        //
        //? = if else = true : false
        return horasTrabajadas > 40 ? pagoPorHora  * 5 : 0;
    }
    
}
