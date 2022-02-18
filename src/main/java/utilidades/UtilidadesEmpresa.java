package utilidades;

import modelos.*;

import java.util.*;
import java.util.stream.Collectors;


public class UtilidadesEmpresa {


    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato) {


        List<Empleado> listaEmpleadosCorrectos = new ArrayList<>();


        for (Empleado empleado : empresa.getEmpleados()) {
            if (empleado.equals(empresa) && empleado.equals(tipoContrato)) {
                listaEmpleadosCorrectos.add(empleado);
            }
        }
        return listaEmpleadosCorrectos;

    }


    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa) {


        List<Contrato> listaContratos = new ArrayList<Contrato>();
        List<Empleado> listaFinal = new ArrayList<>();


        for (Empleado empleado : empresa.getEmpleados()) {

                    if (empleado.getContrato().getSalarioBase() >1000){
                        listaFinal.add(empleado);
                    }
                }
        return listaFinal.stream().sorted(Comparator.comparing(e -> e.getContrato().getSalarioBase())).collect(Collectors.toList());
    }


    public double fondoSalarialEmpresa(Empresa empresa) {

        Double Contratos = 0.0;

        for (Empleado empleado : empresa.getEmpleados()) {

                    Contratos = empleado.getContrato().getSalarioBase() + Contratos;
                }
        return Contratos;
    }


    public Empleado getMejorPagado(List<Empresa> empresas) {

        List<Empleado> listaFinal = new ArrayList<>();
        Double Final1 = 0.0;

        for(Empresa e : empresas){
            for(Empleado em : e.getEmpleados()){
                if(em.getContrato().getSalarioBase() > Final1){
                    Final1 = em.getContrato().getSalarioBase();
                    listaFinal.remove(-1);
                    listaFinal.add(em);
                }
            }
            }
      Empleado mascobra = listaFinal.get(0);
    return mascobra;
    }



    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas){

        Map<TipoContrato, List<Empleado>> empleadosAgrupadosPorTipo = new HashMap<>();



        List<Empleado> listaEmpleado = new ArrayList<Empleado>();
        List<Empleado> listaEmpleadoInde = new ArrayList<>();
        List<Empleado> listaEmpleadoPra = new ArrayList<>();
        List<Empleado> listaEmpleadoOYS = new ArrayList<>();
        List<Empleado> listaEmpleadoTem = new ArrayList<>();


        for (Empleado empleado : listaEmpleado){
            if(empleado.equals(empresas)){
                if (empleado.getContrato().getTipoContrato() == TipoContrato.INDEFINIDO){
                    listaEmpleadoInde.add(empleado);
                }
                else if (empleado.getContrato().getTipoContrato() == TipoContrato.PRACTICAS){
                    listaEmpleadoPra.add(empleado);
                }
                else if (empleado.getContrato().getTipoContrato() == TipoContrato.OBRAYSERVICIO){
                    listaEmpleadoOYS.add(empleado);
                }
                else if (empleado.getContrato().getTipoContrato() == TipoContrato.TEMPORAL){
                    listaEmpleadoTem.add(empleado);
                }

            }


        }
        empleadosAgrupadosPorTipo.put(TipoContrato.INDEFINIDO, listaEmpleadoInde);
        empleadosAgrupadosPorTipo.put(TipoContrato.OBRAYSERVICIO, listaEmpleadoOYS);
        empleadosAgrupadosPorTipo.put(TipoContrato.PRACTICAS, listaEmpleadoPra);
        empleadosAgrupadosPorTipo.put(TipoContrato.TEMPORAL, listaEmpleadoTem);


        return empleadosAgrupadosPorTipo;
    }

    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas){

        Map<TipoContrato, List<Empleado>> empleadosAgrupadosPorTipo = new HashMap<>();
        Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato = new HashMap<>();

        List<Empleado> empleadosInde = new ArrayList<>();
        List<Empleado> empleadosTem = new ArrayList<>();
        List<Empleado> empleadosOys = new ArrayList<>();
        List<Empleado> empleadosPra = new ArrayList<>();

        for (Empresa e : empresas){
        for (Empleado empleado : e.getEmpleados()) {

                if (empleado.getContrato().getTipoContrato() == TipoContrato.INDEFINIDO) {
                    empleadosInde.add(empleado);

                } else if (empleado.getContrato().getTipoContrato() == TipoContrato.TEMPORAL) {
                    empleadosTem.add(empleado);

                } else if (empleado.getContrato().getTipoContrato() == TipoContrato.OBRAYSERVICIO) {
                    empleadosOys.add(empleado);

                } else if (empleado.getContrato().getTipoContrato() == TipoContrato.PRACTICAS) {
                    empleadosPra.add(empleado);

                }

        }
            empleadosAgrupadosPorTipo.put(TipoContrato.INDEFINIDO, empleadosInde);
            empleadosAgrupadosPorTipo.put(TipoContrato.OBRAYSERVICIO, empleadosOys);
            empleadosAgrupadosPorTipo.put(TipoContrato.PRACTICAS, empleadosOys);
            empleadosAgrupadosPorTipo.put(TipoContrato.TEMPORAL, empleadosTem);

            getEmpleadosPorTipoContrato.put(e, empleadosAgrupadosPorTipo);
        }

        return getEmpleadosPorTipoContrato;

    }



    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas){

        List<Empleado> empleadosPymesPra = new ArrayList<>();


        for (Empresa e : empresas) {
            if (e.getTipoEmpresa().equals(TipoEmpresa.PYME)) {
                for (Empleado em : e.getEmpleados()) {
                    if (em.getContrato().getTipoContrato() == TipoContrato.PRACTICAS) {
                        empleadosPymesPra.add(em);
                    }
                }
            }
        }

        return empleadosPymesPra;
    }

    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa(List<Empresa> empresas) {

        Map<Empresa,Empleado> empleadomap = new HashMap<>();


        for (Empresa empresa : empresas) {

            Empleado Empleadomascobra = null;

            for (Empleado e : empresa.getEmpleados()) {

                if ((Empleadomascobra.equals(null))||(e.getContrato().getSalarioBase() > Empleadomascobra.getContrato().getSalarioBase()) ) {

                    Empleadomascobra = e;

                }

            }

            empleadomap.put(empresa, Empleadomascobra);
        }
        return empleadomap;
    }
}
