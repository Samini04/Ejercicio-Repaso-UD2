import java.util.Scanner;

public class EjercicioRepaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int manzanas = 0;
        int peras = 0;
        boolean salir = false;

        System.out.println("--- Menú de Inventario ---");
        System.out.println("1. Agregar Manzana");
        System.out.println("2. Eliminar Manzana");
        System.out.println("3. Agregar Pera");
        System.out.println("4. Eliminar Pera");
        System.out.println("5. Mostrar Inventario");
        System.out.println("6. Salir");

        while (!salir) {
            System.out.print("\nSeleccione una opción: ");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> manzanas++;
                    case 2 -> {
                        if (manzanas > 0) {
                            manzanas--;
                            if (manzanas <= 3) System.out.println("Hay que reponer Manzanas");
                        } else {
                            System.out.println("No hay inventario de Manzanas");
                        }
                    }
                    case 3 -> peras++;
                    case 4 -> {
                        if (peras > 0) {
                            peras--;
                            if (peras <= 3) System.out.println("Hay que reponer Peras");
                        } else {
                            System.out.println("No hay inventario de Peras");
                        }
                    }
                    case 5 -> System.out.println("Inventario actual: Manzanas: " + manzanas + ", Peras: " + peras);
                    case 6 -> {
                        System.out.println("Gracias por usar el sistema . ");
                        salir = true;
                    }
                    default -> System.out.println("Opción inválida. Seleccione un número entre 1 y 6.");
                }
            }
                scanner.nextLine();  // Limpiar entrada inválida
            }
        }
    }
