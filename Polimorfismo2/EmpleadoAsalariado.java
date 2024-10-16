public class EmpleadoAsalariado extends Empleado implements BonusCalculable {

    //No tiene atributos

    //Constructor
    public EmpleadoAsalariado(String IdEmpleado, String nombre, double sueldo){
        super(IdEmpleado, nombre, sueldo);
    }

    @Override
    public double calcularSalario(){
        return sueldo +calcularBonus();
    }

    @Override
    public double calcularBonus(){
        return sueldo * 0.1;//10%
    }
    
}
