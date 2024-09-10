package gestiondeempleados;
public class Empleado {
    //Atributos del Empleado: Nombre, ID, Departamento
    private String nombre, id, departamento;
    //Constructor
    public Empleado(String nombre, String id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }
    //Accesadores Getter y Mutadores Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //GetInfo => toString

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + ", departamento=" + departamento + '}';
    }
    
    
    
    
}
