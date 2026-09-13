/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Enemigo extends Personaje{
    private float DistanciaDeteccion;
    private int RecompensaXP;

    public Enemigo() {
    }

    public Enemigo(float DistanciaDeteccion, int RecompensaXP, String Tipo, String Nombre, int Vida, int nivel, int daño, int defensa, boolean EstaVivo) {
        super(Tipo, Nombre, Vida, nivel, daño, defensa, EstaVivo);
        this.DistanciaDeteccion = DistanciaDeteccion;
        this.RecompensaXP = RecompensaXP;
    }

    public float getDistanciaDeteccion() {
        return DistanciaDeteccion;
    }

    public void setDistanciaDeteccion(float DistanciaDeteccion) {
        this.DistanciaDeteccion = DistanciaDeteccion;
    }

    public int getRecompensaXP() {
        return RecompensaXP;
    }

    public void setRecompensaXP(int RecompensaXP) {
        this.RecompensaXP = RecompensaXP;
    }

    @Override
    public String toString() {
        return super.toString()+ " \nEnemigo{" + "DistanciaDeteccion=" + DistanciaDeteccion + ", RecompensaXP=" + RecompensaXP + '}';
    }
    
    
    
    
}
