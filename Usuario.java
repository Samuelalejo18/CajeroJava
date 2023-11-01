public class Usuario {

    private String nombre;
    private double saldo;
    private String contraseña;


    
    public Usuario(String nombre, double saldo, String contraseña) {
        this.nombre = nombre;
        this.saldo =saldo;
        this.contraseña = contraseña;
    }


    public String getNombre(){
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }

    public  void setSaldo(double saldo ){
        this.saldo= saldo;
    }

    public String getContraseña() {
        return contraseña;
    }

}