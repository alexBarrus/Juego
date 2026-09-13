/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Ataque extends Habilidad {
    private int dañoExtra;

    public Ataque() {
    }

    public Ataque(String nombre, int coste, int poder, int dañoExtra) {
        super(nombre, coste, poder);
        this.dañoExtra = dañoExtra;
    }

    public int getDañoExtra() {
        return dañoExtra;
    }

    public void setDañoExtra(int dañoExtra) {
        this.dañoExtra = dañoExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " \nAtaque{dañoExtra=" + dañoExtra + "}";
    }
}