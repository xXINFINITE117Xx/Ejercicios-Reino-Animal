import java.util.*;

public class Programa {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reino[] reinos = {
                new Animalia(),
                new Plantae(),
                new Fungi(),
                new Protista(),
                new Monera()
        };

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Listar los reinos");
            System.out.println("2. Listar características de un reino");
            System.out.println("3. Listar especies de un reino");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nReinos de la naturaleza:");
                    for (Reino reino : reinos) {
                        System.out.println(reino.getNombre());
                    }
                    break;
                case 2:
                    listarCaracteristicas(reinos, scanner);
                    break;
                case 3:
                    listarEspecies(reinos, scanner);
                    break;
                case 4:
                    System.out.println("¡Hasta Pronto!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
            }
        }
    }


    private static void listarCaracteristicas(Reino[] reinos, Scanner scanner) {
        System.out.print("Ingrese el nombre del reino del cual desea ver las características: ");
        String nombreReino = scanner.next();
        boolean encontrado = false;
        for (Reino reino : reinos) {
            if (reino.getNombre().equalsIgnoreCase(nombreReino)) {
                System.out.println("\nCaracterísticas de " + reino.getNombre() + ":");
                reino.mostrarCaracteristicas();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el reino especificado.");
        }
    }


    private static void listarEspecies(Reino[] reinos, Scanner scanner) {
        System.out.print("Ingrese el nombre del reino del cual desea ver las especies: ");
        String nombreReino = scanner.next();
        boolean encontrado = false;
        for (Reino reino : reinos) {
            if (reino.getNombre().equalsIgnoreCase(nombreReino)) {
                System.out.println("\nEspecies de " + reino.getNombre() + ":");
                reino.listarEspecies();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el reino especificado.");
        }
    }
}