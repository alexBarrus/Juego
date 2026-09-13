/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Baston extends Armas{
    private int bonusMana;

    public Baston() {
    }

    public Baston(String nombre, int daño, int durabilidad, int bonusMana) {
        super(nombre, daño, durabilidad);
        this.bonusMana = bonusMana;
    }

    public int getBonusMana() {
        return bonusMana;
    }

    public void setBonusMana(int bonusMana) {
        this.bonusMana = bonusMana;
    }

    @Override
    public String toString() {
        return super.toString() + " \nBaston{bonusMana=" + bonusMana + "}";
    }

    @Override
    public String ejecutar() {
        return "El bastón " + getNombre() + " canaliza energía mágica y libera " + getDaño() + " de daño mágico.";
    }

    @Override
    public int calcularValorCombate() {
        return getDaño() + bonusMana / 5;
    }

    @Override
    public String obtenerCategoria() {
        return "Arma mágica";
    }
}
