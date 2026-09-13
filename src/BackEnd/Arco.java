/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Arco extends Armas{
    private String nombre;
    private int daño;
    private float alcance;

    public Arco() {
    }

    public Arco(String nombre, int daño, float alcance) {
        this.nombre = nombre;
        this.daño = daño;
        this.alcance = alcance;
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

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return "Arco{nombre=" + nombre + ", daño=" + daño + ", alcance=" + alcance + "}";
    }
}