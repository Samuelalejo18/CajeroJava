import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            CuentaBancaria WolfBank = new CuentaBancaria();

            // Crear objetos de la clase Libro
            Usuario Usuario1 = new Usuario("Samuel", 100000, "Lukas2012");

            // Registrar los libros en la biblioteca
            WolfBank.Registar(Usuario1);

            int opcion = -1; // Operación de tiempo constante, O(1)

            while (opcion != 0) {
                // Impresión de mensaje de tiempo constante, O(1)
                System.out.println("Bienvenidos a WolfBanck");
                System.out.println("Por favor, elija una opción:");
                System.out.println("1. Crear una cuenta");
                System.out.println("2. Ingresa a tu cuenta");
                System.out.println("0. Salir");
                opcion = lector.nextInt();
                lector.nextLine();

                /* Switch case tiempo constante 0(1) */
                switch (opcion) {
                    case 1:
                        /* Caso para registra un nuevo libro, complejidad de tiempo constante */
                        // tiempo constante, O(1)
                        System.out.println("Registrar un nuevo usuario");
                        System.out.println("Ingrese el nombre del usuario: ");
                        String nuevoNombre = lector.nextLine();

                        System.out.println("Ingrese la contraseña: ");
                        String nuevoContraseña = lector.nextLine();
                        System.out.println("Ingrese el saldo: ");
                        double nuevoSaldo = lector.nextInt();
                        lector.nextLine();

                        // Crear un nuevo libro con los datos proporcionados
                        Usuario nuevoUsuario = new Usuario(nuevoNombre, nuevoSaldo, nuevoContraseña);
                        // Registrar el nuevo libro en la biblioteca
                        WolfBank.Registar(nuevoUsuario);
                        break;
                    case 2:
                        System.out.println("Ingrese usuario: ");
                        String user = lector.nextLine();
                        System.out.println("Ingrese la contraseña: ");
                        String password = lector.nextLine();
                        WolfBank.Autentificar(user, password);
                        
                        break;


                    case 0:
                        System.out.println("Saliendo de WolfBank. Hasta la proxima");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción válida.");
                        break;
                }
            }
        }
    }
}