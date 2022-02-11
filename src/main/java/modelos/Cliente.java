package modelos;

import java.util.Objects;

public class Cliente extends Persona{

    private TipoCliente tipoCliente;


    //Const.Compl

    public Cliente(int identificador, String dni, String nombre, String apellidos, String direccion, TipoCliente tipoCliente) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.tipoCliente = tipoCliente;
    }

    public Cliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Cliente(Persona p, TipoCliente tipoCliente) {
        super(p);
        this.tipoCliente = tipoCliente;
    }


    //Const.Vac

    public Cliente() {
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    //Const.Copia

    public Cliente(Cliente c){

        this.tipoCliente = c.getTipoCliente();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return tipoCliente == cliente.tipoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoCliente=" + tipoCliente +
                '}';
    }
}
