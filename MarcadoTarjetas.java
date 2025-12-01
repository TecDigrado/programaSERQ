import java.util.Scanner;


public class MarcadoTarjetas {

    // ================================
    //  VARIABLES GLOBALES (static)
    // ================================
    static String[] TITULOS = new String[43];
    static String[] ESTADO = new String[43];
    static int TOTAL = 43;   // Número de tarjetas cargadas
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        // =====================================
        //      CARGA DE LOS TÍTULOS
        // =====================================

        TITULOS[0] = "Introducción a la química";
        TITULOS[1] = "Materia y energía";
        TITULOS[2] = "Propiedades de la materia";
        TITULOS[3] = "Fenómenos físicos y químicos";
        TITULOS[4] = "Elementos, compuestos y mezclas";
        TITULOS[5] = "Métodos de separación de mezclas";

        TITULOS[6] = "Configuración electrónica";
        TITULOS[7] = "El átomo";
        TITULOS[8] = "Electrón diferencial";
        TITULOS[9] = "Modelos atómicos";
        TITULOS[10] = "Números cuánticos";
        TITULOS[11] = "Principio de Aufbau";
        TITULOS[12] = "Tabulación de los números cuánticos";

        TITULOS[13] = "Afinidad electrónica y electronegatividad";
        TITULOS[14] = "Construcción de la tabla periódica";
        TITULOS[15] = "Electrones periféricos";
        TITULOS[16] = "Electrones de valencia";
        TITULOS[17] = "Electrones de transición";
        TITULOS[18] = "Energía de ionización";
        TITULOS[19] = "Metal y no metal";
        TITULOS[20] = "Valencia";
        TITULOS[21] = "Radio atómico";
        TITULOS[22] = "Propiedades periódicas";
        TITULOS[23] = "Números de oxidación";

        TITULOS[24] = "Enlace Químico";
        TITULOS[25] = "Enlace iónico";
        TITULOS[26] = "Enlace covalente";
        TITULOS[27] = "Tipos de covalencia";
        TITULOS[28] = "Enlace dativo";
        TITULOS[29] = "Enlaces especiales";
        TITULOS[30] = "Hibridación";
        TITULOS[31] = "Propiedades de las sustancias derivadas del tipo de enlace";

        TITULOS[32] = "Hidróxidos";
        TITULOS[33] = "Hidruros metálicos";
        TITULOS[34] = "Hidruros no metálicos";
        TITULOS[35] = "Nomenclatura inorgánica";
        TITULOS[36] = "Determinación de los números de oxidación";
        TITULOS[37] = "Óxidos metálicos";
        TITULOS[38] = "Óxidos no metálicos";
        TITULOS[39] = "Oxoácidos";
        TITULOS[40] = "Oxisales";
        TITULOS[41] = "Sales ácidas";
        TITULOS[42] = "Sales binarias";

        // Inicializar todos los estados a pendiente
        for (int i = 0; i < TOTAL; i++) {
            ESTADO[i] = "PENDIENTE";
        }

