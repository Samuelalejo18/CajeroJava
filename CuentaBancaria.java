import java.awt.desktop.UserSessionEvent;
import java.util.LinkedList;

class CuentaBancaria {
    LinkedList<Usuario> cuentaBancaria = new LinkedList<>();
    private Usuario usuarioAutenticado;

    public void Registar(Usuario Usuario) {

        if (!cuentaBancaria.contains(Usuario)) {
            cuentaBancaria.add(Usuario);
            System.out.println("El Usuario '" + Usuario.getNombre() + "' ha sido registrado  exitosomante.");
        } else {
            System.out.println("El Usuario'" + Usuario.getNombre() + "' ya existe esta usuario. No se puede registrar nuevamente.");
        }
    }
public  void Autentificar ( String nombreUsuario, String contraseña){
Usuario usuarioEncontrado=null;

for ( Usuario Usuario : cuentaBancaria){
    if(usuarioEncontrado.getNombre().equals(nombreUsuario)){
        usuarioEncontrado=  Usuario;
        break;
    }
}
        if(usuarioEncontrado !=null){
            if( usuarioEncontrado.getContraseña().equals(contraseña)){
                usuarioAutenticado = usuarioEncontrado;
                System.out.println(" Autentificacion exitosa para el usaurio" + nombreUsuario);
            } else {
                System.out.println("contraseña incorrecta");
            }
                System.out.println("El usuario no existe");

        }
}

  public void Depositar(double cantidad) {
        if(usuarioAutenticado!= null) {
            double saldoActual = usuarioAutenticado.getSaldo();
            double nuevoSaldo = saldoActual + cantidad;
            usuarioAutenticado.setSaldo(nuevoSaldo);
            System.out.println("Deposito de "+ cantidad+"realizado exitosamente");
        }else{
            System.out.println("No es psobile realizar el deposito");
        }


    }
    public void Retirar(double cantidad) {
        if(usuarioAutenticado!= null) {
            double saldoActual = usuarioAutenticado.getSaldo();
            double nuevoSaldo = saldoActual - cantidad;
            usuarioAutenticado.setSaldo(nuevoSaldo);
            System.out.println("Retiro de "+ cantidad+" realizado exitosamente");
        }else{
            System.out.println("No es psobile realizar el retiro");
        }


    }
     public void Transferir( String nombreDestinario, double cantidad ){
        if(usuarioAutenticado != null){
            Usuario destinario = null;
            for ( Usuario Usuario : cuentaBancaria){
                if(Usuario.getNombre().equals(nombreDestinario)){
                    destinario=  Usuario;
                    break;
                }
            }
             if(destinario != null){
                 if(usuarioAutenticado.getSaldo() >=cantidad){
                     double saldoOrigen= usuarioAutenticado.getSaldo();
                     double saldoDestinario= destinario.getSaldo();

                     usuarioAutenticado.setSaldo( saldoOrigen-cantidad);
                     destinario.setSaldo(saldoDestinario+cantidad);
                     System.out.println(" Tranferencia de" + cantidad+ " realizada exitosamente");
                 } else{
                     System.out.println("Saldo insuficiente");
                 } else{
                     System.out.println("EL Destinario "+ nombreDestinario+ "no existe");
                 } else{
                     System.out.println("No se puede  realizar la tranferencia");
                 }

             }
        }
     }

}



