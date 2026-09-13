/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public final class Jefe extends Personaje{
    private int Fases;
    private  double multiplicadorFuria;

    public Jefe() {
    }

    public Jefe(int Fases, double multiplicadorFuria, String Tipo, String Nombre, int Vida, int nivel, int daño, int defensa, boolean EstaVivo) {
        super(Tipo, Nombre, Vida, nivel, daño, defensa, EstaVivo);
        this.Fases = Fases;
        this.multiplicadorFuria = multiplicadorFuria;
    }

    public int getFases() {
        return Fases;
    }

    public void setFases(int Fases) {
        this.Fases = Fases;
    }

    public double getMultiplicadorFuria() {
        return multiplicadorFuria;
    }

    public void setMultiplicadorFuria(double multiplicadorFuria) {
        this.multiplicadorFuria = multiplicadorFuria;
    }

    @Override
    public String toString() {
        return super.toString()+ " \nJefe{" + "Fases=" + Fases + ", multiplicadorFuria=" + multiplicadorFuria + '}';
    }

    @Override
    public String realizarAccion() {
        return "El jefe " + getNombre() + " desata su furia en la fase " + Fases + ".";
    }

    @Override
    public int calcularPoderAtaque() {
        return (int) (getDaño() * multiplicadorFuria);
    }

    @Override
    public String obtenerEstado() {
        return "Fase actual: " + Fases + ", Multiplicador de furia: x" + multiplicadorFuria + (isEstaVivo() ? " - En combate" : " - Derrotado");
    }
}
