/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Espada extends Armas{
    private String nombre;
    private int daño;
    private float filo;

    public Espada() {
    }

    public Espada(String nombre, int daño, float filo) {
        this.nombre = nombre;
        this.daño = daño;
        this.filo = filo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public float getFilo() {
        return filo;
    }

    public void setFilo(float filo) {
        this.filo = filo;
    }

    @Override
    public String toString() {
        return "Espada{nombre=" + nombre + ", daño=" + daño + ", filo=" + filo + "}";
    }
}