        menuTarjetas();
    }


    // ================================
    //        MENÚ PRINCIPAL
    // ================================
    public static void menuTarjetas() {
        int opcion=-1;

        do {
            limpiarPantalla();
            marcado();
            System.out.println("===================================================================");
            System.out.println("|                      MARCADO DE TARJETAS                        |");
            System.out.println("===================================================================");
            System.out.println("| 1. Ver todas las tarjetas                                       |");
            System.out.println("| 2. Marcar tarjeta como LEÍDA                                    |");
            System.out.println("| 3. Marcar tarjeta como PENDIENTE                                |");
            System.out.println("| 4. Ver solo tarjetas LEÍDAS                                     |");
            System.out.println("| 5. Ver solo tarjetas PENDIENTES                                 |");
            System.out.println("| 6. Ver progreso                                                 |");
            System.out.println("| 0. Salir                                                        |");
            System.out.println("===================================================================");
            System.out.print("Seleccione una opción: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n");
                System.out.println("===============================");
                System.out.println("| Ingrese un número válido... |");
                System.out.println("===============================");
                esperarEnter();
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    verTodasLasTarjetas();
                    break;

                case 2:
                    marcarLeida(TITULOS,ESTADO);
                    break;

                case 3:
                    marcarPendiente(TITULOS,ESTADO);
                    break;

                case 4:
                    verSoloLeidas(TITULOS,ESTADO);
                    break;

                case 5:
                    verSoloPendientes(TITULOS,ESTADO);
                    break;

                case 6:
                    verProgreso(ESTADO);
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("============================");
                    System.out.println("| Saliendo del programa... |");
                    System.out.println("============================");
                    esperarEnter();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarEnter();
            }

        } while (opcion != 0);
    }


    // ================================
    //     VER TODAS LAS TARJETAS
    // ================================
    private static void verTodasLasTarjetas() {
        limpiarPantalla();
        System.out.println("================================================================================");
        System.out.println("|                           LISTA DE TODAS LAS TARJETAS                        |");
        System.out.println("================================================================================");

        System.out.printf("| %-1s  | %-60s | %-20s%n", "N°", "TÍTULO", "ESTADO  |");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < TOTAL; i++) {
            System.out.printf(" %-4d | %-60s | %-10s%n", (i + 1), TITULOS[i], ESTADO[i]);
        }

        System.out.println("--------------------------------------------------------------------------------");
        esperarEnter();
    }

    private static void marcarLeida(String[] TITULOS, String[] ESTADO) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("========================================================================================");
            System.out.println("|                              MARCAR TARJETA COMO LEÍDA                               |");
            System.out.println("========================================================================================");

            // Mostrar lista de tarjetas
            for (int i = 0; i < TITULOS.length; i++) {
                System.out.printf("%-3d | %-62s | Estado: %s%n", (i + 1), TITULOS[i], ESTADO[i]);
            }

            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(" 0. Regresar");
            System.out.println("----------------------------------------------------------------------------------------");

            System.out.print("Ingresa el número de la tarjeta que deseas marcar como LEÍDA: ");

            // ============================
            // VALIDACIÓN DE ENTRADA
            // ============================
            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpiar entrada
                System.out.println("\n===============================================");
                System.out.println("| Entrada inválida. Debes ingresar un número. |");
                System.out.println("===============================================");
                esperarEnter();
                continue;  // repetir todo el bloque
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // ============================
            // OPCIÓN 0 → REGRESAR
            // ============================
            if (opcion == 0) {
                System.out.println("\n==========================");
                System.out.println("| Regresando al menú... |");
                System.out.println("==========================");
                esperarEnter();
                return;
            }

            // ============================
            // RANGO INVÁLIDO
            // ============================
            if (opcion < 1 || opcion > TITULOS.length) {
                System.out.println("\n============================================");
                System.out.println("| Número fuera de rango. Intenta otra vez. |");
                System.out.println("============================================");
                esperarEnter();
                continue; // repetir el menú
            }

            // ============================
            // SI LLEGA AQUÍ → ES VÁLIDO
            // ============================
            int index = opcion - 1;
            ESTADO[index] = "LEÍDA";

            System.out.println("\n========================================");
            System.out.println(" La tarjeta ha sido marcada como LEÍDA! ");
            System.out.println("========================================");
            esperarEnter();
            return;  // Finaliza porque ya eligió una tarjeta

        } while (true);
    }

    private static void marcarPendiente(String[] TITULOS, String[] ESTADO) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("======================================================================================");
            System.out.println("|                          MARCAR TARJETA COMO PENDIENTE                             |");
            System.out.println("======================================================================================");

            // Mostrar todas las tarjetas con estado
            for (int i = 0; i < TITULOS.length; i++) {
                System.out.printf("%-3d | %-60s | Estado: %s%n", (i + 1), TITULOS[i], ESTADO[i]);
            }

            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println(" 0. Regresar");
            System.out.println("--------------------------------------------------------------------------------------");

            System.out.print("Ingresa el número de la tarjeta que deseas marcar como PENDIENTE: ");

            // ============================
            // VALIDAR ENTRADA
            // ============================
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n=======================================");
                System.out.println("| Entrada inválida. Ingresa un número. |");
                System.out.println("=======================================");
                esperarEnter();
                continue; // Se repite todo el bloque
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // ============================
            // REGRESAR AL MENÚ
            // ============================
            if (opcion == 0) {
                System.out.println("\n===============================");
                System.out.println("| Regresando al menú...       |");
                System.out.println("===============================");
                esperarEnter();
                return;
            }

            // ============================
            // VALIDAR RANGO
            // ============================
            if (opcion < 1 || opcion > TITULOS.length) {
                System.out.println("\n==============================================");
                System.out.println("| Número fuera de rango. Intenta nuevamente. |");
                System.out.println("==============================================");
                esperarEnter();
                continue;
            }

            // ============================
            // ESTADO VÁLIDO → MARCAR
            // ============================
            int index = opcion - 1;
            ESTADO[index] = "PENDIENTE";

            System.out.println("\n=============================================");
            System.out.println(" La tarjeta ha sido marcada como PENDIENTE! ");
            System.out.println("=============================================");
            esperarEnter();
            return; // termina después de marcar

        } while (true);
    }

    private static void verSoloLeidas(String[] TITULOS, String[] ESTADO) {
        limpiarPantalla();
        System.out.println("==========================================================================");
        System.out.println("|                         TARJETAS MARCADAS COMO LEÍDAS                  |");
        System.out.println("==========================================================================");

        boolean hayLeidas = false;

        System.out.printf("%-4s | %-50s | %-10s%n", "N°", "TÍTULO", "ESTADO");
        System.out.println("--------------------------------------------------------------------------");

        // Recorrer todas las tarjetas
        for (int i = 0; i < TITULOS.length; i++) {

            if (ESTADO[i].equals("LEÍDA")) {
                hayLeidas = true;

                System.out.printf(
                        "%-4d | %-50s | %-10s%n",
                        (i + 1),
                        TITULOS[i],
                        ESTADO[i]
                );
            }
        }

        // Si no se encontró ninguna
        if (!hayLeidas) {
            System.out.println("\n==========================================================================");
            System.out.println("|     No hay tarjetas marcadas como LEÍDAS actualmente.                 |");
            System.out.println("==========================================================================");
        }

        System.out.println("--------------------------------------------------------------------------");
        esperarEnter();
    }

    private static void verSoloPendientes(String[] TITULOS, String[] ESTADO) {
        limpiarPantalla();
        System.out.println("===============================================================================");
        System.out.println("|                       TARJETAS MARCADAS COMO PENDIENTES                     |");
        System.out.println("===============================================================================");

        boolean hayPendientes = false;

        System.out.printf("%-4s | %-60s | %-10s%n", "N°", "TÍTULO", "ESTADO");
        System.out.println("-------------------------------------------------------------------------------");

        // Recorrer todas las tarjetas
        for (int i = 0; i < TITULOS.length; i++) {

            if (ESTADO[i].equals("PENDIENTE")) {
                hayPendientes = true;

                System.out.printf(
                        "%-4d | %-60s | %-10s%n",
                        (i + 1),
                        TITULOS[i],
                        ESTADO[i]
                );
            }
        }

        // Si no se encontró ninguna tarjeta pendiente
        if (!hayPendientes) {
            System.out.println("\n=========================================================================");
            System.out.println("|         No hay tarjetas marcadas como PENDIENTES actualmente.         |");
            System.out.println("=========================================================================");
        }

        System.out.println("-------------------------------------------------------------------------------");
        esperarEnter();
    }

    private static void verProgreso(String[] ESTADO) {
        limpiarPantalla();

        System.out.println("===================================================================");
        System.out.println("|                         PROGRESO GENERAL                        |");
        System.out.println("===================================================================");

        int total = ESTADO.length;
        int leidas = 0;

        // Contar cuántas están leídas
        for (String estado : ESTADO) {
            if (estado.equals("LEÍDA")) {
                leidas++;
            }
        }

        int pendientes = total - leidas;

        // Calcular porcentaje
        double porcentaje = (leidas * 100.0) / total;

        // Barra de progreso
        int largoBarra = 30;  // puedes cambiar el tamaño aquí
        int llenado = (int) (largoBarra * (porcentaje / 100));

        StringBuilder barra = new StringBuilder("[");
        for (int i = 0; i < largoBarra; i++) {
            if (i < llenado) barra.append("█");
            else barra.append("-");
        }
        barra.append("]");

        // Mostrar datos
        System.out.println();
        System.out.printf("Tarjetas leídas:     %d%n", leidas);
        System.out.printf("Tarjetas pendientes: %d%n", pendientes);
        System.out.printf("Total de tarjetas:   %d%n", total);
        System.out.println();
        System.out.printf("Progreso: %.2f%% %n", porcentaje);
        System.out.println(barra.toString());

        System.out.println("===================================================================");
        esperarEnter();
    }





    // ================================
    //   UTILIDADES
    // ================================
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

    public static void marcado(){
        System.out.println("\u001B[38;2;0;220;120m\n" +
                "███╗   ███╗  █████╗  ██████╗   ██████╗  █████╗  ██████╗   ██████╗   ██████╗ ███████╗ \n" +
                "████╗ ████║ ██╔══██╗ ██╔══██╗ ██╔════╝ ██╔══██╗ ██╔══██╗ ██╔═══██╗  ██╔══██╗██╔════╝\n" +
                "██╔████╔██║ ███████║ ██████╔╝ ██║      ███████║ ██║  ██║ ██║   ██║  ██║  ██║█████╗ \n"+
                "██║╚██╔╝██║ ██╔══██║ ██╔══██╗ ██║      ██╔══██║ ██║  ██║ ██║   ██║  ██║  ██║██╔══╝  \n" +
                "██║ ╚═╝ ██║ ██║  ██║ ██║  ██║ ╚██████╗ ██║  ██║ ██████╔╝ ╚██████╔╝  ██████╔╝███████╗\n"+
                "╚═╝     ╚═╝ ╚═╝  ╚═╝ ╚═╝  ╚═╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝   ╚═════╝   ╚═════╝ ╚══════╝\n" +
                "\n" +
                "████████╗ █████╗  ██████╗       ██╗  ███████╗ ████████╗  █████╗   █████═╗\n" +
                "╚══██╔══╝██╔══██╗ ██╔══██╗      ██║  ██╔════╝ ╚══██╔══╝ ██╔══██╗ ██╔════╝\n" +
                "   ██║   ███████║ ██████╔╝      ██║  █████╗      ██║    ███████║  █████╗\n" +
                "   ██║   ██╔══██║ ██╔══██╗ ██   ██║  ██╔══╝      ██║    ██╔══██║  ╚═══██╗\n" +
                "   ██║   ██║  ██║ ██║  ██║ ╚█████╔╝  ███████╗    ██║    ██║  ██║ ██████╔╝\n" +
                "   ╚═╝   ╚═╝  ╚═╝ ╚═╝  ╚═╝  ╚════╝   ╚══════╝    ╚═╝    ╚═╝  ╚═╝ ╚═════╝\n" +
                "\u001B[0m");
    }
}
