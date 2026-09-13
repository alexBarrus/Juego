/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Baston extends Armas{
    private String nombre;
    private int dañoMagico;
    private int bonusMana;

    public Baston() {
    }

    public Baston(String nombre, int dañoMagico, int bonusMana) {
        this.nombre = nombre;
        this.dañoMagico = dañoMagico;
        this.bonusMana = bonusMana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDañoMagico() {
        return dañoMagico;
    }

    public void setDañoMagico(int dañoMagico) {
        this.dañoMagico = dañoMagico;
    }

    public int getBonusMana() {
        return bonusMana;
    }

    public void setBonusMana(int bonusMana) {
        this.bonusMana = bonusMana;
    }

    @Override
    public String toString() {
        return "Baston{nombre=" + nombre + ", dañoMagico=" + dañoMagico + ", bonusMana=" + bonusMana + "}";
    }
}