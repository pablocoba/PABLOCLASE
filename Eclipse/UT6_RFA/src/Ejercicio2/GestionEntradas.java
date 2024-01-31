package Ejercicio2;



import java.util.Scanner;

public class GestionEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de las zonas
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Leer la opción seleccionada
            opcion = scanner.nextInt();

            // Realizar acciones según la opción seleccionada
            switch (opcion) {
                case 1:
                    mostrarEntradasLibres(salaPrincipal, compraVenta, zonaVip);
                    break;
                case 2:
                    venderEntradas(scanner, salaPrincipal, compraVenta, zonaVip);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);

        // Cerrar el scanner al salir del programa
        scanner.close();
    }

    // Método para mostrar el número de entradas libres de cada zona
    private static void mostrarEntradasLibres(Zona salaPrincipal, Zona compraVenta, Zona zonaVip) {
        System.out.println("Entradas disponibles:");
        System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
        System.out.println("Compra-Venta: " + compraVenta.getEntradasPorVender());
        System.out.println("Zona VIP: " + zonaVip.getEntradasPorVender());
    }

    // Método para vender entradas según la zona seleccionada
    private static void venderEntradas(Scanner scanner, Zona salaPrincipal, Zona compraVenta, Zona zonaVip) {
        System.out.print("Seleccione la zona (1. Sala Principal, 2. Compra-Venta, 3. Zona VIP): ");
        int zonaSeleccionada = scanner.nextInt();

        Zona zona;
        switch (zonaSeleccionada) {
            case 1:
                zona = salaPrincipal;
                break;
            case 2:
                zona = compraVenta;
                break;
            case 3:
                zona = zonaVip;
                break;
            default:
                System.out.println("Zona no válida. La venta ha sido cancelada.");
                return;
        }
        
        //preguntamos cuantas entradas quiere comprar

        System.out.print("Ingrese la cantidad de entradas que desea comprar: ");
        int cantidadEntradas = scanner.nextInt();

        zona.vender(cantidadEntradas);
    }
}
