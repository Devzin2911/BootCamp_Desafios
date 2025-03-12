package setInterface.Pesquisa;

import java.util.Objects;

public class Contato {

    private String name;

    private int numero;

    public Contato(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getName().equals(contato.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "name='" + name + '\'' +
                ", numero=" + numero +
                '}';
    }
}
