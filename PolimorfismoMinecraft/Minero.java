package PolimorfismoMinecraft;
public class Minero extends Jugador implements AccionBonus {
    
    //Atributo único
    private int bloquesMinados;

    //cs
    public Minero(String nombre, int salud, int bloquesMinados) {
        super(nombre, salud);
        this.bloquesMinados = bloquesMinados;
    }
    @Override
    public int calcularPuntos(){
        return bloquesMinados * 10 + calcularBonus();
    }
    @Override
    public int calcularBonus(){
        return bloquesMinados > 100 ? 100 : 0;
    }

}
