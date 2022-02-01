package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){

        List<Producto> listaproductostipo = new ArrayList<Producto>();

        for(Producto producto : productos){
            if(producto.equals(tipo)){
                listaproductostipo.add(producto);

            }
        }


        return listaproductostipo;
    }

    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){

        List<Producto> listaproductosalmacen = new ArrayList<Producto>();

        for(Producto producto : productos){
            if(producto.equals(almacen)){
                listaproductosalmacen.add(producto);
            }
        }


        return listaproductosalmacen ;
    }



}
