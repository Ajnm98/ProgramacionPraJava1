import modelos.*;

import java.time.LocalDate;

public class pruebaV1 {

    public static void main(String[] args) {

        Almacen a = new Almacen();
        Almacen a1 = new Almacen(12392, "almacen", 12999 );
        Almacen a2 = a1;

        Producto p = new Producto();
        Producto p1 = new Producto( 234442, "1293A", "Muy chulo", LocalDate.now() , TipoProducto.ALIMENTACION, a1);
        Producto p2 = p1;

        Cliente c = new Cliente();
        Cliente c1 = new Cliente(12341, "192831F", "Pepe", "Garcia", "C/Flores", TipoCliente.PARTICULAR);
        Cliente c2 = c1;


        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

    }
}
