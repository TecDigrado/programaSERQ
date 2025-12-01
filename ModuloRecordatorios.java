import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ModuloRecordatorios {

    static String[] OPCIONES_TITULOS = {
            "Estructura atómica",
            "Tabla periódica",
            "Enlaces químicos",
            "Electrones de valencia",
            "Nomenclatura",
            "Reacciones químicas",
            "Gases ideales",
            "Problemas",
            "Ciencias con relación a la química",
            "Estudiar lapbooks"
    };

    static String[] OPCIONES_CONTENIDOS = {
            "La estructura atómica se compone de protones, neutrones y electrones distribuidos en niveles de energía.",
            "La tabla periódica organiza los elementos por número atómico, grupos y periodos.",
            "Los enlaces químicos son interacciones entre átomos para alcanzar estabilidad electrónica.",
            "Los electrones de valencia determinan la reactividad y el tipo de enlace de un átomo.",
            "La nomenclatura química permite nombrar compuestos según reglas establecidas (IUPAC).",
            "Las reacciones químicas transforman sustancias mediante ruptura y formación de enlaces.",
            "La teoría de gases ideales describe el comportamiento de los gases mediante leyes como Boyle y Charles.",
            "Problemas típicos de química que requieren análisis, cálculos y aplicación de conceptos teóricos.",
            "Ciencias relacionadas con la química, como física, biología y geología y su relación con la materia.",
            "Estudiar teoría y práctica en los lapbooks."
    };


    static String[] TITULOSr = new String[50];
    static String[] CONTENIDOS = new String[50];
    static int TOTALr = 0;
    static String[] FECHAS = new String[50];


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcionMenu("Seleccione una opción: ");

            if (opcion == -9999){
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarRecordatorio(scanner);
                    break;

                case 2:
                    verRecordatorios();
                    break;

                case 3:
                    eliminarRecordatorio(scanner);
                    break;

                case 4:
                    buscarYEditarRecordatorio();
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    pausar();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("|         Opción inválida         |");
                    System.out.println("===================================");
                    pausar();
            }

        } while (opcion != 0);
    }

    // ==========================================================
    // Menu principal
    // ==========================================================
    public static void mostrarMenu() {
        limpiarPantalla();
        recordatorios();
        System.out.println("=======================================");
        System.out.println("|  ADMINISTRACIÓN DE RECORDATORIOS    |");
        System.out.println("=======================================");
        System.out.println("| 1. Agregar nuevo recordatorio       |");
        System.out.println("| 2. Ver recordatorios guardados      |");
        System.out.println("| 3. Eliminar un recordatorio         |");
        System.out.println("| 4. Buscar y editar un recordatorio  |");
        System.out.println("| 0. Regresar al menú principal       |");
        System.out.println("=======================================");
    }

    // ==========================================================
    // Agregar recordatorio
    // ==========================================================

    public static void agregarRecordatorio(Scanner sc) {

        limpiarPantalla();
        System.out.println("========================");
        System.out.println("| AGREGAR RECORDATORIO |");
        System.out.println("========================");

        // 1) Seleccionar título y contenido
        String[] datos = seleccionarTitulo(sc);
        if (datos == null) return;

        String titulo = datos[0];
        String contenido = datos[1];

        // 2) Seleccionar fecha automática
        LocalDate fecha = seleccionarFecha(sc);
        if (fecha == null) return;

        // 3) Guardar el recordatorio
        TITULOSr[TOTALr] = titulo;
        CONTENIDOS[TOTALr] = contenido;
        FECHAS[TOTALr] = fecha.toString();
        TOTALr++;

        System.out.println("\n");
        System.out.println("========================================");
        System.out.println("| Recordatorio agregado correctamente. |");
        System.out.println("========================================");
        pausar();
    }


    // ==========================================================
    // Ver recordatorios
    // ==========================================================

    public static void ordenarPorFecha() {

        for (int i = 0; i < TOTALr - 1; i++) {
            for (int j = i + 1; j < TOTALr; j++) {

                // Separar FECHAS[i] ? ["DD","MM","AAAA"]
                String[] p1 = FECHAS[i].split("/");
                String[] p2 = FECHAS[j].split("/");

                // Validar por si acaso (evita errores si falta algo)
                if (p1.length < 3 || p2.length < 3) continue;

                int dia1 = Integer.parseInt(p1[0]);
                int mes1 = Integer.parseInt(p1[1]);
                int anio1 = Integer.parseInt(p1[2]);

                int dia2 = Integer.parseInt(p2[0]);
                int mes2 = Integer.parseInt(p2[1]);
                int anio2 = Integer.parseInt(p2[2]);

                // Comparaci�n correcta: primero a�o, luego mes, luego d�a
                boolean debeIntercambiar = false;

                if (anio1 > anio2) debeIntercambiar = true;
                else if (anio1 == anio2 && mes1 > mes2) debeIntercambiar = true;
                else if (anio1 == anio2 && mes1 == mes2 && dia1 > dia2) debeIntercambiar = true;

                if (debeIntercambiar) {
                    // Interc. t�tulo
                    String tmpT = TITULOSr[i];
                    TITULOSr[i] = TITULOSr[j];
                    TITULOSr[j] = tmpT;

                    // Interc. contenido
                    String tmpC = CONTENIDOS[i];
                    CONTENIDOS[i] = CONTENIDOS[j];
                    CONTENIDOS[j] = tmpC;

                    // Interc. fecha
                    String tmpF = FECHAS[i];
                    FECHAS[i] = FECHAS[j];
                    FECHAS[j] = tmpF;
                }
            }
        }
    }


    public static void verRecordatorios() {
        limpiarPantalla();

        if (TOTALr == 0) {
            System.out.println("======================================");
            System.out.println("|   No hay recordatorios guardados   |");
            System.out.println("======================================");
            pausar();
            return;
        }

        // ORDEN AUTOMÁTICO POR FECHA
        ordenarPorFecha();

        System.out.println("==============================================================================================");
        System.out.println("|                               RECORDATORIOS ORDENADOS POR FECHA                            |");
        System.out.println("==============================================================================================");

        // Encabezados
        System.out.printf("%-5s | %-25s | %-18s | %-50s%n",
                "N°", "TITULO", "FECHA", "DESCRIPCIÓN");

        System.out.println("----------------------------------------------------------------------------------------------");

        // Registros
        for (int i = 0; i < TOTALr; i++) {
            System.out.printf("%-5d | %-25s | %-18s | %-50s%n",
                    (i + 1), TITULOSr[i], FECHAS[i], CONTENIDOS[i]);
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        pausar();
    }


// ==========================================================
// Eliminar recordatorio
// ==========================================================

    public static void eliminarRecordatorio(Scanner sc) {

        while (true) {  // ← Mantiene el módulo activo SIEMPRE hasta que se elija 0
            limpiarPantalla();

            if (TOTALr == 0) {
                System.out.println("======================================");
                System.out.println("|  No hay recordatorios para borrar  |");
                System.out.println("======================================");
                pausar();
                return;
            }

            System.out.println("=======================================================");
            System.out.println("|        Ingrese el número del recordatorio a borrar  |");
            System.out.println("=======================================================");

            // Mostrar lista antes de elegir
            for (int i = 0; i < TOTALr; i++) {
                System.out.println((i + 1) + ". " + TITULOSr[i] + "  (" + FECHAS[i] + ")");
            }

            System.out.println("-------------------------------------------------------");
            System.out.println("| 0. Regresar al menú                                 |");
            System.out.println("-------------------------------------------------------");

            System.out.print("Seleccione una opción: ");
            String entrada = sc.nextLine().trim();

            // ❌ Validar que sea un número entero
            if (!entrada.matches("\\d+")) {
                System.out.println("\n=====================");
                System.out.println("| Opción no válida. |");
                System.out.println("=====================");
                pausar();
                continue;  // ← vuelve al menú SIN SALIR
            }

            int numero = Integer.parseInt(entrada);

            // ✔ Regresar al menú principal
            if (numero == 0) {
                limpiarPantalla();
                System.out.println("======================================");
                System.out.println("|      Regresando al menú...         |");
                System.out.println("======================================");
                pausar();
                return; // ← aquí sí se sale del módulo
            }

            // ❌ Validación de rango
            if (numero < 1 || numero > TOTALr) {
                System.out.println("\n=====================");
                System.out.println("| Opción no válida. |");
                System.out.println("=====================");
                pausar();
                continue; // ← regresa al inicio
            }

            // ✔ Eliminar elemento recorriendo arrays
            for (int i = numero - 1; i < TOTALr - 1; i++) {
                TITULOSr[i] = TITULOSr[i + 1];
                CONTENIDOS[i] = CONTENIDOS[i + 1];
                FECHAS[i] = FECHAS[i + 1];
            }

            TOTALr--;

            System.out.println("==============================================");
            System.out.println("|    Recordatorio eliminado correctamente    |");
            System.out.println("==============================================");

            pausar();
            return; // ← después de borrar volvemos al menú anterior
        }
    }

//Aqui inicia editar recordatorios

    public static void buscarYEditarRecordatorio() {


        limpiarPantalla();

        // ==============================
        //   NO EXISTEN RECORDATORIOS
        // ==============================
        if (TOTALr == 0) {
            System.out.println("========================================================");
            System.out.println("|      Aún no hay recordatorios para editar            |");
            System.out.println("========================================================");
            pausar();
            return;
        }

        // ==============================
        //      MOSTRAR LISTA
        // ==============================
        // ==============================
//   MENÚ DE LISTA COMPLETO
// ==============================
        int opcion = -1;

        while (true) {

            limpiarPantalla();

            System.out.println("========================================================");
            System.out.println("|             LISTA DE RECORDATORIOS                   |");
            System.out.println("========================================================");

            for (int i = 0; i < TOTALr; i++) {
                System.out.println((i + 1) + ". " + TITULOSr[i] + "  (" + FECHAS[i] + ")");
            }

            System.out.println("--------------------------------------------------------");
            System.out.println(" 0. Regresar");
            System.out.println("--------------------------------------------------------");

            System.out.print("Seleccione el número del recordatorio a editar: ");

            // -----------------------------------------------
            //      DETECTAR SI ES CADENA O NÚMERO
            // -----------------------------------------------
            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpiar
                System.out.println("\n=================================");
                System.out.println("| Debe ingresar un número válido |");
                System.out.println("=================================");
                pausar();   // espera para que el usuario vea el error
                continue;   // REGRESA AL INICIO DEL WHILE → MENU SE RECARGA
            }

            // Si sí es entero, lo leemos
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) {
                System.out.println("\n==========================");
                System.out.println("| Regresando al menú... |");
                System.out.println("==========================");
                pausar();
                return;
            }

            if (opcion < 1 || opcion > TOTALr) {
                System.out.println("\n=================================");
                System.out.println("|       Número no válido        |");
                System.out.println("=================================");
                pausar();
                continue;  // vuelve al menú completo
            }
            break;
        }

        int indice = opcion - 1;

        // ==============================
        //      MENÚ DE EDICIÓN
        // ==============================
        int opEdit=-1;

        do {
            limpiarPantalla();
            System.out.println("========================================================");
            System.out.println("|             EDITAR RECORDATORIO                      |");
            System.out.println("========================================================");
            System.out.println("Título actual : " + TITULOSr[indice]);
            System.out.println("Fecha actual  : " + FECHAS[indice]);
            System.out.println("Contenido: ");
            System.out.println(CONTENIDOS[indice]);
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Editar título");
            System.out.println("2. Editar contenido");
            System.out.println("3. Editar fecha");
            System.out.println("0. Regresar");
            System.out.println("--------------------------------------------------------");
            System.out.print("Seleccione una opción: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                pausar();
                continue;
            }

            opEdit = scanner.nextInt();
            scanner.nextLine();

            switch (opEdit) {

                // EDITAR TÍTULO
                case 1 -> {
                    String nuevoTitulo;
                    do {
                        limpiarPantalla();
                        System.out.println("========================================================");
                        System.out.println("|                 EDITAR TÍTULO                        |");
                        System.out.println("========================================================");
                        System.out.print("Nuevo título: ");
                        nuevoTitulo = scanner.nextLine().trim();

                        if (nuevoTitulo.isEmpty()) {
                            System.out.println("\n========================================");
                            System.out.println("| El título no puede estar vacío.      |");
                            System.out.println("========================================");
                            pausar();
                        }
                    } while (nuevoTitulo.isEmpty());

                    TITULOSr[indice] = nuevoTitulo;

                    System.out.println("\n=================================");
                    System.out.println("| Título actualizado con éxito. |");
                    System.out.println("=================================");
                    pausar();
                }

                // EDITAR CONTENIDO
                case 2 -> {
                    String nuevoContenido;
                    do {
                        limpiarPantalla();
                        System.out.println("========================================================");
                        System.out.println("|                EDITAR CONTENIDO                      |");
                        System.out.println("========================================================");
                        System.out.print("Nuevo contenido: ");
                        nuevoContenido = scanner.nextLine().trim();

                        if (nuevoContenido.isEmpty()) {
                            System.out.println("\n==========================================");
                            System.out.println("| El contenido no puede estar vacío.     |");
                            System.out.println("==========================================");
                            pausar();
                        }
                    } while (nuevoContenido.isEmpty());

                    CONTENIDOS[indice] = nuevoContenido;

                    System.out.println("\n=================================");
                    System.out.println("| Contenido actualizado con éxito. |");
                    System.out.println("=================================");
                    pausar();
                }

                // EDITAR FECHA
                case 3 -> {
                    String nuevaFecha;

                    do {
                        limpiarPantalla();
                        System.out.println("========================================================");
                        System.out.println("|                    EDITAR FECHA                       |");
                        System.out.println("========================================================");
                        System.out.println("Formato: DD/MM/AAAA");
                        System.out.print("Nueva fecha: ");
                        nuevaFecha = scanner.nextLine().trim();

                        if (!nuevaFecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
                            System.out.println("\n=======================================");
                            System.out.println("| Formato inválido. Intente de nuevo. |");
                            System.out.println("=======================================");
                            pausar();
                            nuevaFecha = "";
                        }
                    } while (nuevaFecha.isEmpty());

                    FECHAS[indice] = nuevaFecha;

                    System.out.println("\n================================");
                    System.out.println("| Fecha actualizada con éxito. |");
                    System.out.println("================================");
                    pausar();
                }

                case 0 -> {
                    System.out.println("\n==========================");
                    System.out.println("| Regresando al menú... |");
                    System.out.println("==========================");
                    pausar();
                }

                default -> {
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    pausar();
                }
            }

        } while (opEdit != 0);
    }





    // ==========================================================
    // Funciones auxiliares
    // ==========================================================
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static void pausar() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presione ENTER para continuar... |");
        System.out.println("====================================");
        scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("\n");
            System.out.println("=======================================");
            System.out.println("| Entrada inválida. Intente de nuevo: | ");
            System.out.println("=======================================");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static int leerOpcionMenu(String mensaje) {

        while (true) {
            System.out.print(mensaje);

            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpiar basura

                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");

                pausar();           // Presione ENTER para continuar
                limpiarPantalla(); // Limpia pantalla completa
                return -9999;      // Señal de error para que el menú se repita
            }

            int num = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            return num;
        }
    }

    public static int leerOpcionMenu2(String msg) {
        while (true) {
            System.out.print(msg);

            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpia cadena inválida
                System.out.println("=====================================");
                System.out.println("| Entrada inválida. Debe ser número |");
                System.out.println("=====================================");
                pausar();

                return -9999;   // <<--- clave: avisa que hubo cadena
            }

            int num = scanner.nextInt();
            scanner.nextLine(); // limpia salto de línea
            return num;
        }
    }


    public static String[] seleccionarTitulo(Scanner sc) {

        while (true) {
            limpiarPantalla();
            System.out.println("=========================================");
            System.out.println("|         Selecciona un tema            |");
            System.out.println("=========================================");

            // Mostrar las opciones automáticamente
            for (int i = 0; i < OPCIONES_TITULOS.length; i++) {
                System.out.println((i + 1) + ") " + OPCIONES_TITULOS[i]);
            }

            System.out.println("0) Cancelar                           ");
            System.out.println("-----------------------------------------");
            int op = leerOpcionMenu("Selecciona una opcion: ");
            if (op == -9999){
                continue;
            }
            if (op == 0) {
                return null;
            }

            if (op >= 1 && op <= OPCIONES_TITULOS.length) {
                // Regresa un arreglo con {titulo, contenido}
                return new String[]{
                        OPCIONES_TITULOS[op - 1],
                        OPCIONES_CONTENIDOS[op - 1]
                };
            }

            System.out.println("\n");
            System.out.println("=====================================");
            System.out.println("| Opción inválida. Intente de nuevo |");
            System.out.println("=====================================");
            pausar();
        }
    }

    public static LocalDate seleccionarFecha(Scanner sc) {
        LocalDate hoy = LocalDate.now();

        while (true) {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|      Selecciona una fecha           |");
            System.out.println("=======================================");
            System.out.println("| 1) Hoy (" + hoy + ")                 |");
            System.out.println("| 2) Mañana (" + hoy.plusDays(1) + ")              |");
            System.out.println("| 3) Pasado mañana (" + hoy.plusDays(2) + ")       |");
            System.out.println("| 4) En tres días (" + hoy.plusDays(3) + ")        |");
            System.out.println("| 0) Cancelar                         |");
            System.out.println("=======================================");

            int op = leerOpcionMenu("Selecciona una opcion: ");
            if (op == -9999){
                continue;
            }

            switch (op) {
                case 1: return hoy;
                case 2: return hoy.plusDays(1);
                case 3: return hoy.plusDays(2);
                case 4: return hoy.plusDays(3);
                case 0:
                    return null;

                default:
                    System.out.println("\n");
                    System.out.println("=====================================");
                    System.out.println("| Opción inválida. Intente de nuevo |");
                    System.out.println("=====================================");
                    pausar();
            }
        }
    }

    public static void recordatorios(){
        System.out.println("\u001B[32m" +
                "██████╗  ███████╗  ██████╗  ██████╗  ██████╗   ██████╗   █████╗  ████████╗  ██████╗  ██████╗   ██╗  ██████╗    █████╗       \n" +
                "██╔══██╗ ██╔════╝ ██╔════╝ ██╔═══██╗ ██╔══██╗  ██╔══██╗ ██╔══██╗ ╚══██╔══╝ ██╔═══██╗ ██╔══██╗  ██║ ██╔═══██╗  ██╔═══╝  \n" +
                "██████╔╝ █████╗   ██║      ██║   ██║ ██████╔╝  ██║  ██║ ███████║    ██║    ██║   ██║ ██████╔╝  ██║ ██║   ██║  █████╗ \n" +
                "██╔══██╗ ██╔══╝   ██╚════╗ ██║   ██║ ██║  ██╗  ██║  ██║ ██╔══██║    ██║    ██║   ██║ ██║  ██╗  ██║ ██║   ██║  ╚═══██╗\n" +
                "██║  ██║ ███████╗ ╚██████║ ╚██████╔╝ ██║  ██║  ██████╔╝ ██║  ██║    ██║    ╚██████╔╝ ██║  ██║  ██║ ╚██████╔╝ ██████╔╝\n" +
                "╚═╝  ╚═╝ ╚══════╝  ╚═════╝  ╚═════╝  ╚═╝  ╚═╝  ╚═════╝  ╚═╝  ╚═╝    ╚═╝     ╚═════╝  ╚═╝  ╚═╝  ╚═╝  ╚═════╝  ╚═════╝\n" +
                "\u001B[0m");

    }
}

