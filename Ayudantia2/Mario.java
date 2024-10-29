public class Mario extends Personaje implements SuperPoder{
    private boolean poderFuego;

    public Mario(String nombre, int vidas, int monedas, boolean poderFuego){

        super(nombre, vidas, monedas);
        this.poderFuego = poderFuego;
    }

    @Override
    public void moverse(){
        System.out.println(nombre + " Mario se mueve corriendo");
    }

    @Override
    public int comerEstrella(){
        return 10;
    }
    
    @Override
    public boolean comerHongo(){
        return true;//mario crece al comer el hongo

    }
    public void lanzarBolasFuego(){
        if(poderFuego){
            System.out.println(nombre + " lanza bola de fuegos");
        }else{
            System.out.println(nombre+" no tiene el pder de fuego");
        }
    }
}
