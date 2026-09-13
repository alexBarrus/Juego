/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Espada extends Armas{
    private float filo;

    public Espada() {
    }

    public Espada(String nombre, int daño, int durabilidad, float filo) {
        super(nombre, daño, durabilidad);
        this.filo = filo;
    }

    public float getFilo() {
        return filo;
    }

    public void setFilo(float filo) {
        this.filo = filo;
    }

    @Override
    public String toString() {
        return super.toString() + " \nEspada{filo=" + filo + "}";
    }

    @Override
    public String ejecutar() {
        return "La espada " + getNombre() + " realiza un corte cuerpo a cuerpo con filo " + filo + ".";
    }

    @Override
    public int calcularValorCombate() {
        return getDaño() + (int) (filo * 2);
    }

    @Override
    public String obtenerCategoria() {
        return "Arma cuerpo a cuerpo";
    }
}
