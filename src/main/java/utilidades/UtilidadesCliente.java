package utilidades;

import modelos.Cliente;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilidadesCliente {

    public boolean esDniValido(Cliente cliente) {

        Pattern p = Pattern.compile("[0-9]{8},[a-zA-Z]");
        Matcher m = p.matcher(cliente.getDni());
        boolean b = m.matches();

        return b;
    }
    }



