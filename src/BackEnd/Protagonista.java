/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

import java.util.List;
import java.util.ArrayList;

public class Protagonista extends Personaje{
    private int Experiencia;
    private List<String> Inventario;

    public Protagonista() {
    }

    public Protagonista(int Experiencia, List<String> Inventario, String Tipo, String Nombre, int Vida, int nivel, int daño, int defensa, boolean EstaVivo) {
        super(Tipo, Nombre, Vida, nivel, daño, defensa, EstaVivo);
        this.Experiencia = Experiencia;
        this.Inventario = Inventario;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public List<String> getInventario() {
        return Inventario;
    }

    public void setInventario(List<String> Inventario) {
        this.Inventario = Inventario;
    }

    @Override
    public String toString() {
        return super.toString()+ " \nProtagonista{" + "Experiencia=" + Experiencia + ", Inventario=" + Inventario + '}';
    }
    
    
}
