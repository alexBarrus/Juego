/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Escudo extends Armas{
    private int defensaExtra;

    public Escudo() {
    }

    public Escudo(String nombre, int defensaExtra, int durabilidad) {
        super(nombre, 0, durabilidad);
        this.defensaExtra = defensaExtra;
    }

    public int getDefensaExtra() {
        return defensaExtra;
    }

    public void setDefensaExtra(int defensaExtra) {
        this.defensaExtra = defensaExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " \nEscudo{defensaExtra=" + defensaExtra + "}";
    }

    @Override
    public String ejecutar() {
        return "El escudo " + getNombre() + " bloquea el golpe entrante y reduce el daño recibido.";
    }

    @Override
    public int calcularValorCombate() {
        return defensaExtra + getDurabilidad() / 10;
    }

    @Override
    public String obtenerCategoria() {
        return "Equipo defensivo";
    }
}
