/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Escudo extends Armas{
    private String nombre;
    private int defensaExtra;
    private int durabilidad;

    public Escudo() {
    }

    public Escudo(String nombre, int defensaExtra, int durabilidad) {
        this.nombre = nombre;
        this.defensaExtra = defensaExtra;
        this.durabilidad = durabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDefensaExtra() {
        return defensaExtra;
    }

    public void setDefensaExtra(int defensaExtra) {
        this.defensaExtra = defensaExtra;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() {
        return "Escudo{nombre=" + nombre + ", defensaExtra=" + defensaExtra + ", durabilidad=" + durabilidad + "}";
    }
}