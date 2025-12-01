import java.util.Scanner;

public class Administracion_de_contenido {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        administrarContenido();
    }

    public static void administrarContenido() {

        String[] TITULOS = new String[50];
        String[] CONTENIDOS = new String[50];
        int[] TOTAL_TARJETAS = {0}; // contador real

        int opcion = -1;

        do {
            limpiarPantalla();
            administracionTitulo();
            System.out.println("=================================");
            System.out.println("|  ADMINISTRACIÓN DE CONTENIDO  |");
            System.out.println("=================================");
            System.out.println("| 1. Agregar nueva tarjeta      |");
            System.out.println("| 2. Ver tarjetas guardadas     |");
            System.out.println("| 3. Eliminar una tarjeta       |");
            System.out.println("| 4. Editar tarjeta             |");
            System.out.println("| 0. Regresar al menú principal |");
            System.out.println("---------------------------------");
            System.out.print("Selecciona una opción: ");

            // Validación de entrada
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n");
                System.out.println("========================================");
                System.out.println("| Entrada inválida. Ingresa un número. |");
                System.out.println("========================================");
                esperarEnter();
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    agregarTarjeta(TITULOS, CONTENIDOS, TOTAL_TARJETAS);
                    break;

                case 2:
                    verTarjetas(TITULOS, CONTENIDOS, TOTAL_TARJETAS[0]);
                    break;

                case 3:
                    eliminarTarjetaPorNumero(TITULOS, CONTENIDOS, TOTAL_TARJETAS);
                    break;

                case 4:
                    editarTarjetaPorNumero(TITULOS,CONTENIDOS, TOTAL_TARJETAS);
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    esperarEnter();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("===================");
                    System.out.println("| Opción inválida |");
                    System.out.println("===================");
                    esperarEnter();
            }

        } while (opcion != 0);
    }

    public static void agregarTarjeta(String[] TITULOS, String[] CONTENIDOS, int[] TOTAL_TARJETAS) {

        // Límite de tarjetas
        if (TOTAL_TARJETAS[0] >= 50) {
            limpiarPantalla();
            System.out.println("================================================");
            System.out.println("|     No se pueden agregar más tarjetas (50).  |");
            System.out.println("================================================");
            esperarEnter();
            return;
        }

        while (true) {
            limpiarPantalla();

            System.out.println("================================================");
            System.out.println("|               AGREGAR NUEVA TARJETA          |");
            System.out.println("================================================");
            System.out.printf("  Tarjetas almacenadas: %d / 50%n", TOTAL_TARJETAS[0]);
            System.out.println("------------------------------------------------");
            System.out.println(" Escribe 0 en cualquier campo para regresar al menú anterior.");
            System.out.println("------------------------------------------------\n");

            // Solicitar título
            System.out.print("  Ingrese el TÍTULO del tema\n> ");
            String titulo = scanner.nextLine().trim();

            // Opción para regresar
            if (titulo.equals("0")) {
                System.out.println("\nRegresando al menú anterior...");
                esperarEnter();
                return;
            }

            if (titulo.isEmpty()) {
                System.out.println("\n--------------------------------------------------");
                System.out.println("|       El título NO puede estar vacío. Intenta. |");
                System.out.println("--------------------------------------------------");
                esperarEnter();
                continue;
            }

            // Solicitar contenido
            System.out.print("\n  Ingrese el CONTENIDO o descripción\n> ");
            String contenido = scanner.nextLine().trim();

            // Opción para regresar
            if (contenido.equals("0")) {
                System.out.println("\nRegresando al menú anterior...");
                esperarEnter();
                return;
            }

            if (contenido.isEmpty()) {
                System.out.println("\n---------------------------------------------------");
                System.out.println("|     El contenido NO puede estar vacío. Intenta. |");
                System.out.println("---------------------------------------------------");
                esperarEnter();
                continue;
            }

            // Guardar tarjeta
            int pos = TOTAL_TARJETAS[0];
            TITULOS[pos] = titulo;
            CONTENIDOS[pos] = contenido;
            TOTAL_TARJETAS[0]++;

            System.out.println("\n================================================");
            System.out.println("|          Tarjeta guardada correctamente      |");
            System.out.println("================================================");
            esperarEnter();
            break;
        }
    }

    public static void verTarjetas(String[] TITULOS, String[] CONTENIDOS, int TOTAL_TARJETAS) {
        limpiarPantalla();

        if (TOTAL_TARJETAS == 0) {
            System.out.println("================================================");
            System.out.println("|            No hay tarjetas guardadas         |");
            System.out.println("================================================");
            esperarEnter();
            return;
        }

        System.out.println("================================================");
        System.out.println("|                TARJETAS GUARDADAS            |");
        System.out.println("================================================");
        System.out.printf("  Total de tarjetas: %d%n", TOTAL_TARJETAS);

        for (int i = 0; i < TOTAL_TARJETAS; i++) {
            System.out.println("------------------------------------------------");
            System.out.printf(" 🔹 Tarjeta #%d%n", (i + 1));
            System.out.println("------------------------------------------------");
            System.out.printf(" 📌 Título: %s%n", TITULOS[i]);
            System.out.println(" 📝 Contenido:");
            System.out.println("   " + CONTENIDOS[i]);
            System.out.println("------------------------------------------------\n");
        }

        esperarEnter();
    }

    public static void eliminarTarjetaPorNumero(String[] TITULOS, String[] CONTENIDOS, int[] TOTAL_TARJETAS) {

        if (TOTAL_TARJETAS[0] == 0) {
            limpiarPantalla();
            System.out.println("=================================================");
            System.out.println("|        No hay tarjetas para eliminar.         |");
            System.out.println("=================================================");
            esperarEnter();
            return;
        }

        while (true) {
            limpiarPantalla();

            System.out.println("=================================================");
            System.out.println("|            ELIMINAR TARJETA POR NÚMERO        |");
            System.out.println("=================================================");
            System.out.printf("  Total de tarjetas: %d%n", TOTAL_TARJETAS[0]);
            System.out.println("-------------------------------------------------");
            System.out.println("  Escribe 0 para regresar al menú anterior.");
            System.out.println("-------------------------------------------------");
            System.out.print("  Ingrese el número de la tarjeta a eliminar: ");

            // VALIDACIÓN — entrada no numérica
            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpiar basura
                System.out.println("\n===============================================");
                System.out.println("| Entrada inválida. Debes ingresar un número. |");
                System.out.println("===============================================");
                esperarEnter();
                continue;
            }

            int numero = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // Opción para regresar
            if (numero == 0) {
                esperarEnter();
                return;
            }

            int indice = numero - 1;

            // VALIDACIÓN — fuera de rango
            if (indice < 0 || indice >= TOTAL_TARJETAS[0]) {
                System.out.println("\n===============================================");
                System.out.println("| El número no corresponde a ninguna tarjeta. |");
                System.out.println("===============================================");
                esperarEnter();
                continue;
            }

            // ELIMINAR TARJETA (compactando el arreglo)
            for (int i = indice; i < TOTAL_TARJETAS[0] - 1; i++) {
                TITULOS[i] = TITULOS[i + 1];
                CONTENIDOS[i] = CONTENIDOS[i + 1];
            }

            TOTAL_TARJETAS[0]--;
            TITULOS[TOTAL_TARJETAS[0]] = null;
            CONTENIDOS[TOTAL_TARJETAS[0]] = null;

            System.out.println("\n=======================================");
            System.out.println("|   Tarjeta eliminada correctamente   |");
            System.out.println("=======================================");
            esperarEnter();
            return;
        }
    }


    public static void editarTarjetaPorNumero(String[] TITULOS, String[] CONTENIDOS, int[] TOTAL_TARJETAS) {

        while (true) {
            limpiarPantalla();

            if (TOTAL_TARJETAS[0] == 0) {
                System.out.println("=================================================");
                System.out.println("|        No hay tarjetas para editar.           |");
                System.out.println("=================================================");
                esperarEnter();
                return;
            }

            System.out.println("=================================================");
            System.out.println("|                EDITAR TARJETA                 |");
            System.out.println("=================================================");
            System.out.printf("  Total de tarjetas: %d%n", TOTAL_TARJETAS[0]);
            System.out.println("-------------------------------------------------");
            System.out.println(" Escribe 0 para regresar al menú anterior.");
            System.out.println("-------------------------------------------------\n");

            System.out.print("  Ingrese el número de la tarjeta a editar: ");

            // Validación de número
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n===============================================");
                System.out.println("| Entrada inválida. Debes ingresar un número. |");
                System.out.println("===============================================");
                esperarEnter();
                continue; // repetir bloque
            }

            int numero = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // Opción regresar
            if (numero == 0) {
                esperarEnter();
                return;
            }

            int indice = numero - 1;

            if (indice < 0 || indice >= TOTAL_TARJETAS[0]) {
                System.out.println("\n===============================================");
                System.out.println("| El número no corresponde a ninguna tarjeta. |");
                System.out.println("===============================================");
                esperarEnter();
                continue; // repetir
            }

            // Mostrar datos actuales
            limpiarPantalla();
            System.out.println("=================================================");
            System.out.printf("     EDITANDO TARJETA #%d%n", numero);
            System.out.println("=================================================");
            System.out.printf("  Título actual: %s%n", TITULOS[indice]);
            System.out.printf("  Contenido actual: %s%n", CONTENIDOS[indice]);
            System.out.println("-------------------------------------------------");
            System.out.println(" (Escribe 0 en cualquier campo para cancelar)");
            System.out.println("-------------------------------------------------\n");

            // Nuevo título
            System.out.print("Ingrese el NUEVO título:\n> ");
            String nuevoTitulo = scanner.nextLine().trim();

            if (nuevoTitulo.equals("0")) {
                return;
            }

            if (nuevoTitulo.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("| El título no puede estar vacío. Intenta otra vez. |");
                System.out.println("=================================================");
                esperarEnter();
                continue;
            }

            // Nuevo contenido
            System.out.print("\nIngrese el NUEVO contenido:\n> ");
            String nuevoContenido = scanner.nextLine().trim();

            if (nuevoContenido.equals("0")) {
                return;
            }

            if (nuevoContenido.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("| El contenido no puede estar vacío. Intenta.   |");
                System.out.println("=================================================");
                esperarEnter();
                continue;
            }

            // Guardar cambios
            TITULOS[indice] = nuevoTitulo;
            CONTENIDOS[indice] = nuevoContenido;

            System.out.println("\n=================================================");
            System.out.println("|     Tarjeta editada correctamente ✔️          |");
            System.out.println("=================================================");
            esperarEnter();
            return; // edición completa
        }
    }



    public static void esperarEnter() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presione ENTER para continuar... |");
        System.out.println("====================================");
        scanner.nextLine();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void administracionTitulo() {
        System.out.println("\u001B[38;2;255;190;150m\n" +
                " █████╗  ██████╗  ███╗   ███╗ ██╗ ███╗   ██╗ ██╗  █████═╗ ████████╗ ██████╗   █████╗   ██████╗ ██╗  ██████╗   ███╗   ██╗\n" +
                "██╔══██╗ ██╔══██╗ ████╗ ████║ ██║ ████╗  ██║ ██║ ██╔════╝ ╚══██╔══╝ ██╔══██╗ ██╔══██╗ ██╔════╝ ██║ ██╔═══██╗  ████╗  ██║\n" +
                "███████║ ██║  ██║ ██╔████╔██║ ██║ ██╔██╗ ██║ ██║  █████╗     ██║    ██████╔╝ ███████║ ██║      ██║ ██║   ██║  ██╔██╗ ██║\n" +
                "██╔══██║ ██║  ██║ ██║╚██╔╝██║ ██║ ██║╚██╗██║ ██║  ╚═══██╗    ██║    ██╔══██╗ ██╔══██║ ██║      ██║ ██║   ██║  ██║╚██╗██║\n" +
                "██║  ██║ ██████╔╝ ██║ ╚═╝ ██║ ██║ ██║ ╚████║ ██║ ██████╔╝    ██║    ██║  ██║ ██║  ██║ ╚██████╗ ██║ ╚██████╔╝  ██║ ╚████║\n" +
                "╚═╝  ╚═╝ ╚═════╝  ╚═╝     ╚═╝ ╚═╝ ╚═╝  ╚═══╝ ╚═╝ ╚═════╝     ╚═╝    ╚═╝  ╚═╝ ╚═╝  ╚═╝  ╚═════╝ ╚═╝  ╚═════╝   ╚═╝  ╚═══╝\n" +
                "\n" +
                "██████╗  ███████╗   ██████╗  ██████╗  ███╗   ██╗ ████████╗ ███████╗ ███╗   ██╗ ██╗ ██████╗   ██████╗\n" +
                "██╔══██╗ ██╔════╝  ██╔════╝ ██╔═══██╗ ████╗  ██║ ╚══██╔══╝ ██╔════╝ ████╗  ██║ ██║ ██╔══██╗ ██╔═══██╗\n" +
                "██║  ██║ █████╗    ██║      ██║   ██║ ██╔██╗ ██║    ██║    █████╗   ██╔██╗ ██║ ██║ ██║  ██║ ██║   ██║\n" +
                "██║  ██║ ██╔══╝    ██║      ██║   ██║ ██║╚██╗██║    ██║    ██╔══╝   ██║╚██╗██║ ██║ ██║  ██║ ██║   ██║\n" +
                "██████╔╝ ███████╗  ╚██████╗ ╚██████╔╝ ██║ ╚████║    ██║    ███████╗ ██║ ╚████║ ██║ ██████╔╝ ╚██████╔╝\n" +
                "╚═════╝  ╚══════╝   ╚═════╝  ╚═════╝  ╚═╝  ╚═══╝    ╚═╝    ╚══════╝ ╚═╝  ╚═══╝ ╚═╝ ╚═════╝   ╚═════╝\n" +
                "\u001B[0m");
    }
}
