import java.util.LinkedList;
class CuentaBancaria {
    LinkedList<Usuario> cuentaBancaria= new LinkedList<>();
   

 public void registar( Usuario Usuario ) {
    for(Usuario Usuario : cuentaBancaria){
        if(Usuario.getUsuario().equalsIgnoreCase(nombre)){
            return null;
        }
    } else {
        cuentaBancaria.add(Usuario);
    }

    }
}

public void autentificar ( Usuario Usuario){
    for(Usuario Usuario : cuentaBancaria){
        
}
}
  public LinkedList<Usuario> mostrarUsuariosExistentes() {
        return cuentaBancaria;
    }


