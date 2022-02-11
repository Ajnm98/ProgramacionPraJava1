package modelos;

import java.util.Objects;

public class Empleado extends Persona {

    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    public Empleado(int identificador, String dni, String nombre, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado(String numTelefono, Empresa empresa, Contrato contrato) {
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado(Persona p, String numTelefono, Empresa empresa, Contrato contrato) {
        super(p);
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado() {
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Empleado(Empleado e){
        this.numTelefono = e.getNumTelefono();
        this.empresa = e.getEmpresa();
        this.contrato = e.getContrato();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(numTelefono, empleado.numTelefono) && Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numTelefono, empresa, contrato);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }
}
