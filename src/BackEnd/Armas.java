/*
 barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
 */
package BackEnd;

import java.util.Objects;

public abstract class Armas {

    protected String Nombre;
    protected int Daño;
    protected int Durabilidad;

    public Armas() {
    }

    public Armas(String Nombre, int Daño, int Durabilidad) {
        this.Nombre = Nombre;
        this.Daño = Daño;
        this.Durabilidad = Durabilidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }

    public int getDurabilidad() {
        return Durabilidad;
    }

    public void setDurabilidad(int Durabilidad) {
        this.Durabilidad = Durabilidad;
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
        final Armas other = (Armas) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Arma{" + "Nombre=" + Nombre + ", Da\u00f1o=" + Daño + ", Durabilidad=" + Durabilidad + '}';
    }
}
