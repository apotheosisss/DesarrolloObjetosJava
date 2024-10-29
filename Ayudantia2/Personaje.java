// clase
public abstract class Personaje {
    protected String nombre;
    protected int vidas, monedas;


    public Personaje(String nombre, int vidas, int monedas){
        this.nombre = nombre;
        this.vidas = vidas;
        this.monedas = monedas;
    }

    public abstract void moverse();

    public int pederVida(){
        if(vidas >0){
            vidas--;
        }
        return vidas;
    }

    public final int recogerMoneda(){
        monedas ++;
        return monedas;
    }

    public void mostrarInfo(){
        System.out.println("Nombre : "+nombre);
        System.out.println("Vidas : "+vidas);
        System.out.println("Monedas : "+monedas);
    }

    
}