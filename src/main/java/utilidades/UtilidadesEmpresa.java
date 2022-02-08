package utilidades;

import modelos.Contrato;
import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class UtilidadesEmpresa {


    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato) {

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        List<Empleado> listaEmpleadosCorrectos = new ArrayList<>();


        for (Empleado empleado : listaEmpleados) {
            if (empleado.equals(empresa) && empleado.equals(tipoContrato)) {
                listaEmpleadosCorrectos.add(empleado);
            }
        }
        return listaEmpleados;
    }


    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa) {

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        List<Contrato> listaContratos = new ArrayList<Contrato>();
        List<Empleado> listaFinal = new ArrayList<>();


        for (Empleado empleado : listaEmpleados) {

            if (empresa.getEmpleados().equals(empresa)) {
                for (Contrato contrato : listaContratos) {
                    if (empleado.getContrato().getSalarioBase() >1000){
                        listaFinal.add(empleado);
                    }
                }
            }
        }
        return listaFinal;
    }


    public double fondoSalarialEmpresa(Empresa empresa) {

        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Double Contratos = 0.0;
        List<Contrato> listaContratos = new ArrayList<Contrato>();


        for (Empleado empleado : listaEmpleados) {

            if (empleado.equals(empresa)) {

                for (Contrato contrato : listaContratos) {
                    Contratos = contrato.getSalarioBase() + Contratos;
                }
            }
        }
        return Contratos;
    }


    public Empleado getMejorPagado(List<Empresa> empresas) {

        List<Empleado> listaEmpleado = new ArrayList<Empleado>();
        List<Empleado> listaFinal = new ArrayList<>();
        Double Final1 = 0.0;

        for (Empleado empleado : listaEmpleado)
            if (empleado.equals(empresas)) {
                if (empleado.getContrato().getSalarioBase() > Final1) {
                    Final1 = empleado.getContrato().getSalarioBase();
                    listaFinal.remove(-1);
                    listaFinal.add(empleado);
                }
            }
    return listaFinal;
    }



    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas){




        return ;
    }



}
