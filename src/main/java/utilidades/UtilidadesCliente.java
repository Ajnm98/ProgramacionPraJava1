package utilidades;

import modelos.Cliente;

public class UtilidadesCliente {

    public boolean esDniValido(Cliente cliente) {

        String Dni = cliente.getDni();
        char[] Caracteres = Dni.toCharArray();
       // char [] Numeros = {0,1,2,3,4,5,6,7,8,9};
        //char Ultimo = Dni.charAt(8);
        Boolean esValido = true;

        for(int i = 0; i<Caracteres.length; i++){
            if((Dni.length() != 9 || Character.isLetter(Dni.charAt(8)) || Character.isDigit(Dni.charAt(i-1)) == false))
            { esValido = false; }

        }
    return esValido;}
    }



