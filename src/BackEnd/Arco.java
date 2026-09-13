/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Arco extends Armas{
    private float alcance;

    public Arco() {
    }

    public Arco(String nombre, int daño, int durabilidad, float alcance) {
        super(nombre, daño, durabilidad);
        this.alcance = alcance;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return super.toString() + " \nArco{alcance=" + alcance + "}";
    }

    @Override
    public String ejecutar() {
        return "El arco " + getNombre() + " dispara una flecha a " + alcance + " metros de distancia.";
    }

    @Override
    public int calcularValorCombate() {
        return getDaño() + (int) (alcance / 10);
    }

    @Override
    public String obtenerCategoria() {
        return "Arma a distancia";
    }
}
