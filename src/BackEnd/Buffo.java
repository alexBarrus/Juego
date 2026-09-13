/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

public class Buffo extends Habilidad {
    private int duracionTurnos;

    public Buffo() {
    }

    public Buffo(String nombre, int coste, int poder, int duracionTurnos) {
        super(nombre, coste, poder);
        this.duracionTurnos = duracionTurnos;
    }

    public int getDuracionTurnos() {
        return duracionTurnos;
    }

    public void setDuracionTurnos(int duracionTurnos) {
        this.duracionTurnos = duracionTurnos;
    }

    @Override
    public String toString() {
        return super.toString() + " \nBuffo{duracionTurnos=" + duracionTurnos + "}";
    }

    @Override
    public String ejecutar() {
        return "La habilidad " + getNombre() + " aumenta las estadísticas durante " + duracionTurnos + " turnos.";
    }

    @Override
    public int calcularEfecto() {
        return getPoder() * duracionTurnos;
    }

    @Override
    public String obtenerCategoria() {
        return "Soporte - Mejora";
    }
}
