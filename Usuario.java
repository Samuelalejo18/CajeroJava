public class Usuario {

    private String nombre;
    private double saldo;
    private String contraseña;


    
    public Usuario(String nombre, double saldo, String contraseña) {
        this.nombre = nombre;
        this.saldo = 0.0;
        this.contraseña = contraseña;
    }
}

public String getUsuario(){
    return nombre;
}
public String getSaldo(){
    return saldo;
}
public String getUsuario(){
    return contraseña;
}
