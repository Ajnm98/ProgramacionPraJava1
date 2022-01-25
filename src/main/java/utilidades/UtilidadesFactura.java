package utilidades;

import modelos.Factura;
import modelos.LineaFactura;

import java.time.LocalDate;

public class UtilidadesFactura {

    public boolean esFacturaVencida(Factura factura){

        LocalDate Fecha = factura.getFechaVencimiento();
        boolean vencido = Fecha.isAfter(LocalDate.now());

        return vencido;
    }

    //public double calcularBaseFactura(Factura factura){

        //Double importeb =0.0;

        //for(Factura f: factura){
        //    importeb += f.getLineaFactura;
      //  }

        //return importeb;

   // }

    public double calcularTotalAPagar(Factura factura){


        Double importeBase1 = factura.getImporteBase();
        Double descuentos1 = factura.getDescuento();
        Double iva1 = factura.getIva();
        Double TotalAPagar = (importeBase1-descuentos1)*iva1;

        return TotalAPagar;


    }
}
