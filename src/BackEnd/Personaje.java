/*barrutieta Nulutagua Juan Alexander
  Alcala Bejarano Jennifer Paola
*/
package BackEnd;

import java.util.Objects;

public abstract class Personaje {

    protected String Tipo;
    protected String Nombre;
    protected int Vida;
    protected int nivel;
    protected int daño;
    protected int defensa;
    protected boolean EstaVivo;

    public Personaje() {
    }

    
    
    public Personaje(String Tipo, String Nombre, int Vida, int nivel, int daño, int defensa, boolean EstaVivo) {
        this.Tipo = Tipo;
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.nivel = nivel;
        this.daño = daño;
        this.defensa = defensa;
        this.EstaVivo = EstaVivo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isEstaVivo() {
        return EstaVivo;
    }

    public void setEstaVivo(boolean EstaVivo) {
        this.EstaVivo = EstaVivo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Tipo);
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
        final Personaje other = (Personaje) obj;
        if (!Objects.equals(this.Tipo, other.Tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personaje{" + "Tipo=" + Tipo + ", Nombre=" + Nombre + ", Vida=" + Vida + ", nivel=" + nivel + ", da\u00f1o=" + daño + ", defensa=" + defensa + ", EstaVivo=" + EstaVivo + '}';
    }

    

    
    
    
    
}
