package modelos;

public class Cliente {
    private int identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private TipoCliente tipoCliente;


    //Const.Compl

    public Cliente(int identificador, String dni, String nombre, String apellidos, String direccion, TipoCliente tipoCliente) {
        this.identificador = identificador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }


    //Const.Vac

    public Cliente() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    //Const.Copia

    public Cliente(Cliente c){
        this.identificador = c.getIdentificador();
        this.dni = c.getDni();
        this.nombre = c.getNombre();
        this.apellidos = c.getApellidos();
        this.direccion = c.getDireccion();
        this.tipoCliente = c.getTipoCliente();

    }


}
