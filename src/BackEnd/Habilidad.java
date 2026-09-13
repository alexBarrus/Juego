/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

import java.util.Objects;

public abstract class Habilidad {

    protected String Nombre;
    protected int Costo;
    protected int Poder;

    public Habilidad() {
    }

    public Habilidad(String Nombre, int Costo, int Poder) {
        this.Nombre = Nombre;
        this.Costo = Costo;
        this.Poder = Poder;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habilidad other = (Habilidad) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "Nombre=" + Nombre + ", Costo=" + Costo + ", Poder=" + Poder + '}';
    }

    public abstract String ejecutar();

    public int calcularEfecto() {
        return Poder;
    }

    public String obtenerCategoria() {
        return "Genérica";
    }
}
