import java.util.LinkedList;

class CuentaBancaria {
    LinkedList<Usuario> cuentaBancaria = new LinkedList<>();

    public String registar(Usuario Usuario) {
        for (Usuario Usuario : cuentaBancaria) {
            if (Usuario.getNombre().equalsIgnoreCase(nombre)) {
                return "el usuario ya existe";
            }
        }
        cuentaBancaria.add(Usuario);

    }

    public void autentificar(Usuario Usuario) {
        for (Usuario Usuario : cuentaBancaria) {

        }
    }

    public LinkedList<Usuario> mostrarUsuariosExistentes() {
        return cuentaBancaria;
    }

}
