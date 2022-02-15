package utilidades;

import modelos.*;

import java.util.ArrayList;
import java.util.HashMap;
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

        List<Empleado> empleados = new ArrayList<>();
        List<Empleado> empleadosInde = new ArrayList<>();
        List<Empleado> empleadosTem = new ArrayList<>();
        List<Empleado> empleadosOys = new ArrayList<>();
        List<Empleado> empleadosPra = new ArrayList<>();


        for (Empleado empleado : empleados) {
            if(empleado.equals(empresas)){
                if(empleado.getContrato().getTipoContrato() == TipoContrato.INDEFINIDO){
                    empleadosInde.add(empleado);

                }
                else if(empleado.getContrato().getTipoContrato() == TipoContrato.TEMPORAL){
                    empleadosTem.add(empleado);

                }
                else if(empleado.getContrato().getTipoContrato() == TipoContrato.OBRAYSERVICIO){
                    empleadosOys.add(empleado);

                }
                else if(empleado.getContrato().getTipoContrato() == TipoContrato.PRACTICAS){
                    empleadosPra.add(empleado);

                }
            }


        }
        empleadosAgrupadosPorTipo.put(TipoContrato.INDEFINIDO, empleadosInde);
        empleadosAgrupadosPorTipo.put(TipoContrato.OBRAYSERVICIO, empleadosOys);
        empleadosAgrupadosPorTipo.put(TipoContrato.PRACTICAS, empleadosOys);
        empleadosAgrupadosPorTipo.put(TipoContrato.TEMPORAL, empleadosTem);

        Empresa e1 = new Empresa(1123, "3123", empleados, TipoEmpresa.PYME);


        getEmpleadosPorTipoContrato.put(e1, empleadosAgrupadosPorTipo);

        return getEmpleadosPorTipoContrato;

    }



    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas){

        List<Empleado> empleadosPymesPra = new ArrayList<>();
        List<Empleado> listaempleados= new ArrayList<Empleado>();


        for (Empleado empleado : listaempleados) {

            if (empleado.equals(empresas))
                if (empleado.getContrato().getTipoContrato() == TipoContrato.PRACTICAS) {
                    empleadosPymesPra.add(empleado);
                }

        }
        return empleadosPymesPra;
    }

    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa(List<Empresa> empresas){

        Map<TipoEmpresa,  List<Empleado>> empleadomascobracada = new HashMap<>();

        List<Empleado> listaempleados= new ArrayList<Empleado>();
        Empleado EmpleadoPY = new Empleado();
        Empleado EmpleadoST = new Empleado();
        Empleado EmpleadoNA = new Empleado();
        Empleado EmpleadoMU = new Empleado();
        List<Empleado> EmpleadoPy1= new ArrayList<>();
        List<Empleado> EmpleadoSt1= new ArrayList<>();
        List<Empleado> EmpleadoNa1= new ArrayList<>();
        List<Empleado> EmpleadoMu1= new ArrayList<>();



        for (Empleado empleado : listaempleados){

            if (empleado.equals(empresas)){
                if(empleado.getEmpresa().getTipoEmpresa() == TipoEmpresa.PYME){
                    if(empleado.getContrato().getSalarioBase() > EmpleadoPY.getContrato().getSalarioBase()){
                        Empleado EmpleadoPy = empleado;
                        EmpleadoPy1.remove(-1);
                        EmpleadoPy1.add(EmpleadoPy);
                    }

                }

                if(empleado.getEmpresa().getTipoEmpresa() == TipoEmpresa.STARTUP){
                    if(empleado.getContrato().getSalarioBase() > EmpleadoST.getContrato().getSalarioBase()){
                        Empleado EmpleadoSt = empleado;
                        EmpleadoSt1.remove(-1);
                        EmpleadoSt1.add(EmpleadoSt);
                    }

                }

                if(empleado.getEmpresa().getTipoEmpresa() == TipoEmpresa.NACIONAL){
                    if(empleado.getContrato().getSalarioBase() > EmpleadoNA.getContrato().getSalarioBase()){
                        Empleado EmpleadoNa = empleado;
                        EmpleadoNa1.remove(-1);
                        EmpleadoNa1.add(EmpleadoNa);
                    }

                }
                if(empleado.getEmpresa().getTipoEmpresa() == TipoEmpresa.MULTINACIONAL){
                    if(empleado.getContrato().getSalarioBase() > EmpleadoMU.getContrato().getSalarioBase()){
                        Empleado EmpleadoMu = empleado;
                        EmpleadoMu1.remove(-1);
                        EmpleadoMu1.add(EmpleadoMu);
                    }

                }
            }

        }

        empleadomascobracada.put(TipoEmpresa.PYME, EmpleadoPy1);
        empleadomascobracada.put(TipoEmpresa.STARTUP, EmpleadoSt1);
        empleadomascobracada.put(TipoEmpresa.NACIONAL, EmpleadoNa1);
        empleadomascobracada.put(TipoEmpresa.MULTINACIONAL, EmpleadoMu1);


        return empleadomascobracada;
    }

}
