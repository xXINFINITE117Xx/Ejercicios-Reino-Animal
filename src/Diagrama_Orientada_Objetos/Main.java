package Diagrama_Orientada_Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Automovil> automoviles = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();
    private static List<Agencia> agencias = new ArrayList<>();
    private static List<Garaje> garajes = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Renta Car Menu de opciones");
            System.out.println("1. Agencias");
            System.out.println("2. Reservas");
            System.out.println("3. Automoviles");
            System.out.println("4. Clientes");
            System.out.println("5. Listar Alquileres De Un Cliente");
            System.out.println("6. Salir");
            System.out.println("Seleccione Una Opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crudAgencias(scanner);
                    break;
                case 2:
                    crudReservas(scanner);
                    break;
                case 3:
                    crudAutomoviles(scanner);
                    break;
                case 4:
                    crudClientes(scanner);
                    break;
                case 5:
                    listarAlquileresDeClientes(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        } while (option != 6);
        scanner.close();
    }

    private static void crudClientes(Scanner scanner) {
        int option;
        do {
            System.out.println("CRUD Cliente Menu de opciones");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Leer Cliente");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Volver al Menu Principal");
            System.out.println("Seleccione Una Opcion");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crearCliente(scanner);
                    break;
                case 2:
                    leerCliente();
                    break;
                case 3:
                    ActualizarCliente(scanner);
                    break;
                case 4:
                    EliminarCliente(scanner);
                    break;
                case 5:
                    System.out.println("Volver al Menu Principal");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        } while (option != 5);
    }

    private static void crearCliente(Scanner scanner) {
        System.out.println("Ingrese DNI");
        String dni = scanner.nextLine();
        System.out.println("Ingrese Nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese Direccion");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese Telefono");
        String telefono = scanner.nextLine();
        System.out.println("Codigo");
        String codigo = scanner.nextLine();

        Cliente cliente = new Cliente(dni, nombre, direccion, telefono, codigo, null);
        clientes.add(cliente);
        System.out.println("Cliente creado");
    }

    private static void leerCliente() {
        System.out.println("Lista De Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void ActualizarCliente(Scanner scanner) {
        System.out.println("Ingrese codigo del cliente que desea actualizar: ");
        String codigo = scanner.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigo)) {
                System.out.print("Ingrese nuevo DNI (actual: " + cliente.getDNI() + "): ");
                cliente.setDNI(scanner.nextLine());
                System.out.print("Ingrese nuevo nombre (actual: " + cliente.getNombre() + "): ");
                cliente.setNombre(scanner.nextLine());
                System.out.print("Ingrese nueva dirección (actual: " + cliente.getDireccion() + "): ");
                cliente.setDireccion(scanner.nextLine());
                System.out.print("Ingrese nuevo teléfono (actual: " + cliente.getTelefono() + "): ");
                cliente.setTelefono(scanner.nextLine());
                System.out.println("Cliente actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado");
    }

    private static void EliminarCliente(Scanner scanner) {
        System.out.println("Ingrese codigo del cliente que desea eliminar: ");
        String codigo = scanner.nextLine();
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCodigo().equals(codigo)) {
                iterator.remove();
                System.out.println("Cliente eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado");
    }

    private static void crudAgencias(Scanner scanner) {
        int option;
        do {
            System.out.println("CRUD Agencias Menu de opciones");
            System.out.println("1. Crear Agencia");
            System.out.println("2. Leer Agencia");
            System.out.println("3. Actualizar Agencia");
            System.out.println("4. Eliminar Agencia");
            System.out.println("5. Volver al Menu Principal");
            System.out.println("Seleccione Una Opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crearAgencia(scanner);
                    break;
                case 2:
                    leerAgencia();
                    break;
                case 3:
                    ActualizarAgencia(scanner);
                    break;
                case 4:
                    EliminarAgencia(scanner);
                    break;
                case 5:
                    System.out.println("Volver al Menu Principal");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        } while (option != 5);
    }

    private static void crearAgencia(Scanner scanner) {
        System.out.println("Ingrese id de la agencia: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese nombre de la agencia");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese direccion de la agencia: ");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese telefono de la agencia: ");
        String id = scanner.nextLine();

        Agencia agencia = new Agencia(nombre, direccion, telefono, id);
        agencias.add(agencia);
        System.out.println("Agencia creada exitosamente");
    }

    private static void leerAgencia() {
        System.out.println("Lista de agencias: ");
        for (Agencia agencia : agencias) {
            System.out.println(agencia);
        }
    }

    private static void ActualizarAgencia(Scanner scanner) {
        System.out.println("Ingrese Id de la agencia que desea actualizar: ");
        String id = scanner.nextLine();
        for (Agencia agencia : agencias) {
            if (agencia.getId().equals(id)) {
                System.out.println("Ingrese nuevo Id (actual: " + agencia.getId() + "): ");
                agencia.setId(scanner.nextLine());
                System.out.println("Ingrese nueva direccion (actual: " + agencia.getDireccion() + "): ");
                agencia.setDireccion(scanner.nextLine());
                System.out.println("Ingrese nuevo telefono (actual: " + agencia.getTelefono() + "): ");
                agencia.setTelefono(scanner.nextLine());
            }
        }
    }

    private static void EliminarAgencia(Scanner scanner) {
        System.out.println("Ingrese nombre de la agencia que desea eliminar: ");
        String nombre = scanner.nextLine();
        Iterator<Agencia> iterator = agencias.iterator();
        while (iterator.hasNext()) {
            Agencia agencia = iterator.next();
            if (agencia.getNombre().equals(nombre)) {
                iterator.remove();
                System.out.println("Agencia eliminada exitosamente.");
                return;
            }
        }
        System.out.println("Agencia no encontrado");
    }

    private static void crudAutomoviles(Scanner scanner) {
        int option;
        do {
            System.out.println("CRUD Automoviles Menu de opciones");
            System.out.println("1. Crear Automovil");
            System.out.println("2. Leer Automovil");
            System.out.println("3. Actualizar Automovil");
            System.out.println("4. Eliminar Automovil");
            System.out.println("5. Volver al Menu Principal");
            System.out.println("Seleccione Una Opcion");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crearAutomovil(scanner);
                    break;
                case 2:
                    leerAutomovil();
                    break;
                case 3:
                    ActualizarAutomovil(scanner);
                    break;
                case 4:
                    EliminarAutomovil(scanner);
                    break;
                case 5:
                    System.out.println("Volver al Menu Principal");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        } while (option != 5);
    }

    private static void crearAutomovil(Scanner scanner) {
        System.out.println("Ingrese matricula del Automovil: ");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese modelo del  Automovil: ");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese color del Automovil: ");
        String color = scanner.nextLine();
        System.out.println("Ingrese marca del Automovil: ");
        String marca = scanner.nextLine();
        System.out.println("Ingrese garaje del Automovil: ");
        String garaje = scanner.nextLine();
        Automovil automovil = new Automovil(matricula, modelo, color, marca, garaje);
        automoviles.add(automovil);
        System.out.println("Automovil creado exitosamente");
    }

    private static void leerAutomovil() {
        System.out.println("Lista de Automoviles: ");
        for (Automovil automovil : automoviles) {
            System.out.println(automovil);
        }
    }

    private static void ActualizarAutomovil(Scanner scanner) {
        System.out.println("Ingrese nombre del Automovil que desea actualizar: ");
        String matricula = scanner.nextLine();
        for (Automovil automovil : automoviles) {
            if (automovil.getMatricula().equals(matricula)) {
                System.out.println("Ingrese nuevo modelo (actual: " + automovil.getModelo() + "): ");
                automovil.setModelo(scanner.nextLine());
                System.out.println("Ingrese nueva color (actual: " + automovil.getColor() + "): ");
                automovil.setColor(scanner.nextLine());
                System.out.println("Ingrese nueva marca (actual: " + automovil.getMarca() + "): ");
                automovil.setMarca(scanner.nextLine());
                System.out.println("Ingrese nuevo garaje (actual: " + automovil.getGaraje() + "): ");
                automovil.setGaraje(scanner.nextLine());
            }
        }
    }

    private static void EliminarAutomovil(Scanner scanner) {
        System.out.println("Ingrese matricula del Automovil que desea eliminar: ");
        String matricula = scanner.nextLine();
        Iterator<Automovil> iterator = automoviles.iterator();
        while (iterator.hasNext()) {
            Automovil automovil = iterator.next();
            if (automovil.getMatricula().equals(matricula)) {
                iterator.remove();
                System.out.println("Automovil eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Automovil no encontrado");
    }

    private static void crudReservas(Scanner scanner) throws ParseException {
        int option;
        do {
            System.out.println("CRUD Reservas Menu de opciones");
            System.out.println("1. Crear Reserva");
            System.out.println("2. Leer Reserva");
            System.out.println("3. Actualizar Reserva");
            System.out.println("4. Eliminar Reserva");
            System.out.println("5. Volver al Menu Principal");
            System.out.println("Seleccione Una Opcion");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    crearReserva(scanner);
                    break;
                case 2:
                    leerReserva();
                    break;
                case 3:
                    ActualizarReserva(scanner);
                    break;
                case 4:
                    EliminarReserva(scanner);
                    break;
                case 5:
                    System.out.println("Volver al Menu Principal");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        } while (option != 5);
    }

    private static void crearReserva(Scanner scanner) throws ParseException {
        System.out.println("Ingrese id de la reserva: ");
        String id = scanner.nextLine();

        System.out.println("Ingrese DNI del cliente de la reserva: ");
        String dniCliente = scanner.nextLine();
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getDNI().equals(dniCliente)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.println("Ingrese fecha de inicio de la reserva (dd/MM/yyyy): ");
        String fechainicio = scanner.nextLine();
        System.out.println("Ingrese fecha fin de la reserva (dd/MM/yyyy): ");
        String fechafin = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date fechaInicioUtil = sdf.parse(fechainicio);
        Date fechaFinUtil = sdf.parse(fechafin);

        java.sql.Date fechaInicioSql = new java.sql.Date(fechaInicioUtil.getTime());
        java.sql.Date fechaFinSql = new java.sql.Date(fechaFinUtil.getTime());

        List<Automovil> coches = new ArrayList<>();
        System.out.println("Ingrese matrículas de los automóviles (separadas por comas): ");
        String matriculas = scanner.nextLine();
        for (String matricula : matriculas.split(",")) {
            Automovil automovil = null;
            for (Automovil a : automoviles) {
                if (a.getMatricula().trim().equals(matricula.trim())) {
                    automovil = a;
                    coches.add(automovil);
                    break;
                }
            }
            if (automovil == null) {
                System.out.println("Automóvil con matrícula " + matricula + " no encontrado.");
                return;
            }
        }

        System.out.println("Ingrese el precio total de la reserva: ");
        double precioTotal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("¿El coche ha sido entregado? (true/false): ");
        boolean entregado = scanner.nextBoolean();
        scanner.nextLine();

        Reserva reserva = new Reserva(id, cliente, fechaInicioSql, fechaFinSql, coches, precioTotal, entregado);
        reservas.add(reserva);
        System.out.println("Reserva creada exitosamente.");
    }

    private static void leerReserva() {
        System.out.println("Lista de reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
    private static void ActualizarReserva(Scanner scanner) throws ParseException {
        System.out.println("Ingrese el ID de la reserva a actualizar: ");
        String id = scanner.nextLine();

        Reserva reserva = null;
        for (Reserva r : reservas) {
            if (r.getId().equals(id)) {
                reserva = r;
                break;
            }
        }

        if (reserva == null) {
            System.out.println("Reserva no encontrada.");
            return;
        }

        try {
            System.out.println("Ingrese nuevo DNI del cliente (o presione Enter para mantener el actual): ");
            String dniCliente = scanner.nextLine();
            if (!dniCliente.isEmpty()) {
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.getDNI().equals(dniCliente)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente != null) {
                    reserva.setCliente(cliente);
                } else {
                    System.out.println("Cliente no encontrado. Se mantiene el cliente actual.");
                }
            }

            System.out.println("Ingrese nueva fecha de inicio (dd/MM/yyyy) (o presione Enter para mantener la actual): ");
            String fechainicio = scanner.nextLine();
            if (!fechainicio.isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaInicio = (Date) sdf.parse(fechainicio);
                reserva.setFechaInicio((java.sql.Date) fechaInicio);
            }

            System.out.println("Ingrese nueva fecha de fin (dd/MM/yyyy) (o presione Enter para mantener la actual): ");
            String fechafin = scanner.nextLine();
            if (!fechafin.isEmpty()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaFin = (Date) sdf.parse(fechafin);
                reserva.setFechaFin((java.sql.Date) fechaFin);
            }

            System.out.println("Ingrese nuevas matrículas de los automóviles (separadas por comas) (o presione Enter para mantener los actuales): ");
            String matriculas = scanner.nextLine();
            if (!matriculas.isEmpty()) {
                List<Automovil> coches = new ArrayList<>();
                for (String matricula : matriculas.split(",")) {
                    Automovil automovil = null;
                    for (Automovil a : automoviles) {
                        if (a.getMatricula().trim().equals(matricula.trim())) {
                            automovil = a;
                            coches.add(automovil);
                            break;
                        }
                    }
                    if (automovil == null) {
                        System.out.println("Automóvil con matrícula " + matricula + " no encontrado.");
                        return;
                    }
                }
                reserva.setCoches(coches);
            }

            System.out.println("Ingrese nuevo precio total (o presione Enter para mantener el actual): ");
            String precioTotalStr = scanner.nextLine();
            if (!precioTotalStr.isEmpty()) {
                double precioTotal = Double.parseDouble(precioTotalStr);
                reserva.setPrecioTotal(precioTotal);
            }

            System.out.println("¿El coche ha sido entregado? (true/false) (o presione Enter para mantener el actual): ");
            String entregadoStr = scanner.nextLine();
            if (!entregadoStr.isEmpty()) {
                boolean entregado = Boolean.parseBoolean(entregadoStr);
                reserva.setEntregado(entregado);
            }

            System.out.println("Reserva actualizada exitosamente.");

        } catch (ParseException e) {
            System.out.println("Error en el formato de la fecha. Actualización cancelada.");
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del precio. Actualización cancelada.");
        }
    }
    private static void EliminarReserva (Scanner scanner) {
        System.out.println("Ingrese el id de la reserva a eliminar: ");
        String id = scanner.nextLine();

        Reserva reservaAEliminar = null;
        for (Reserva reserva : reservas) {
            if (reserva.getId().equals(id)) {
                reservaAEliminar = reserva;
                break;
            }
        }

        if (reservaAEliminar != null) {
            reservas.remove(reservaAEliminar);
            System.out.println("Reserva con id " + id + " eliminada exitosamente.");
        } else {
            System.out.println("Reserva con id " + id + " no encontrada.");
        }
    }
    private static void listarAlquileresDeClientes (Scanner scanner) {
        System.out.print("Ingrese el código del cliente: ");
        String codigoCliente = scanner.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigoCliente)) {
                System.out.println("Reservas del cliente " + cliente.getNombre() + ":");
                for (Reserva reserva : reservas) {
                    if (reserva.getCliente().equals(cliente)) {
                        System.out.println(reserva);
                    }
                }
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }
}
