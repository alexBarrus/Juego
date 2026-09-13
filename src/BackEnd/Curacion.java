/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Curacion extends Habilidad {
    private int puntosRestaurados;

    public Curacion() {
    }

    public Curacion(String nombre, int coste, int poder, int puntosRestaurados) {
        super(nombre, coste, poder);
        this.puntosRestaurados = puntosRestaurados;
    }

    public int getPuntosRestaurados() {
        return puntosRestaurados;
    }

    public void setPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }

    @Override
    public String toString() {
        return super.toString() + " \nCuracion{puntosRestaurados=" + puntosRestaurados + "}";
    }
}