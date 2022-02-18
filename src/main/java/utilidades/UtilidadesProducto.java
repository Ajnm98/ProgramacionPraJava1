package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){

        List<Producto> listaproductopor = new ArrayList<>();

        for(Producto producto : productos){
            if(producto.getTipoProducto().equals(tipo)){
                listaproductopor.add(producto);

            }
        }

        return listaproductopor;
    }

    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){

        List<Producto> listaproductosalmacen = new ArrayList<>();

        for(Producto producto : productos){
            if(producto.getAlmacen().equals(almacen)){
                listaproductosalmacen.add(producto);
            }
        }


        return listaproductosalmacen ;
    }



}
