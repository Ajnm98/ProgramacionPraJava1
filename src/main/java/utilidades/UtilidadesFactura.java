package utilidades;

import modelos.Cliente;
import modelos.Factura;
import modelos.LineaFactura;

import java.time.LocalDate;
import java.util.List;

public class UtilidadesFactura {

    public boolean esFacturaVencida(Factura factura){

        LocalDate Fecha = factura.getFechaVencimiento();
        boolean vencido = Fecha.isAfter(LocalDate.now());

        return vencido;
    }

    public double calcularBaseFactura(Factura factura){

        Double importe =0.0;

        for(LineaFactura ln: factura.getLineaFactura()){
            importe += ln.getProducto().getPrecio()*ln.getCantidad();
       }

        return importe;

    }

    public double calcularTotalAPagar(Factura factura){


        Double importeBase1 = factura.getImporteBase();
        Double descuentos1 = factura.getDescuento();
        Double iva1 = factura.getIva();
        Double TotalAPagar = (importeBase1-descuentos1)*iva1;

        return TotalAPagar;


    }


    public Double gastoTotalCliente(List<Factura> facturas, Cliente cliente){

        Double total = 0.0;


        for (Factura factura : facturas){
            if (factura.equals(cliente)){
                total = factura.getTotalAPagar() + total;

            }
        }
        return total;
    }
}
