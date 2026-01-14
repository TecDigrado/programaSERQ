
import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalDate;


public class SERQ {

    // ===== TARJETAS (usuario activo) =====
    static String[] TITULOS_TARJETAS = new String[50];
    static String[] CONTENIDOS_TARJETAS = new String[50];
    static int TOTAL_TARJETAS = 0;


    // 1. ¿Qué significa static aquí?
    //Cuando una variable es static:
    //•	Pertenece a la clase, no a un objeto
    //•	Puede usarse directamente desde main
    //•	Mantiene su valor durante toda la ejecución del programa
    
    static int califU1 = 0;
    static int califU2 = 0;
    static int califU3 = 0;
    static int califU4 = 0;
    static int califU5 = 0;


    //Son calificaciones (De Unidad 1 a Unidad 5).
    //•	Se inicializan en 0
    //•	Se irán actualizando conforme el usuario avance contestando los cuestionarios
    //•	Pueden usarse para:
    //o	Promedios

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

    //¿Qué representan?
    //Son menús de opciones con:
    //•	Títulos de temas
    //•	Descripciones de cada tema
    //•	Se usan al crear un recordatorio

    static String[] TITULOSr = new String[50];
    static String[] CONTENIDOS = new String[50];
    static int TOTALr = 0;
    static String[] FECHAS = new String[50];

    //Marcan la cantidad de recordatorios que pueden ser creados (50 recordatorios con título, contenido y fecha)

    static String[] TITULOS = new String[43];
    static String[] ESTADO = new String[43];
    static int TOTAL = 43;   // Número de tarjetas cargadas
    static Scanner scanner = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    //¿Qué representan?
    //•	TITULOS → tarjetas de estudio ya cargadas
    //•	ESTADO → estado de cada tarjeta
    //o	"PENDIENTE"
    //o	posiblemente luego "VISTO", "APRENDIDO", etc.
    //•	TOTAL → número total de tarjetas
    // El for final:
    //for (int i = 0; i < TOTAL; i++) {
    //    ESTADO[i] = "PENDIENTE";
    //}
    //Inicializa todas las tarjetas como pendientes.



    public static void main(String[] args) {

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


        // ===== LOGIN INICIAL =====
        limpiarPantalla();


// BLOQUE QUE SE REPITE SI EL USUARIO CONTIENE NÚMEROS
        while (true) {
            limpiarPantalla();
            usuario();
            System.out.println("=============================================================");
            System.out.println("|              SISTEMA DE ESTUDIO RÁPIDO (SERQ)             |");
            System.out.println("=============================================================");

            // LLAMA A CAMBIO USUARIO (VALIDA QUE SOLO HAYA LETRAS)
            if (cambioUsuarioInicio()) {
                break; // Usuario válido → salir del ciclo y continuar
            }
        }

        // ===== MENÚ PRINCIPAL =====
        int opcion = -1;

        do {
            limpiarPantalla();
            serq();
            System.out.println("===============================================================");
            System.out.println("| Bienvenido al Sistema de Estudio Rápido de Química 1 (SERQ) |");
            System.out.printf ("| Usuario actual: %-44s|\n", SistemaUsuarios.getUsuarioActual().nombreUsuario);
            System.out.println("===============================================================");
            System.out.println("| 1. Tarjetas de estudio                                      |");
            System.out.println("| 2. Técnicas de estudio                                      |");
            System.out.println("| 3. Recordatorios                                            |");
            System.out.println("| 4. Test de conocimientos                                    |");
            System.out.println("| 5. Administración de contenido                              |");
            System.out.println("| 6. Cambiar de usuario                                       |");
            System.out.println("| 0. Salir                                                    |");
            System.out.println("===============================================================");
            System.out.println("Seleccione la opción que quiera consultar:");

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
                case 1 -> {
                    menuTarjetas();
                    break;
                }
                case 2 -> {
                    ModuloTecnicasDeEstudio();
                    break;
                }
                case 3 -> {
                    Recordatorios();
                    break;
                }
                case 4 -> {
                    ModuloTest();
                    break;
                }
                case 5 -> {
                    AdministrarContenido();
                    break;
                }
                case 6 -> {
                    cambioUsuario();
                    break;
                }
                case 0 -> {
                    System.out.println("\n");
                    System.out.println("========================================");
                    System.out.println("| Gracias por usar SERQ. ¡Hasta luego! |");
                    System.out.println("========================================");
                }
                default -> {
                    System.out.println("\n");
                    System.out.println("====================");
                    System.out.println("| Opción inválida. |");
                    System.out.println("====================");
                    esperarEnter();
                }
            }

        } while (opcion != 0);
    }



    // ========= PRIMER INICIO DE SESION ============

    //Este metodo sirve para:
    //✔ Cambiar usuario al inicio
    //✔ Validar que el nombre solo tenga letras

     private static boolean cambioUsuarioInicio() {

        String nuevo;

        System.out.print("Usuario: ");
        nuevo = scanner.nextLine();

        // VALIDAR SOLO LETRAS
        if (!nuevo.matches("[a-zA-Z ]+")) {
            System.out.println("\n========================================");
            System.out.println("| Error: El usuario solo puede contener |");
            System.out.println("| letras. No se permiten números.       |");
            System.out.println("=========================================");
            esperarEnter();
            return false;  // <-- usuario inválido → repetir bloque
        }

        System.out.print("Contraseña: ");
        String pass = scanner.nextLine();

        SistemaUsuarios.guardarUsuarioActual();
        SistemaUsuarios.login(nuevo, pass);
        return true; // <-- usuario válido → continuar al menú principal
    }


    private static void cambioUsuario() {

        String nuevo;

        while (true) {
            System.out.print("usuario: ");
            nuevo = scanner.nextLine();

            // VALIDAR QUE SOLO CONTENGA LETRAS (A-Z, a-z y espacios)
            if (!nuevo.matches("[a-zA-Z ]+")) {
                System.out.println("\n========================================");
                System.out.println("| Error: El usuario solo puede contener |");
                System.out.println("| letras. No se permiten números.      |");
                System.out.println("========================================");
                esperarEnter();
                continue; // repetir
            }

            break; // nombre válido → salir del ciclo
        }

        System.out.print("Contraseña: ");
        String pass = scanner.nextLine();


        SistemaUsuarios.guardarUsuarioActual();
        SistemaUsuarios.login(nuevo, pass);
        esperarEnter();
    }


    //SistemaUsuarios:
    //
    //✔ Guarda usuarios en memoria
    //✔ Cambia entre perfiles
    //✔ Guarda progreso antes de cambiar de usuario
    //✔ Restaura progreso al entrar
    //✔ Evita mezclar datos
    //
    //Es como una mini base de datos sin archivos.

    public static class SistemaUsuarios {
        private static HashMap<String, Perfil> usuarios = new HashMap<>();
        private static Perfil usuarioActual = null;

        public static Perfil getUsuarioActual() {
            return usuarioActual;
        }

        public static void login(String usuario, String password) {

            // Guardar el usuario anterior antes de cambiar (si existe)

            if (!usuarios.containsKey(usuario)) {
                usuarios.put(usuario, new Perfil(usuario));
            }

            usuarioActual = usuarios.get(usuario);

            // Cargar los datos del perfil a las variables globales de SERQ
            cargarUsuarioActual();

            System.out.println("\nInicio de sesión exitoso como: " + usuario);
        }

        public static void CambiarUsuario(String usuario, String password) {
            login(usuario, password);
        }

        // Llamar antes de cerrar sesión / cambiar a otro usuario
        public static void guardarUsuarioActual() {
            if (usuarioActual == null) return;
            Perfil p = usuarioActual;

            // Guardar calificaciones
            p.calificaciones[0] = califU1;
            p.calificaciones[1] = califU2;
            p.calificaciones[2] = califU3;
            p.calificaciones[3] = califU4;
            p.calificaciones[4] = califU5;
            // si hay más, ajústalo

            // Guardar estado de tarjetas
            for (int i = 0; i < SERQ.TOTAL; i++) {
                p.estadoTarjetas[i] = SERQ.ESTADO[i];
            }

            // Guardar recordatorios
            p.totalRecordatorios = SERQ.TOTALr;
            for (int i = 0; i < 50; i++) {
                p.titulosRecordatorios[i] = SERQ.TITULOSr[i];
                p.contenidosRecordatorios[i] = SERQ.CONTENIDOS[i];
                p.fechasRecordatorios[i] = SERQ.FECHAS[i];
            }

            // ===== GUARDAR TARJETAS =====
            p.totalTarjetas = TOTAL_TARJETAS;

            for (int i = 0; i < 50; i++) {
                p.titulosTarjetas[i] = TITULOS_TARJETAS[i];
                p.contenidosTarjetas[i] = CONTENIDOS_TARJETAS[i];
            }

        }

        // Cargar datos del perfil a las variables globales del programa
        public static void cargarUsuarioActual() {
            if (usuarioActual == null) return;
            Perfil p = usuarioActual;

            // Cargar calificaciones
            if (p.calificaciones != null && p.calificaciones.length >= 5) {
                califU1 = (int) p.calificaciones[0];
                califU2 = (int) p.calificaciones[1];
                califU3 = (int) p.calificaciones[2];
                califU4 = (int) p.calificaciones[3];
                califU5 = (int) p.calificaciones[4];
            }

            // Cargar estado de tarjetas
            for (int i = 0; i < SERQ.TOTAL; i++) {
                if (p.estadoTarjetas[i] != null) {
                    SERQ.ESTADO[i] = p.estadoTarjetas[i];
                } else {
                    SERQ.ESTADO[i] = "PENDIENTE";
                }
            }

            // Cargar recordatorios
            SERQ.TOTALr = p.totalRecordatorios;
            for (int i = 0; i < 50; i++) {
                SERQ.TITULOSr[i] = p.titulosRecordatorios[i];
                SERQ.CONTENIDOS[i] = p.contenidosRecordatorios[i];
                SERQ.FECHAS[i] = p.fechasRecordatorios[i];
            }

            // ===== CARGAR TARJETAS =====
            TOTAL_TARJETAS = p.totalTarjetas;

            for (int i = 0; i < 50; i++) {
                TITULOS_TARJETAS[i] = p.titulosTarjetas[i];
                CONTENIDOS_TARJETAS[i] = p.contenidosTarjetas[i];
            }

        }
    }

    //Perfil:
    //
    //✔ Es la estructura de datos del usuario
    //✔ Guarda todo su progreso
    //✔ Se crea una sola vez por usuario
    //✔ Se usa para guardar / cargar datos
    //


    public static class Perfil {
        String nombreUsuario;

        // Progreso / calificaciones
        double[] calificaciones = new double[6];
        boolean[] unidadesContestadas = new boolean[6];

        // Estado de tarjetas (lo que ahora está en ESTADO[])
        String[] estadoTarjetas = new String[43];

        // Recordatorios
        String[] titulosRecordatorios = new String[50];
        String[] contenidosRecordatorios = new String[50];
        String[] fechasRecordatorios = new String[50];
        int totalRecordatorios = 0;

        // Tarjetas personales
        String[] titulosTarjetas = new String[50];
        String[] contenidosTarjetas = new String[50];
        int totalTarjetas = 0;

        public Perfil(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;

            for (int i = 0; i < 6; i++) {
                calificaciones[i] = 0;
                unidadesContestadas[i] = false;
            }
            for (int i = 0; i < 43; i++) {
                estadoTarjetas[i] = "PENDIENTE";
            }
            totalRecordatorios = 0;
            totalTarjetas = 0;
        }
    }



    // ======= AQUÍ VAN LOS MÓDULOS  =======
    public static void menuTarjetas() {
        int opcionTarjetas=-1;

        while (true) {
            limpiarPantalla();
            Tarjetas_estudio();
            System.out.println("==================================");
            System.out.println("|        TARJETAS DE ESTUDIO     |");
            System.out.println("==================================");
            System.out.println("| 1. Marcado de tarjetas         |");
            System.out.println("| 2. Consulta de tarjetas        |");
            System.out.println("| 0. Volver al menú principal    |");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");

            // Validar si NO escribió un número
            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpiar basura
                System.out.println("\n==================================");
                System.out.println("| Error: Debe ingresar un número |");
                System.out.println("==================================");
                esperarEnter();
                continue; // repetir menú
            }

            opcionTarjetas = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // Validar fuera de rango
            if (opcionTarjetas < 0 || opcionTarjetas > 2) {
                System.out.println("\n======================================");
                System.out.println("| Error: Opción fuera de rango (0-2) |");
                System.out.println("======================================");
                esperarEnter();
                continue; // repetir menú
            }

            // Opciones correctas
            switch (opcionTarjetas) {
                case 1:
                    marcadoTarjetas();  // tu función
                    break;

                case 2:
                    menuUnidades();     // tu función
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    esperarEnter();
                    return;  // salir del menú de tarjetas
            }
        }



    }

    public static void marcadoTarjetas() {
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

    public static void menuUnidades() {
        int opcion = -1;

        do {
            limpiarPantalla();

            String VERDE = "\u001B[36m";
            String RESET = "\u001B[0m";

            System.out.println(VERDE +
                    "        ██╗   ██╗ ███╗   ██╗ ██╗ ██████╗   █████╗  ██████╗   ███████╗  █████╗ \n" +
                    "        ██║   ██║ ████╗  ██║ ██║ ██╔══██╗ ██╔══██╗ ██╔══██╗  ██╔════╝ ██╔═══╝ \n" +
                    "        ██║   ██║ ██╔██╗ ██║ ██║ ██║  ██║ ███████║ ██║  ██║  █████╗   █████╗  \n" +
                    "        ██║   ██║ ██║╚██╗██║ ██║ ██║  ██║ ██╔══██║ ██║  ██║  ██╔══╝    ╚═══██╗ \n" +
                    "        ╚██████╔╝ ██║ ╚████║ ██║ ██████╔╝ ██║  ██║ ██████╔╝  ███████╗ ██████╔╝\n" +
                    "         ╚═════╝  ╚═╝  ╚═══╝ ╚═╝ ╚═════╝  ╚═╝  ╚═╝ ╚═════╝   ╚══════╝ ╚═════╝ \n" +
                    "\n" +
                    "        ██████╗  ██╗   ██╗ ██╗ ███╗   ███╗ ██╗  ██████╗  █████╗      █████╗  \n" +
                    "       ██╔═══██╗ ██║   ██║ ██║ ████╗ ████║ ██║ ██╔════╝ ██╔══██╗        ██║  \n" +
                    "       ██║   ██║ ██║   ██║ ██║ ██╔████╔██║ ██║ ██║      ███████║        ██║  \n" +
                    "       ██║▄▄ ██║ ██║   ██║ ██║ ██║╚██╔╝██║ ██║ ██╚════╗ ██╔══██║        ██║  \n" +
                    "       ╚██████╔╝ ╚██████╔╝ ██║ ██║ ╚═╝ ██║ ██║ ╚██████║ ██║  ██║        ██║  \n" +
                    "        ╚══▀▀═╝   ╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═╝  ╚═════╝ ╚═╝  ╚═╝        ╚═╝  \n"
                    + RESET);

            System.out.println("==================================================");
            System.out.println("|               UNIDADES QUÍMICA 1               |");
            System.out.println("==================================================");
            System.out.println("| 1. Unidad 1 - Introducción a la Química        |");
            System.out.println("| 2. Unidad 2 - Estructura atómica               |");
            System.out.println("| 3. Unidad 3 - Tabla periódica                  |");
            System.out.println("| 4. Unidad 4 - Enlace químico                   |");
            System.out.println("| 5. Unidad 5 - Compuestos inorgánicos           |");
            System.out.println("| 0. Volver al menú principal                    |");
            System.out.println("==================================================");
            System.out.print("Selecciona una opción: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarTecla();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar ENTER

            switch (opcion) {
                case 1:
                    menuUnidad1();
                    esperarTecla();
                    break;
                case 2:
                    menuUnidad2();
                    break;
                case 3:
                    menuUnidad3();
                    break;
                case 4:
                    menuUnidad4();
                    break;
                case 5:
                    menuUnidad5();
                    break;
                case 0:
                    System.out.println("\n================================");
                    System.out.println("| Regresando al menú principal |");
                    System.out.println("================================");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }

    public static void menuUnidad1() {
        int opcionSubtema = -1;

        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|           UNIDAD 1 - MATERIA        |");
            System.out.println("=======================================");
            System.out.println("| 1. Introducción a la química        |");
            System.out.println("| 2. Materia y energía                |");
            System.out.println("| 3. Propiedades de la materia        |");
            System.out.println("| 4. Fenómenos físicos y químicos     |");
            System.out.println("| 5. Elementos, compuestos y mezclas  |");
            System.out.println("| 6. Métodos de separación de mezclas |");
            System.out.println("| 0. Volver al menú de unidades       |");
            System.out.println("---------------------------------------");
            System.out.print("Seleccione una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcionSubtema = sc.nextInt();
            sc.nextLine();

            switch (opcionSubtema) {
                case 1: temaIntroduccionQuimica(); break;
                case 2: temaMateriaEnergia(); break;
                case 3: temaPropiedadesMateria(); break;
                case 4: temaFenomenos(); break;
                case 5: temaElementosCompuestos(); break;
                case 6: temaMetodosSeparacion(); break;
                case 0:
                    System.out.println("\n");
                    System.out.println("=========================");
                    System.out.println("| Regresando al menú... |");
                    System.out.println("=========================");

                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcionSubtema != 0);
    }


    public static void temaIntroduccionQuimica() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=============================================================");
            System.out.println("|        INTRODUCCIÓN A LA QUÍMICA                          |");
            System.out.println("=============================================================");
            System.out.println("| 1. ¿Qué es la Química?                                    |");
            System.out.println("| 2. Ejemplos de aplicación de la química en la vida diaria |");
            System.out.println("| 3. Relación con otras ciencias                            |");
            System.out.println("| 4. Bibliografía                                           |");
            System.out.println("| 0. Salir                                                  |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================================================");
                    System.out.println("|                                                        ¿QUÉ ES LA QUÍMICA?                                                              |");
                    System.out.println("===========================================================================================================================================");
                    System.out.println("| La química es la ciencia que estudia la materia, su composición, estructura, propiedades y las transformaciones que experimenta.        |");
                    System.out.println("| Se relaciona con fenómenos que ocurren a nivel microscópico (átomos y moléculas) y macroscópico (lo que podemos ver y medir).           |");
                    System.out.println("|                                                                                                                                         |");
                    System.out.println("| Esta disciplina se divide en ramas como:                                                                                                |");
                    System.out.println("| - Química general: principios básicos de la materia y la energía.                                                                       |");
                    System.out.println("| - Química inorgánica: estudia los compuestos que no contienen carbono.                                                                  |");
                    System.out.println("| - Química orgánica: analiza moléculas basadas en carbono y la vida.                                                                     |");
                    System.out.println("| - Química física: explica los procesos químicos con leyes físicas y matemáticas.                                                        |");
                    System.out.println("| - Bioquímica: estudia las sustancias y procesos químicos de los seres vivos.                                                            |");
                    System.out.println("| - Química analítica: identifica y cuantifica componentes de las sustancias.                                                             |");
                    System.out.println("|                                                                                                                                         |");
                    System.out.println("| La química tiene aplicaciones en medicina, alimentos, materiales, energía, medio ambiente, industria y prácticamente toda nuestra vida. |");
                    System.out.println("| Gracias a ella se desarrollan medicamentos, fertilizantes, combustibles, plásticos, cosméticos y tecnologías que usamos diariamente.    |");
                    System.out.println("===========================================================================================================================================");

                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("========================================================================");
                    System.out.println("|                   EJEMPLOS DE APLICACIÓN DE LA QUÍMICA               |");
                    System.out.println("========================================================================");
                    System.out.println("|  1. Cocinar: Reacciones como la caramelización y la fermentación.    |");
                    System.out.println("|  2. Productos de limpieza: Detergentes y desinfectantes.             |");
                    System.out.println("|  3. Medicamentos: Formulación de fármacos para tratar enfermedades.  |");
                    System.out.println("|  4. Cosméticos: Creación de cremas, perfumes y shampoos.             |");
                    System.out.println("|  5. Baterías: Reacciones químicas para almacenar y liberar energía.  |");
                    System.out.println("========================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("=================================================================================================");
                    System.out.println("|                             RELACIÓN CON OTRAS CIENCIAS                                       |");
                    System.out.println("=================================================================================================");
                    System.out.println("|  1. Física: La química física estudia cómo las leyes físicas aplican a los procesos químicos. |");
                    System.out.println("|  2. Biología: La bioquímica analiza las sustancias químicas en los seres vivos.               |");
                    System.out.println("|  3. Geología: La geoquímica estudia los elementos químicos en la Tierra.                      |");
                    System.out.println("=================================================================================================");
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                    BIBLIOGRAFÍA                    |");
                    System.out.println("======================================================");
                    System.out.println("| 1. Chang, R. (Química General).                    |");
                    System.out.println("| 2. Tro, N. J. (Principios de Química: Atoms First) |");
                    System.out.println("======================================================");
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("================");
                    System.out.println("|  Saliendo... |");
                    System.out.println("================");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");

            }

            if (opcion != 0) esperarTecla();

        } while (opcion != 0);
    }


    public static void temaMateriaEnergia() {
        int opcion=-1;

        do {
            limpiarPantalla();
            System.out.println("====================================================");
            System.out.println("|            MATERIA Y ENERGÍA                     |");
            System.out.println("====================================================");
            System.out.println("|1. Concepto de materia                            |");
            System.out.println("|2. Concepto de energía                            |");
            System.out.println("|3. Propiedades                                    |");
            System.out.println("|4. Leyes de conservación                          |");
            System.out.println("|5. Tipos y formas de manifestación de la energía  |");
            System.out.println("|6. Fuentes de energía y consecuencias             |");
            System.out.println("|7. Bibliografía                                   |");
            System.out.println("|0. Salir                                          |");
            System.out.println("----------------------------------------------------");
            System.out.println("Selecciona una opcion:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================================================");
                    System.out.println("|                                           ¿QUÉ ES LA MATERIA?                                                                                                     |");
                    System.out.println("=====================================================================================================================================================================");
                    System.out.println("| La materia es todo aquello que tiene masa y ocupa un lugar en el espacio. Está formada por partículas diminutas llamadas átomos, que se combinan para formar      |");
                    System.out.println("| moléculas y estructuras más complejas. Según las fuerzas que actúan entre sus partículas, la materia puede presentarse en distintos estados físicos: sólido,      |");
                    System.out.println("| líquido, gas y plasma.                                                                                                                                            |");
                    System.out.println("|                                                                                                                                                                   |");
                    System.out.println("| - Estado sólido: las partículas están muy juntas y casi no se mueven; por eso mantienen forma y volumen definidos.                                                |");
                    System.out.println("| - Estado líquido: las partículas están más separadas y pueden deslizarse; tienen volumen definido pero no forma fija.                                             |");
                    System.out.println("| - Estado gaseoso: las partículas están muy separadas y se mueven libremente; no tienen forma ni volumen definidos.                                                |");
                    System.out.println("| - Plasma: gas ionizado presente en estrellas, rayos y algunos dispositivos tecnológicos.                                                                          |");
                    System.out.println("|                                                                                                                                                                   |");
                    System.out.println("| La materia puede cambiar de un estado a otro mediante procesos físicos como fusión, evaporación, condensación, sublimación y solidificación, sin alterar su       |");
                    System.out.println("| composición química. También puede experimentar cambios químicos cuando sus átomos se reorganizan para formar nuevas sustancias.                                  |");
                    System.out.println("=====================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===================================================================================");
                    System.out.println("|                               ¿QUÉ ES LA ENERGÍA?                               |");
                    System.out.println("===================================================================================");
                    System.out.println("| La energía es la capacidad de un cuerpo o sistema para realizar trabajo, mover  |");
                    System.out.println("| objetos, generar luz, producir calor o provocar transformaciones. Está presente |");
                    System.out.println("| en todos los procesos físicos y químicos del universo.                          |");
                    System.out.println("|                                                                                 |");
                    System.out.println("| TIPOS PRINCIPALES DE ENERGÍA:                                                   |");
                    System.out.println("| - Energía cinética: asociada al movimiento de los cuerpos.                      |");
                    System.out.println("| - Energía potencial: almacenada en función de la posición o configuración.      |");
                    System.out.println("| - Energía térmica: relacionada con el movimiento de las partículas.             |");
                    System.out.println("| - Energía eléctrica: producida por el flujo de electrones.                      |");
                    System.out.println("| - Energía química: contenida en los enlaces de los átomos y moléculas.          |");
                    System.out.println("| - Energía lumínica o radiante: transportada por ondas electromagnéticas.        |");
                    System.out.println("| - Energía nuclear: liberada en reacciones del núcleo atómico.                   |");
                    System.out.println("|                                                                                 |");
                    System.out.println("| La energía no se crea ni se destruye; solo se transforma de un tipo a otro.     |");
                    System.out.println("===================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=========================================================================================================================================================================");
                    System.out.println("|                                        PROPIEDADES FUNDAMENTALES DE LA MATERIA                                                                                        |");
                    System.out.println("=========================================================================================================================================================================");
                    System.out.println("| Masa: Cantidad de materia que contiene un cuerpo. Se mide en kilogramos (kg)                                                                                          |");
                    System.out.println("| Volumen: El volumen es una magnitud escalar definida como el espacio ocupado por un cuerpo.                                                                           |");
                    System.out.println("| Densidad: La densidad de un cuerpo es una medida de la cantidad de masa contenida en un volumen determinado. Se calcula dividiendo la masa del objeto por su volumen. |");
                    System.out.println("| Inercia: propiedad de los cuerpos de mantener su estado de reposo o de movimiento uniforme a menos que una fuerza externa actúe sobre ellos.                          |");
                    System.out.println("| Divisibilidad:  propiedad de la materia para dividirse en partes cada vez más pequeñas.                                                                               |");
                    System.out.println("=========================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("========================================================================================================");
                    System.out.println("|                                    LEYES DE CONSERVACIÓN                                             |");
                    System.out.println("========================================================================================================");
                    System.out.println("| Ley de la conservación de la masa (Lavoisier): La masa total de reactivos = masa total de productos. |");
                    System.out.println("| Ley de la conservación de la energía: La energía no se crea ni se destruye, solo se transforma.      |");
                    System.out.println("| Ley de la conservación de la masa-energía: E = mc², masa y energía son equivalentes.                 |");
                    System.out.println("========================================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("=================================================================================");
                    System.out.println("|                  FORMAS DE LA MANIFESTACIÓN DE LA ENERGÍA                     |");
                    System.out.println("=================================================================================");
                    System.out.println("| Siete formas de manifestación de la energía:                                  |");
                    System.out.println("| 1. Mecánica 2. Eléctrica 3. Química 4. Térmica 5. Nuclear 6. Solar 7. Sonora  |");
                    System.out.println("| Ejemplo: Energía química (gasolina) -> energía mecánica (motor de auto)       |");
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("| Tipos de energía:                                                             |");
                    System.out.println("| Energía potencial gravitacional: Ep = m × g × h                               |");
                    System.out.println("| Energía potencial química: liberada en enlaces químicos                       |");
                    System.out.println("| Energía cinética: Ec = (1/2) × m × v²                                         |");
                    System.out.println("=================================================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================================");
                    System.out.println("|                                               FUENTES DE ENERGÍA Y SUS CONSECUENCIAS                                                              |");
                    System.out.println("=====================================================================================================================================================");
                    System.out.println("| Fuentes de energía no renovables en México: 1. Petróleo 2. Gas natural 3. Carbón                                                                  |");
                    System.out.println("| Alternativas: Energía solar, eólica, geotérmica e hidroeléctrica                                                                                  |");
                    System.out.println("| Consecuencias del uso irracional de la energía: Contaminación, Calentamiento global, Agotamiento de recursos, Problemas de salud y biodiversidad  |");
                    System.out.println("| Importancia de las leyes de conservación: Controlar reacciones, minimizar pérdidas, optimizar recursos, reducir contaminación.                    |");
                    System.out.println("=====================================================================================================================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("===================================================================");
                    System.out.println("|                       BIBLIOGRAFÍA                              |");
                    System.out.println("===================================================================");
                    System.out.println("| Chang, R. (Química General).                                    |");
                    System.out.println("| Tro, N. J. (Principios de Química: Atoms First)                 |");
                    System.out.println("| Tipler, P. A., & Mosca, G. (Física para Ciencias e Ingeniería). |");
                    System.out.println("| Secretaría de Energía de México (SENER).                        |");
                    System.out.println("| Einstein, A. (Teoría de la Relatividad).                        |");
                    System.out.println("===================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("================");
                    System.out.println("|  Saliendo... |");
                    System.out.println("================");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }


    public static void temaFenomenos() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|     FENÓMENOS QUÍMICOS Y FÍSICOS    |");
            System.out.println("=======================================");
            System.out.println("| 1. Fenómenos físicos                |");
            System.out.println("| 2. Fenómenos químicos               |");
            System.out.println("| 3. Ejemplos                         |");
            System.out.println("| 4. Bibliografía                     |");
            System.out.println("| 0. Salir                            |");
            System.out.println("---------------------------------------");
            System.out.print("Selecciona una opción: ");

            // VALIDAR PRIMERO
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                                  FENÓMENOS FÍSICOS                                                |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("| Un fenómeno físico es aquel en el que no cambia la composición de la materia, solo su forma, estado o apariencia. |");
                    System.out.println("| Ejemplos:                                                                                                         |");
                    System.out.println("| 1. Derretimiento del hielo                                                                                        |");
                    System.out.println("| 2. Evaporación del agua al hervir                                                                                 |");
                    System.out.println("| 3. Romper un vaso                                                                                                 |");
                    System.out.println("| 4. Cortar papel                                                                                                   |");
                    System.out.println("| 5. Inflar un globo                                                                                                |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                                  FENÓMENOS QUÍMICOS                                               |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("| Un fenómeno químico es aquel en el que una o más sustancias se transforman en otras diferentes.                   |");
                    System.out.println("| Ejemplos:                                                                                                         |");
                    System.out.println("| 1. La oxidación de un clavo                                                                                       |");
                    System.out.println("| 2. La cocción de los alimentos                                                                                    |");
                    System.out.println("| 3. La combustión de la madera                                                                                     |");
                    System.out.println("| 4. La fermentación del pan o del vino                                                                             |");
                    System.out.println("| 5. El deterioro o descomposición de frutas                                                                        |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("============================================================================================================================");
                    System.out.println("|                                                        EJEMPLOS                                                          |");
                    System.out.println("============================================================================================================================");
                    System.out.println("| FENÓMENOS FÍSICOS:                                                                                                       |");
                    System.out.println("| 1. Derretimiento del hielo 2. Evaporación del agua 3. Romper un vaso 4. Cortar papel 5. Inflar un globo                  |");
                    System.out.println("| FENÓMENOS QUÍMICOS:                                                                                                      |");
                    System.out.println("| 1. Oxidación de un clavo 2. Cocción de alimentos 3. Combustión de la madera 4. Fermentación 5. Deterioro de frutas       |");
                    System.out.println("============================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================");
                    System.out.println("|                                                       BIBLIOGRAFÍA                                                   |");
                    System.out.println("========================================================================================================================");
                    System.out.println("| 1. Chang, Raymond. Química. McGraw-Hill Education, 2010.                                                             |");
                    System.out.println("| 2. Brown, Theodore L., LeMay, H. Eugene, y Bursten, Bruce E. Química: La Ciencia Central. Pearson Educación, 2012.   |");
                    System.out.println("| 3. Enciclopedia Britannica. Artículo: Physical and Chemical Changes.                                                 |");
                    System.out.println("========================================================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=================================================================");
                    System.out.println("| Opción no válida. Por favor, selecciona un número del 0 al 4. |");
                    System.out.println("=================================================================");
                    esperarTecla();

            }

        } while (opcion != 0);
    }

    public static void temaElementosCompuestos() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("========================================================");
            System.out.println("|             ElEMENTO, COMPUESTO Y MEZCLA             |");
            System.out.println("========================================================");
            System.out.println("|1. Clasificación de sustancias puras                  |");
            System.out.println("|2. Concepto de elemento químico                       |");
            System.out.println("|3. Concepto de compuesto                              |");
            System.out.println("|4. Diferencias entre elemento y compuesto             |");
            System.out.println("|5. ¿Qué es una mezcla?                                |");
            System.out.println("|6. ¿Qué es una mezcla homogénea?                      |");
            System.out.println("|7. ¿Qué es una mezcla heterogénea?                    |");
            System.out.println("|8. Bibliografía                                       |");
            System.out.println("|0. Salir                                              |");
            System.out.println("--------------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("==================================================================================================");
                    System.out.println("|                          CLASIFICACIÓN DE LAS SUSTANCIAS PURAS                                 |");
                    System.out.println("==================================================================================================");
                    System.out.println("| Las sustancias puras son formas de materia que tienen composición fija y propiedades           |");
                    System.out.println("| características constantes. No pueden separarse por métodos físicos como filtración o          |");
                    System.out.println("| decantación, solo mediante procesos químicos.                                                  |");
                    System.out.println("|                                                                                                |");
                    System.out.println("| Se dividen en dos categorías principales:                                                      |");
                    System.out.println("|                                                                                                |");
                    System.out.println("| ► ELEMENTOS                                                                                    |");
                    System.out.println("| - Formados por un solo tipo de átomo.                                                          |");
                    System.out.println("| - No pueden descomponerse en sustancias más simples mediante métodos químicos ordinarios.      |");
                    System.out.println("| - Ejemplos: Oxígeno (O₂), Hierro (Fe), Carbono (C), Oro (Au).                                  |");
                    System.out.println("|                                                                                                |");
                    System.out.println("| ► COMPUESTOS                                                                                   |");
                    System.out.println("| - Formados por la combinación química de dos o más elementos.                                  |");
                    System.out.println("| - Tienen proporciones definidas y constantes.                                                  |");
                    System.out.println("| - Poseen propiedades diferentes a las de los elementos que los forman.                         |");
                    System.out.println("| - Ejemplos: Agua (H₂O), Sal (NaCl), Dióxido de carbono (CO₂).                                  |");
                    System.out.println("|                                                                                                |");
                    System.out.println("| Diferencias clave:                                                                             |");
                    System.out.println("| - Un elemento está formado por un solo tipo de átomo; un compuesto por dos o más.              |");
                    System.out.println("| - Los compuestos SOLO se separan por métodos químicos.                                         |");
                    System.out.println("|                                                                                                |");
                    System.out.println("==================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================");
                    System.out.println("|                                                   CONCEPTO DE ELEMENTO QUÍMICO                                                    |");
                    System.out.println("=====================================================================================================================================");
                    System.out.println("| Un elemento químico es una sustancia pura que no se puede descomponer en sustancias más simples por medios químicos ordinarios y  |");
                    System.out.println("| está compuesta por átomos con el mismo número de protones en su núcleo.                                                           |");
                    System.out.println("| La cantidad de protones, también conocida como número atómico, define la identidad de un elemento.                                |");
                    System.out.println("=====================================================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================================================");
                    System.out.println("|                                                             CONCEPTO DE COMPUESTO                                                                                 |");
                    System.out.println("=====================================================================================================================================================================");
                    System.out.println("| Un compuesto es una sustancia formada por la unión química de dos o más elementos diferentes en una proporción fija. Los compuestos tienen propiedades            |");
                    System.out.println("| que son distintas a las de los elementos que los componen.                                                                                                        |");
                    System.out.println("| Ejemplos comunes incluyen el agua (H₂O), que está formada por hidrógeno y oxígeno, y el cloruro de sodio (NaCl), que se compone de sodio y cloro.                 |");
                    System.out.println("=====================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================================================================================");
                    System.out.println("|                                                       DIFERENCIAS ENTRE ELEMENTO Y COMPUESTO                                                                         |");
                    System.out.println("=======================================================================================================================================================================");
                    System.out.println("| Característica     |         Elemento                                                    |          Compuesto                                                       |");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| Composición        | Un solo tipo de átomo                                               | Dos o más tipos de átomos enlazados químicamente                         |");
                    System.out.println("| Propiedades        | Propiedades únicas de ese átomo                                     | Propiedades diferentes a las de los elementos que lo forman              |");
                    System.out.println("| Descomposición     | No puede descomponerse en sustncias más simples por medios químicos | Pueden descomponerse en sus elementos constituyentes por medios químicos |");
                    System.out.println("| Ejemplos           | Oro (Au), Oxígeno (O₂), Aluminio (Al)                               | Agua (H₂O), sal de mesa (NaCl)                                           |");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("=============================================================================================================================================");
                    System.out.println("|                                                       CONCEPTO DE MEZCLA                                                                  |");
                    System.out.println("=============================================================================================================================================");
                    System.out.println("| Una mezcla es la combinación física de dos o más sustancias donde cada una mantiene sus propiedades originales y no hay reacción química. |");
                    System.out.println("| Existen dos tipos principales de mezclas: homogéneas, como el agua con sal, donde los componentes no se distinguen a simple vista,        |");
                    System.out.println("| y heterogéneas, como una ensalada, donde sí se pueden identificar las distintas partes.                                                   |");
                    System.out.println("=============================================================================================================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================================================================");
                    System.out.println("|                                                       MEZCLAS HOMOGÉNEAS                                                                            |");
                    System.out.println("=======================================================================================================================================================");
                    System.out.println("| Una mezcla homogénea es un tipo de mezcla en la que los componentes están distribuidos de manera uniforme y no se pueden distinguir a simple vista, |");
                    System.out.println("| lo que resulta en una única fase visible. Estas mezclas, también conocidas como disoluciones o soluciones, tienen una composición uniforme en todas |");
                    System.out.println("| sus partes y sus propiedades físicas,  como la densidad y el punto de ebullición, son las mismas en cualquier punto de la mezcla.                   |");
                    System.out.println("=======================================================================================================================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("================================================================================================================================================");
                    System.out.println("|                                                       MEZCLAS HETEROGÉNEAS                                                                   |");
                    System.out.println("================================================================================================================================================");
                    System.out.println("| Una mezcla heterogénea es una combinación de dos o más sustancias en la que los componentes no se distribuyen de manera uniforme y se pueden |");
                    System.out.println("| identificar a simple vista o con un microscopio.                                                                                             | ");
                    System.out.println("| Los componentes no se disuelven entre sí y se pueden separar fácilmente mediante métodos físicos como la filtración o la decantación.        |");
                    System.out.println("================================================================================================================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================================================================================");
                    System.out.println("|                                                            BIBLIOGRAFÍA                                                                                             |");
                    System.out.println("=======================================================================================================================================================================");
                    System.out.println("| 1.Zumdahl, Steven S., Zumdahl, Susan A. Chemistry: An Atoms First Approach. 3ra edición. Cengage Learning, 2016.                                                    |");
                    System.out.println("| 2.Brown, Theodore L., LeMay, H. Eugene, Bursten, Bruce E., Murphy, Catherine. Química: La Ciencia Central. 14ª edición. Pearson Educación, 2018.                    |");
                    System.out.println("| 3.Petrucci, Ralph H., Herring, F. Geoffrey, Madura, Jeffry D., Bissonnette, Carey. Química General: Principios y Aplicaciones Modernas. 11ª edición. Pearson, 2017. |");
                    System.out.println("=======================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=================================================================");
                    System.out.println("| Opción no válida. Por favor, selecciona un número del 0 al 8. |");
                    System.out.println("=================================================================");
                    esperarTecla();
            }
        }  while(opcion != 0);

    }

    public static void temaMetodosSeparacion() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|   MÉTODOS DE SEPARACIÓN DE MEZCLAS  |");
            System.out.println("=======================================");
            System.out.println("| 1. Decantación                      |");
            System.out.println("| 2. Filtración                       |");
            System.out.println("| 3. Centrifugación                   |");
            System.out.println("| 4. Destilación                      |");
            System.out.println("| 5. Cristalización                   |");
            System.out.println("| 6. Solubilidad                      |");
            System.out.println("| 7. Tamizado                         |");
            System.out.println("| 8. Imantación                       |");
            System.out.println("| 9. Cromatografía                    |");
            System.out.println("| 10. Bibliografía                    |");
            System.out.println("| 0.  Salir                           |");
            System.out.println("---------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================================");
                    System.out.println("|                                                         DECANTACIÓN                                                                |");
                    System.out.println("======================================================================================================================================");
                    System.out.println("| La decantación es un método de separación de mezclas heterogéneas (sólido-líquido o líquido-líquido) que se basa en la diferencia  |");
                    System.out.println("| de densidad de sus componentes. Consiste en dejar reposar la mezcla hasta que el componente más denso se sedimenta en el fondo,    |");
                    System.out.println("| y luego se vierte lentamente el componente menos denso, separándolos así.                                                          |");
                    System.out.println("| Un ejemplo común es separar el agua del aceite, donde el aceite (menos denso) queda en la superficie y se vierte o se extrae,      |");
                    System.out.println("| dejando el agua en el recipiente original.                                                                                         |");
                    System.out.println("======================================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================");
                    System.out.println("|                                                       FILTRACIÓN                                                                  |");
                    System.out.println("=====================================================================================================================================");
                    System.out.println("| La filtración es un método de separación que usa un medio poroso (un filtro) para separar partículas sólidas de un líquido o gas. |");
                    System.out.println("| El líquido o gas pasa a través del filtro, mientras que las partículas sólidas quedan retenidas.                                  |");
                    System.out.println("| Ejemplo: separar arena del agua.                                                                                                  |");
                    System.out.println("=====================================================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================");
                    System.out.println("|                                                    CENTRIFUGACIÓN                                                    |");
                    System.out.println("========================================================================================================================");
                    System.out.println("| La centrifugación es un método de separación que utiliza la fuerza centrífuga para separar componentes de una mezcla |");
                    System.out.println("| basándose en su densidad, tamaño, forma o masa.                                                                      |");
                    System.out.println("| Ejemplo: separar glóbulos rojos del plasma sanguíneo.                                                                |");
                    System.out.println("========================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================");
                    System.out.println("|                                                        DESTILACIÓN                                                                |");
                    System.out.println("=====================================================================================================================================");
                    System.out.println("| La destilación es un método de separación que usa la ebullición y condensación para separar líquidos miscibles con distintos      |");
                    System.out.println("| puntos de ebullición.                                                                                                             |");
                    System.out.println("| Un ejemplo común es separar agua y alcohol: se calienta la mezcla, el alcohol (con menor punto de ebullición) se evapora primero, |");
                    System.out.println("| se condensa en un refrigerante y se recoge en un recipiente aparte, mientras que el agua permanece en el matraz original.         |");
                    System.out.println("=====================================================================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================================");
                    System.out.println("|                                                   CRISTALIZACIÓN                                                                     |");
                    System.out.println("========================================================================================================================================");
                    System.out.println("| La cristalización es un método de separación para purificar un sólido disuelto en un líquido, que consiste en evaporar el disolvente |");
                    System.out.println("| generalmente calentando la mezcla) para que el soluto se separe en forma de cristales.                                               |");
                    System.out.println("| Ejemplo: obtener sal del agua salada.                                                                                                |");
                    System.out.println("========================================================================================================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("============================================================================================================");
                    System.out.println("|                                           SOLUBILIDAD                                                    |");
                    System.out.println("============================================================================================================");
                    System.out.println("| La solubilidad es la capacidad de un soluto de disolverse en un disolvente para formar una solución.     |");
                    System.out.println("| Se utiliza como método de separación, por ejemplo, al separar sal de sílice disolviendo la sal en agua y |");
                    System.out.println("| filtrando la sílice no disuelta.                                                                         |");
                    System.out.println("============================================================================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================");
                    System.out.println("|                                                        TAMIZADO                                                                   |");
                    System.out.println("=====================================================================================================================================");
                    System.out.println("| El tamizado es un método de separación de mezclas sólidas basado en la diferencia del tamaño de las partículas, donde una mezcla  |");
                    System.out.println("| pasa a través de un tamiz (o criba) con orificios de un tamaño específico. Las partículas más pequeñas caen a través de la malla, |");
                    System.out.println("| mientras que las más grandes quedan retenidas en la parte superior.                                                               |");
                    System.out.println("| Un ejemplo común es separar los grumos de la harina pasándola por un colador.                                                     |");
                    System.out.println("=====================================================================================================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================================");
                    System.out.println("|                                                      IMANTACIÓN                                                                  |");
                    System.out.println("====================================================================================================================================");
                    System.out.println("| La imantación es un método de separación que utiliza las propiedades magnéticas de ciertos materiales para separarlos de         |");
                    System.out.println("| otros no magnéticos.                                                                                                             |");
                    System.out.println("| Un ejemplo es pasar un imán sobre una mezcla de limaduras de hierro y arena; el imán atraerá el hierro, separándolo de la arena. |");
                    System.out.println("====================================================================================================================================");
                    esperarTecla();
                    break;
                case 9:
                    limpiarPantalla();
                    System.out.println("=========================================================================================================================");
                    System.out.println("|                                                       CROMATOGRAFÍA                                                   |");
                    System.out.println("=========================================================================================================================");
                    System.out.println("| Es un método de separación física en el que los componentes de una mezcla se distribuyen entre una fase estacionaria  |");
                    System.out.println("| (sólida o líquida) y una fase móvil (líquida o gaseosa) que se mueve en una dirección.                                |");
                    System.out.println("| Un ejemplo sencillo es la cromatografía en papel, donde la tinta de un rotulador se separa en sus colores primarios   |");
                    System.out.println("| cuando un solvente la arrastra a través de un trozo de papel.                                                         |");
                    System.out.println("=========================================================================================================================");
                    esperarTecla();
                    break;
                case 10:
                    limpiarPantalla();
                    System.out.println("================================================================================================================================");
                    System.out.println("|                                                            BIBLIOGRAFÍA                                                      |");
                    System.out.println("================================================================================================================================");
                    System.out.println("| 1.Chang, Raymond. Química. 12ª edición. McGraw-Hill, 2017.                                                                   |");
                    System.out.println("| 2.Brady, James E., Humiston, Fred. Química General. 6ª edición. McGraw-Hill, 2014.                                           |");
                    System.out.println("| 3.Atkins, Peter, de Paula, Julio. Química Física. 11ª edición. Oxford University Press, 2018.                                |");
                    System.out.println("| 4.Brown, LeMay, Bursten, Química: La Ciencia Central, capítulos sobre ', 'Propiedades de la materia y métodos de separación. |");
                    System.out.println("================================================================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("==================================================================");
                    System.out.println("| Opción no válida. Por favor, selecciona un número del 0 al 10. |");
                    System.out.println("==================================================================");
                    esperarTecla();
                    break;
            }
        }  while(opcion != 0);
    }

    public static void temaPropiedadesMateria() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=======================================");
            System.out.println("|      PROPIEDADES DE LA MATERIA      |");
            System.out.println("=======================================");
            System.out.println("| 1. Propiedades Generales            |");
            System.out.println("| 2. Propiedades Específicas          |");
            System.out.println("| 3. Propiedades Físicas              |");
            System.out.println("| 4. Propiedades Químicas             |");
            System.out.println("| 5. Bibliografía                     |");
            System.out.println("| 0. Salir                            |");
            System.out.println("----------------------------------------");
            System.out.println("Seleccione una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("==================================================================================");
                    System.out.println("|                           PROPIEDADES GENERALES                                |");
                    System.out.println("==================================================================================");
                    System.out.println("| Son las características comunes a toda materia.                                |");
                    System.out.println("| Incluyen:                                                                      |");
                    System.out.println("|  - Masa: cantidad de materia que posee un cuerpo.                              |");
                    System.out.println("|  - Volumen: espacio que ocupa.                                                 |");
                    System.out.println("|  - Peso: fuerza con que la Tierra atrae a un cuerpo.                           |");
                    System.out.println("|  - Inercia: resistencia al cambio de estado de movimiento o reposo.            |");
                    System.out.println("|  - Divisibilidad: capacidad de fraccionarse sin perder sus propiedades.        |");
                    System.out.println("|  - Impenetrabilidad: dos cuerpos no pueden ocupar el mismo espacio.            |");
                    System.out.println("==================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===================================================================================");
                    System.out.println("|                           PROPIEDADES ESPECÍFICAS                               |");
                    System.out.println("===================================================================================");
                    System.out.println("| Son características que diferencian una sustancia de otra.','                   |");
                    System.out.println("| Se subdividen en:','                                                            |");
                    System.out.println("|  - Propiedades Físicas: se pueden medir sin cambiar la composición.','          |");
                    System.out.println("| -  Propiedades Químicas: cambian la estructura interna de la materia.','        |");
                    System.out.println("===================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================================================================================================================");
                    System.out.println("|                                                                              PROPIEDADES FÍSICAS                                                                                                                  |");
                    System.out.println("=====================================================================================================================================================================================================================");
                    System.out.println("| Describen los aspectos observables o medibles sin alterar la composición.                                                                                                                                         |");
                    System.out.println("| Ejemplos:                                                                                                                                                                                                         |");
                    System.out.println("| - Densidad: La densidad de un cuerpo es una medida de la cantidad de masa contenida en un volumen determinado. Se calcula dividiendo la masa del objeto por su volumen.                                           |");
                    System.out.println("| - Punto de fusión: El punto de fusión es la temperatura a la que un sólido se convierte en líquido.                                                                                                               |");
                    System.out.println("| - Punto de ebullición: El punto de ebullición es la temperatura a la que la presión de vapor de un líquido iguala la presión que lo rodea, lo que provoca que pase del estado líquido al gaseoso en toda su masa. |");
                    System.out.println("| - Solubilidad: Es la capacidad de una sustancia (soluto) para disolverse en otra (disolvente) y formar una solución homogénea.                                                                                    |");
                    System.out.println("| - Conductividad: Es la capacidad de una sustancia para transportar partículas cargadas, ya sean iones en soluciones o electrones libres en metales, permitiendo el flujo de corriente eléctrica.                  |");
                    System.out.println("=====================================================================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==================================================================================");
                    System.out.println("|                             PROPIEDADES QUÍMICAS                               |");
                    System.out.println("==================================================================================");
                    System.out.println("| Describen cómo una sustancia puede transformarse en otra diferente.            |");
                    System.out.println("|  Ejemplos:                                                                     |");
                    System.out.println("|   - Combustión (capacidad de arder).                                           |");
                    System.out.println("|   - Oxidación (reacción con el oxígeno).                                       |");
                    System.out.println("|   - Fermentación.                                                              |");
                    System.out.println("|   - Reacción con ácidos o bases.                                               |");
                    System.out.println("==================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("===============================================================================");
                    System.out.println("|                            BIBLIOGRAFÍA                                     |");
                    System.out.println("===============================================================================");
                    System.out.println("| 1. Chang, R. & Goldsby, K. (2016). Química. McGraw-Hill Education.          |");
                    System.out.println("| 2. Brown, T. L., LeMay, H. E., Bursten, B. E., & Murphy, C. J. (2018).      |");
                    System.out.println("| 3. Química: La ciencia central. Pearson Educación.                          |");
                    System.out.println("| 4. Zumdahl, S. S. & Zumdahl, S. A. (2015). Chemistry. Cengage Learning.     |");
                    System.out.println("===============================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=================================================================");
                    System.out.println("| Opción no válida. Por favor, selecciona un número del 0 al 5. |");
                    System.out.println("=================================================================");
                    esperarTecla();
                    break;
            }
        }  while(opcion != 0);
    }


    public static void esperarTecla() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");

        sc.nextLine(); // espera hasta que se presione ENTER
    }


    public static void limpiarPantalla() {
        // Solo estética
        for (int i = 0; i < 50; i++) System.out.println();
    }


    public static void menuUnidad2() {
        int opcionSubtema=-1;

        do {
            limpiarPantalla();
            System.out.println("======================================");
            System.out.println("|    UNIDAD 2 - ESTRUCTURA ATÓMICA   |");
            System.out.println("======================================");
            System.out.println("| 1. Configuracion electronica       |");
            System.out.println("| 2. El átomo                        |");
            System.out.println("| 3. Electrón diferencial            |");
            System.out.println("| 4. Modelos atómicos                |");
            System.out.println("| 5. Números cuánticos               |");
            System.out.println("| 6. Principio de Aufbau             |");
            System.out.println("| 7. Tabulación de números cuánticos |");
            System.out.println("| 0. Volver al menú de unidades      |");
            System.out.println("--------------------------------------");
            System.out.println("Selecciona una opcion:                ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcionSubtema = sc.nextInt();
            sc.nextLine();

            switch (opcionSubtema) {
                case 1:
                    TemaConfiguracion_Electronica();
                    break;
                case 2:
                    TemaElatomo();
                    break;
                case 3:
                    TemaElectron_Diferencial();
                    break;
                case 4:
                    TemaModelos_Atomicos();
                    break;
                case 5:
                    TemaNumerosCuanticos();
                    break;
                case 6:
                    TemaPrincipio_Aufbau();
                    break;
                case 7:
                    TemaTabulacion_de_numeros_cuanticos();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("|         Opción inválida         |");
                    System.out.println("===================================");
                    esperarTecla();
            }
        } while (opcionSubtema != 0);
    }

    public static void TemaConfiguracion_Electronica() {
        int opcion=-1;

        do {
            limpiarPantalla();
            System.out.println("===========================================================");
            System.out.println("|       Estructura Atómica: Configuración Electrónica     |");
            System.out.println("===========================================================");
            System.out.println("| 1. Configuración electrónica con gas noble (Z=83)       |");
            System.out.println("| 2. Principio de máxima multiplicidad (Regla de Hund)    |");
            System.out.println("| 3. Diagrama energético (Z=43)                           |");
            System.out.println("| 4. Números cuánticos del electrón diferencial (Z=43)    |");
            System.out.println("| 5. Bibliografía                                         |");
            System.out.println("| 0. Salir                                                |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Selecciona una opcion:                                     ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=============================================================================");
                    System.out.println("|                  CONFIGURACIÓN ELECTRÓNICA CON GAS NOBLE                  |");
                    System.out.println("=============================================================================");
                    System.out.println("| El método de gas noble permite escribir la configuración electrónica de   |");
                    System.out.println("| un elemento usando la configuración completa del gas noble anterior como  |");
                    System.out.println("| punto de partida, reduciendo así la longitud de la notación.              |");
                    System.out.println("|                                                                           |");
                    System.out.println("| Ejemplo con el elemento Bismuto (Z = 83):                                 |");
                    System.out.println("| [Xe₅₄] 4f¹⁴ 5d¹⁰ 6s² 6p³                                                  |");
                    System.out.println("=============================================================================");
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================================");
                    System.out.println("|                                            PRINCIPIO DE MÁXIMA MULTPLICIDAD (REGLA DE HUND)                                          |");
                    System.out.println("========================================================================================================================================");
                    System.out.println("| Los electrones se distribuyen en los orbitales de un mismo subnivel de forma que se maximice el número de electrones desapareados    |");
                    System.out.println("| Esto minimiza la repulsión electrónica y estabiliza el átomo.                                                                        |");
                    System.out.println("========================================================================================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("=============================================================");
                    System.out.println("|                    DIAGRAMA ENERGÉTICO                    |");
                    System.out.println("=============================================================");
                    System.out.println("| Configuración electrónica estandar para Z= 43 (Tecnecio): |");
                    System.out.println("|  1s²                                                      |");
                    System.out.println("|  2s²  2p⁶                                                 |");
                    System.out.println("|  3s²  3p⁶                                                 |");
                    System.out.println("|  4s²  3d¹⁰  4p⁶                                           |");
                    System.out.println("|  5s²  4d⁵                                                 |");
                    System.out.println("|  Ultimo electrón con spin positivo                        |");
                    System.out.println("=============================================================");
                    break;


                case 4:
                    limpiarPantalla();
                    System.out.println("==============================================================================");
                    System.out.println("|       NÚMEROS CUÁNTICOS DEL ELECTRÓN DIFERENCIAL DE Z=43 (TECNECIO)        |");
                    System.out.println("==============================================================================");
                    System.out.println("| Número cuántico principal (n) = 5                                          |");
                    System.out.println("| Número cuántico secundario (l) = 2 (subnivel d)                            |");
                    System.out.println("| Número cuántico magnético (m) = -1 (por ejemplo, dependiendo del orbital)  |");
                    System.out.println("| Número cuántico spin (ms) = +1/2 (si es el electrón último colocado)       |");
                    System.out.println("==============================================================================");
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("=======================================================================================");
                    System.out.println("|                                     BIBLIOGRAFÍA                                    |");
                    System.out.println("=======================================================================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill.                                           |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson.  |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química).                                    |");
                    System.out.println("=======================================================================================");
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
            }

            if (opcion != 0) esperarTecla();

        } while (opcion != 0);
    }


    public static void TemaElatomo() {
        int opcion=-1;

        do {
            limpiarPantalla();
            System.out.println("================================================");
            System.out.println("|        ÁTOMO, PARTÍCULAS E ISÓTOPOS          |");
            System.out.println("================================================");
            System.out.println("| 1.  ¿Qué es el átomo?                        |");
            System.out.println("| 2.  ¿Qué es el electrón?                     |");
            System.out.println("| 3.  ¿Qué es el protón?                       |");
            System.out.println("| 4.  ¿Qué es el neutrón?                      |");
            System.out.println("| 5.  ¿Qué es el número atómico?               |");
            System.out.println("| 6.  ¿Qué es el número de masa?               |");
            System.out.println("| 7.  ¿Qué es un isótopo?                      |");
            System.out.println("| 8.  ¿Qué es la masa atómica?                 |");
            System.out.println("| 9.  Beneficios de la investigación isótopos  |");
            System.out.println("| 10. Peligros del uso bélico del átomo        |");
            System.out.println("| 11. Bibliografía                             |");
            System.out.println("| 0.  Salir                                    |");
            System.out.println("------------------------------------------------");
            System.out.println("Selecciona una opcion                        ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================================================================================");
                    System.out.println("|                                               ¿QUÉ ES EL ÁTOMO?                                             |");
                    System.out.println("===============================================================================================================");
                    System.out.println("| Un átomo es la unidad fundamental de la materia. Está compuesto por un núcleo central que contiene          |");
                    System.out.println("| protones (partículas con carga positiva) y neutrones (partículas sin carga). Alrededor del núcleo se        |");
                    System.out.println("| encuentran los electrones, partículas con carga negativa que se mueven en diferentes niveles de energía.    |");
                    System.out.println("|                                                                                                             |");
                    System.out.println("| Cada elemento químico está definido por su número atómico (Z), que corresponde a la cantidad de protones    |");
                    System.out.println("| en su núcleo. Los átomos pueden unirse entre sí para formar moléculas o reaccionar para crear sustancias    |");
                    System.out.println("| nuevas. Además, las propiedades químicas de los átomos dependen de la distribución de sus electrones,       |");
                    System.out.println("| especialmente de los electrones de valencia.                                                                |");
                    System.out.println("===============================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==========================================================================================");
                    System.out.println("|                                    ¿QUÉ ES EL ELECTRÓN                                 |");
                    System.out.println("==========================================================================================");
                    System.out.println("| El electrón es una partícula subatómica con carga negativa localizada fuera del núcleo |");
                    System.out.println("|  - Características: (1) Tiene muy poca masa relativa comparada con protones/neutrones. |");
                    System.out.println("|                     (2) Participa en enlaces químicos y en la conducción eléctrica.    |");
                    System.out.println("==========================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("===============================================================================================");
                    System.out.println("|                                   ¿QUÉ ES EL PROTÓN?                                        |");
                    System.out.println("===============================================================================================");
                    System.out.println("| El protón es una partícula subatómica con carga positiva localizada en el núcleo.           |");
                    System.out.println("|  - Características: (1) Determina el número atómico del elemento;                           |");
                    System.out.println("|                     (2) Tiene masa aproximada de 1 uma (unidad de masa atómica).            |");
                    System.out.println("===============================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==============================================================================================");
                    System.out.println("|                               ¿QUÉ ES EL NEUTRÓN?                                          |");
                    System.out.println("==============================================================================================");
                    System.out.println("| El neutrón es una partícula subatómica sin carga eléctrica (neutra) ubicada en el núcleo.  |");
                    System.out.println("|  - Características: (1) Contribuye a la masa del núcleo (≈1 uma);                          |");
                    System.out.println("|                     (2) Aporta estabilidad nuclear y su variación produce isótopos.        |");
                    System.out.println("==============================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("===================================================================================================================");
                    System.out.println("|                                            ¿QUÉ ES EL NÚMERO ATÓMICO?                                           |");
                    System.out.println("===================================================================================================================");
                    System.out.println("| El número atómico es el número total de protones en el núcleo de un átomo, lo que lo identifica de forma única. |");
                    System.out.println("| Se representa con la letra Z y determina la posición de un elemento en la tabla periódica.                      |");
                    System.out.println("| En un átomo neutro, el número atómico también es igual al número de electrones que lo rodean.                   |");
                    System.out.println("===================================================================================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("=================================================================================================================================================");
                    System.out.println("|                                                    ¿QUÉ ES EL NÚMERO DE MASA?                                                                 |");
                    System.out.println("=================================================================================================================================================");
                    System.out.println("| El número de masa es la suma del número de protones y neutrones en el núcleo de un átomo.                                                     |");
                    System.out.println("| Se representa con la letra A y se calcula mediante la fórmula A=Z+N, donde Z es el número atómico (protones) y N es el número de neutrones.   |");
                    System.out.println("=================================================================================================================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("===============================================================================================================================================================");
                    System.out.println("|                                                             ¿QUÉ ES UN ISÓTOPO?                                                                             |");
                    System.out.println("===============================================================================================================================================================");
                    System.out.println("| Un isótopo son variantes de un mismo elemento que tienen igual número atómico (mismos protones) pero diferente número de neutrones (por tanto diferente A). |");
                    System.out.println("| Ejemplos:                                                                                                                                                   |");
                    System.out.println("| - Carbono: C-12 (6p, 6n), C-13 (6p, 7n), C-14 (6p, 8n).                                                                                                     |");
                    System.out.println("| - Uranio:  U-235 (92p, 143n), U-238 (92p, 146n).                                                                                                            |");
                    System.out.println("===============================================================================================================================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("============================================================================================================================");
                    System.out.println("|                                               ¿QUÉ ES LA MASA ATÓMICA?                                                   |");
                    System.out.println("============================================================================================================================");
                    System.out.println("| La masa atómica es la masa de un átomo individual, que se compone principalmente de la masa de sus protones y neutrones, |");
                    System.out.println("| y se mide en unidades de masa atómica (uma).                                                                             |");
                    System.out.println("| El valor que se encuentra en la tabla periódica es el de la masa atómica promedio,                                       |");
                    System.out.println("| que es un promedio ponderado de las masas de todos los isótopos naturales de un elemento.                                |");
                    System.out.println("============================================================================================================================");
                    esperarTecla();
                    break;
                case 9:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================================================");
                    System.out.println("|                               TRES BENEFICIOS DE LA INVESTIGACIÓN CON ISÓTOPOS                                                      |");
                    System.out.println("=======================================================================================================================================");
                    System.out.println("| 1. Medicina: Isótopos radioactivos permiten diagnóstico por imagen (PET, gammagrafía) y tratamientos (radioterapia).                |");
                    System.out.println("| 2. Datación: Isótopos como 14C permiten datar materiales arqueológicos y geológicos.                                                |");
                    System.out.println("| 3. Agricultura e industria: Marcadores isotópicos y trazadores mejoran fertilizantes, estudios ambientales y procesos industriales. |");
                    System.out.println("=======================================================================================================================================");
                    esperarTecla();
                    break;
                case 10:
                    limpiarPantalla();
                    System.out.println("===================================================================================================================================");
                    System.out.println("|                                 PELIGROS DEL USO DEL ÁTOMO CON FINES BÉLICOS                                                    |");
                    System.out.println("===================================================================================================================================");
                    System.out.println("|- Las armas nucleares poseen una capacidad destructiva masiva: pérdidas humanas, destrucción de infraestructura y ecosistemas.   |");
                    System.out.println("|- Generan radiación residual y contaminación radiactiva de larga duración, afectando salud y ambiente por décadas.               |");
                    System.out.println("|- Uso bélico incrementa riesgos de escalada, errores humanos, proliferación y problemas éticos sobre humanidad y supervivencia.  |");
                    System.out.println("|- Además, la recuperación social, económica y ambiental tras un ataque nuclear es extremadamente difícil y costosa.              |");
                    System.out.println("===================================================================================================================================");
                    esperarTecla();
                    break;
                case 11:
                    limpiarPantalla();
                    System.out.println("============================================================================================");
                    System.out.println("|                                    BIBLIOGRAFÍA                                          |");
                    System.out.println("============================================================================================");
                    System.out.println("| Chang, R. (2010). Química. McGraw-Hill.                                                  |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (2012). Química: La Ciencia Central. Pearson. |");
                    System.out.println("| Zumdahl, S. (2014). Química. Cengage Learning.                                           |");
                    System.out.println("| Petrucci, R. H. (2011). Química General. Pearson Educación.                              |");
                    System.out.println("| Atkins, P., & Friedman, R. (2011). Química Cuántica. Oxford University Press.            |");
                    System.out.println("============================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);

    }


    public static void TemaElectron_Diferencial() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("===================================================");
            System.out.println("|   Estructura Atómica: ELECTRÓN DIFERENCIAL      |");
            System.out.println("===================================================");
            System.out.println("| 1. Concepto                                     |");
            System.out.println("| 2. Ejemplo: Tecnecio (Z=43)                     |");
            System.out.println("| 3. Regla de Hund y spin                         |");
            System.out.println("| 4. Bibliografía                                 |");
            System.out.println("| 0. Salir                                        |");
            System.out.println("---------------------------------------------------");
            System.out.println("Selecciona una opción:               ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=============================================================================================================");
                    System.out.println("|                               CONCEPTO DE ELECTRÓN DIFERENCIAL                                            |");
                    System.out.println("=============================================================================================================");
                    System.out.println("| El electrón diferencial es el último electrón que se agrega en la configuración electrónica de un átomo.  |");
                    System.out.println("| Determina las propiedades químicas más importantes del elemento.                                          |");
                    System.out.println("| Se encuentra en el orbital de mayor energía del subnivel incompleto.                                      |");
                    System.out.println("=============================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=================================================================================");
                    System.out.println("|                      EJEMPLO: TECNECIO (Tc, Z=43)                             |");
                    System.out.println("=================================================================================");
                    System.out.println("| Configuración electrónica: [Kr] 5s² 4d¹⁰                                      |");
                    System.out.println("| El electrón diferencial es el último en el subnivel 4d                        |");
                    System.out.println("| Número cuántico principal n = 4                                               |");
                    System.out.println("| Número cuántico secundario l = 2 (subnivel d)                                 |");
                    System.out.println("| Número cuántico magnético m = +2  (posición en +2)                            |");
                    System.out.println("| Spin s = +1/2 (primer electrón en orbital vacío)                              |");
                    System.out.println("=================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================================================================================");
                    System.out.println("|                                                                       REGLA DE HUND Y SPIN                                                                                           |");
                    System.out.println("========================================================================================================================================================================================");
                    System.out.println("| La regla de Hund establece que para llenar orbitales de la misma energía (orbitales degenerados), cada orbital recibe un electrón antes de                                           |");
                    System.out.println("| que cualquier orbital reciba un segundo electrón.                                                                                                                                    |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| El espín es una propiedad intrínseca del electrón que puede ser paralela (representada como flecha hacia arriba, +1/2) o antiparalela (flecha hacia abajo, -1/2) a otros electrones. |");
                    System.out.println("| No es un giro físico en el sentido clásico, sino una propiedad fundamental que hace que las partículas se comporten como pequeños imanes y tengan estados cuánticos definidos.       |");
                    System.out.println("========================================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("=============================================================================================");
                    System.out.println("|                                   BIBLIOGRAFÍA                                            |");
                    System.out.println("=============================================================================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill, 2010.                                           |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson, 2012.  |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química). Oxford, 2010.                            |");
                    System.out.println("=============================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
                    break;
            }

        } while (opcion != 0);
    }

    public static void TemaModelos_Atomicos() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=========================================");
            System.out.println("|        MODELOS ATÓMICOS               |");
            System.out.println("=========================================");
            System.out.println("| 1. Demócrito                          |");
            System.out.println("| 2. Dalton                             |");
            System.out.println("| 3. Thomson                            |");
            System.out.println("| 4. Rutherford                         |");
            System.out.println("| 5. Bohr                               |");
            System.out.println("| 6. Sommerfeld                         |");
            System.out.println("| 7. Schrödinger                        |");
            System.out.println("| 8. Dirac-Jordan                       |");
            System.out.println("| 9. Bibliografía                       |");
            System.out.println("| 0. Salir                              |");
            System.out.println("-----------------------------------------");
            System.out.println("Selecciona una opción:  ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================================");
                    System.out.println("|                                               DEMÓCRITO (460-370 A.C.)                                                  |");
                    System.out.println("===========================================================================================================================");
                    System.out.println("| El modelo de Demócrito propone que toda la materia está compuesta por átomos indivisibles, indestructibles y eternos    |");
                    System.out.println("| que se mueven constantemente en el vacío.                                                                               |");
                    System.out.println("| Los átomos difieren en forma, tamaño, posición y orden, y su combinación crea las distintas propiedades de los objetos. |");
                    System.out.println("|  - Propuso que la materia está formada por partículas indivisibles llamadas átomos.                                     |");
                    System.out.println("|  - No tenía evidencia experimental, era filosófico.                                                                     |");
                    System.out.println("|  - Introdujo la idea de que los átomos se combinan para formar la materia.                                              |");
                    System.out.println("===========================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("========================================================================================================");
                    System.out.println("|                                         DALTON (1803-1808)                                           |");
                    System.out.println("========================================================================================================");
                    System.out.println("| El átomo de Dalton es la representación de un átomo como una esfera sólida, maciza e indivisible,    |");
                    System.out.println("| que fue el primer modelo atómico con bases científicas. Propuesto por John Dalton entre 1803 y 1808  |");
                    System.out.println("|  - La materia está formada por átomos indivisibles e indestructibles.                                |");
                    System.out.println("|  - Todos los átomos de un elemento son iguales.                                                      |");
                    System.out.println("|  - Los compuestos se forman por combinación de átomos en proporciones fijas.                         |");
                    System.out.println("========================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("===================================================================================================================");
                    System.out.println("|                                                      THOMSON (1904)                                             |");
                    System.out.println("===================================================================================================================");
                    System.out.println("| Modelo propuesto en 1904. El átomo de Thomson, también conocido como el modelo del pudín de pasas, describe     |");
                    System.out.println("| el átomo como una esfera de carga positiva con electrones (carga negativa) incrustados en su interior, como     |");
                    System.out.println("| las pasas en un pudín.                                                                                          |");
                    System.out.println("| - Conocido como pudín de pasas.                                                                                 |");
                    System.out.println("| - Átomo es una esfera cargada positivamente con electrones incrustados.                                         |");
                    System.out.println("| - Explica la neutralidad eléctrica del átomo.                                                                   |");
                    System.out.println("===================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================");
                    System.out.println("|                                        RUTHERFORD (1911)                                            |");
                    System.out.println("=======================================================================================================");
                    System.out.println("| El átomo de Rutherford, propuesto en 1911, es un modelo que describe el átomo como una estructura   |");
                    System.out.println("| con un núcleo central denso y positivo, donde se concentra la mayor parte de la masa, y electrones  |");
                    System.out.println("| con carga negativa que giran a su alrededor en órbitas.                                             |");
                    System.out.println("| - Experimento de la lámina de oro.                                                                  |");
                    System.out.println("| - Átomo con núcleo pequeño, denso y positivo.                                                       |");
                    System.out.println("| - Electrones giran alrededor del núcleo, el resto es espacio vacío.                                 |");
                    System.out.println("=======================================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("================================================================================================================================");
                    System.out.println("|                                                           BOHR (1913)                                                        |");
                    System.out.println("================================================================================================================================");
                    System.out.println("| El átomo de Bohr, propuesto en 1913 por Niels Bohr, es un modelo planetario del átomo donde los electrones giran en órbitas  |");
                    System.out.println("| estables y cuantizadas alrededor de un núcleo central cargado positivamente.                                                 |");
                    System.out.println("| - Electrones giran en órbitas circulares con niveles de energía definidos.                                                   |");
                    System.out.println("| - Explica los espectros de emisión del hidrógeno.                                                                            |");
                    System.out.println("| - Introduce cuantización de energía.                                                                                         |");
                    System.out.println("================================================================================================================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                 SOMMERFELD (1916)                                                |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Propuesto en 1916, este modelo postula que los electrones se mueven en órbitas elípticas, además de circulares,  |");
                    System.out.println("| y que existen niveles y subniveles de energía dentro de cada capa principal.                                     |");
                    System.out.println("| - Modificación del modelo de Bohr.                                                                               |");
                    System.out.println("| - Introdujo órbitas elípticas además de circulares.                                                              |");
                    System.out.println("| - Considera subniveles (s, p, d, f) para explicar espectros más precisos.                                        |");
                    System.out.println("====================================================================================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================");
                    System.out.println("|                                           SCHRÖDINGER (1926)                                                         |");
                    System.out.println("========================================================================================================================");
                    System.out.println("| es un modelo cuántico del átomo que describe a los electrones no como partículas que orbitan en trayectorias fijas,  |");
                    System.out.println("| sino como ondas de probabilidad. En este modelo, los electrones existen en regiones de espacio llamadas orbitales,   |");
                    System.out.println("| donde existe una probabilidad de encontrarlos, y no se puede conocer su posición y momento exactos simultáneamente.  |");
                    System.out.println("| - Schrödinger desarrolló la ecuación de onda que describe la probabilidad de encontrar electrones.                   |");
                    System.out.println("| - Introduce orbitales y números cuánticos (n, l, m, s).                                                              |");
                    System.out.println("========================================================================================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================================");
                    System.out.println("|                                                           DIRAC-JORDAN (1928)                                                        |");
                    System.out.println("========================================================================================================================================");
                    System.out.println("| El modelo de Dirac-Jordan es una generalización cuántico-relativista del modelo atómico que incorpora la relatividad                 |");
                    System.out.println("| especial de Einstein, formulada por Paul Dirac y Pascual Jordan en 1928. Este modelo explica de manera natural el                    |");
                    System.out.println("| espín del electrón, un cuarto número cuántico.                                                                                       |");
                    System.out.println("| - Incorpora la teoría de la relatividad especial de Einstein en la descripción del electrón.                                         |");
                    System.out.println("| - Sigue utilizando el concepto de orbitales, que son regiones en el espacio donde se encuentra la probabilidad máxima de un electrón |");
                    System.out.println("========================================================================================================================================");
                    esperarTecla();
                    break;
                case 9:
                    limpiarPantalla();
                    System.out.println("============================================================================================");
                    System.out.println("|                                  BIBLIOGRAFÍA                                            |");
                    System.out.println("============================================================================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill, 2010.                                          |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson, 2012. |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química). Oxford, 2010.                           |");
                    System.out.println("| Tipler, P. A., & Mosca, G. (Física para Ciencias e Ingeniería).                          |");
                    System.out.println("| Einstein, A. (Teoría de la Relatividad).                                                 |");
                    System.out.println("============================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }
        } while (opcion != 0);

    }

    public static void TemaNumerosCuanticos() {
        int opcionesp =-1;
        do {
            limpiarPantalla();
            System.out.println("==================================================");
            System.out.println("|               NÚMEROS CUÁNTICOS                |");
            System.out.println("==================================================");
            System.out.println("| 1.  Principio de Incertidumbre de Heisenberg   |");
            System.out.println("| 2.  Soluciones de la ecuación de Schrödinger   |");
            System.out.println("| 3.  Números cuánticos                          |");
            System.out.println("| 4.  Número cuántico principal n                |");
            System.out.println("| 5.  Valores posibles de n                      |");
            System.out.println("| 6.  Número cuántico secundario l               |");
            System.out.println("| 7.  Valores de l                               |");
            System.out.println("| 8.  Letras asignadas a l                       |");
            System.out.println("| 9.  Forma de los orbitales s y p               |");
            System.out.println("| 10. Número cuántico magnético m                |");
            System.out.println("| 11. Valores de m                               |");
            System.out.println("| 12. Número cuántico spin ms                    |");
            System.out.println("| 13. Valores de ms                              |");
            System.out.println("| 14. ¿Qué es un orbital?                        |");
            System.out.println("| 15. Diferencia entre nivel, subnivel y orbital |");
            System.out.println("| 16. Bibliografía                               |");
            System.out.println("| 0.  Regresar al menu principal                 |");
            System.out.println("--------------------------------------------------");
            System.out.println("Selecciona una opción:             ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine();
                esperarTecla();
                continue;
            }

            opcionesp = sc.nextInt();
            sc.nextLine();

            switch (opcionesp) {
                case 1:
                    limpiarPantalla();
                    System.out.println("==============================================================================================================================");
                    System.out.println("|                                        PRINCIPIO DE INCERTIDUMBRE DE HEISENBERG                                            |");
                    System.out.println("==============================================================================================================================");
                    System.out.println("| El principio de incertidumbre, formulado por Werner Heisenberg en 1927, establece que es imposible conocer simultáneamente |");
                    System.out.println("| con exactitud absoluta ciertos pares de magnitudes físicas de una partícula subatómica, especialmente su posición y su     |");
                    System.out.println("| momento lineal (masa x velocidad). Esto no se debe a fallas en los instrumentos, sino a la propia naturaleza cuántica de   |");
                    System.out.println("| la materia.                                                                                                                |");
                    System.out.println("|                                                                                                                            |");
                    System.out.println("| En otras palabras: mientras más precisamente se intenta medir la posición de una partícula, menos precisa será la          |");
                    System.out.println("| información que se puede obtener sobre su momento, y viceversa. Esta limitación fundamental demuestra que, en el mundo     |");
                    System.out.println("| cuántico, las partículas no tienen valores exactos y simultáneos de todas sus propiedades.                                 |");
                    System.out.println("==============================================================================================================================");

                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==============================================================================================================");
                    System.out.println("|                              SOLUCIONES DE LA ECUACIÓN DE SCHRÖDINGER                                      |");
                    System.out.println("==============================================================================================================");
                    System.out.println("| La ecuación de Schrödinger describe matemáticamente el comportamiento y la probabilidad de encontrar un    |");
                    System.out.println("| electrón alrededor del núcleo. Sus soluciones son las funciones de onda (ψ), que contienen toda la         |");
                    System.out.println("| información posible sobre el estado cuántico del electrón.                                                 |");
                    System.out.println("|                                                                                                            |");
                    System.out.println("| De estas funciones de onda se derivan los ORBITALES, que representan regiones del espacio donde existe     |");
                    System.out.println("| mayor probabilidad de hallar al electrón. Además, las soluciones también determinan los NIVELES DE ENERGÍA |");
                    System.out.println("| permitidos para el electrón, mostrando que este no puede tener cualquier valor de energía, sino solo       |");
                    System.out.println("| cantidades específicas (cuantizadas).                                                                      |");
                    System.out.println("|                                                                                                            |");
                    System.out.println("| En resumen: la ecuación no solo predice dónde es más probable encontrar al electrón, sino también cuánta   |");
                    System.out.println("| energía puede poseer y qué formas (orbitales) puede adoptar su distribución espacial.                      |");
                    System.out.println("==============================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("========================================================================================");
                    System.out.println("|                                      NÚMEROS CUÁNTICOS                               |");
                    System.out.println("========================================================================================");
                    System.out.println("| Los número cuánticos son un conjunto de valores numéricos que describen              |");
                    System.out.println("| el estado cuántico único y completo de un electrón dentro de un átomo                |");
                    System.out.println("| 1.-Número cuántico principal (n)                                                     |");
                    System.out.println("| 2.-Número cuántico del momento angular (l)                                           |");
                    System.out.println("| 3.-Número cuántico magnético (m)                                                     |");
                    System.out.println("| 4.-Número cuántico de espin (ms)                                                     |");
                    System.out.println("========================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("=========================================================================================================================");
                    System.out.println("|                                               NÚMEROS CUÁNTICO PRINCIPAL 'n'                                          |");
                    System.out.println("=========================================================================================================================");
                    System.out.println("| El número cuántico principal n es un entero positivo que determina el nivel de energía del electrón en el átomo       |");
                    System.out.println("| y establece el tamaño del orbital.                                                                                    |");
                    System.out.println("=========================================================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("=======================================");
                    System.out.println("|        VALORES POSIBLES DE 'n'      |");
                    System.out.println("=======================================");
                    System.out.println("| Sus valores permitidos son:         |");
                    System.out.println("|             n=1,2,3,4,…             |");
                    System.out.println("|                                     |");
                    System.out.println("=======================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("=============================================================================================");
                    System.out.println("|                              NÚMEROS CUÁNTICO SECUNDARIO 'l'                              |");
                    System.out.println("=============================================================================================");
                    System.out.println("| El número cuántico del momento angular l indica la forma del orbital y está asociado      |");
                    System.out.println("| al momento angular orbital del electrón.                                                  |");
                    System.out.println("=============================================================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("====================================================================");
                    System.out.println("|                       VALORES POSIBLES DE 'l'                    |");
                    System.out.println("====================================================================");
                    System.out.println("| Para un valor dado de n, sus valores permitidos son:             |");
                    System.out.println("|                          l=0,1,2,…,(n−1)                         |");
                    System.out.println("====================================================================");
                    esperarTecla();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("=================================================================================================");
                    System.out.println("|                                       LETRAS ASIGNADAS A 'l'                                  |");
                    System.out.println("=================================================================================================");
                    System.out.println("| La asignación formal entre el número cuántico del momento angular l y las letras usadas       |");
                    System.out.println("| para nombrar los subniveles:                                                                  |");
                    System.out.println("|               l = 0 → s                                                                       |");
                    System.out.println("|               l = 1 → p                                                                       |");
                    System.out.println("|               l = 2 → d                                                                       |");
                    System.out.println("|               l = 3 → f                                                                       |");
                    System.out.println("=================================================================================================");
                    esperarTecla();
                    break;
                case 9:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================================");
                    System.out.println("|                                           FORMA DE LOS ORBITALES 's' Y 'p'                                          |");
                    System.out.println("=======================================================================================================================");
                    System.out.println("| Orbital s:                                                                                                          |");
                    System.out.println("|  Los orbitales s son regiones de probabilidad con simetría esférica alrededor del núcleo. Su densidad de            |");
                    System.out.println("|  probabilidad depende únicamente de la distancia al núcleo y no presenta nodos angulares.                           |");
                    System.out.println("|_____________________________________________________________________________________________________________________|");
                    System.out.println("| Orbital p:                                                                                                          |");
                    System.out.println("|  Los orbitales p tienen una forma bilobular constituida por dos regiones alargadas situadas a lados opuestos        |");
                    System.out.println("|  del núcleo, separadas por un plano nodal que pasa por el núcleo. Cada orbital p se orienta en uno de los           |");
                    System.out.println("|  tres ejes cartesianos: px, py o pz.                                                                                |");
                    System.out.println("=======================================================================================================================");
                    esperarTecla();
                    break;
                case 10:
                    limpiarPantalla();
                    System.out.println("==========================================================================================================================");
                    System.out.println("|                                            NÚMEROS CUÁNTICO MAGNÉTICO 'm'                                              |");
                    System.out.println("==========================================================================================================================");
                    System.out.println("| El número cuántico magnético mₗ especifica la orientación espacial del orbital asociado a un valor dado del             |");
                    System.out.println("| número cuántico del momento angular l. Sus valores permitidos son todos los enteros comprendidos entre −l y +l         |");
                    System.out.println("==========================================================================================================================");
                    esperarTecla();
                    break;
                case 11:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                              VALORES POSIBLES DE 'm'                                              |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("| Para un valor dado el número cuántico del momento angular 'l', el numero cuántico magnético ml puede              |");
                    System.out.println("| tomar todos los valores enteros desde -l hasta +l. Es decir:                                                      |");
                    System.out.println("|                                        ml\u200B=−l,(−l+1),…,0,…,(l−1),l                                                |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 12:
                    limpiarPantalla();
                    System.out.println("================================================================================================================");
                    System.out.println("|                                     CUARTO  NÚMEROS CUÁNTICO (SPIN)                                          |");
                    System.out.println("================================================================================================================");
                    System.out.println("| El cuarto número cuántico es el número cuántico de espín, una especie de firma íntima del electrón           |");
                    System.out.println("| , como un pequeño remolino interno que marca si gira hacia una dirección o hacia la contraria.               |");
                    System.out.println("================================================================================================================");
                    esperarTecla();
                    esperarTecla();
                    break;
                case 13:
                    limpiarPantalla();
                    System.out.println("===============================================");
                    System.out.println("|           VALORES POSIBLES DE 'ms'          |");
                    System.out.println("===============================================");
                    System.out.println("| Los valores permitidos son únicamente:      |");
                    System.out.println("|  ms=  +½ y −½                               |");
                    System.out.println("===============================================");
                    esperarTecla();
                    break;
                case 14:
                    limpiarPantalla();
                    System.out.println("==========================================================================================================");
                    System.out.println("|                                          ¿QUÉ ES UN ORBITAL?                                           |");
                    System.out.println("==========================================================================================================");
                    System.out.println("| Un orbital es una función matemática derivada de la solución de la ecuación de Schrödinger             |");
                    System.out.println("| que describe la distribución de probabilidad de encontrar un electrón en una región específica         |");
                    System.out.println("| del espacio alrededor del núcleo de un átomo. Cada orbital se caracteriza por un conjunto de           |");
                    System.out.println("| números cuánticos y posee una energía y forma determinadas.                                            |");
                    System.out.println("==========================================================================================================");
                    esperarTecla();
                    break;
                case 15:
                    limpiarPantalla();
                    System.out.println("==================================================================================================================================");
                    System.out.println("|                                              DIFERENCIA ENTRE NIVEL, SUBNIVEL Y ORBITAL                                        |");
                    System.out.println("==================================================================================================================================");
                    System.out.println("| 1. Diferencia entre nivel y subnivel                                                                                           |");
                    System.out.println("|  -Nivel (n): clasifica la energía general del electrón; es la división más amplia.                                             |");
                    System.out.println("|  -Subnivel (l): es una subdivisión dentro de un nivel; especifica la forma de los orbitales.                                   |");
                    System.out.println("|     **Diferencia clave: el nivel indica qué tanta energía tiene el electrón, mientras que el subnivel indica cómo              |");
                    System.out.println("|                                    es la forma de la región donde puede estar.**                                               |");
                    System.out.println("|________________________________________________________________________________________________________________________________|");
                    System.out.println("| 2. Diferencia entre subnivel y orbital                                                                                         |");
                    System.out.println("|  -Subnivel (s, p, d, f): grupo de orbitales con la misma forma.                                                                |");
                    System.out.println("|  -Orbital: cada una de las orientaciones posibles dentro de un subnivel.                                                       |");
                    System.out.println("|     **Diferencia clave: el subnivel es un tipo de región (por ejemplo, p), y el orbital es una orientación                     |");
                    System.out.println("|                                    específica dentro de ese tipo (px, py o pz).**                                              |");
                    System.out.println("|________________________________________________________________________________________________________________________________|");
                    System.out.println("| 3. Diferencia entre nivel y orbital                                                                                            |");
                    System.out.println("|  -Nivel (n): categoría general de energía.                                                                                     |");
                    System.out.println("|  -Orbital: región concreta donde puede encontrarse un electrón.                                                                |");
                    System.out.println("|     **Diferencia clave: el nivel es la escala más amplia y energética; el orbital es la escala más específica y                |");
                    System.out.println("|                                    espacial.**                                                                                 |");
                    System.out.println("==================================================================================================================================");
                    esperarTecla();
                    break;

                case 16:
                    limpiarPantalla();
                    System.out.println("=============================================================================================");
                    System.out.println("|                                     BIBLIOGRAFÍA                                          |");
                    System.out.println("=============================================================================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill, 2010.                                           |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson, 2012.  |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química). Oxford, 2010.                            |");
                    System.out.println("| Tipler, P. A., & Mosca, G. (Física para Ciencias e Ingeniería).                           |");
                    System.out.println("| Einstein, A. (Teoría de la Relatividad).                                                  |");
                    System.out.println("=============================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
                    break;
            }

        } while (opcionesp != 0);
    }


    public static void TemaPrincipio_Aufbau() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("================================================================");
            System.out.println("|    ESTRUCTURA ATÓMICA: PRINCIPIO DE CONSTRUCCIÓN (AUFBAU)    |");
            System.out.println("================================================================");
            System.out.println("| 1.Estado basal del átomo                                     |");
            System.out.println("| 2.Principio de exclusión de Pauli                            |");
            System.out.println("| 3.Principio de edificación progresiva (Aufbau)               |");
            System.out.println("| 4.Traslape energético                                        |");
            System.out.println("| 5.Bibliografía                                               |");
            System.out.println("| 0. Salir                                                     |");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Elige una opción :                                            ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================================================================================================");
                    System.out.println("|                                                  ESTADO BASAL DEL ÁTOMO                                                     |");
                    System.out.println("===============================================================================================================================");
                    System.out.println("| El estado basal de un átomo es su estado de energía más bajo posible, en el cual los electrones se                          |");
                    System.out.println("| encuentran distribuidos en los orbitales disponibles siguiendo los principios de Aufbau, exclusión de Pauli y               |");
                    System.out.println("| máxima multiplicidad, sin ocupar niveles de energía superiores.                                                             |");
                    System.out.println("===============================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===============================================================================================================");
                    System.out.println("|                                      PRINCIPIO DE EXCLUSIÓN DE PAULI                                        |");
                    System.out.println("===============================================================================================================");
                    System.out.println("| El principio de exclusión de Pauli establece que no pueden existir dos electrones en un mismo átomo que     |");
                    System.out.println("| posean los cuatro números cuánticos iguales. En un mismo orbital solo pueden coexistir dos electrones y     |");
                    System.out.println("| deben diferir en su número cuántico de espín.                                                               |");
                    System.out.println("===============================================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                PRINCIPIO DE EDIFICACIÓN PROGRESIVA (AUFBAU)                                       |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("| El principio de edificación progresiva, o principio de Aufbau, establece que los electrones en un átomo           |");
                    System.out.println("| ocupan los orbitales en orden creciente de energía, empezando por los de menor energía disponible. La             |");
                    System.out.println("| configuración electrónica se construye llenando primero los niveles y subniveles más bajos antes de pasar a       |");
                    System.out.println("| los superiores.                                                                                                   |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("===============================================================================================================");
                    System.out.println("|                                           TRANSLAPE ENERGÉTICO                                              |");
                    System.out.println("===============================================================================================================");
                    System.out.println("| Ocurre cuando un subnivel de un nivel superior tiene menor energía que un subnivel de un nivel inferior.    |");
                    System.out.println("| Por ejemplo, el 4s se llena antes que el 3d debido a su menor energía.                                      |");
                    System.out.println("===============================================================================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("========================================================================================");
                    System.out.println("|                                     BIBLIOGRAFÍA                                     |");
                    System.out.println("========================================================================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill.                                            |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson.   |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química).                                     |");
                    System.out.println("========================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();

            }
        } while (opcion != 0);
    }

    public static void TemaTabulacion_de_numeros_cuanticos() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=============================================================================");
            System.out.println("|  TABULACIÓN Y CANTIDADES DE NIVELES, SUBNIVELES, ORBITALES Y ELECTRONES   |");
            System.out.println("=============================================================================");
            System.out.println("| 1.Subniveles por nivel                                                    |");
            System.out.println("| 2.Orbitales por subnivel                                                  |");
            System.out.println("| 3.Electrones por orbital                                                  |");
            System.out.println("| 4.Orbitales por nivel                                                     |");
            System.out.println("| 5.Electrones por subnivel                                                 |");
            System.out.println("| 6.Electrones totales por nivel                                            |");
            System.out.println("| 7.Bibliografía                                                            |");
            System.out.println("| 0.Salir                                                                   |");
            System.out.println("=============================================================================");
            System.out.println("|Elige una opción :                                                         |");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================");
                    System.out.println("|           SUBNIVELES POR NIVEL              |");
                    System.out.println("===============================================");
                    System.out.println("| ¿Cuántos subniveles existen por cada nivel? |");
                    System.out.println("| Nivel 1 = 1 subnivel (s)                    |");
                    System.out.println("| Nivel 2 = 2 subniveles (s, p)               |");
                    System.out.println("| Nivel 3 = 3 subniveles (s, p, d)            |");
                    System.out.println("| Nivel 4 = 4 subniveles (s, p, d, f)         |");
                    System.out.println("===============================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=================================================");
                    System.out.println("|           ORBITALES POR SUBNIVEL              |");
                    System.out.println("=================================================");
                    System.out.println("| ¿Cuántos orbitales existen por cada subnivel? |");
                    System.out.println("|  Subnivel s = 1 orbital                       |");
                    System.out.println("|  Subnivel p = 3 orbitales                     |");
                    System.out.println("|  Subnivel d = 5 orbitales                     |");
                    System.out.println("|  Subnivel f = 7 orbitales                     |");
                    System.out.println("=================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=============================================================");
                    System.out.println("|                 ELECTRONES POR ORBITAL                    |");
                    System.out.println("=============================================================");
                    System.out.println("| ¿Cuántos electrones existen por orbital?                  |");
                    System.out.println("| Cada orbital puede tener 2 electrones con spins opuestos. |");
                    System.out.println("=============================================================");
                    esperarTecla();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("========================================================");
                    System.out.println("|                  ORBITALES POR NIVEL                 |");
                    System.out.println("========================================================");
                    System.out.println("| ¿Cuántos orbitales existen por cada nivel hasta n=4? |");
                    System.out.println("| Nivel 1 = 1 orbital                                  |");
                    System.out.println("| Nivel 2 = 4 orbitales                                |");
                    System.out.println("| Nivel 3 = 9 orbitales                                |");
                    System.out.println("| Nivel 4 = 16 orbitales                               |");
                    System.out.println("========================================================");
                    esperarTecla();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("===============================================");
                    System.out.println("|           ELECTRONES POR SUBNIVEL           |");
                    System.out.println("===============================================");
                    System.out.println("| ¿Cuántos electrones existen por subnivel?   |");
                    System.out.println("| Subnivel s = 2 electrones                   |");
                    System.out.println("| Subnivel p = 6 electrones                   |");
                    System.out.println("| Subnivel d = 10 electrones                  |");
                    System.out.println("| Subnivel f = 14 electrones                  |");
                    System.out.println("===============================================");
                    esperarTecla();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("============================================================");
                    System.out.println("|             ELECTRONES TOTALES POR NIVEL                 |");
                    System.out.println("============================================================");
                    System.out.println("| ¿Cuántos electrones totales existen por nivel hasta n=4? |");
                    System.out.println("| Nivel 1 = 2 electrones                                   |");
                    System.out.println("| Nivel 2 = 8 electrones                                   |");
                    System.out.println("| Nivel 3 = 18 electrones                                  |");
                    System.out.println("| Nivel 4 = 32 electrones                                  |");
                    System.out.println("============================================================");
                    esperarTecla();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("========================================================================================");
                    System.out.println("|                                         BIBLIOGRAFÍA                                 |");
                    System.out.println("========================================================================================");
                    System.out.println("| Chang, R. (Química General). McGraw-Hill.                                            |");
                    System.out.println("| Brown, T. L., LeMay, H. E., Bursten, B. E. (Química: La Ciencia Central). Pearson.   |");
                    System.out.println("| Atkins, P., & Jones, L. (Principios de Química).                                     |");
                    System.out.println("========================================================================================");
                    esperarTecla();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }
        } while (opcion != 0);
    }

    public static void menuUnidad3(){
        int opcionsubtema = -1;
        while (opcionsubtema != 0){
            MenuUnidad3();
            while (true){
                if (scanner.hasNextInt()) {
                    opcionsubtema = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcionsubtema){
                        case 0:
                            System.out.println("\n");
                            System.out.println("===================================");
                            System.out.println("| Regresando al menú principal... |");
                            System.out.println("===================================");
                            esperarMENU();
                            break;
                        case 1:
                            limpiarPantalla();
                            TemaAfinidadElectronica1();
                            break;
                        case 2:
                            limpiarPantalla();
                            TemaConstruccionTablaPeriodica1();
                            break;
                        case 3:
                            limpiarPantalla();
                            TemaElectronesPerifericos1();
                            break;
                        case 4:
                            limpiarPantalla();
                            TemaElectronesValencia1();
                            break;
                        case 5:
                            limpiarPantalla();
                            TemaElementosTransicion1();
                            break;
                        case 6:
                            limpiarPantalla();
                            TemaEnergiaIonizacion1();
                            break;
                        case 7:
                            limpiarPantalla();
                            TemaMetalNoMetal1();
                            break;
                        case 8:
                            limpiarPantalla();
                            TemaValencia1();
                            break;
                        case 9:
                            limpiarPantalla();
                            TemaRadioAtomico1();
                            break;
                        case 10:
                            limpiarPantalla();
                            TemaPropiedadesPeriodicas1();
                            break;
                        case 11:
                            limpiarPantalla();
                            NumeroOxidacion1();
                            break;
                        default:
                            System.out.println("--------------------------------------");
                            System.out.println("| Opción no válida. Intenta de nuevo |");
                            System.out.println("--------------------------------------");
                            esperarMENU();
                            break;
                    }
                    break;
                }
                else{
                    System.out.println("---------------------------------------------");
                    System.out.println("| Opción inválida. Ingresa un numero entero |");
                    System.out.println("---------------------------------------------");
                    scanner.next();
                    scanner.nextLine();
                    esperarMENU();
                    break;
                }
            }
        }
    }

    private static void NumeroOxidacion1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("================================================");
            System.out.println("|            NÚMEROS DE OXIDACIÓN              |");
            System.out.println("================================================");
            System.out.println("| 1. Definición                                |");
            System.out.println("| 2. Reglas para asignar núneros de oxidación  |");
            System.out.println("| 3. Ejemplos resueltos                        |");
            System.out.println("| 4. Bibliografía                              |");
            System.out.println("| 0. Salir                                     |");
            System.out.println("------------------------------------------------");
            System.out.println("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("=========================================================");
                    System.out.println("|                     NÚMEROS (NOX):                    |");
                    System.out.println("=========================================================");
                    System.out.println("| Carga hipotética que un átomo tendría si              |");
                    System.out.println("| los electrones se asignaran según electronegatividad. |");
                    System.out.println("=========================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=================================");
                    System.out.println("|            REGLAS:            |");
                    System.out.println("=================================");
                    System.out.println("| - Elementos puros NOX=0;      |");
                    System.out.println("| - Metales alcalinos +1        |");
                    System.out.println("| - Alcalinotérreos +2          |");
                    System.out.println("| - O = -2 (salvo peróxidos)    |");
                    System.out.println("| - H = +1 con no metales       |");
                    System.out.println("| - H =-1 con metales.          |");
                    System.out.println("=================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==================================================");
                    System.out.println("|                    EJEMPLO                     |");
                    System.out.println("==================================================");
                    System.out.println("| H2O -> H +1, O -2. KMnO4 -> K +1, O -2, Mn +7. |");
                    System.out.println("==================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("===================================================");
                    System.out.println("|                  BIBLIOGRAFÍA:                  |");
                    System.out.println("===================================================");
                    System.out.println("| - Petrucci et al., *General Chemistry*          |");
                    System.out.println("| - Housecroft & Sharpe, *Inorganic Chemistry*6   |");
                    System.out.println("===================================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    limpiarPantalla();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    public static void TemaPropiedadesPeriodicas1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("=========================================================");
            System.out.println("|                 PROPIEDADES PERIÓDICAS                |");
            System.out.println("=========================================================");
            System.out.println("| 1. Lista de propiedades periódicas                    |");
            System.out.println("| 2. Explicación de tendencias (Zef y apantallamiento)  |");
            System.out.println("| 3. Ejemplos aplicados (reactividad, tipo de enlace)   |");
            System.out.println("| 4. Bibliografía                                       |");
            System.out.println("| 0. Salir                                              |");
            System.out.println("---------------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();


            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================");
                    System.out.println("|                             PROPIEDADES:                                |");
                    System.out.println("===========================================================================");
                    System.out.println("| Radio atómico, radio iónico, energía de ionización, electronegatividad, |");
                    System.out.println("| afinidad electrónica, carácter metálico, potenciales de reducción.      |");
                    System.out.println("===========================================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===========================================================================");
                    System.out.println("|                              EXPLICACIÓN:                               |");
                    System.out.println("===========================================================================");
                    System.out.println("| La carga nuclear efectiva y el apantallamiento por electrones internos  |");
                    System.out.println("| determinan las tednencias observadas                                    |");
                    System.out.println("===========================================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==========================================================");
                    System.out.println("|                        EJEMPLO:                        |");
                    System.out.println("==========================================================");
                    System.out.println("| Un mismo grupo la reactividad de metales aumenta hacia |");
                    System.out.println("| abajo (menor energía de ionización).                   |");
                    System.out.println("==========================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|             BIBLIOGRAFÍA:              |");
                    System.out.println("==========================================");
                    System.out.println("| - Petrucci et al., *General Chemistry* |");
                    System.out.println("| - Atkins, *Physical Chemistry*         |");
                    System.out.println("==========================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    limpiarPantalla();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    public static void TemaRadioAtomico1() {
        int OPCION = -1;
        while (OPCION  != 0){
            limpiarPantalla();
            System.out.println("========================================================");
            System.out.println("|                   RADIO ATÓMICO                      |");
            System.out.println("========================================================");
            System.out.println("| 1. Qué es el radio atómico                           |");
            System.out.println("| 2. Cómo se mide (conceptos y métodos experimentales  |");
            System.out.println("| 3. Tendencias en la tabla periódica                  |");
            System.out.println("| 4. Bibliografía                                      |");
            System.out.println("| 0. Salir                                             |");
            System.out.println("--------------------------------------------------------");
            System.out.println("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                               DEFINICIÓN                           |");
                    System.out.println("======================================================================");
                    System.out.println("| El radio atómico es una medida del tamaño de un átomo. Se          |");
                    System.out.println("| define comúnmente como la mitad de la distancia entre los          |");
                    System.out.println("| núcleos de dos átomos iguales unidos en un cristal o molécula.     |");
                    System.out.println("|                                                                    |");
                    System.out.println("| No existe un borde físico del átomo, ya que los electrones no      |");
                    System.out.println("| tienen posiciones fijas; por eso el radio atómico es un valor      |");
                    System.out.println("| estimado basado en distancias promedio.                            |");
                    System.out.println("|                                                                    |");
                    System.out.println("| El radio atómico depende del número atómico, de la energía de      |");
                    System.out.println("| los electrones y del tipo de enlace con otros átomos. Por eso      |");
                    System.out.println("| puede variar según el modelo usado (covalente, metálico, iónico).  |");
                    System.out.println("======================================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===========================================================================================");
                    System.out.println("|                                   CÓMO SE MIDEN                                         |");
                    System.out.println("===========================================================================================");
                    System.out.println("| El radio atómico no puede medirse directamente, ya que los electrones no tienen una     |");
                    System.out.println("| posición fija alrededor del núcleo. Por ello, se determina utilizando métodos físicos   |");
                    System.out.println("| y cálculos teóricos que permiten estimar la distancia promedio entre átomos.            |");
                    System.out.println("|                                                                                         |");
                    System.out.println("| • Difracción de rayos X: Permite obtener la distancia entre núcleos en cristales,       |");
                    System.out.println("|   a partir de la cual se calcula el radio atómico.                                      |");
                    System.out.println("|                                                                                         |");
                    System.out.println("| • Difracción electrónica y difracción de neutrones: Técnicas que también determinan     |");
                    System.out.println("|   distancias interatómicas en sólidos y moléculas.                                      |");
                    System.out.println("|                                                                                         |");
                    System.out.println("| • Cálculos teóricos (modelo cuántico): Usan funciones de onda del electrón para         |");
                    System.out.println("|   estimar el tamaño promedio de la nube electrónica.                                    |");
                    System.out.println("|                                                                                         |");
                    System.out.println("| • Modelos específicos: Según el tipo de enlace se define un tipo de radio distinto:     |");
                    System.out.println("|    - Radio covalente: Distancia entre núcleos en un enlace covalente.                   |");
                    System.out.println("|    - Radio metálico: Mitad de la distancia entre núcleos en un cristal metálico.        |");
                    System.out.println("|    - Radio iónico: Calculado en sales iónicas según el catión y anión involucrados.     |");
                    System.out.println("===========================================================================================");

                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=======================================================================");
                    System.out.println("|                   TENDENCIAS EN LA TABLA PERIÓDICA                  |");
                    System.out.println("=======================================================================");
                    System.out.println("| Aumenta hacia abajo en un grupo; disminuye de izquierda             |");
                    System.out.println("| a derecha en un periodo (mayor carga nuclear efectiva).             |");
                    System.out.println("=======================================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|             BIBLIOGRAFÍA:              |");
                    System.out.println("==========================================");
                    System.out.println("| - Atkins, *Physical Chemistry*         |");
                    System.out.println("| - Petrucci et al., *General Chemistry* |");
                    System.out.println("==========================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    limpiarPantalla();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    private static void TemaMetalNoMetal1() {
        int OPCION = -1;
        while (OPCION != 0) {
            limpiarPantalla();
            System.out.println("================================================");
            System.out.println("|              METAL vs NO METAL               |");
            System.out.println("================================================");
            System.out.println("| 1. Definición de metal                       |");
            System.out.println("| 2. Definición de no metal                    |");
            System.out.println("| 3. Propiedades físicas y químicas comparadas |");
            System.out.println("| 4. Ejemplos y tendencias periódicas          |");
            System.out.println("| 5. Bibliografía                              |");
            System.out.println("| 0. Salir                                     |");
            System.out.println("------------------------------------------------");
            System.out.println("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("=============================================================================");
                    System.out.println("|                                 METAL                                     |");
                    System.out.println("=============================================================================");
                    System.out.println("| Los metales son elementos químicos caracterizados por su brillo, buena    |");
                    System.out.println("| conductividad eléctrica y térmica, así como por su capacidad de ceder     |");
                    System.out.println("| electrones para formar cationes. Son generalmente sólidos a temperatura   |");
                    System.out.println("| ambiente (excepto el mercurio), dúctiles, maleables y con alta densidad.  |");
                    System.out.println("| Forman enlaces metálicos y suelen presentar puntos de fusión elevados.    |");
                    System.out.println("=============================================================================");

                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("========================================================================");
                    System.out.println("|                              NO METAL                                |");
                    System.out.println("========================================================================");
                    System.out.println("| Los no metales son elementos que, a diferencia de los metales, no    |");
                    System.out.println("| conducen bien el calor ni la electricidad. Tienen tendencia a ganar  |");
                    System.out.println("| electrones para formar aniones o a compartirlos mediante enlaces     |");
                    System.out.println("| covalentes. Suelen encontrarse en estado sólido, líquido o gaseoso,  |");
                    System.out.println("| presentan baja densidad, no son maleables ni dúctiles, y carecen de  |");
                    System.out.println("| brillo metálico.                                                     |");
                    System.out.println("========================================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================");
                    System.out.println("|                  PROPIEDADES FÍSICAS Y QUÍMICAS                  |");
                    System.out.println("====================================================================");
                    System.out.println("| Comparación entre metales, no metales y metaloides según sus     |");
                    System.out.println("| propiedades físicas y periódicas más importantes:                |");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("| • Punto de fusión y ebullición:                                  |");
                    System.out.println("|   - Metales: generalmente altos.                                 |");
                    System.out.println("|   - No metales: por lo regular bajos (especialmente gases).      |");
                    System.out.println("|   - Metaloides: valores intermedios.                             |");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("| • Conductividad eléctrica y térmica:                             |");
                    System.out.println("|   - Metales: muy buena.                                          |");
                    System.out.println("|   - No metales: mala o nula.                                     |");
                    System.out.println("|   - Metaloides: semiconductores.                                 |");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("| • Electronegatividad:                                            |");
                    System.out.println("|   - Metales: baja (tienden a ceder electrones).                  |");
                    System.out.println("|   - No metales: alta (tienden a ganar electrones).               |");
                    System.out.println("|   - Metaloides: intermedia.                                      |");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("| • Formación de óxidos:                                           |");
                    System.out.println("|   - Metales: forman óxidos básicos.                              |");
                    System.out.println("|   - No metales: forman óxidos ácidos.                            |");
                    System.out.println("|   - Metaloides: suelen formar óxidos anfóteros.                  |");
                    System.out.println("====================================================================");

                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================================");
                    System.out.println("|                EJEMPLOS Y TENDENCIAS PERIÓDICAS                  |");
                    System.out.println("====================================================================");
                    System.out.println("| Ejemplos:                                                        |");
                    System.out.println("|   • Metales: Na, Fe, Cu, Al – brillantes, conductores y ceden    |");
                    System.out.println("|     electrones para formar cationes.                             |");
                    System.out.println("|   • No metales: O, S, N, Cl – gases o sólidos frágiles, con      |");
                    System.out.println("|     alta electronegatividad.                                     |");
                    System.out.println("|   • Metaloides: Si, Ge, As – conductividad intermedia, útiles    |");
                    System.out.println("|     en semiconductores.                                          |");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("| Tendencias periódicas:                                           |");
                    System.out.println("|   • Radio atómico: aumenta hacia abajo y hacia la izquierda.     |");
                    System.out.println("|   • Electronegatividad: aumenta hacia arriba y hacia la derecha. |");
                    System.out.println("|   • Energía de ionización: misma tendencia que la                |");
                    System.out.println("|     electronegatividad.                                          |");
                    System.out.println("|   • Carácter metálico: aumenta hacia abajo y hacia la izquierda. |");
                    System.out.println("====================================================================");
                    esperarMENU();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("==========================================");
                    System.out.println("|              BIBLIOGRAFÍA              |");
                    System.out.println("==========================================");
                    System.out.println("| - Petrucci et al., *General Chemistry* |");
                    System.out.println("| - Atkins, *Physical Chemistry*         |");
                    System.out.println("==========================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("---------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("---------------------");
                    esperarMENU();
                    limpiarPantalla();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    private static void TemaValencia1() {
        int OPCION = -1;
        while (OPCION != 0) {
            limpiarPantalla();
            System.out.println("======================================================");
            System.out.println("|        VALENCIA (CAPACIDAD DE COMBINACIÓN          |");
            System.out.println("======================================================");
            System.out.println("| 1. ¿Qué es la valencia?                            |");
            System.out.println("| 2. Ejemplos comunes y reglas (metales, no metales) |");
            System.out.println("| 3. Cómo se determinan                              |");
            System.out.println("| 4. Bibliografía                                    |");
            System.out.println("| 0. Salir                                           |");
            System.out.println("------------------------------------------------------");
            System.out.println("Elige una opción:");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=========================================================================");
                    System.out.println("|                              DEFINICIÓN                               |");
                    System.out.println("=========================================================================");
                    System.out.println("| La valencia es la capacidad combinatoria de un átomo, frecuentemente  |");
                    System.out.println("| igual al número de electrones compartidos, cedidos o ganados.         |");
                    System.out.println("=========================================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==============================================================================================");
                    System.out.println("|                                     EJEMPLOS COMUNES                                       |");
                    System.out.println("==============================================================================================");
                    System.out.println("| Ejemplo: Na (valencia 1), O (valencia 2 en muchos compuestos), C (valencia 4 en orgánica). |");
                    System.out.println("==============================================================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==========================================================================================");
                    System.out.println("|                                  COMO SE DETERMINAN                                    |");
                    System.out.println("==========================================================================================");
                    System.out.println("| Determinación: usar configuración electrónica y tendencias (grupo en tabla periódica). |");
                    System.out.println("==========================================================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("================================================================");
                    System.out.println("|                        BIBLIOGRAFÍA:                         |");
                    System.out.println("================================================================");
                    System.out.println("| - Silberberg, M. *Química*                                   |");
                    System.out.println("| - Atkins, P. *Physical Chemistry* (capítulos introductorios) |");
                    System.out.println("================================================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("------------------------");
                    System.out.println("| Saliendo del menú... |");
                    System.out.println("------------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("======================================");
                    System.out.println("| Opción no válida. Intenta de Nuevo |");
                    System.out.println("======================================");
                    esperarMENU();
            }
        }
    }

    private static void TemaElementosTransicion1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("======================================================================");
            System.out.println("|                      ELEMENTOS DE TRANSICIÓN                       |");
            System.out.println("======================================================================");
            System.out.println("| 1. Propiedades de los elementos de transición                      |");
            System.out.println("| 2. Números de oxidación de los principales elementos de transición |");
            System.out.println("| 3. Por qué varían sus números de oxidacion                         |");
            System.out.println("| 4. Bibliografía                                                    |");
            System.out.println("| 0. Salir                                                           |");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Selecciona una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();


            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================");
                    System.out.println("| PROPIEDADES DE LOS ELEMENTOS de TRANSMISIÓN |");
                    System.out.println("===============================================");
                    System.out.println("| Estados de oxidación múltiples              |");
                    System.out.println("| Propiedades magnéticas                      |");
                    System.out.println("| Actividad catalítica                        |");
                    System.out.println("| Formación de aleaciones                     |");
                    System.out.println("===============================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================");
                    System.out.println("|  NÚMEROS DE OXIDACIÓN PRINCIALES  |");
                    System.out.println("=====================================");
                    System.out.println("| Hierro (Fe): +2,+3,+6             |");
                    System.out.println("| Cobalto (Co): +2, +3              |");
                    System.out.println("| Níquel (Ni): +2, +3               |");
                    System.out.println("| Zinc (Zn): +2                     |");
                    System.out.println("| Titanio (Ti): +2, +3, +4          |");
                    System.out.println("=====================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=================================================================");
                    System.out.println("|            VARIACIÓN DE LOS NUMEROS DE OXIDACIÓN              |");
                    System.out.println("=================================================================");
                    System.out.println("| 1. Energías semejantes entre los orbitales ns y (n−1)d        |");
                    System.out.println("| 2. Estabilización del subnivel d según su ocupación           |");
                    System.out.println("| 3. Participación de los electrones d en enlaces con ligandos  |");
                    System.out.println("=================================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("===========================================");
                    System.out.println("|              BIBLIOGRAFÍA:              |");
                    System.out.println("===========================================");
                    System.out.println("| -Cotton, A. Química inorgánica básica   |");
                    System.out.println("| -Cotton, A. Química inorgánica avanzada |");
                    System.out.println("===========================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    private static void TemaEnergiaIonizacion1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("===========================================");
            System.out.println("|          ENERGÍA DE IONIZACIÓN          |");
            System.out.println("===========================================");
            System.out.println("| 1. Definición                           |");
            System.out.println("| 2. Factores que la afectan (Zef, radio) |");
            System.out.println("| 3. Ejemplos y variación periódica       |");
            System.out.println("| 4. Bibliografía                         |");
            System.out.println("| 0. Salir                                |");
            System.out.println("-------------------------------------------");
            System.out.println("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================================================");
                    System.out.println("|                                 DEFINICIÓN                                  |");
                    System.out.println("=============================================================================== ");
                    System.out.println("| La energía de ionización es la cantidad mínima de energía necesaria para    |");
                    System.out.println("| remover un electrón de un átomo o ión en estado gaseoso. Este proceso       |");
                    System.out.println("| produce un ion positivo (catión). La energía de ionización refleja qué tan  |");
                    System.out.println("| fuertemente un átomo mantiene a sus electrones externos.                    |");
                    System.out.println("=============================================================================== ");

                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==========================================================================");
                    System.out.println("|                         FACTORES QUE LA AFECTAN                        |");
                    System.out.println("==========================================================================");
                    System.out.println("| Carga nuclear efectiva (Zef), distancia al electrón (radio) y          |");
                    System.out.println("| apantallamiento de electrones internos.                                |");
                    System.out.println("==========================================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==========================================================================");
                    System.out.println("|               EJEMPLOS Y VARIACIÓN PERIÓDICA                           |");
                    System.out.println("==========================================================================");
                    System.out.println("| Tendencias: aumenta de izquierda a derecha; disminuye de arriba abajo. |");
                    System.out.println("| Excepciones menores por subniveles (ej. Be vs B).                      |");
                    System.out.println("==========================================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==================================");
                    System.out.println("|       BIBLIOGRAFÍA             |");
                    System.out.println("==================================");
                    System.out.println("| - Atkins, *Physical Chemistry* |");
                    System.out.println("| - Housecroft & Sharpe          |");
                    System.out.println("==================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    private static void TemaElectronesValencia1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("==================================================");
            System.out.println("|             ELECTRONES DE VALENCIA             |");
            System.out.println("==================================================");
            System.out.println("| 1. Definición                                  |");
            System.out.println("| 2. Cómo encontrarlos (Configuración y grupo    |");
            System.out.println("| 3. Importancia en enlaces y reactividad        |");
            System.out.println("| 4. Bibliografía                                |");
            System.out.println("| 0. Salir                                       |");
            System.out.println("--------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("========================================================");
                    System.out.println("|                     DEFINICIÓN                       |");
                    System.out.println("========================================================");
                    System.out.println("| Los electrones de valencia son los electrones que    |");
                    System.out.println("| se encuentran en la capa electrónica más externa     |");
                    System.out.println("| de un átomo. Estos electrones determinan su          |");
                    System.out.println("| reactividad química y participan directamente en la  |");
                    System.out.println("| formación de enlaces iónicos, covalentes o metálicos |");
                    System.out.println("| con otros átomos.                                    |");
                    System.out.println("========================================================");

                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===============================================================");
                    System.out.println("|            CÓMO USAR CONFIGURACIÓN ELECTRÓNICA              |");
                    System.out.println("===============================================================");
                    System.out.println("| Para elementos principales (s y p) el número de electrones  |");
                    System.out.println("| de valencia = número de electrones en s+p del último nivel. |");
                    System.out.println("===============================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==================================================");
                    System.out.println("|                   IMPORTANCIA                  |");
                    System.out.println("==================================================");
                    System.out.println("| Determinan la valencia, la reactividad química |");
                    System.out.println("| y el tipo de enlace (iónico/covalente).        |");
                    System.out.println("==================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================");
                    System.out.println("|                  BIBLIOGRAFÍA                    |");
                    System.out.println("====================================================");
                    System.out.println("| - Brown et al., *Chemistry: The Central Science* |");
                    System.out.println("| - Housecroft & Sharpe                            |");
                    System.out.println("====================================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    private static void TemaElectronesPerifericos1() {
        int OPCION = -1;
        while (OPCION != 0) {
            limpiarPantalla();
            System.out.println("============================================");
            System.out.println("|          ELECTRONES PERIFÉRICOS          |");
            System.out.println("============================================");
            System.out.println("| 1. ¿Qué son?                             |");
            System.out.println("| 2. Diferencia con electrones de valencia |");
            System.out.println("| 3. Ejemplos y casos especiales (d, f)    |");
            System.out.println("| 4. Bibliografía                          |");
            System.out.println("| 0. Salir                                 |");
            System.out.println("--------------------------------------------");
            System.out.println("Elige una opción:");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("==================================================================");
                    System.out.println("|                   ELECTRONES PERIFÉRICOS:                      |");
                    System.out.println("==================================================================");
                    System.out.println("| Son los electrones que se encuentran en las capas externas     |");
                    System.out.println("| del átomo, especialmente en el nivel energético más lejano.    |");
                    System.out.println("| Estos electrones determinan el comportamiento químico de un    |");
                    System.out.println("| elemento, ya que participan en enlaces, reacciones y           |");
                    System.out.println("| transferencia de electrones.                                   |");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("| También se relacionan con las propiedades periódicas como la   |");
                    System.out.println("| electronegatividad, energía de ionización y afinidad           |");
                    System.out.println("| electrónica.                                                   |");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("| Los electrones periféricos suelen coincidir con los            |");
                    System.out.println("| electrones de valencia, aunque en algunos contextos técnicos   |");
                    System.out.println("| pueden incluir electrones de capas cercanas si influyen en el  |");
                    System.out.println("| comportamiento químico.                                        |");
                    System.out.println("==================================================================");

                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===================================================================================");
                    System.out.println("|                       DIFERENCIA CON ELECTRONES DE VALENCIA                     |");
                    System.out.println("===================================================================================");
                    System.out.println("| Diferencia: a veces coinciden con electrones de valencia.                       |");
                    System.out.println("| En metales de transición, electrones d externos también pueden ser periféricos. |");
                    System.out.println("===================================================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================");
                    System.out.println("|               EJEMPLOS Y CASOS ESPECIALES (d, f)                 |");
                    System.out.println("====================================================================");
                    System.out.println("| Ejemplo: Fe (hierro) en compuestos puede usar electrones 4s y 3d |");
                    System.out.println("| periféricos en enlaces y formación de complejos.                 |");
                    System.out.println("====================================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==================================");
                    System.out.println("|          BIBLIOGRAFÍA:         |");
                    System.out.println("==================================");
                    System.out.println("| - Atkins, *Physical Chemistry* |");
                    System.out.println("| - Housecroft & Sharpe          |");
                    System.out.println("==================================");
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }


        }
    }

    private static void TemaAfinidadElectronica1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("=========================================================");
            System.out.println("|       AFINIDAD ELECTRÓNICA Y ELECTRONEGATIVIDAD       |");
            System.out.println("=========================================================");
            System.out.println("| 1. Afinidad electrónica (definición)                  |");
            System.out.println("| 2. Electronegatividad (definición y escalas: Pauling) |");
            System.out.println("| 3. Relación entre ambas y ejemplos                    |");
            System.out.println("| 4. Bibliografía                                       |");
            System.out.println("| 0. Salir                                              |");
            System.out.println("---------------------------------------------------------");
            System.out.println("Elige una opción");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("=========================================================");
                    System.out.println("|                 AFINIDAD ELECTRÓNICA:                 |");
                    System.out.println("=========================================================");
                    System.out.println("| Energía liberada (o requerida) cuando un átomo neutro |");
                    System.out.println("| en gas captura un electrón.                           |");
                    System.out.println("=========================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===============================================================");
                    System.out.println("|                     ELECTRONEGATIVIDAD                      |");
                    System.out.println("===============================================================");
                    System.out.println("| Medida adimensional de la capacidad de un átomo para atraer |");
                    System.out.println("| electrones en un enlace (Pauling es la escala más usada).   |");
                    System.out.println("===============================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("===================================================================");
                    System.out.println("|                             RELACIÓN                            |");
                    System.out.println("===================================================================");
                    System.out.println("| Mayor electronegatividad suele asociarse a afinidad electrónica |");
                    System.out.println("| más negativa (ganancia de e-), aunque no es idéntico.           |");
                    System.out.println("========================================================??=========");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("===============================================");
                    System.out.println("|                 BIBLIOGRAFÍA                |");
                    System.out.println("===============================================");
                    System.out.println("| - Pauling, L. *The Nature of Chemical Bond* |");
                    System.out.println("| - Atkins, *Physical Chemistry*              |");
                    System.out.println("===============================================");
                    esperarMENU();
                    break;
                case 0:
                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de Nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    private static void TemaConstruccionTablaPeriodica1() {
        int OPCION = -1;
        while (OPCION != 0){
            limpiarPantalla();
            System.out.println("====================================================================");
            System.out.println("|                CONSTRUCCIÓN DE LA TABLA PERIÓDICA                |");
            System.out.println("====================================================================");
            System.out.println("| 1. Mostrar resúmen                                               |");
            System.out.println("| 2. Mostrar criterios históricos (Mendeleiev, orden por Z)        |");
            System.out.println("| 3. Mostrar organización moderna(periodos, grupos, bloques spdf)  |");
            System.out.println("| 4. Mostrar tendencias periódicas principales                     |");
            System.out.println("| 5. Bibliografía                                                  |");
            System.out.println("| 0. Salir                                                         |");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Elige una opción:");

            if (!scanner.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                scanner.nextLine();
                continue;
            }


            OPCION = scanner.nextInt();
            scanner.nextLine();

            switch (OPCION){
                case 1:
                    limpiarPantalla();
                    System.out.println("=======================================================================");
                    System.out.println("|                               RESÚMEN                               |");
                    System.out.println("=======================================================================");
                    System.out.println("| La tabla periódica orgnaiza los elementos por su número atómico (Z) |");
                    System.out.println("| Permite observar propiedades priódicas y agrupar elementos con      |");
                    System.out.println("| comportamiento químico similar.                                     |");
                    System.out.println("=======================================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===============================================================================");
                    System.out.println("|                                  HISTORIA                                   |");
                    System.out.println("===============================================================================");
                    System.out.println("| La tabla periódica moderna es el resultado de siglos de estudio sobre los   |");
                    System.out.println("| elementos. Antes de Mendeleiev, varios científicos intentaron organizarlos  |");
                    System.out.println("| según sus propiedades, pero sin éxito completo.                             |");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("| En 1869, Dimitri Mendeleiev organizó los elementos conocidos según su masa  |");
                    System.out.println("| atómica y sus propiedades químicas. Incluso dejó espacios vacíos para los   |");
                    System.out.println("| elementos que aún no habían sido descubiertos, prediciendo sus propiedades. |");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("| Más adelante, Henry Moseley (1913) determinó que el orden correcto debía    |");
                    System.out.println("| basarse en el número atómico (Z), no en la masa. Esto corrigió anomalías y  |");
                    System.out.println("| permitió una clasificación más precisa.                                     |");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("| La tabla actual incorpora conceptos modernos como niveles de energía,       |");
                    System.out.println("| estructura electrónica y modelos cuánticos, lo que explica la periodicidad  |");
                    System.out.println("| de las propiedades de los elementos.                                        |");
                    System.out.println("===============================================================================");

                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=================================================");
                    System.out.println("|                 ORGANIZACIÓN                  |");
                    System.out.println("=================================================");
                    System.out.println("| Filas = Periodos (Niveles de energía)         |");
                    System.out.println("| Columnas = grupos (valencia similar)          |");
                    System.out.println("| Bloques: s, p, d, f según subniveles ocupados |");
                    System.out.println("=================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("=========================");
                    System.out.println("|       TENDENCIAS      |");
                    System.out.println("=========================");
                    System.out.println("| Radio Atómico         |");
                    System.out.println("| Energía de Ionización |");
                    System.out.println("| Electronegatividad    |");
                    System.out.println("| Afinidad Electrónica  |");
                    System.out.println("| Carácter Metálico     |");
                    System.out.println("=========================");
                    esperarMENU();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("============================================");
                    System.out.println("               BIBLIOGARFÍA                |");
                    System.out.println("============================================");
                    System.out.println("- Petrucci et al., Química General         |");
                    System.out.println("- Housecroft & Sharpe, Inorganic Chemistry |");
                    System.out.println("============================================");
                    esperarMENU();
                    break;
                case 0:

                    System.out.println("--------------------");
                    System.out.println("Saliendo del menú...");
                    System.out.println("--------------------");
                    esperarMENU();
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opción no válida. Intenta de nuevo");
                    System.out.println("----------------------------------");
                    esperarMENU();
            }
        }
    }

    public static void MenuUnidad3() {
        limpiarPantalla();
        System.out.println("================================================");
        System.out.println("|        UNIDAD 3 - ESTRUCTURA ATÓMICA         |");
        System.out.println("================================================");
        System.out.println("| 1. Afinidad electrónica y electronegatividad |");
        System.out.println("| 2. Contrucción de la tabla periódica         |");
        System.out.println("| 3. Electrones periféricos                    |");
        System.out.println("| 4. Electrones de valencia                    |");
        System.out.println("| 5. Electrones de transición                  |");
        System.out.println("| 6. Energía de ionización                     |");
        System.out.println("| 7. Metal y no metal                          |");
        System.out.println("| 8. Valencia                                  |");
        System.out.println("| 9. Radio atómico                             |");
        System.out.println("| 10. Propiedades periódicas                   |");
        System.out.println("| 11. Números de oxidación                     |");
        System.out.println("| 0. Volver al menú de unidades                |");
        System.out.println("------------------------------------------------");
        System.out.println("Selecciona una opción:");
    }

    public static void esperarMENU(){
        System.out.println(" ");
        System.out.println("================================");
        System.out.println("| Presiona Enter para regresar |");
        System.out.println("================================");
        scanner.nextLine();
    }
    public static int ValidarNum(){
        while (true){
            if (scanner.hasNextInt()){
                int N = scanner.nextInt();
                scanner.nextLine();
                return N;
            }
            else{
                System.out.println("-----------------------------------------------------");
                System.out.println("ENTRADA NO VÁLIDA. FAVOR DE INGRESAR UN NÚMERO ENTERO");
                System.out.println("-----------------------------------------------------");
                scanner.next();
            }
        }
    }


    public static void menuUnidad4() {
        int opcionSubtema=1;

        do {
            limpiarPantalla();
            System.out.println("=============================================================");
            System.out.println("|                 UNIDAD 4 - ENLACE QUÍMICO                 |");
            System.out.println("=============================================================");
            System.out.println("| 1. Enlace Químico                                         |");
            System.out.println("| 2. Enlace iónico                                          |");
            System.out.println("| 3. Enlace covalente                                       |");
            System.out.println("| 4. Tipos de covalencia                                    |");
            System.out.println("| 5. Enlace dativo                                          |");
            System.out.println("| 6. Enlaces especiales                                     |");
            System.out.println("| 7. Hibridación                                            |");
            System.out.println("| 8. Propiedades de las sustancias derivadas de tipo enlace |");
            System.out.println("| 0. Volver al menú de unidades                             |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcionSubtema = sc.nextInt();
            sc.nextLine();

            switch (opcionSubtema) {
                case 1:
                    TemaEnlaceQuimico();
                    break;
                case 2:
                    TemaEnlaceIonico();
                    break;
                case 3:
                    TemaEnlaceCovalente();
                    break;
                case 4:
                    TemaTiposdeCovalencia();
                    break;
                case 5:
                    TemaEnlacesDativos();
                    break;
                case 6:
                    TemaEnlacesEspeciales();
                    break;
                case 7:
                    TemaHibridacion();
                    break;
                case 8:
                    TemaPropiedadesSustancias();
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("=========================");
                    System.out.println("| Regresando al menú... |");
                    System.out.println("=========================");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }
        } while (opcionSubtema != 0);
    }

    public static void TemaEnlaceQuimico() {
        int opcion=-1;

        do {
            limpiarPantalla();
            System.out.println("============================================================");
            System.out.println("|                    ENLACE QUÍMICO                        |");
            System.out.println("============================================================");
            System.out.println("| 1. Definición                                            |");
            System.out.println("| 2. Importancia                                           |");
            System.out.println("| 3. Bibliografía                                          |");
            System.out.println("| 0. Salir                                                 |");
            System.out.println("============================================================");
            System.out.println("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("========================================================================================================================");
                    System.out.println("|                                               ENLACE QUÍMICO                                                         |");
                    System.out.println("========================================================================================================================");
                    System.out.println("| Un enlace químico es la fuerza de atracción que mantiene unidos a dos o más átomos para formar un compuesto estable. |");
                    System.out.println("| Esta unión se logra mediante la transferencia total o parcial de electrones,                                         |");
                    System.out.println("| lo que permite que los átomos alcancen una configuración electrónica estable, similar a la de un gas noble.          |");
                    System.out.println("========================================================================================================================");
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("=========================================================================================");
                    System.out.println("|                       IMPORTANCIA DEL ENLACE QUÍMICO                                  |");
                    System.out.println("=========================================================================================");
                    System.out.println("| Es fundamental para formar moléculas y compuestos que constituyen toda la materia.    |");
                    System.out.println("| Sin los enlaces químicos no existirían sustancias como el agua, sales o proteínas.    |");
                    System.out.println("=========================================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("==============================================================");
                    System.out.println("|                       BIBLIOGRAFÍA                         |");
                    System.out.println("==============================================================");
                    System.out.println("| - Chang, R. (2010). Química. McGraw-Hill.                  |");
                    System.out.println("| - Zumdahl, S. (2018). Química General. Cengage Learning.   |");
                    System.out.println("| - Petrucci, R. (2017). Química General. Pearson.           |");
                    System.out.println("==============================================================");
                    break;


                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
            }

            if (opcion != 0) esperarTecla();

        } while (opcion != 0);
    }


    public static void TemaEnlaceIonico() {
        int opcion= -1;

        do {
            limpiarPantalla();
            System.out.println("======================================");
            System.out.println("|            ENLACE IÓNICO           |");
            System.out.println("======================================");
            System.out.println("|1. Definición                       |");
            System.out.println("|2. Ejemplo                          |");
            System.out.println("|3. Bibliografía                     |");
            System.out.println("|0. Salir                            |");
            System.out.println("--------------------------------------");
            System.out.println("Selecciona una opciÓn: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("============================================================================================================");
                    System.out.println("|                                           DEFINICIÓN                                                     |");
                    System.out.println("============================================================================================================");
                    System.out.println("| Un enlace iónico es un tipo de enlace químico que se forma por la atracción electrostática               |");
                    System.out.println("| entre iones de carga opuesta, un catión (ión positivo) y un anión (ión negativo).                        |");
                    System.out.println("| Este enlace se crea cuando un átomo metálico transfiere electrones de valencia a un átomo no metálico,   |");
                    System.out.println("| produciendo una diferencia significativa en su electronegatividad, mayor a 1.7.                          |");
                    System.out.println("============================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("================================================================================");
                    System.out.println("|                                     EJEMPLO                                  |");
                    System.out.println("================================================================================");
                    System.out.println("| Electronegatividad Na: 0.9                                                   |");
                    System.out.println("| Electronegatividad Cl: 3.1                                                   |");
                    System.out.println("| Diferencia de electronegatividad: 3.1-0.9= 2.2                               |");
                    System.out.println("| El sodio (Na) cede un electrón al cloro (Cl), formando NaCl (sal de mesa).   |");
                    System.out.println("================================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("========================================================================================");
                    System.out.println("|                                   BIBLIOGRAFÍA                                       |");
                    System.out.println("========================================================================================");
                    System.out.println("| - Kotz, J. C., Treichel, P. (2015). Química y Reactividad Química. Cengage Learning. |");
                    System.out.println("| - Chang, R. (2010). Química. McGraw-Hill.                                            |");
                    System.out.println("========================================================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }


    public static void TemaEnlaceCovalente() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("================================");
            System.out.println("|       ENLACE COVALENTE       |");
            System.out.println("================================");
            System.out.println("| 1. Definición                |");
            System.out.println("| 2. Tipos de moléculas        |");
            System.out.println("| 3. Bibliografía              |");
            System.out.println("| 0. Salir                     |");
            System.out.println("--------------------------------");
            System.out.println("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("================================================================================================================================");
                    System.out.println("|                                            ENLACE COVALENTE                                                                  |");
                    System.out.println("================================================================================================================================");
                    System.out.println("| Un enlace covalente es un tipo de enlace químico en el que dos átomos comparten electrones para formar una molécula,         |");
                    System.out.println("| logrando así alcanzar una mayor estabilidad. Se produce generalmente entre átomos no metálicos y se basa en la compartición  |");
                    System.out.println("| de uno o más pares de electrones de valencia.                                                                                |");
                    System.out.println("================================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==============================================================================");
                    System.out.println("|                                   EJEMPLO                                  |");
                    System.out.println("==============================================================================");
                    System.out.println("| Ejemplo: El H₂O (agua) tiene enlaces covalentes entre hidrógeno y oxígeno. |");
                    System.out.println("| Existen moléculas polares (HCl) y no polares (O₂).                         |");
                    System.out.println("==============================================================================");
                    esperarTecla();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("===============================================================");
                    System.out.println("|                         BIBLIOGRAFÍA                        |");
                    System.out.println("===============================================================");
                    System.out.println("| - Brown, T. (2014). Química: La Ciencia Central. Pearson.   |");
                    System.out.println("| - Zumdahl, S. (2018). Química General. Cengage Learning.    |");
                    System.out.println("===============================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();

            }

        } while (opcion != 0);
    }

    public static void TemaTiposdeCovalencia() {
        int opcion= -1;
        do {
            limpiarPantalla();
            System.out.println("========================================");
            System.out.println("|              COVALENCIA              |");
            System.out.println("========================================");
            System.out.println("|1. Covalencia simple                  |");
            System.out.println("|2. Covalencia doble                   |");
            System.out.println("|3. Covalencia triple                  |");
            System.out.println("|4. Bibliografía                       |");
            System.out.println("|0. Salir                              |");
            System.out.println("----------------------------------------");
            System.out.println("Elige una opción:                     ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================================================================");
                    System.out.println("|                                   COVALENCIA SIMPLE                                         |");
                    System.out.println("===============================================================================================");
                    System.out.println("| La covalencia simple ocurre cuando dos átomos comparten UN solo par de electrones.          |");
                    System.out.println("| Este tipo de enlace es común en moléculas estables y pequeñas.                              |");
                    System.out.println("| - Fuerza del enlace: Moderada                                                               |");
                    System.out.println("| - Longitud del enlace: Mayor que en doble o triple                                          |");
                    System.out.println("|                                                                                             |");
                    System.out.println("| Ejemplos:                                                                                   |");
                    System.out.println("| - H—H  (H₂)                                                                                 |");
                    System.out.println("| - H—Cl (HCl)                                                                                |");
                    System.out.println("| - F—F  (F₂)                                                                                 |");
                    System.out.println("===============================================================================================");
                    esperarTecla();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("===============================================================================================");
                    System.out.println("|                                   COVALENCIA DOBLE                                          |");
                    System.out.println("===============================================================================================");
                    System.out.println("| En la covalencia doble, los átomos comparten DOS pares de electrones.                       |");
                    System.out.println("| Esto hace que el enlace sea más fuerte y más corto que un enlace simple.                    |");
                    System.out.println("| - Fuerza del enlace: Alta                                                                   |");
                    System.out.println("| - Longitud del enlace: Menor que la simple                                                  |");
                    System.out.println("|                                                                                             |");
                    System.out.println("| Ejemplos:                                                                                   |");
                    System.out.println("| - O=O  (O₂)                                                                                 |");
                    System.out.println("| - CO2  (O=C=O)                                                                              |");
                    System.out.println("===============================================================================================");
                    esperarTecla();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("===============================================================================================");
                    System.out.println("|                                   COVALENCIA TRIPLE                                         |");
                    System.out.println("===============================================================================================");
                    System.out.println("| En la covalencia triple, los átomos comparten TRES pares de electrones.                     |");
                    System.out.println("| Es el enlace covalente más fuerte y también el más corto de los tres tipos.                 |");
                    System.out.println("| - Fuerza del enlace: Muy alta                                                               |");
                    System.out.println("| - Longitud del enlace: Muy corta                                                            |");
                    System.out.println("|                                                                                             |");
                    System.out.println("| Ejemplos:                                                                                   |");
                    System.out.println("| - N≡N  (N₂)                                                                                 |");
                    System.out.println("| - C≡C  (Alquinos como el etino: HC≡CH)                                                      |");
                    System.out.println("===============================================================================================");
                    esperarTecla();
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("==============================================================");
                    System.out.println("|                         BIBLIOGRAFÍA                       |");
                    System.out.println("==============================================================");
                    System.out.println("| - Atkins, P. (2015). Principios de Química. Panamericana.  |");
                    System.out.println("| - Chang, R. (2010). Química. McGraw-Hill.                  |");
                    System.out.println("| - Petrucci, R. (2017). Química General. Pearson.           |");
                    System.out.println("==============================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }

    public static void TemaEnlacesDativos() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=============================");
            System.out.println("|       ENLACE DATIVO       |");
            System.out.println("=============================");
            System.out.println("| 1. Definición             |");
            System.out.println("| 2. Ejemplo                |");
            System.out.println("| 3. Bibliografía           |");
            System.out.println("| 0.  Salir                 |");
            System.out.println("-----------------------------");
            System.out.println("Selecciona una opción:  ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("===============================================================================================");
                    System.out.println("|                                      DEFINICIÓN                                             |");
                    System.out.println("===============================================================================================");
                    System.out.println("| Un enlace dativo, también llamado enlace coordinado, es un tipo de enlace covalente donde   |");
                    System.out.println("| ambos electrones del par compartido son aportados por un solo átomo.                        |");
                    System.out.println("|                                                                                             |");
                    System.out.println("| Una vez formado, el enlace es indistinguible de un enlace covalente normal.                 |");
                    System.out.println("| Se presenta comúnmente cuando un átomo con un par de electrones libres se une a un átomo    |");
                    System.out.println("| deficiente de electrones o con un orbital vacío.                                            |");
                    System.out.println("===============================================================================================");
                    esperarTecla();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("===============================================================================================");
                    System.out.println("|                                     EJEMPLOS Y EXPLICACIÓN                                  |");
                    System.out.println("===============================================================================================");
                    System.out.println("| ► Ejemplo principal: Ion amonio (NH₄⁺).                                                     |");
                    System.out.println("|                                                                                             |");
                    System.out.println("|   - El NH₃ posee un par solitario en el nitrógeno.                                          |");
                    System.out.println("|   - Un protón (H⁺) no tiene electrones propios.                                             |");
                    System.out.println("|   - El nitrógeno dona su par solitario para formar un enlace con el H⁺.                     |");
                    System.out.println("|                                                                                             |");
                    System.out.println("|                       H                                                                     |");
                    System.out.println("|                      /                                                                      |");
                    System.out.println("|                H — N — H                                                                    |");
                    System.out.println("|                    "+ "\\ \\ " + "    ← par donado por el N                                            |");
                    System.out.println("|                       H                                                                     |");
                    System.out.println("|                                                                                             |");
                    System.out.println("| ► Otros ejemplos importantes:                                                               |");
                    System.out.println("|   - Complejo BF₃·NH₃ (amoníaco-diborano).                                                   |");
                    System.out.println("|   - Complejos metálicos (ligandos → metales).                                               |");
                    System.out.println("|   - Oxonio (H3O⁺), donde el oxígeno dona un par al H⁺.                                      |");
                    System.out.println("===============================================================================================");
                    esperarTecla();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("==============================================================");
                    System.out.println("|                         BIBLIOGRAFÍA                       |");
                    System.out.println("==============================================================");
                    System.out.println("| - Chang, R. (2010). Química. McGraw-Hill.                  |");
                    System.out.println("| - Petrucci, R. (2017). Química General. Pearson.           |");
                    System.out.println("| - Atkins, P. (2015). Principios de Química. Panamericana.  |");
                    System.out.println("==============================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }

    public static void TemaEnlacesEspeciales() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=========================================");
            System.out.println("| PUENTE DE HIDRÓGENO Y ENLACE METÁLICO |");
            System.out.println("=========================================");
            System.out.println("| 1. Puente de hidrógeno                |");
            System.out.println("| 2. Ejemplo de puente de hidrógeno     |");
            System.out.println("| 3. Enlace metálico                    |");
            System.out.println("| 4. Ejemplo enlace metálico            |");
            System.out.println("| 5. Bibliografía                       |");
            System.out.println("| 0. Salir                              |");
            System.out.println("-----------------------------------------");
            System.out.println("Seleccione una opción:           ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================");
                    System.out.println("|                                     PUENTE DE HIDRÓGENO                                                 |");
                    System.out.println("===========================================================================================================");
                    System.out.println("| Un puente de hidrógeno es una fuerza de atracción intermolecular que ocurre cuando un átomo de          |");
                    System.out.println("| hidrógeno, unido covalentemente a un átomo muy electronegativo (como O, N o F), es atraído por otro     |");
                    System.out.println("| átomo electronegativo cercano.                                                                          |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Características:                                                                                        |");
                    System.out.println("| - Es más fuerte que las fuerzas de Van der Waals pero más débil que un enlace covalente.                |");
                    System.out.println("| - Responsable de propiedades únicas como el alto punto de ebullición del agua.                          |");
                    System.out.println("| - Fundamental para las estructuras del ADN y proteínas.                                                 |");
                    System.out.println("===========================================================================================================");
                    esperarTecla();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================");
                    System.out.println("|                            EJEMPLO DE PUENTE DE HIDRÓGENO                                               |");
                    System.out.println("===========================================================================================================");
                    System.out.println("| En el agua (H₂O), los átomos de oxígeno poseen carga parcial negativa (δ–) y los hidrógenos carga       |");
                    System.out.println("| parcial positiva (δ+).                                                                                  |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Cuando varias moléculas de agua se acercan, el hidrógeno de una se atrae al oxígeno de otra, formando   |");
                    System.out.println("| un puente de hidrógeno.                                                                                 |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("|   H–O···H–O···H–O                                                                                       |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Este tipo de interacción es lo que permite que el agua tenga:                                           |");
                    System.out.println("| - Alta tensión superficial                                                                              |");
                    System.out.println("| - Punto de ebullición anormalmente alto                                                                 |");
                    System.out.println("| - Estructura sólida menos densa (hielo flota)                                                           |");
                    System.out.println("===========================================================================================================");
                    esperarTecla();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================");
                    System.out.println("|                                        ENLACE METÁLICO                                                  |");
                    System.out.println("===========================================================================================================");
                    System.out.println("| El enlace metálico se da entre átomos de metales. Consiste en una red ordenada de cationes metálicos    |");
                    System.out.println("| rodeados por una 'nube' de electrones deslocalizados que pueden moverse libremente.                     |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Características principales:                                                                            |");
                    System.out.println("| - Alta conductividad eléctrica y térmica                                                                |");
                    System.out.println("| - Maleabilidad y ductilidad                                                                             |");
                    System.out.println("| - Brillo metálico                                                                                       |");
                    System.out.println("| - Fuerza del enlace depende del número de electrones deslocalizados                                     |");
                    System.out.println("===========================================================================================================");
                    esperarTecla();
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================");
                    System.out.println("|                                  EJEMPLO DE ENLACE METÁLICO                                             |");
                    System.out.println("===========================================================================================================");
                    System.out.println("| En un metal como el hierro (Fe), cobre (Cu) o plata (Ag), los átomos pierden sus electrones de          |");
                    System.out.println("| valencia, que se deslocalizan formando una nube electrónica alrededor de una red de cationes.           |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| La nube electrónica actúa como un 'pegamento' que mantiene unidos a los átomos.                         |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Representación simplificada:                                                                            |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("|   [Fe]⁺   [Fe]⁺   [Fe]⁺                                                                                 |");
                    System.out.println("|     \\ \\    |     /                                                                                      |");
                    System.out.println("|      ~~~~~~ nube de electrones ~~~~~                                                                    |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Esta estructura explica:                                                                                |");
                    System.out.println("| - Que los metales conduzcan electricidad (electrones móviles)                                           |");
                    System.out.println("| - Que sean maleables (las capas se deslizan sin romper el enlace)                                       |");
                    System.out.println("===========================================================================================================");
                    esperarTecla();
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("==============================================================");
                    System.out.println("|                         BIBLIOGRAFÍA                       |");
                    System.out.println("==============================================================");
                    System.out.println("| - Petrucci, R. (2017). Química General. Pearson.           |");
                    System.out.println("| - Chang, R. (2010). Química. McGraw-Hill.                  |");
                    System.out.println("| - Atkins, P. (2015). Principios de Química. Panamericana.  |");
                    System.out.println("==============================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }


    public static void TemaHibridacion() {
        int opcion= -1;
        do {
            limpiarPantalla();
            System.out.println("==============================");
            System.out.println("|        HIBRIDACIÓN         |");
            System.out.println("==============================");
            System.out.println("| 1. Concepto                |");
            System.out.println("| 2. Tipos de hibridación    |");
            System.out.println("| 3. Bibliografía            |");
            System.out.println("| 0. Salir                   |");
            System.out.println("------------------------------");
            System.out.println("Seleccione una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================");
                    System.out.println("|                                           CONCEPTO DE HIBRIDACIÓN                                       |");
                    System.out.println("===========================================================================================================");
                    System.out.println("| La hibridación es un modelo que explica cómo los átomos reorganizan sus orbitales atómicos para         |");
                    System.out.println("| formar nuevos orbitales de igual energía llamados *orbitales híbridos*.                                 |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| Estos orbitales híbridos permiten explicar:                                                             |");
                    System.out.println("|  - La geometría molecular.                                                                              |");
                    System.out.println("|  - Los ángulos de enlace.                                                                               |");
                    System.out.println("|  - La formación de enlaces sigma (σ).                                                                   |");
                    System.out.println("|                                                                                                         |");
                    System.out.println("| La hibridación NO ocurre físicamente; es un modelo matemático útil para describir la estructura.        |");
                    System.out.println("===========================================================================================================");
                    esperarTecla();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                        TIPOS DE HIBRIDACIÓN                                                       |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("| 1) sp  → LINEAL (180°)                                                                                            |");
                    System.out.println("|    - Se mezclan 1 orbital s + 1 orbital p.                                                                        |");
                    System.out.println("|    - Geometría: lineal.                                                                                           |");
                    System.out.println("|    - Ejemplo: BeCl₂, CO₂.                                                                                         |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| 2) sp² → TRIGONAL PLANA (120°)                                                                                    |");
                    System.out.println("|    - Se mezclan 1 s + 2 p.                                                                                        |");
                    System.out.println("|    - Geometría: trigonal plana.                                                                                   |");
                    System.out.println("|    - Ejemplo: BF₃, el carbono del eteno (C₂H₄).                                                                   |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| 3) sp³ → TETRAÉDRICA (109.5°)                                                                                     |");
                    System.out.println("|    - Se mezclan 1 s + 3 p.                                                                                        |");
                    System.out.println("|    - Geometría: tetraédrica.                                                                                      |");
                    System.out.println("|    - Ejemplo: CH₄ (metano).                                                                                       |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| 4) sp³d → BIPIRAMIDAL TRIGONAL                                                                                    |");
                    System.out.println("|    - Geometría: 90° y 120°.                                                                                       |");
                    System.out.println("|    - Ejemplo: PCl₅.                                                                                               |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| 5) sp³d² → OCTAHÉDRICA                                                                                            |");
                    System.out.println("|    - Geometría: 90°.                                                                                              |");
                    System.out.println("|    - Ejemplo: SF₆.                                                                                                |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("===================================================================================================================");
                    System.out.println("|                                              BIBLIOGRAFÍA                                                       |");
                    System.out.println("===================================================================================================================");
                    System.out.println("| - Brown, T. (2014). *Química: La Ciencia Central*. Pearson.                                                     |");
                    System.out.println("| - Atkins, P. (2015). *Principios de Química*. Editorial Médica Panamericana.                                    |");
                    System.out.println("| - Chang, R. (2010). *Química*. McGraw-Hill.                                                                     |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                              |");
                    System.out.println("===================================================================================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }

    public static void TemaPropiedadesSustancias() {
        int opcion=-1;
        do {
            limpiarPantalla();
            System.out.println("=================================");
            System.out.println("| PROPIEDADES DE LAS SUSTANCIAS |");
            System.out.println("=================================");
            System.out.println("| 1. Punto de fusión            |");
            System.out.println("| 2. Solubilidad                |");
            System.out.println("| 3. Conductividad eléctrica    |");
            System.out.println("| 4. Bibliografía               |");
            System.out.println("| 0. Salir                      |");
            System.out.println("---------------------------------");
            System.out.println("Seleccione una opción:     ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarTecla();
                sc.nextLine();  // Descartar entrada incorrecta
                continue;
            }

            // LEER SOLO UNA VEZ
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================");
                    System.out.println("|                                             PUNTO DE FUSIÓN                                                        |");
                    System.out.println("======================================================================================================================");
                    System.out.println("| El punto de fusión es la temperatura a la cual una sustancia cambia de sólido a líquido.                           |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| Depende principalmente de:                                                                                         |");
                    System.out.println("|  - La fuerza del enlace químico.                                                                                   |");
                    System.out.println("|  - La estructura cristalina.                                                                                       |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| Tendencias generales:                                                                                              |");
                    System.out.println("|  • ENLACES IÓNICOS → puntos de fusión MUY altos (ej.: NaCl ~ 801°C).                                               |");
                    System.out.println("|  • ENLACES METÁLICOS → moderados a altos según el metal.                                                           |");
                    System.out.println("|  • COVALENTES MOLECULARES → puntos bajos (ej.: hielo, CO₂ sólido).                                                 |");
                    System.out.println("|  • REDES COVALENTES → extremadamente altos (diamante, SiO₂).                                                       |");
                    System.out.println("======================================================================================================================");
                    esperarTecla();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("===================================================================================================================");
                    System.out.println("|                                                  SOLUBILIDAD                                                    |");
                    System.out.println("===================================================================================================================");
                    System.out.println("| La solubilidad es la capacidad de una sustancia para disolverse en un solvente.                                 |");
                    System.out.println("|                                                                                                                 |");
                    System.out.println("| Regla general:"+ "Lo semejante disuelve a lo semejante."  + "                                                             |");
                    System.out.println("|                                                                                                                 |");
                    System.out.println("| • Sustancias POLARES → se disuelven en solventes polares (agua).                                                |");
                    System.out.println("|   Ejemplo: sales, alcoholes pequeños, compuestos iónicos.                                                       |");
                    System.out.println("|                                                                                                                 |");
                    System.out.println("| • Sustancias NO POLARES → se disuelven en solventes no polares (gasolina, hexano).                              |");
                    System.out.println("|   Ejemplo: grasas, aceites, gases no polares.                                                                   |");
                    System.out.println("|                                                                                                                 |");
                    System.out.println("| Factores que influyen en la solubilidad:                                                                        |");
                    System.out.println("|   - Temperatura                                                                                                 |");
                    System.out.println("|   - Polaridad                                                                                                   |");
                    System.out.println("|   - Presión (especialmente en gases)                                                                            |");
                    System.out.println("===================================================================================================================");
                    esperarTecla();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("=====================================================================================================================");
                    System.out.println("|                                           CONDUCTIVIDAD ELÉCTRICA                                                 |");
                    System.out.println("=====================================================================================================================");
                    System.out.println("| La conductividad eléctrica es la capacidad de un material para permitir el paso de electrones o iones.            |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| • METALES → excelente conductividad debido al 'mar de electrones'.                                                |");
                    System.out.println("|   Ejemplos: cobre, plata, aluminio.                                                                               |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| • COMPUESTOS IÓNICOS → conducen SOLO cuando:                                                                      |");
                    System.out.println("|      - Están fundidos (estado líquido).                                                                           |");
                    System.out.println("|      - Están disueltos en agua (iones libres).                                                                    |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| • SUSTANCIAS COVALENTES MOLECULARES → casi no conducen (no poseen cargas móviles).                                |");
                    System.out.println("|   Ejemplos: azúcar, agua pura, alcohol.                                                                           |");
                    System.out.println("|                                                                                                                   |");
                    System.out.println("| • SEMICONDUCTORES → conducen moderadamente y dependen de dopaje o temperatura.                                    |");
                    System.out.println("|   Ejemplos: silicio, germanio.                                                                                    |");
                    System.out.println("=====================================================================================================================");
                    esperarTecla();
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("=================================================================================================================");
                    System.out.println("|                                               BIBLIOGRAFÍA                                                    |");
                    System.out.println("=================================================================================================================");
                    System.out.println("| - Brown, T. (2014). *Química: La Ciencia Central*. Pearson.                                                   |");
                    System.out.println("| - Atkins, P. (2015). *Principios de Química*. Editorial Médica Panamericana.                                  |");
                    System.out.println("| - Chang, R. (2010). *Química*. McGraw-Hill.                                                                   |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                            |");
                    System.out.println("=================================================================================================================");
                    esperarTecla();
                    break;

                case 0:
                    System.out.println("\n===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);
    }

    public static void menuUnidad5(){

        int opcion = -1;

        while (opcion != 0) {
            limpiarPantalla();

            System.out.println("==============================================");
            System.out.println("| UNIDAD 5 - NOMENCLATURA QUÍMICA INORGÁNICA |");
            System.out.println("==============================================");
            System.out.println("| 1. Hidruros metálicos                      |");
            System.out.println("| 2. Hidruros no metálicos                   |");
            System.out.println("| 3. Nomenclatura inorgánica                 |");
            System.out.println("| 4. Determinación de números de oxidación   |");
            System.out.println("| 5. Óxidos metálicos                        |");
            System.out.println("| 6. Óxidos no metálicos                     |");
            System.out.println("| 7. Oxoácidos                               |");
            System.out.println("| 8. Oxosales                                |");
            System.out.println("| 9. Sales ácidas                            |");
            System.out.println("| 10. Sales binarias                         |");
            System.out.println("| 0. Salir                                   |");
            System.out.println("==============================================");
            System.out.print("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                sc.nextLine();
                continue;
            }


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: temaHidrurosMetalicos1(); break;
                case 2: temaHidrurosNoMetalicos1(); break;
                case 3: temaNomenclaturaInorganica1(); break;
                case 4: temaDeterminacionNO1(); break;
                case 5: temaOxidosMetalicos1(); break;
                case 6: temaOxidosNoMetalicos1(); break;
                case 7: temaOxoacidos1(); break;
                case 8: temaOxosales1(); break;
                case 9: temaSalesAcidas1(); break;
                case 10: temaSalesBinarias1(); break;
                case 0: {
                    System.out.println("\n");
                    System.out.println("=========================");
                    System.out.println("| Regresando al menú... |");
                    System.out.println("=========================");
                    esperarMENU();
                    break;
                }
                default :
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
            }
        }
    }

    public static void temaHidrurosMetalicos1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=============================================================");
            System.out.println("|                     HIDRUROS METÁLICOS                    |");
            System.out.println("=============================================================");
            System.out.println("| 1. Definición                                             |");
            System.out.println("| 2. Ejemplos                                               |");
            System.out.println("| 3. Bibliografía                                           |");
            System.out.println("| 0. Salir                                                  |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================================================================");
                    System.out.println("|                                                  DEFINICIÓN DE HIDRUROS METÁLICOS                                       |");
                    System.out.println("===========================================================================================================================");
                    System.out.println("| Los hidruros metálicos son compuestos formados por:                                                                     |");
                    System.out.println("|   • Un metal (generalmente alcalinos, alcalinotérreos o metales de transición).                                         |");
                    System.out.println("|   • Hidrógeno actuando con número de oxidación -1 (ión hidruro H⁻).                                                     |");
                    System.out.println("|                                                                                                                         |");
                    System.out.println("| Características principales:                                                                                            |");
                    System.out.println("|   - Suelen ser sólidos cristalinos.                                                                                     |");
                    System.out.println("|   - Son buenos agentes reductores.                                                                                      |");
                    System.out.println("|   - Algunos reaccionan violentamente con agua liberando hidrógeno.                                                      |");
                    System.out.println("|                                                                                                                         |");
                    System.out.println("| Ejemplo de reacción típica:                                                                                             |");
                    System.out.println("|       CaH₂ + 2H₂O  →  Ca(OH)₂ + 2H₂↑                                                                                    |");
                    System.out.println("===========================================================================================================================");
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("=================================================================================================");
                    System.out.println("|                                         EJEMPLOS DE HIDRUROS                                  |");
                    System.out.println("=================================================================================================");
                    System.out.println("| • NaH   → Hidruro de sodio: muy reactivo con agua.                                            |");
                    System.out.println("| • LiH   → Hidruro de litio: estable, usado como reductor.                                     |");
                    System.out.println("| • CaH₂  → Hidruro de calcio: común en deshidratación de solventes.                            |");
                    System.out.println("| • MgH₂  → Hidruro de magnesio: estudiado para almacenamiento de hidrógeno.                    |");
                    System.out.println("|                                                                                               |");
                    System.out.println("| Metales de transición:                                                                        |");
                    System.out.println("| • PdHₓ  → El paladio puede absorber hidrógeno dentro de su red cristalina.                     |");
                    System.out.println("=================================================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("=========================================================");
                    System.out.println("|                    BIBLIOGRAFÍA                       |");
                    System.out.println("=========================================================");
                    System.out.println("| 1. IUPAC (2022). Nomenclature of Inorganic Chemistry. |");
                    System.out.println("| 2. Chang, R. (Química). McGraw-Hill.                  |");
                    System.out.println("| 3. Greenwood & Earnshaw. Chemistry of the Elements.   |");
                    System.out.println("=========================================================");
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("=========================");
                    System.out.println("| Regresando al menú... |");
                    System.out.println("=========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    break;
            }

            if (opcion != 0) esperarMENU();

        } while (opcion != 0);
    }

    public static void temaHidrurosNoMetalicos1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=====================================================================");
            System.out.println("|                        HIDRUROS NO METÁLICOS                      |");
            System.out.println("=====================================================================");
            System.out.println("| 1. Definición                                                     |");
            System.out.println("| 2. Formación                                                      |");
            System.out.println("| 3. Propiedades                                                    |");
            System.out.println("| 4. Clasificación                                                  |");
            System.out.println("| 5. Ejemplos                                                       |");
            System.out.println("| 6. Nomenclatura                                                   |");
            System.out.println("| 7. Bibliografía                                                   |");
            System.out.println("| 0. Volver                                                         |");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                             DEFINICIÓN                             |");
                    System.out.println("======================================================================");
                    System.out.println("| Los hidruros no metálicos son compuestos formados por la unión     |");
                    System.out.println("| del hidrógeno (que actúa con número de oxidación +1) con un        |");
                    System.out.println("| elemento no metálico. Estos compuestos suelen presentar            |");
                    System.out.println("| propiedades moleculares y muchas veces se encuentran en estado     |");
                    System.out.println("| gaseoso o líquido.                                                 |");
                    System.out.println("======================================================================");
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                              FORMACIÓN                             |");
                    System.out.println("======================================================================");
                    System.out.println("| Se forman mediante la combinación directa del hidrógeno con un     |");
                    System.out.println("| no metal, o por reacciones químicas específicas, como:             |");
                    System.out.println("|                                                                    |");
                    System.out.println("| • Síntesis directa:                                                |");
                    System.out.println("|       H₂(g) + S(s) → H₂S(g)                                        |");
                    System.out.println("| • Reacciones ácido-base de Lewis:                                  |");
                    System.out.println("|       BCl₃ + 3H₂ → BH₃ + 3HCl                                      |");
                    System.out.println("|                                                                    |");
                    System.out.println("| La forma de enlace suele ser covalente.                            |");
                    System.out.println("======================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                           PROPIEDADES                              |");
                    System.out.println("======================================================================");
                    System.out.println("| • Presentan enlaces covalentes.                                    |");
                    System.out.println("| • Suelen ser gases o líquidos a temperatura ambiente.              |");
                    System.out.println("| • Muchos son polares (como H₂O o H₂S).                             |");
                    System.out.println("| • Tienen puntos de ebullición relativamente bajos, excepto cuando  |");
                    System.out.println("|   forman puentes de hidrógeno (NH₃, H₂O, HF).                      |");
                    System.out.println("| • Pueden actuar como ácidos o bases de Lewis.                      |");
                    System.out.println("======================================================================");
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                          CLASIFICACIÓN                             |");
                    System.out.println("======================================================================");
                    System.out.println("| Según el elemento no metálico:                                     |");
                    System.out.println("|                                                                    |");
                    System.out.println("| • Hidruros del grupo 15: NH₃, PH₃                                  |");
                    System.out.println("| • Hidruros del grupo 16: H₂O, H₂S, H2Se                            |");
                    System.out.println("| • Hidruros del grupo 17 (halógenos): HF, HCl, HBr, HI              |");
                    System.out.println("|                                                                    |");
                    System.out.println("| Según su comportamiento:                                           |");
                    System.out.println("| • Hidruros volátiles                                               |");
                    System.out.println("| • Hidruros anfóteros                                               |");
                    System.out.println("| • Hidruros ácidos                                                  |");
                    System.out.println("======================================================================");
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                             EJEMPLOS                               |");
                    System.out.println("======================================================================");
                    System.out.println("| • NH₃ → Amoniaco (gas incoloro, básico, soluble en agua).          |");
                    System.out.println("| • H₂S → Sulfuro de hidrógeno (gas tóxico de olor a huevo podrido). |");
                    System.out.println("| • CH₄ → Metano (principal componente del gas natural).             |");
                    System.out.println("| • HF  → Fluoruro de hidrógeno (muy corrosivo).                     |");
                    System.out.println("| • HCl → Cloruro de hidrógeno (gas que forma ácido clorhídrico      |");
                    System.out.println("|         al disolverse en agua).                                    |");
                    System.out.println("======================================================================");
                    break;

                case 6:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                           NOMENCLATURA                             |");
                    System.out.println("======================================================================");
                    System.out.println("| ► SISTEMA TRADICIONAL                                              |");
                    System.out.println("| H + no metal → se nombra como “hidrato de …” o “ácido …hídrico”    |");
                    System.out.println("| Ejemplo:                                                           |");
                    System.out.println("|    HCl (ac) → ácido clorhídrico                                    |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► SISTEMA IUPAC                                                    |");
                    System.out.println("| Se nombran como “hidruro de …”                                     |");
                    System.out.println("| Ejemplo:                                                           |");
                    System.out.println("|    NH₃ → trihidruro de nitrógeno                                   |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► NOMENCLATURA DE STOCK                                            |");
                    System.out.println("| Se indica el número de oxidación del no metal entre paréntesis.    |");
                    System.out.println("| Ejemplo:                                                           |");
                    System.out.println("|    H₂S → hidruro de azufre (-II)                                   |");
                    System.out.println("======================================================================");
                    break;

                case 7:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                           BIBLIOGRAFÍA                             |");
                    System.out.println("======================================================================");
                    System.out.println("| • Chang, R. (2016). Química. McGraw-Hill.                          |");
                    System.out.println("| • Petrucci, R. et al. (2017). Química General. Pearson.            |");
                    System.out.println("| • Brown, T. & LeMay (2014). Química: La Ciencia Central.           |");
                    System.out.println("| • IUPAC (2022). Nomenclature of Inorganic Chemistry.               |");
                    System.out.println("======================================================================");
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("|  Regresando al menú...  |");
                    System.out.println("===========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
            }

            if (opcion != 0) esperarMENU();

        } while (opcion != 0);
    }

    public static void temaNomenclaturaInorganica1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=====================================================================");
            System.out.println("|                        NOMENCLATURA INORGÁNICA                    |");
            System.out.println("=====================================================================");
            System.out.println("| 1. ¿Qué es la nomenclatura?                                       |");
            System.out.println("| 2. Tipos                                                          |");
            System.out.println("| 3. Ejemplos                                                       |");
            System.out.println("| 4. Bibliografía                                                   |");
            System.out.println("| 0. Volver                                                         |");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Selecciona una opción:");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                       ¿QUÉ ES LA NOMENCLATURA?                     |");
                    System.out.println("======================================================================");
                    System.out.println("| Es el conjunto de reglas y sistemas establecidos para asignar      |");
                    System.out.println("| nombres correctos a los compuestos químicos.                       |");
                    System.out.println("|                                                                    |");
                    System.out.println("| La nomenclatura permite:                                           |");
                    System.out.println("| • Identificar la composición de un compuesto.                      |");
                    System.out.println("| • Comunicar correctamente sustancias en química.                   |");
                    System.out.println("| • Evitar ambigüedades.                                             |");
                    System.out.println("======================================================================");
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                                TIPOS                               |");
                    System.out.println("======================================================================");
                    System.out.println("| ► 1. NOMENCLATURA SISTEMÁTICA (IUPAC)                              |");
                    System.out.println("| Utiliza prefijos griegos (mono-, di-, tri-, tetra-, etc.).         |");
                    System.out.println("| Describe con exactitud el número de átomos de cada elemento.       |");
                    System.out.println("| Ejemplo: CO₂ → dióxido de carbono                                  |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► 2. NOMENCLATURA DE STOCK                                         |");
                    System.out.println("| Usa números romanos para indicar el estado de oxidación.           |");
                    System.out.println("| Ejemplo: FeCl₂ → cloruro de hierro (II)                            |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► 3. NOMENCLATURA TRADICIONAL                                      |");
                    System.out.println("| Usa terminaciones “-oso” y “-ico” para metales con dos valencias.  |");
                    System.out.println("| Ejemplo: FeCl₂ → cloruro ferroso                                   |");
                    System.out.println("======================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                               EJEMPLOS                             |");
                    System.out.println("======================================================================");
                    System.out.println("| ► Óxidos                                                           |");
                    System.out.println("|   CO  → monóxido de carbono                                        |");
                    System.out.println("|   CO₂ → dióxido de carbono                                         |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► Sales binarias                                                   |");
                    System.out.println("|   NaCl → cloruro de sodio                                          |");
                    System.out.println("|   FeCl₂ → cloruro de hierro (II) / cloruro ferroso                 |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► Hidróxidos                                                       |");
                    System.out.println("|   KOH → hidróxido de potasio                                       |");
                    System.out.println("|   Fe(OH)₃ → hidróxido de hierro (III) / hidróxido férrico          |");
                    System.out.println("======================================================================");
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                             BIBLIOGRAFÍA                           |");
                    System.out.println("======================================================================");
                    System.out.println("| • IUPAC (2022). *Nomenclature of Inorganic Chemistry*.             |");
                    System.out.println("| • Chang, R. (2018). *Química*. McGraw-Hill.                        |");
                    System.out.println("| • Petrucci, R. (2017). *Química General*. Pearson.                 |");
                    System.out.println("| • Brown, T. (2014). *Química: La Ciencia Central*. Pearson.        |");
                    System.out.println("======================================================================");
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===========================");
                    System.out.println("| Regresando al menú...   |");
                    System.out.println("===========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
            }

            if (opcion != 0) esperarMENU();

        } while (opcion != 0);
    }


    public static void temaDeterminacionNO1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=====================================================================");
            System.out.println("|                 DETERMINACIÓN DE NÚMEROS DE OXIDACIÓN             |");
            System.out.println("=====================================================================");
            System.out.println("| 1. reglas básicas                                                 |");
            System.out.println("| 2. ejemplos                                                       |");
            System.out.println("| 3. bibliografía                                                   |");
            System.out.println("| 0. volver                                                         |");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Selecciona una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                            REGLAS BÁSICAS                          |");
                    System.out.println("======================================================================");
                    System.out.println("| 1) Elementos en estado libre (sin combinar) = 0                    |");
                    System.out.println("|    Ej.: O₂, N₂, Fe(s), S₈ → NO = 0                                 |");
                    System.out.println("|                                                                    |");
                    System.out.println("| 2) En iones monoatómicos, el NO = carga del ion                    |");
                    System.out.println("|    Ej.: Na+ → +1, Cl– → -1                                         |");
                    System.out.println("|                                                                    |");
                    System.out.println("| 3) El oxígeno casi siempre = -2                                    |");
                    System.out.println("|    EXCEPCIONES:                                                    |");
                    System.out.println("|    • Peróxidos (O2²⁻) → -1 por cada O                              |");
                    System.out.println("|    • Superóxidos (O²⁻) → -1/2 por cada O                           |");
                    System.out.println("|                                                                    |");
                    System.out.println("| 4) El hidrógeno usualmente = +1                                    |");
                    System.out.println("|    EXCEPCIÓN: en hidruros metálicos (NaH, CaH2) → -1               |");
                    System.out.println("|                                                                    |");
                    System.out.println("| 5) Metales alcalinos (grupo 1) = +1                                |");
                    System.out.println("| 6) Alcalinotérreos (grupo 2) = +2                                  |");
                    System.out.println("|                                                                    |");
                    System.out.println("| 7) La suma de los NO = carga del compuesto                         |");
                    System.out.println("|    Ej.: En un compuesto neutro, la suma = 0                        |");
                    System.out.println("|                                                                    |");
                    System.out.println("======================================================================");
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                               EJEMPLOS                             |");
                    System.out.println("======================================================================");
                    System.out.println("| ► Ejemplo 1: H₂O                                                   |");
                    System.out.println("|   H = +1 (2 átomos) → +2                                           |");
                    System.out.println("|   O = -2                                                           |");
                    System.out.println("|   SUMA = 0  →  Compuesto correcto                                  |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► Ejemplo 2: CO₂                                                   |");
                    System.out.println("|   O = -2 (×2) → -4                                                 |");
                    System.out.println("|   C = +4                                                           |");
                    System.out.println("|   SUMA = 0                                                         |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► Ejemplo 3: SO₄²–  (ion sulfato)                                  |");
                    System.out.println("|   O = -2 (×4) → -8                                                 |");
                    System.out.println("|   Total debe dar = -2                                              |");
                    System.out.println("|   S = +6                                                           |");
                    System.out.println("|                                                                    |");
                    System.out.println("| ► Ejemplo 4: NaH (hidruro metálico)                                |");
                    System.out.println("|   Na = +1                                                          |");
                    System.out.println("|   H = -1 (por ser hidruro)                                         |");
                    System.out.println("======================================================================");
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                             BIBLIOGRAFÍA                           |");
                    System.out.println("======================================================================");
                    System.out.println("| • Chang, R. (2018). *Química*. McGraw-Hill.                        |");
                    System.out.println("| • Petrucci, R. (2017). *Química General*. Pearson.                 |");
                    System.out.println("| • Brown, T. (2014). *Química: La Ciencia Central*. Pearson.        |");
                    System.out.println("| • IUPAC. *Oxidation Number Definitions* (2020).                    |");
                    System.out.println("======================================================================");
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("============================");
                    System.out.println("|  Regresando al menú...   |");
                    System.out.println("============================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
            }

            if (opcion != 0) esperarMENU();

        } while (opcion != 0);
    }


    public static void temaOxidosMetalicos1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=================================");
            System.out.println("|        ÓXIDOS METÁLICOS       |");
            System.out.println("=================================");
            System.out.println("| 1. Definición                 |");
            System.out.println("| 2. Formación y propiedades    |");
            System.out.println("| 3. Cómo se formula un óxido   |");
            System.out.println("| 4. Ejemplos                   |");
            System.out.println("| 5. Bibliografía               |");
            System.out.println("| 0. Salir                      |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione una opción: ");

            // VALIDACIÓN PARA IMPEDIR CADENAS
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                esperarMENU();
                sc.nextLine(); // limpiar entrada incorrecta
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================");
                    System.out.println("|                                                DEFINICIÓN DE ÓXIDOS METÁLICOS                                      |");
                    System.out.println("======================================================================================================================");
                    System.out.println("| Los óxidos metálicos son compuestos binarios formados por:                                                         |");
                    System.out.println("|     → Un metal (con carga positiva).                                                                               |");
                    System.out.println("|     → Oxígeno con número de oxidación -2.                                                                          |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| En la nomenclatura general se nombran como:                                                                        |");
                    System.out.println("|     ÓXIDO + (de) + NOMBRE DEL METAL + (número de oxidación).                                                       |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| Ejemplos comunes: CaO, Fe₂O₃, MgO.                                                                                 |");
                    System.out.println("======================================================================================================================");
                    esperarMENU();
                    break;

                case 2:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================");
                    System.out.println("|                                            FORMACIÓN Y PROPIEDADES                                                 |");
                    System.out.println("======================================================================================================================");
                    System.out.println("| Cómo se forman:                                                                                                    |");
                    System.out.println("|   - Por reacción directa del metal con oxígeno atmosférico:                                                        |");
                    System.out.println("|        4 Fe + 3 O₂ → 2 Fe₂O₃                                                                                       |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| Propiedades típicas:                                                                                               |");
                    System.out.println("|   • Sólidos cristalinos de color blanco o gris.                                                                    |");
                    System.out.println("|   • Poseen carácter BÁSICO: reaccionan con agua formando HIDRÓXIDOS.                                               |");
                    System.out.println("|        Ejemplo: Na₂O + H₂O → 2 NaOH                                                                                |");
                    System.out.println("|   • Elevado punto de fusión (por enlaces metálicos + oxígeno electronegativo).                                     |");
                    System.out.println("|   • Algunos son anfóteros (Al2O3, ZnO).                                                                            |");
                    System.out.println("|   • Muchos participan en procesos de corrosión y oxidación del metal.                                              |");
                    System.out.println("======================================================================================================================");
                    esperarMENU();
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================");
                    System.out.println("|                                          ¿CÓMO SE FORMULA UN ÓXIDO METÁLICO?                                       |");
                    System.out.println("======================================================================================================================");
                    System.out.println("| 1. El oxígeno SIEMPRE tiene número de oxidación -2.                                                                |");
                    System.out.println("| 2. El metal toma su número de oxidación (I, II, III, etc.).                                                        |");
                    System.out.println("| 3. Se aplica la REGLA DEL CRUCE para obtener la fórmula:                                                           |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("|    Ejemplo: Óxido de hierro (III) → Fe(+3) y O(-2)                                                                 |");
                    System.out.println("|    Intercambio de números → Fe₂O₃                                                                                  |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| 4. Se simplifican los subíndices si es necesario.                                                                  |");
                    System.out.println("|                                                                                                                    |");
                    System.out.println("| 5. Para nombrarlos: ÓXIDO + de + METAL + (número romano)                                                           |");
                    System.out.println("|       Ejemplo: Cu₂O = óxido de cobre (I)                                                                           |");
                    System.out.println("======================================================================================================================");
                    esperarMENU();
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================");
                    System.out.println("|                                                 EJEMPLOS DE ÓXIDOS                                                 |");
                    System.out.println("======================================================================================================================");
                    System.out.println("|  • Na₂O  → óxido de sodio                                                                                          |");
                    System.out.println("|  • MgO   → óxido de magnesio                                                                                       |");
                    System.out.println("|  • CaO   → óxido de calcio                                                                                         |");
                    System.out.println("|  • FeO   → óxido de hierro (II)                                                                                    |");
                    System.out.println("|  • Fe₂O₃ → óxido de hierro (III)                                                                                   |");
                    System.out.println("|  • Al₂O₃ → óxido de aluminio (anfótero)                                                                            |");
                    System.out.println("|  • Cu₂O → óxido de cobre (I)                                                                                       |");
                    System.out.println("|  • CuO  → óxido de cobre (II)                                                                                      |");
                    System.out.println("======================================================================================================================");
                    esperarMENU();
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("======================================================================================================================");
                    System.out.println("|                                                   BIBLIOGRAFÍA                                                     |");
                    System.out.println("======================================================================================================================");
                    System.out.println("| - Brown, T. (2014). *Química: La Ciencia Central*. Pearson.                                                        |");
                    System.out.println("| - Chang, R. (2010). *Química*. McGraw-Hill.                                                                        |");
                    System.out.println("| - Atkins, P. (2015). *Principios de Química*. Panamericana.                                                        |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                                 |");
                    System.out.println("======================================================================================================================");
                    esperarMENU();
                    break;

                case 0:
                    System.out.println("\n===========================");
                    System.out.println("|  Regresando al menú...  |");
                    System.out.println("===========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
            }

        } while (opcion != 0);
    }


    public static void temaOxidosNoMetalicos1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("==================================");
            System.out.println("|      ÓXIDOS NO METÁLICOS       |");
            System.out.println("==================================");
            System.out.println("| 1. Definición                  |");
            System.out.println("| 2. Formación y nomenclatura    |");
            System.out.println("| 3. Ejemplos comunes            |");
            System.out.println("| 4. Reacciones importantes      |");
            System.out.println("| 5. Bibliografía                |");
            System.out.println("| 0. Salir                       |");
            System.out.println("----------------------------------");
            System.out.print("Seleccione una opción: ");

            // Validación de entrada (evitar cadenas)
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine();
                esperarMENU();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // 1. DEFINICIÓN
                case 1:
                    limpiarPantalla();
                    System.out.println("==================================================================================================================");
                    System.out.println("|                                               DEFINICIÓN                                                       |");
                    System.out.println("==================================================================================================================");
                    System.out.println("| Los óxidos no metálicos, también llamados ANHÍDRIDOS, son compuestos formados por:                             |");
                    System.out.println("|                                                                                                                |");
                    System.out.println("|   - Oxígeno (O)                                                                                                |");
                    System.out.println("|   - Un elemento NO METÁLICO (C, N, S, P, Cl, etc.)                                                             |");
                    System.out.println("|                                                                                                                |");
                    System.out.println("| Características generales:                                                                                     |");
                    System.out.println("|   • Enlace COVALENTE (comparten electrones).                                                                   |");
                    System.out.println("|   • Muchos son gases a temperatura ambiente.                                                                   |");
                    System.out.println("|   • Al reaccionar con agua forman ácidos oxácidos.                                                             |");
                    System.out.println("==================================================================================================================");
                    esperarMENU();
                    break;

                // 2. FORMACIÓN Y NOMENCLATURA
                case 2:
                    limpiarPantalla();
                    System.out.println("======================================================================================================");
                    System.out.println("|                             FORMACIÓN Y NOMENCLATURA                                               |");
                    System.out.println("======================================================================================================");
                    System.out.println("| Se forman por reacción directa del NO METAL con OXÍGENO:                                           |");
                    System.out.println("|                                                                                                    |");
                    System.out.println("|       No metal  +  O₂   →   Óxido no metálico                                                      |");
                    System.out.println("|                                                                                                    |");
                    System.out.println("| Ejemplo:  S + O₂ → SO₂ (dióxido de azufre)                                                         |");
                    System.out.println("|                                                                                                    |");
                    System.out.println("| NOMENCLATURA:                                                                                      |");
                    System.out.println("|   • Sistemática: Usa prefijos (mono-, di-, tri-).                                                  |");
                    System.out.println("|         Ej.: CO₂ = dióxido de carbono                                                              |");
                    System.out.println("|                                                                                                    |");
                    System.out.println("|   • Stock: 'Óxido de' + elemento + (número romano).                                                |");
                    System.out.println("|         Ej.: NO₂ = óxido de nitrógeno (IV)                                                         |");
                    System.out.println("======================================================================================================");
                    esperarMENU();
                    break;

                // 3. EJEMPLOS
                case 3:
                    limpiarPantalla();
                    System.out.println("===================================================================================================");
                    System.out.println("|                                   EJEMPLOS COMUNES                                              |");
                    System.out.println("===================================================================================================");
                    System.out.println("| • CO₂  → Dióxido de carbono                                                                     |");
                    System.out.println("| • CO   → Monóxido de carbono                                                                    |");
                    System.out.println("| • SO₂  → Dióxido de azufre                                                                      |");
                    System.out.println("| • SO₃  → Trióxido de azufre                                                                     |");
                    System.out.println("| • N₂O₅ → Pentóxido de dinitrógeno                                                               |");
                    System.out.println("|                                                                                                 |");
                    System.out.println("| Propiedades comunes:                                                                            |");
                    System.out.println("|   - Muchos son gases.                                                                           |");
                    System.out.println("|   - La mayoría son solubles en agua.                                                            |");
                    System.out.println("|   - Son precursores de ácidos oxácidos.                                                         |");
                    System.out.println("===================================================================================================");
                    esperarMENU();
                    break;

                // 4. REACCIONES IMPORTANTES
                case 4:
                    limpiarPantalla();
                    System.out.println("===================================================================================================");
                    System.out.println("|                             REACCIONES IMPORTANTES                                              |");
                    System.out.println("===================================================================================================");
                    System.out.println("| 1) Formación de ácidos oxácidos:                                                                |");
                    System.out.println("|      SO₃ + H₂O → H₂SO₄ (ácido sulfúrico)                                                        |");
                    System.out.println("|      CO₂ + H₂O → H₂CO₃ (ácido carbónico)                                                        |");
                    System.out.println("|                                                                                                 |");
                    System.out.println("| 2) Reacciones de combustión:                                                                    |");
                    System.out.println("|      C + O₂ → CO₂                                                                               |");
                    System.out.println("|                                                                                                 |");
                    System.out.println("| 3) Reacciones ambientales (lluvia ácida):                                                       |");
                    System.out.println("|      SO₂ + H₂O → H₂SO₃                                                                          |");
                    System.out.println("|      NO₂ + H₂O → HNO₃                                                                           |");
                    System.out.println("===================================================================================================");
                    esperarMENU();
                    break;

                // 5. BIBLIOGRAFÍA
                case 5:
                    limpiarPantalla();
                    System.out.println("======================================================================================================");
                    System.out.println("|                                BIBLIOGRAFÍA                                                        |");
                    System.out.println("======================================================================================================");
                    System.out.println("| - Chang, R. (2010). *Química*. McGraw-Hill.                                                        |");
                    System.out.println("| - Atkins, P. (2015). *Principios de Química*. Panamericana.                                        |");
                    System.out.println("| - Brown, T. (2014). *Química: La Ciencia Central*. Pearson.                                        |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                 |");
                    System.out.println("======================================================================================================");
                    esperarMENU();
                    break;

                case 0:
                    System.out.println("\n==========================");
                    System.out.println("|  Regresando al menú... |");
                    System.out.println("==========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
            }

        } while (opcion != 0);
    }


    public static void temaOxoacidos1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=================================");
            System.out.println("|           OXOÁCIDOS           |");
            System.out.println("=================================");
            System.out.println("| 1. Definición                 |");
            System.out.println("| 2. Formación y nomenclatura   |");
            System.out.println("| 3. Ejemplos                   |");
            System.out.println("| 4. Propiedades                |");
            System.out.println("| 5. Bibliografía               |");
            System.out.println("| 0. Salir                      |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione una opción: ");

            // Validación para evitar cadenas
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine();
                esperarMENU();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // 1. DEFINICIÓN
                case 1:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                 DEFINICIÓN                                                       |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Los oxoácidos (también llamados ácidos oxácidos) son compuestos ternarios formados por:                          |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("|     • Hidrógeno (H)                                                                                              |");
                    System.out.println("|     • Oxígeno (O)                                                                                                |");
                    System.out.println("|     • Un NO METAL (S, N, P, Cl, C, Br, etc.)                                                                     |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| En ellos, el hidrógeno está unido a un grupo oxígeno-no metal, y son capaces de donar protones en solución.      |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 2. FORMACIÓN Y NOMENCLATURA
                case 2:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                      FORMACIÓN Y NOMENCLATURA                                                    |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Los oxoácidos SE FORMAN cuando un óxido no metálico (anhídrido) reacciona con agua:                              |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("|    Óxido no metálico + H₂O  →  Oxoácido                                                                          |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Ejemplos:                                                                                                        |");
                    System.out.println("|    SO₃ + H₂O → H₂SO₄ (ácido sulfúrico)                                                                           |");
                    System.out.println("|    CO₂ + H₂O → H₂CO₃ (ácido carbónico)                                                                           |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| NOMENCLATURA:                                                                                                    |");
                    System.out.println("|   • Tradicional: usa sufijos -oso y -ico.                                                                        |");
                    System.out.println("|          H₂SO₃ → ácido sulfuroso                                                                                 |");
                    System.out.println("|          H₂SO₄ → ácido sulfúrico                                                                                 |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("|   • Sistemática: indica número de oxígenos.                                                                      |");
                    System.out.println("|          HClO → ácido oxocloroso                                                                                 |");
                    System.out.println("|          HClO₄ → ácido tetraoxoclorico                                                                           |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 3. EJEMPLOS
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                               EJEMPLOS                                                           |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| • H₂SO₄  → Ácido sulfúrico                                                                                       |");
                    System.out.println("| • H₂SO₃  → Ácido sulfuroso                                                                                       |");
                    System.out.println("| • HNO₃   → Ácido nítrico                                                                                         |");
                    System.out.println("| • HNO₂   → Ácido nitroso                                                                                         |");
                    System.out.println("| • H₂CO₃  → Ácido carbónico                                                                                       |");
                    System.out.println("| • H₃PO₄  → Ácido fosfórico                                                                                       |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 4. PROPIEDADES
                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                               PROPIEDADES                                                        |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| • Son ácidos: liberan H⁺ en solución.                                                                            |");
                    System.out.println("| • Muchos son corrosivos y altamente reactivos.                                                                   |");
                    System.out.println("| • Son solubles en agua.                                                                                          |");
                    System.out.println("| • Su fuerza ácida depende de:                                                                                    |");
                    System.out.println("|       - Electronegatividad del no metal                                                                          |");
                    System.out.println("|       - Número de oxígenos en la molécula                                                                        |");
                    System.out.println("|       - Estructura molecular                                                                                     |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Tendencia importante: MÁS oxígenos → ácido más fuerte (en la misma familia).                                     |");
                    System.out.println("| Ejemplo: HClO < HClO₂ < HClO₃ < HClO₄                                                                            |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 5. BIBLIOGRAFÍA
                case 5:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                               BIBLIOGRAFÍA                                                       |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                               |");
                    System.out.println("| - Silberberg, M. (2013). *Principios de Química*. McGraw-Hill.                                                   |");
                    System.out.println("| - Chang, R. (2010). *Química*. McGraw-Hill.                                                                      |");
                    System.out.println("| - Atkins, P. (2015). *Principios de Química*. Panamericana.                                                      |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                case 0:
                    System.out.println("\n==========================");
                    System.out.println("|  Regresando al menú... |");
                    System.out.println("==========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
            }

        } while (opcion != 0);
    }

    public static void temaOxosales1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=================================");
            System.out.println("|            OXOSALES           |");
            System.out.println("=================================");
            System.out.println("| 1. Definición                 |");
            System.out.println("| 2. Formación                  |");
            System.out.println("| 3. Ejemplos                   |");
            System.out.println("| 4. Clasificación              |");
            System.out.println("| 5. Bibliografía               |");
            System.out.println("| 0. Salir                      |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione una opción: ");

            // Validación para evitar cadenas
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine();
                esperarMENU();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                // 1. DEFINICIÓN
                case 1:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                DEFINICIÓN                                                        |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las oxosales son compuestos derivados de los oxoácidos, en los cuales el hidrógeno ácido ha sido sustituido por  |");
                    System.out.println("| un metal o un catión positivo.                                                                                   |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| En otras palabras: son SALES que provienen de un OXOÁCIDO.                                                       |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 2. FORMACIÓN
                case 2:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                    FORMACIÓN                                                     |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las oxosales se forman mediante la NEUTRALIZACIÓN entre un oxoácido y una base.                                  |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("|          OXOÁCIDO + BASE  →  OXOSAL + AGUA                                                                       |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Ejemplos:                                                                                                        |");
                    System.out.println("|   H₂SO₄  +  2 NaOH   →   Na₂SO₄  +  2 H₂O    (sulfato de sodio)                                                  |");
                    System.out.println("|   HNO₃   +  KOH      →   KNO₃     +   H₂O    (nitrato de potasio)                                                |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| También pueden obtenerse por sustitución directa del hidrógeno del oxoácido por un metal.                        |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 3. EJEMPLOS
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                   EJEMPLOS                                                       |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| • Na₂SO₄  → Sulfato de sodio                                                                                     |");
                    System.out.println("| • KNO₃    → Nitrato de potasio                                                                                   |");
                    System.out.println("| • CaCO₃   → Carbonato de calcio                                                                                  |");
                    System.out.println("| • CuSO₄   → Sulfato de cobre (II)                                                                                |");
                    System.out.println("| • Na₃PO₄  → Fosfato de sodio                                                                                     |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 4. CLASIFICACIÓN
                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                CLASIFICACIÓN                                                     |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las oxosales se clasifican según el número de hidrógenos del ácido que fueron sustituidos:                       |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Sales neutras** → todos los H⁺ son sustituidos por un metal                                                  |");
                    System.out.println("|       Ej: Na₂SO₄, KNO₃                                                                                           |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Sales ácidas** → solo se sustituye parte del hidrógeno                                                       |");
                    System.out.println("|       Ej: NaHSO₄ (bisulfato de sodio)                                                                            |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Sales básicas** → parte de los OH⁻ de la base quedan sin neutralizar                                         |");
                    System.out.println("|       Ej: CuOHNO₃ (nitrato básico de cobre)                                                                      |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 5. BIBLIOGRAFÍA
                case 5:
                    limpiarPantalla();
                    System.out.println("============================================================================================================");
                    System.out.println("|                                                BIBLIOGRAFÍA                                              |");
                    System.out.println("============================================================================================================");
                    System.out.println("| - Brown, T. (2018). *Química: La Ciencia Central*. Pearson.                                              |");
                    System.out.println("| - Zumdahl, S. (2015). *Química*. Cengage Learning.                                                       |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                       |");
                    System.out.println("| - Chang, R. (2010). *Química*. McGraw-Hill.                                                              |");
                    System.out.println("============================================================================================================");
                    esperarMENU();
                    break;

                case 0:
                    System.out.println("\n==========================");
                    System.out.println("|  Regresando al menú... |");
                    System.out.println("==========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
                    break;
            }

        } while (opcion != 0);
    }

    public static void temaSalesAcidas1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=================================");
            System.out.println("|          SALES ÁCIDAS         |");
            System.out.println("=================================");
            System.out.println("| 1. Definición                 |");
            System.out.println("| 2. Formación                  |");
            System.out.println("| 3. Ejemplos                   |");
            System.out.println("| 4. Clasificación              |");
            System.out.println("| 5. Bibliografía               |");
            System.out.println("| 0. Salir                      |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione una opción: ");

            // Validación para evitar cadenas
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine();
                esperarMENU();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                // 1. DEFINICIÓN
                case 1:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                DEFINICIÓN                                                        |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las sales ácidas son compuestos derivados de un oxoácido, en los cuales SOLO parte de los hidrógenos ácidos han  |");
                    System.out.println("| sido sustituidos por un metal.                                                                                   |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • Mantienen al menos un hidrógeno del oxoácido original.                                                         |");
                    System.out.println("| • También reciben el nombre de **sales hidrogenadas** o **hidrógenosales**.                                      |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Ejemplo conceptual:                                                                                              |");
                    System.out.println("|    H₂SO₄  →  NaHSO₄                                                                                              |");
                    System.out.println("|      (ácido sulfúrico)    (bisulfato de sodio)                                                                   |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 2. FORMACIÓN
                case 2:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                    FORMACIÓN                                                     |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las sales ácidas se forman cuando un oxoácido se neutraliza PARCIALMENTE con una base.                           |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("|                    NEUTRALIZACIÓN PARCIAL                                                                        |");
                    System.out.println("|             OXOÁCIDO + BASE (en cantidad limitada)  →  SAL ÁCIDA + AGUA                                          |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Ejemplos:                                                                                                        |");
                    System.out.println("|   H₂SO₄  +  NaOH   →   NaHSO₄  +  H₂O                                                                            |");
                    System.out.println("|   H₃PO₄  +  KOH    →   KH₂PO₄  +  H₂O                                                                            |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| También pueden obtenerse sustituyendo directamente un hidrógeno por un catión metálico.                          |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 3. EJEMPLOS
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                   EJEMPLOS                                                       |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| • NaHSO₄   → Bisulfato (sulfato ácido) de sodio                                                                  |");
                    System.out.println("| • NaHCO₃   → Bicarbonato (carbonato ácido) de sodio                                                              |");
                    System.out.println("| • KH₂PO₄   → Fosfato ácido de potasio                                                                            |");
                    System.out.println("| • CaHPO₄   → Fosfato ácido de calcio                                                                             |");
                    System.out.println("| • MgHPO₄   → Fosfato ácido de magnesio                                                                           |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 4. CLASIFICACIÓN
                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                CLASIFICACIÓN                                                     |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las sales ácidas se clasifican según cuántos hidrógenos del oxoácido original permanecen en la molécula:         |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Monohidrogenosales**: conservan 1 hidrógeno                                                                  |");
                    System.out.println("|        Ej: NaHSO₄, NaHCO₃, KH₂PO₄                                                                                |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Dihidrogenosales**: conservan 2 hidrógenos                                                                   |");
                    System.out.println("|        Ej: Ca(H2PO₄)₂                                                                                            |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Las SALES ÁCIDAS SIEMPRE provienen de un ácido poliprótico (con 2 o más hidrógenos).                             |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 5. BIBLIOGRAFÍA
                case 5:
                    limpiarPantalla();
                    System.out.println("============================================================================================================");
                    System.out.println("|                                                BIBLIOGRAFÍA                                              |");
                    System.out.println("============================================================================================================");
                    System.out.println("| - Brown, T. (2018). *Química: La Ciencia Central*. Pearson.                                              |");
                    System.out.println("| - Chang, R. (2016). *Química*. McGraw-Hill.                                                              |");
                    System.out.println("| - Atkins, P. & Jones, L. (2010). *Química General*. Médica Panamericana.                                 |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                       |");
                    System.out.println("============================================================================================================");
                    esperarMENU();
                    break;

                case 0:
                    System.out.println("\n==========================");
                    System.out.println("|  Regresando al menú... |");
                    System.out.println("==========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
                    break;
            }

        } while (opcion != 0);
    }

    public static void temaSalesBinarias1() {
        int opcion = -1;

        do {
            limpiarPantalla();
            System.out.println("=================================");
            System.out.println("|          SALES BINARIAS       |");
            System.out.println("=================================");
            System.out.println("| 1. Definición                 |");
            System.out.println("| 2. Formación                  |");
            System.out.println("| 3. Ejemplos                   |");
            System.out.println("| 4. Clasificación              |");
            System.out.println("| 5. Nomenclatura               |");
            System.out.println("| 6. Bibliografía               |");
            System.out.println("| 0. Salir                      |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione una opción: ");

            // Validación para evitar cadenas
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine();
                esperarMENU();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // 1. DEFINICIÓN
                case 1:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                DEFINICIÓN                                                        |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las sales binarias son compuestos formados por la combinación de un METAL con un NO METAL.                       |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • Son compuestos binarios porque solo contienen DOS elementos.                                                   |");
                    System.out.println("| • También se denominan HALUROS cuando el no metal es un halógeno (F, Cl, Br, I).                                 |");
                    System.out.println("| • Derivan de la reacción entre un ácido hidrácido y una base o de la combinación directa de los elementos.       |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 2. FORMACIÓN
                case 2:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                    FORMACIÓN                                                     |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las sales binarias pueden formarse de varias formas:                                                             |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| 1) Reacción directa:                                                                                             |");
                    System.out.println("|        Metal  +  No metal  →   Sal binaria                                                                       |");
                    System.out.println("|        2 Na + Cl₂ → 2 NaCl                                                                                       |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| 2) Reacción ácido-base:                                                                                          |");
                    System.out.println("|        Ácido hidrácido + Base → Sal + Agua                                                                       |");
                    System.out.println("|        HCl + NaOH → NaCl + H₂O                                                                                   |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 3. EJEMPLOS
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                    EJEMPLOS                                                      |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| • NaCl      → cloruro de sodio                                                                                   |");
                    System.out.println("| • KBr       → bromuro de potasio                                                                                 |");
                    System.out.println("| • CaF₂      → fluoruro de calcio                                                                                 |");
                    System.out.println("| • AlCl₃     → cloruro de aluminio                                                                                |");
                    System.out.println("| • FeCl₂     → cloruro de hierro (II)                                                                             |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 4. CLASIFICACIÓN
                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                CLASIFICACIÓN                                                     |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Las sales binarias se clasifican según el no metal que participa:                                                |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Halogenuros** → el no metal es un halógeno (F, Cl, Br, I).                                                   |");
                    System.out.println("|         Ej: NaCl, KBr, CaF2                                                                                      |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Calcogenuros** → el no metal es oxígeno, azufre o selenio (O, S, Se)                                         |");
                    System.out.println("|         Ej: FeS (sulfuro de hierro), MgS                                                                         |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| • **Nitruros** → el no metal es nitrógeno (N).                                                                   |");
                    System.out.println("|         Ej: Li₃N (nitruro de litio)                                                     10                       |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 5. NOMENCLATURA
                case 5:
                    limpiarPantalla();
                    System.out.println("====================================================================================================================");
                    System.out.println("|                                                NOMENCLATURA                                                      |");
                    System.out.println("====================================================================================================================");
                    System.out.println("| Se nombran con la palabra:                                                                                       |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("|                  [no metal]–URO de [metal]                                                                       |");
                    System.out.println("|                                                                                                                  |");
                    System.out.println("| Ejemplos:                                                                                                        |");
                    System.out.println("| • NaCl  → cloruro de sodio                                                                                       |");
                    System.out.println("| • FeCl₂ → cloruro de hierro (II)                                                                                 |");
                    System.out.println("| • CaF₂  → fluoruro de calcio                                                                                     |");
                    System.out.println("====================================================================================================================");
                    esperarMENU();
                    break;

                // 6. BIBLIOGRAFÍA
                case 6:
                    limpiarPantalla();
                    System.out.println("============================================================================================================");
                    System.out.println("|                                                BIBLIOGRAFÍA                                              |");
                    System.out.println("============================================================================================================");
                    System.out.println("| - Chang, R. (2008). *Química*. McGraw-Hill.                                                              |");
                    System.out.println("| - Atkins, P. (2010). *Química General*. Médica Panamericana.                                             |");
                    System.out.println("| - Petrucci, R. (2017). *Química General*. Pearson.                                                       |");
                    System.out.println("| - Brown, T. (2018). *Química: La Ciencia Central*. Pearson.                                              |");
                    System.out.println("============================================================================================================");
                    esperarMENU();
                    break;

                case 0:
                    System.out.println("\n==========================");
                    System.out.println("|  Regresando al menú... |");
                    System.out.println("==========================");
                    esperarMENU();
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarMENU();
                    break;
            }

        } while (opcion != 0);
    }

    public static void esperarEnter() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presione ENTER para continuar... |");
        System.out.println("====================================");
        scanner.nextLine();
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

    public static void Tarjetas_estudio()
    {
        System.out.println("\u001B[38;2;255;215;0m\n" +
                "████████╗ █████╗  ██████╗       ██╗  ███████╗ ████████╗  █████╗   █████═╗  ██████╗  ███████╗\n" +
                "╚══██╔══╝██╔══██╗ ██╔══██╗      ██║  ██╔════╝ ╚══██╔══╝ ██╔══██╗ ██╔════╝  ██╔══██╗ ██╔════╝\n" +
                "   ██║   ███████║ ██████╔╝      ██║  █████╗      ██║    ███████║  █████╗   ██║  ██║ █████╗\n" +
                "   ██║   ██╔══██║ ██╔══██╗ ██   ██║  ██╔══╝      ██║    ██╔══██║  ╚═══██╗  ██║  ██║ ██╔══╝ \n" +
                "   ██║   ██║  ██║ ██║  ██║ ╚█████╔╝  ███████╗    ██║    ██║  ██║ ██████╔╝  ██████╔╝ ███████╗\n" +
                "   ╚═╝   ╚═╝  ╚═╝ ╚═╝  ╚═╝  ╚════╝   ╚══════╝    ╚═╝    ╚═╝  ╚═╝ ╚═════╝   ╚═════╝  ╚══════╝\n" +
                "\n" +
                "███████╗  █████═╗ ████████╗ ██╗   ██╗ ██████╗  ██╗  ██████╗\n" +
                "██╔════╝ ██╔════╝ ╚══██╔══╝ ██║   ██║ ██╔══██╗ ██║ ██╔═══██╗\n" +
                "█████╗    █████╗     ██║    ██║   ██║ ██║  ██║ ██║ ██║   ██║\n" +
                "██╔══╝    ╚═══██╗    ██║    ██║   ██║ ██║  ██║ ██║ ██║   ██║\n" +
                "███████╗ ██████╔╝    ██║    ╚██████╔╝ ██████╔╝ ██║ ╚██████╔╝\n" +
                "╚══════╝ ╚═════╝     ╚═╝     ╚═════╝  ╚═════╝  ╚═╝  ╚═════╝\n"+
                "\u001B[0m");
    }

    private static void ModuloTecnicasDeEstudio() {

        int opcion_menu = -1;

        while (true) {
            limpiarPantalla();
            Tecnicas_estudio();
            System.out.println("=========================================");
            System.out.println("|       MÓDULO DE TÉCNICAS DE ESTUDIO   |");
            System.out.println("=========================================");
            System.out.println("| 1. Técnicas mnemotécnicas             |");
            System.out.println("| 2. Ejemplos prácticos                 |");
            System.out.println("| 0. Regresar al menú principal         |");
            System.out.println("=========================================");
            System.out.print("Elige una opción: ");

            // VALIDACIÓN → evitar cadenas
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n=========================================");
                System.out.println("|   Entrada inválida. Ingresa un número. |");
                System.out.println("=========================================");
                esperarEnter();
                continue;
            }

            opcion_menu = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // VALIDACIÓN → evitar números fuera de rango
            if (opcion_menu < 0 || opcion_menu > 2) {
                System.out.println("\n==========================================");
                System.out.println("|      Opción fuera de rango (0-2).      |");
                System.out.println("==========================================");
                esperarEnter();
                continue;
            }

            // OPCIONES VÁLIDAS
            switch (opcion_menu) {
                case 1:
                    tecnicasMnemotecnicas(); // << TU FUNCIÓN AQUÍ
                    break;

                case 2:
                    ejemplosPracticos(); // << TU FUNCIÓN AQUÍ
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    esperarEnter();
                    return;
            }

        }

    }

    public static void ejemplosPracticos(){
        int opcion_unidad = -1;

        do {
            limpiarPantalla();
            ejemplos();
            System.out.println("================================================");
            System.out.println("|           EJEMPLOS PRÁCTICOS                 |");
            System.out.println("================================================");
            System.out.println("| 1. Unidad 1 - Introducción a la Química      |");
            System.out.println("| 2. Unidad 2 - Estructura atómica             |");
            System.out.println("| 3. Unidad 3 - Tabla periódica                |");
            System.out.println("| 4. Unidad 4 - Enlace químico                 |");
            System.out.println("| 5. Unidad 5 - Compuestos inorgánicos         |");
            System.out.println("| 0. Salir                                     |");
            System.out.println("------------------------------------------------");
            System.out.print("Elige una opción: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpiar basura
                esperarTecla(sc);
                continue;
            }

            opcion_unidad = sc.nextInt();
            sc.nextLine(); // limpiar ENTER

            switch (opcion_unidad) {
                case 1:
                    EjemploUnidad1();
                    break;

                case 2:
                    EjemploUnidad2();
                    break;

                case 3:
                    EjemploUnidad3();
                    break;

                case 4:
                    EjemplosUnidad4();
                    break;

                case 5:
                    EjemplosUnidad5();
                    break;

                case 0:
                    System.out.println("\n=================");
                    System.out.println("| Regresando... |");
                    System.out.println("=================");
                    esperarTecla(sc);
                    break;

                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla(sc);
            }

        } while (opcion_unidad != 0);

    }

    public static void EjemploUnidad1() {
        int opcion_marcado = -1;

        do {
            limpiarPantalla();
            System.out.println("======================================");
            System.out.println("|        Ejemplos - Unidad 1         |");
            System.out.println("======================================");
            System.out.println("| 1. Introducción a la química       |");
            System.out.println("| 2. Materia y energía               |");
            System.out.println("| 3. Propiedades de la materia       |");
            System.out.println("| 4. Fenómenos físicos y químicos    |");
            System.out.println("| 5. Elementos, compuestos y mezclas |");
            System.out.println("| 6. Métodos de separación           |");
            System.out.println("| 0. Regresar al menú                |");
            System.out.println("======================================");
            System.out.print(" Elige una opción: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarTecla(sc);
                continue;
            }

            opcion_marcado = sc.nextInt();
            sc.nextLine(); // limpiar ENTER


            switch (opcion_marcado) {
                case 1:
                    ejemploIntroQuimica();
                    break;
                case 2:
                    ejemploMateriaEnergia();
                    break;
                case 3:
                    ejemploPropiedadesMateria();
                    break;
                case 4:
                    ejemploFenomenos();
                    break;
                case 5:
                    ejemploElementosCompuestosMezclas();
                    break;
                case 6:
                    ejemploMetodosSeparacion();
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("====================================");
                    System.out.println("| Saliendo del menú de ejemplos... |");
                    System.out.println("====================================");
                    esperarTecla(sc);
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=======================================");
                    System.out.println("| Opción no válida. Intenta de nuevo. |");
                    System.out.println("=======================================");
                    esperarTecla(sc);
            }

        } while (opcion_marcado != 0);
    }

    // =============================================================
    // ===============         MÉTODOS EJEMPLOS        =============
    // =============================================================

    public static void ejemploIntroQuimica() {
        limpiarPantalla();
        System.out.println("=======================================================================");
        System.out.println("|                    Introducción a la Química                        |");
        System.out.println("=======================================================================");
        System.out.println("| - Ejemplo: Al hervir agua ocurre un cambio físico,                  |");
        System.out.println("|   mientras que al oxidarse un metal ocurre un cambio químico.       |");
        System.out.println("| - Explicación: En el físico solo cambia el estado o forma,          |");
        System.out.println("|   en el químico se forma una sustancia nueva.                       |");
        System.out.println("| - La química estudia la materia, su estructura y transformaciones.  |");
        System.out.println("| - Está presente en procesos cotidianos como cocinar, limpiar        |");
        System.out.println("|   o la corrosión de metales.                                        |");
        System.out.println("=======================================================================");
        System.out.println();
        esperarTecla(sc);
    }

    public static void ejemploMateriaEnergia() {
        limpiarPantalla();
        System.out.println("====================================================================");
        System.out.println("|                        Materia y Energía                         |");
        System.out.println("====================================================================");
        System.out.println("| - Ejemplo: El hielo derritiéndose muestra cómo la energía        |");
        System.out.println("|   (calor) puede cambiar el estado de la materia sin alterar      |");
        System.out.println("|   su composición química.                                        |");
        System.out.println("| - La materia siempre responde a la energía: se calienta,         |");
        System.out.println("|   se enfría, se expande o cambia de estado.                      |");
        System.out.println("| - Todo cambio físico requiere energía para romper o debilitar    |");
        System.out.println("|   las fuerzas entre sus partículas.                              |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|  Ejemplo (HIELO → AGUA):                                         |");
        System.out.println("|        ❄❄                    \uD83D\uDCA7                                 |");
        System.out.println("|      [ HIELO ] --(calor)--> [ AGUA ]                             |");
        System.out.println("====================================================================");
        System.out.println();
        esperarTecla(sc);
    }

    public static void ejemploPropiedadesMateria() {
        limpiarPantalla();
        System.out.println("============================================================");
        System.out.println("|                  Propiedades de la Materia               |");
        System.out.println("============================================================");
        System.out.println("| - Ejemplo: Una pelota tiene masa, ocupa espacio, posee   |");
        System.out.println("|   volumen y puede deformarse gracias a su elasticidad.   |");
        System.out.println("| - Las propiedades pueden ser generales (masa, volumen) o |");
        System.out.println("|   específicas (color, dureza, elasticidad, densidad).    |");
        System.out.println("| - Estas propiedades permiten identificar, comparar y     |");
        System.out.println("|   clasificar distintos materiales.                       |");
        System.out.println("------------------------------------------------------------");
        System.out.println("|  Ejemplo:                                                |");
        System.out.println("|        (cuerpo)  ← masa + volumen + elasticidad          |");
        System.out.println("|        /-----/  ← ocupa espacio                          |");
        System.out.println("============================================================");
        System.out.println();
        esperarTecla(sc);
    }

    public static void ejemploFenomenos() {
        limpiarPantalla();
        System.out.println("============================================================");
        System.out.println("|               Fenómenos Físicos y Químicos               |");
        System.out.println("============================================================");
        System.out.println("| - Ejemplo físico: cortar papel; cambia la forma pero no  |");
        System.out.println("|   la composición. Sigue siendo papel.                    |");
        System.out.println("| - Ejemplo químico: quemar papel; aparecen ceniza y humo, |");
        System.out.println("|   lo que indica la formación de nuevas sustancias.       |");
        System.out.println("| - Los físicos NO alteran la composición, los químicos SÍ |");
        System.out.println("|   generan sustancias nuevas.                             |");
        System.out.println("------------------------------------------------------------");
        System.out.println("|  Ejemplo en ASCII:                                       |");
        System.out.println("|        FÍSICO:   [ PAPEL ] → [ PAPEL ✂ ]                |");
        System.out.println("|        QUÍMICO:  [ PAPEL ] → [ 🔥 CENIZA + HUMO ]        |");
        System.out.println("============================================================");
        System.out.println();
        esperarTecla(sc);
    }


    public static void ejemploElementosCompuestosMezclas() {
        limpiarPantalla();
        System.out.println("=========================================================================================================");
        System.out.println("|                         Elementos, Compuestos y Mezclas                                               |");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("| - Ejemplo: El oxígeno (O2) es un elemento, el agua (H2O) es un compuesto, y el aire es una mezcla.    |");
        System.out.println("| - Explicación: Se diferencian por su pureza y por cómo se combinan sus componentes.                   |");
        System.out.println("|   * Elemento: formado por un solo tipo de átomo.                                                      |");
        System.out.println("|   * Compuesto: unión química fija entre dos o más elementos.                                          |");
        System.out.println("|   * Mezcla: combinación física; sus componentes pueden separarse.                                     |");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("|   Representación rápida:                                                                              |");
        System.out.println("|       [O][O]        → Elemento                                                                        |");
        System.out.println("|       [H]-[O]-[H]   → Compuesto                                                                       |");
        System.out.println("|   [N] [O2] [CO2]    → Mezcla (aire)                                                                   |");
        System.out.println("=========================================================================================================");
        System.out.println();
        esperarTecla(sc);
    }


    public static void ejemploMetodosSeparacion() {
        limpiarPantalla();
        System.out.println("=====================================================================================================");
        System.out.println("|                              Métodos de Separación de Mezclas                                     |");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("| - Ejemplo: Filtración (agua + arena), Destilación (agua + alcohol), Imantación (hierro + azufre). |");
        System.out.println("| - Explicación: Cada método usa una propiedad física distinta, como tamaño de partícula,           |");
        System.out.println("|   punto de ebullición, densidad o magnetismo.                                                     |");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("|   Representación visual:                                                                          |");
        System.out.println("|      Filtración:              Destilación:                     Imantación:                        |");
        System.out.println("|      agua + arena             mezcla líquida                   hierro + azufre                    |");
        System.out.println("|         v                        v                                v                               |");
        System.out.println("|      [Filtro]                 [Calor] → (vapor)              [Imán] ← [Fe] + [S]                  |");
        System.out.println("=====================================================================================================");
        System.out.println();
        esperarTecla(sc);
    }

    public static void EjemploUnidad2() {
        Scanner sc = new Scanner(System.in);
        int opcion_marcado=-1;

        do {
            limpiarPantalla();

            System.out.println("==========================================");
            System.out.println("|          Ejemplos - unidad 2           |");
            System.out.println("==========================================");
            System.out.println("| 1. Configuración electrónica           |");
            System.out.println("| 2. El átomo                            |");
            System.out.println("| 3. Electrón diferencial                |");
            System.out.println("| 4. Modelos atómicos                    |");
            System.out.println("| 5. Números cuánticos                   |");
            System.out.println("| 6. Principio de aufbau                 |");
            System.out.println("| 7. Tabulación de números cuánticos     |");
            System.out.println("| 0. Regresar al menú principal          |");
            System.out.println("------------------------------------------");
            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarEnter(sc);
                continue;
            }

            opcion_marcado = sc.nextInt();
            sc.nextLine();


            switch (opcion_marcado) {

                case 1:
                    ejemploConfiguracionElectronica();
                    esperarEnter(sc);
                    break;

                case 2:
                    ejemploElAtomo();
                    esperarEnter(sc);
                    break;

                case 3:
                    ejemploElectronDiferencial();
                    esperarEnter(sc);
                    break;

                case 4:
                    ejemploModelosAtomicos();
                    esperarEnter(sc);
                    break;

                case 5:
                    ejemploNumerosCuanticos();
                    esperarEnter(sc);
                    break;

                case 6:
                    ejemploPrincipioAufbau();
                    esperarEnter(sc);
                    break;

                case 7:
                    ejemploTabulacionCuanticos();
                    esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("=====================================");
                    System.out.println("| Saliendo del menú de ejemplos...  |");
                    System.out.println("=====================================");
                    esperarEnter(sc);
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================================");
                    System.out.println("|Opción no válida. Intenta de nuevo.|");
                    System.out.println("=====================================");
                    esperarEnter(sc);
                    break;
            }

        } while (opcion_marcado != 0);
    }


    //──────────────────────────────────────────────
    // MÉTODOS QUE EL SWITCH LLAMA
    //──────────────────────────────────────────────

    public static void ejemploConfiguracionElectronica() {
        limpiarPantalla();
        System.out.println("==========================================================================");
        System.out.println("|                        CONFIGURACIÓN ELECTRÓNICA                       |");
        System.out.println("==========================================================================");
        System.out.println("| Ejemplo: El sodio (Na), número atómico Z = 11                          |");
        System.out.println("|                                                                        |");
        System.out.println("| Configuración electrónica completa:                                    |");
        System.out.println("|  - 1s² 2s² 2p⁶ 3s¹                                                     |");
        System.out.println("|                                                                        |");
        System.out.println("| Explicación:                                                           |");
        System.out.println("|  - El número atómico 11 indica que tiene 11 electrones.                |");
        System.out.println("|  - Estos se acomodan siguiendo el Principio de Aufbau (menor energía). |");
        System.out.println("|  - En los orbitales s caben máximo 2 electrones; en p, máximo 6.       |");
        System.out.println("|                                                                        |");
        System.out.println("| Último electrón:                                                       |");
        System.out.println("|  - Termina en 3s¹ → este es el electrón diferencial.                   |");
        System.out.println("|  - Gracias a esto, Na pertenece al grupo 1 (metales alcalinos).        |");
        System.out.println("|  - Su nivel de energía más externo es n = 3 → periodo 3.               |");
        System.out.println("|                                                                        |");
        System.out.println("| Representación por diagrama de cajas:                                  |");
        System.out.println("|  1s [↑↓]   2s [↑↓]   2p [↑↓][↑↓][↑↓]   3s [↑ ]                         |");
        System.out.println("--------------------------------------------------------------------------");
    }


    public static void ejemploElAtomo() {
        limpiarPantalla();
        System.out.println("==========================================================");
        System.out.println("|                         EL ÁTOMO                       |");
        System.out.println("==========================================================");
        System.out.println("| Ejemplo: Átomo de Carbono (C)                          |");
        System.out.println("|                                                        |");
        System.out.println("| Composición:                                           |");
        System.out.println("|  - 6 protones (carga +)                                |");
        System.out.println("|  - 6 electrones (carga -)                              |");
        System.out.println("|  - 6 neutrones (carga 0)                               |");
        System.out.println("|                                                        |");
        System.out.println("| Masa atómica: ~12 uma                                  |");
        System.out.println("|  - Se debe principalmente a protones y neutrones.      |");
        System.out.println("|  - Los electrones casi no aportan masa.                |");
        System.out.println("|                                                        |");
        System.out.println("|Estructura del átomo:                                   |");
        System.out.println("|  - Núcleo: protones + neutrones                        |");
        System.out.println("|  - Nube electrónica: electrones rodeando el núcleo     |");
        System.out.println("|                                                        |");
        System.out.println("| Configuración electrónica:                             |");
        System.out.println("|  - 1s² 2s² 2p²                                         |");
        System.out.println("|                                                        |");
        System.out.println("| Información que aporta la configuración:               |");
        System.out.println("|  - Tiene 4 electrones en la capa de valencia (2s² 2p²) |");
        System.out.println("|  - Pertenece al grupo 14 de la tabla periódica.        |");
        System.out.println("|  - Se localiza en el periodo 2 (nivel n=2).            |");
        System.out.println("----------------------------------------------------------");
    }


    public static void ejemploElectronDiferencial() {
        limpiarPantalla();
        System.out.println("===================================================================================");
        System.out.println("|                              ELECTRÓN DIFERENCIAL                               |");
        System.out.println("===================================================================================");
        System.out.println("| Ejemplo: Magnesio (Mg, Z=12)                                                    |");
        System.out.println("|  - Configuración electrónica: 1s² 2s² 2p⁶ 3s²                                   |");
        System.out.println("|  - El electrón diferencial es el último electrón que se acomoda según el        |");
        System.out.println("|    diagrama de Aufbau.                                                          |");
        System.out.println("|  - En el Mg, dicho electrón está en el orbital 3s.                              |");
        System.out.println("|  - Este electrón define:                                                        |");
        System.out.println("|    • Su número cuántico principal (n=3).                                        |");
        System.out.println("|    • El subnivel energético (s).                                                |");
        System.out.println("|    • Que pertenece al grupo 2 (metales alcalinotérreos).                        |");
        System.out.println("|  - También explica:                                                             |");
        System.out.println("|    • Que el Mg forma iones Mg²⁺ (pierde 2 electrones del subnivel 3s).          |");
        System.out.println("|    • Su reactividad moderada.                                                   |");
        System.out.println("|    • Su configuración de valencia: 3s²                                          |");
        System.out.println("-----------------------------------------------------------------------------------");
    }


    public static void ejemploModelosAtomicos() {
        limpiarPantalla();
        System.out.println("===========================================================================================");
        System.out.println("|                                    MODELOS ATÓMICOS                                     |");
        System.out.println("===========================================================================================");
        System.out.println("| Dalton:                                                                                 |");
        System.out.println("|  - Átomos indivisibles y esféricos, cada elemento tiene átomos iguales.                 |");
        System.out.println("|  - Explica leyes ponderales (proporciones múltiples y definidas).                       |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Thomson:                                                                                |");
        System.out.println("|  - Modelo del 'pudín con pasas': electrones incrustados en una masa positiva.           |");
        System.out.println("|  - Primer modelo en incluir partículas subatómicas.                                     |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Rutherford:                                                                             |");
        System.out.println("|  - Descubre el núcleo mediante la lámina de oro.                                        |");
        System.out.println("|  - El átomo es casi vacío; los electrones giran alrededor del núcleo.                   |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Bohr:                                                                                   |");
        System.out.println("|  - Electrones en órbitas fijas y niveles de energía cuantizados.                        |");
        System.out.println("|  - Explica las líneas espectrales del hidrógeno.                                        |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Modelo Cuántico:                                                                        |");
        System.out.println("|  - Sustituye las órbitas por orbitales: regiones donde es más probable encontrar        |");
        System.out.println("|    al electrón.                                                                         |");
        System.out.println("|  - Basado en Schrödinger, Heisenberg y Dirac.                                           |");
        System.out.println("|  - Describe al electrón como onda y partícula (dualidad).                               |");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void ejemploNumerosCuanticos() {
        limpiarPantalla();
        System.out.println("=====================================================");
        System.out.println("|                    NÚMEROS CUÁNTICOS              |");
        System.out.println("=====================================================");
        System.out.println("| Ejemplo: electrón en 3p²                          |");
        System.out.println("|                                                   |");
        System.out.println("| - n = 3  → Número cuántico principal              |");
        System.out.println("|   Indica el nivel de energía y el tamaño          |");
        System.out.println("|   promedio del orbital.                           |");
        System.out.println("|                                                   |");
        System.out.println("| - l = 1  → Número cuántico azimutal               |");
        System.out.println("|   Define el subnivel (0=s, 1=p, 2=d, 3=f).        |");
        System.out.println("|   Determina la forma del orbital.                 |");
        System.out.println("|                                                   |");
        System.out.println("| - m = -1 → Número cuántico magnético              |");
        System.out.println("|   Indica la orientación espacial del orbital.     |");
        System.out.println("|   En p existen tres posiciones posibles: -1,0,+1  |");
        System.out.println("|                                                   |");
        System.out.println("| - s = +1/2 → Número cuántico de spin              |");
        System.out.println("|   Representa el giro interno del electrón.        |");
        System.out.println("|   Puede ser +1/2 (↑) o -1/2 (↓).                  |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| Este conjunto describe completamente el estado    |");
        System.out.println("| del electrón dentro del átomo según el modelo     |");
        System.out.println("| cuántico moderno.                                 |");
        System.out.println("-----------------------------------------------------");
    }

    public static void ejemploPrincipioAufbau() {
        limpiarPantalla();
        System.out.println("==============================================================================");
        System.out.println("|                             PRINCIPIO DE AUFBAU                            |");
        System.out.println("==============================================================================");
        System.out.println("| Ejemplo: Oxígeno (Z = 8)                                                   |");
        System.out.println("| Configuración: 1s² 2s² 2p⁴                                                 |");
        System.out.println("|                                                                            |");
        System.out.println("| - El principio de Aufbau establece que los electrones                      |");
        System.out.println("|  siempre ocupan primero los orbitales de menor energía antes               |");
        System.out.println("|  de pasar a los de mayor energía.                                          |");
        System.out.println("|                                                                            |");
        System.out.println("| - Por eso se llenan en el orden:                                           |");
        System.out.println("|  1s → 2s → 2p → 3s → 3p → 4s → 3d → 4p ...                                 |");
        System.out.println("|                                                                            |");
        System.out.println("| - En el caso del oxígeno:                                                  |");
        System.out.println("|   * Primero se completa 1s (2 electrones).                                 |");
        System.out.println("|   * Luego 2s (2 electrones).                                               |");
        System.out.println("|   * Finalmente van 4 electrones al subnivel 2p.                            |");
        System.out.println("|                                                                            |");
        System.out.println("| - Esto determina su reactividad, ya que los 2 electrones faltantes         |");
        System.out.println("|   para completar el 2p hacen que el oxígeno sea muy reactivo.              |");
        System.out.println("------------------------------------------------------------------------------");
    }

    public static void ejemploTabulacionCuanticos() {
        limpiarPantalla();
        System.out.println("===========================================================================");
        System.out.println("|                  TABULACIÓN DE LOS NÚMEROS CUÁNTICOS                    |");
        System.out.println("===========================================================================");
        System.out.println("|Ejemplo: Oxígeno (O)                                                     |");
        System.out.println("|Configuración electrónica: 1s² 2s² 2p⁴                                   |");
        System.out.println("|                                                                         |");
        System.out.println("|Los electrones del subnivel 2p deben tabularse mediante sus números      |");
        System.out.println("|cuánticos (n, l, m, s).                                                  |");
        System.out.println("|                                                                         |");
        System.out.println("|Subnivel 2p ⇒ n = 2, l = 1                                               |");
        System.out.println("|Orbitales disponibles (m): -1, 0, +1                                     |");
        System.out.println("|Espín posible (s): +1/2 o -1/2                                           |");
        System.out.println("|                                                                         |");
        System.out.println("|Para 2p⁴, la tabulación queda así (Regla de Hund):                       |");
        System.out.println("|- Los primeros tres electrones ocupan m = -1, 0 y +1 con espín +1/2      |");
        System.out.println("|- El cuarto electrón se empareja en uno de los orbitales con s = -1/2    |");
        System.out.println("|                                                                         |");
        System.out.println("|Ejemplo de tabulación para los 4 electrones 2p:                          |");
        System.out.println("|  e1: n=2, l=1, m=-1, s=+1/2                                             |");
        System.out.println("|  e2: n=2, l=1, m= 0, s=+1/2                                             |");
        System.out.println("|  e3: n=2, l=1, m=+1, s=+1/2                                             |");
        System.out.println("|  e4: n=2, l=1, m=-1, s=-1/2   (se empareja)                             |");
        System.out.println("---------------------------------------------------------------------------");
    }


    public static void EjemploUnidad3() {
        int opcionejemplos = -1;
        while (opcionejemplos != 0) {
            MenuEjemplos();
            while (true) {
                if (scanner.hasNextInt()) {
                    opcionejemplos = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcionejemplos) {
                        case 0:
                            System.out.println("\n");
                            System.out.println("=====================================");
                            System.out.println("| Regresando al menú de ejemplos... |");
                            System.out.println("=====================================");
                            esperarMENU();
                            break;
                        case 1:
                            limpiarPantalla();
                            TemaAfinidadElectronica();
                            esperarMENU();
                            break;
                        case 2:
                            limpiarPantalla();
                            TemaConstruccionTablaPeriodica();
                            esperarMENU();
                            break;
                        case 3:
                            limpiarPantalla();
                            TemaElectronesPerifericos();
                            esperarMENU();
                            break;
                        case 4:
                            limpiarPantalla();
                            TemaElectronesValencia();
                            esperarMENU();
                            break;
                        case 5:
                            limpiarPantalla();
                            TemaElementosTransicion();
                            esperarMENU();
                            break;
                        case 6:
                            limpiarPantalla();
                            TemaEnergiaIonizacion();
                            esperarMENU();
                            break;
                        case 7:
                            limpiarPantalla();
                            TemaMetalNoMetal();
                            esperarMENU();
                            break;
                        case 8:
                            limpiarPantalla();
                            TemaValencia();
                            esperarMENU();
                            break;
                        case 9:
                            limpiarPantalla();
                            TemaRadioAtomico();
                            esperarMENU();
                            break;
                        case 10:
                            limpiarPantalla();
                            TemaPropiedadesPeriodicas();
                            esperarMENU();
                            break;
                        case 11:
                            limpiarPantalla();
                            NumeroOxidacion();
                            esperarMENU();
                            break;
                        default:
                            System.out.println("\n");
                            System.out.println("----------------------------------");
                            System.out.println("Opción no válida. Intenta de nuevo");
                            System.out.println("----------------------------------");
                            esperarMENU();
                            break;
                    }
                    break;
                } else {
                    System.out.println("\n");
                    System.out.println("--------------------------------------------");
                    System.out.println("OPCIÓN INVÁLIDA. SELECCIONE UN NÚMERO ENTERO");
                    System.out.println("--------------------------------------------");
                    esperarMENU();
                    scanner.nextLine();
                    break;
                }
            }
        }
    }

    private static void NumeroOxidacion() {
        System.out.println("===============================================================================");
        System.out.println("|                             NÚMEROS DE OXIDACIÓN                            |");
        System.out.println("===============================================================================");
        System.out.println("| Representan la carga aparente que un átomo tiene dentro de un compuesto.    |");
        System.out.println("| Se usan para identificar agentes oxidantes y reductores.                    |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| REGLAS PRINCIPALES:                                                         |");
        System.out.println("| • Elementos libres = 0 (Ej: Fe, O₂, S₈).                                    |");
        System.out.println("| • Iones simples = su carga (Ej: Cl– = –1; Mg²+ = +2).                       |");
        System.out.println("| • Oxígeno = –2 (salvo peróxidos = –1 y superóxidos = –1/2).                 |");
        System.out.println("| • Hidrógeno = +1 (con metales = –1).                                        |");
        System.out.println("| • Halógenos = –1 (salvo con O o halógenos más electronegativos).            |");
        System.out.println("| • La suma total debe igualar la carga del compuesto.                        |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                   |");
        System.out.println("| -Ej 1: O en H₂O = –2.                                                       |");
        System.out.println("|       2H(+1) + O(–2) = 0 → correcto.                                        |");
        System.out.println("|                                                                             |");
        System.out.println("| -Ej 2: Fe en Fe₂O₃ = +3.                                                    |");
        System.out.println("|       3 oxígenos = –6 total, 2 Fe aportan +6 → +3 cada uno.                 |");
        System.out.println("|                                                                             |");
        System.out.println("| -Ej 3: El peróxido H₂O₂: O = –1.                                            |");
        System.out.println("|       2H(+1) + 2O(–1) = 0 → peróxido.                                       |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| IMPORTANCIA:                                                                |");
        System.out.println("| Permiten balancear reacciones REDOX y entender transferencia de electrones. |");
        System.out.println("-------------------------------------------------------------------------------");
    }

    private static void TemaPropiedadesPeriodicas() {
        System.out.println("==================================================================");
        System.out.println("|                    PROPIEDADES PERIÓDICAS                      |");
        System.out.println("==================================================================");
        System.out.println("| Son tendencias generales de los elementos en la tabla.         |");
        System.out.println("| Se explican por el tamaño atómico y la carga nuclear efectiva. |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| RADIO ATÓMICO                                                  |");
        System.out.println("| -Disminuye en un periodo (→) porque aumenta la atracción.      |");
        System.out.println("| -Aumenta en un grupo (↓) porque hay más niveles energéticos.   |");
        System.out.println("| Ej: Li > Be > B > C (se hace más pequeño).                     |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| ENERGÍA DE IONIZACIÓN                                          |");
        System.out.println("| Energía necesaria para quitar un electrón.                     |");
        System.out.println("| Aumenta a la derecha y arriba.                                 |");
        System.out.println("| Ej: Li < Be < B < C.                                           |");
        System.out.println("| Excepciones: B < Be y O < N por estabilidad electrónica.       |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| ELECTRONEGATIVIDAD                                             |");
        System.out.println("| Tendencia a atraer electrones en un enlace.                    |");
        System.out.println("| Aumenta a la derecha y arriba.                                 |");
        System.out.println("| Ej: C < N < O < F.                                             |");
        System.out.println("| El flúor es el más electronegativo.                            |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| AFINIDAD ELECTRÓNICA                                           |");
        System.out.println("| Energía liberada al ganar un electrón.                         |");
        System.out.println("| Aumenta hacia la derecha y arriba.                             |");
        System.out.println("| Los halógenos tienen altos valores.                            |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| CARÁCTER METÁLICO                                              |");
        System.out.println("| Aumenta hacia la izquierda y abajo de la tabla.                |");
        System.out.println("| Los metales pierden electrones con facilidad.                  |");
        System.out.println("------------------------------------------------------------------");
    }


    private static void TemaRadioAtomico() {
        System.out.println("======================================================================================");
        System.out.println("|                                   RADIO ATÓMICO                                    |");
        System.out.println("======================================================================================");
        System.out.println("| El radio atómico es la distancia entre el núcleo y el último electrón.             |");
        System.out.println("| Depende del número de niveles de energía y la carga nuclear efectiva.              |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| TENDENCIAS EN LA TABLA PERIÓDICA:                                                  |");
        System.out.println("| • AUMENTA de ARRIBA hacia ABAJO (↓): se agregan más niveles electrónicos.          |");
        System.out.println("| • AUMENTA de DERECHA hacia IZQUIERDA (←): menor atracción del núcleo.              |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                          |");
        System.out.println("| -Ej 1: Li (Litio) vs F (Flúor)                                                     |");
        System.out.println("|   Li tiene MAYOR radio atómico porque está más a la IZQUIERDA en el mismo periodo. |");
        System.out.println("|                                                                                    |");
        System.out.println("| -Ej 2: Na > F pero Na < K                                                          |");
        System.out.println("|   • Na es mayor que F porque está más ABAJO y a la IZQUIERDA.                      |");
        System.out.println("|   • Na es menor que K porque K tiene un nivel energético adicional.                |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| NOTA IMPORTANTE:                                                                   |");
        System.out.println("| Los metales suelen tener radios mayores que los no metales en un mismo periodo.    |");
        System.out.println("| Los cationes reducen su radio; los aniones aumentan su radio.                      |");
        System.out.println("--------------------------------------------------------------------------------------");
    }


    private static void TemaMetalNoMetal() {
        System.out.println("=================================================================================================");
        System.out.println("|                                     METAL vs NO METAL                                         |");
        System.out.println("=================================================================================================");
        System.out.println("| Los elementos se clasifican según sus propiedades físicas y su tendencia a perder o ganar e⁻. |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| CARACTERÍSTICAS DE LOS METALES:                                                               |");
        System.out.println("| • Pierden electrones y forman cationes (+).                                                   |");
        System.out.println("| • Son buenos conductores de calor y electricidad.                                             |");
        System.out.println("| • Son maleables, dúctiles y tienen brillo metálico.                                           |");
        System.out.println("| • Se encuentran en la parte izquierda y centro de la tabla.                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| CARACTERÍSTICAS DE LOS NO METALES:                                                            |");
        System.out.println("| • Ganan electrones y forman aniones (–).                                                      |");
        System.out.println("| • Son aislantes o malos conductores.                                                          |");
        System.out.println("| • Muchos son gases o sólidos frágiles.                                                        |");
        System.out.println("| • Se encuentran en la parte superior derecha de la tabla.                                     |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                                     |");
        System.out.println("| -Ej 1: Sodio (Na) -> METAL -> pierde electrones                                               |");
        System.out.println("|   Es blando, conductor y reacciona fuertemente con agua formando:                             |");
        System.out.println("|   Na + H₂O -> NaOH + 1/2 H₂  (reacción exotérmica).                                           |");
        System.out.println("|                                                                                               |");
        System.out.println("| -Ej 2: Cloro (Cl) -> NO METAL -> gana electrones                                              |");
        System.out.println("|   • Como gas Cl₂ es tóxico e irritante.                                                       |");
        System.out.println("|   • Como ion Cl⁻ es estable e inocuo.                                                         |");
        System.out.println("|   • Presente en sales: NaCl, KCl, CaCl₂, etc.                                                 |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                                   |");
        System.out.println("| Los metaloides presentan propiedades intermedias (Si, B, Ge, As...).                          |");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    private static void TemaValencia() {
        System.out.println("======================================================================================");
        System.out.println("|                        VALENCIA (CAPACIDAD DE COMBINACIÓN)                         |");
        System.out.println("======================================================================================");
        System.out.println("| La valencia indica cuántos electrones puede ganar, perder o compartir un átomo.    |");
        System.out.println("| Se relaciona con el número de electrones en la capa de valencia.                   |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                          |");
        System.out.println("| -Ej 1: Nitrógeno (N) -> valencia 3 en NH₃.                                         |");
        System.out.println("|   Forma 3 enlaces covalentes usando 3 electrones, dejando 1 par libre.             |");
        System.out.println("|   Esto le permite aceptar un H⁺ -> formando NH₄⁺ (base de Brønsted).               |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Nitrógeno (N) -> valencia 5 en HNO₃.                                        |");
        System.out.println("|   En combinación con oxígeno puede expandir su capacidad de enlace aparente.       |");
        System.out.println("|   Por eso el ácido nítrico es un oxiácido fuerte con estructura resonante estable. |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| INFORMACIÓN EXTRA:                                                                 |");
        System.out.println("| • Algunos elementos tienen VALENCIA VARIABLE (Fe: 2 y 3, S: 2, 4, 6, P: 3 y 5).    |");
        System.out.println("| • La valencia NO siempre es igual al número de oxidación, aunque a veces coincide. |");
        System.out.println("| • Los gases nobles tienen valencia 0 en condiciones normales (no forman enlaces).  |");
        System.out.println("--------------------------------------------------------------------------------------");
    }

    private static void TemaElementosTransicion() {
        System.out.println("===========================================================================================");
        System.out.println("|                                ELEMENTOS DE TRANSICIÓN                                  |");
        System.out.println("===========================================================================================");
        System.out.println("| Son elementos del bloque d y f, caracterizados por tener electrones en el subnivel      |");
        System.out.println("| d parcialmente lleno. Esto les permite propiedades especiales y estados variables.      |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| CARACTERÍSTICAS PRINCIPALES:                                                            |");
        System.out.println("| • Poseen múltiples números de oxidación.                                                |");
        System.out.println("| • Forman compuestos intensamente coloreados.                                            |");
        System.out.println("| • Son buenos catalizadores (Fe, Ni, Pt, V₂O₅).                                          |");
        System.out.println("| • Presentan propiedades magnéticas (Fe, Co, Ni).                                        |");
        System.out.println("| • Suelen ser metales duros y con altos puntos de fusión.                                |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                               |");
        System.out.println("| -Ej 1: Hierro (Fe) -> configuración [Ar] 3d⁶ 4s².                                       |");
        System.out.println("|   Sus electrones 3d permiten formar Fe²⁺ y Fe³⁺.                                        |");
        System.out.println("|   Es ferromagnético y esencial en hemoglobina, aceros y catalizadores.                  |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Cromo (Cr) -> configuración [Ar] 3d⁵ 4s¹.                                        |");
        System.out.println("|   Tiene estados de oxidación +2, +3 y +6.                                               |");
        System.out.println("|   • Cr³⁺: estable, presente en pigmentos verdes y compuestos coloridos.                 |");
        System.out.println("|   • Cr⁶⁺: fuerte agente oxidante en dicromatos (naranja intenso).                       |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                             |");
        System.out.println("| Los elementos del bloque f (lantánidos y actínidos) también suelen llamarse de          |");
        System.out.println("| transición interna. Son responsables de imanes potentes, láseres y reactores nucleares. |");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    private static void TemaEnergiaIonizacion() {
        System.out.println("==================================================================================");
        System.out.println("|                              ENERGÍA DE IONIZACIÓN                             |");
        System.out.println("==================================================================================");
        System.out.println("| Es la energía necesaria para remover un electrón de un átomo en estado gaseoso |");
        System.out.println("| y formar un ion positivo (catión).                                             |");
        System.out.println("| Mientras más fuerte el núcleo atrae a los electrones, mayor es esta energía.   |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| TENDENCIAS PERIÓDICAS:                                                         |");
        System.out.println("| • Aumenta de izquierda → derecha en un periodo (el núcleo atrae más).          |");
        System.out.println("| • Disminuye de arriba ↓ abajo en un grupo (más capas electrónicas).            |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                      |");
        System.out.println("| -Ej 1: Sodio (Na) -> 496 kJ/mol.                                               |");
        System.out.println("|   Tiene 1 e⁻ externo poco atraído -> lo pierde fácilmente -> Na⁺.              |");
        System.out.println("|   Su baja ionización explica su alta reactividad y uso biológico (iones Na⁺).  |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Potasio (K) -> 419 kJ/mol, aún menor que Na.                            |");
        System.out.println("|   Es más grande, el e⁻ externo está más lejos del núcleo.                      |");
        System.out.println("|   Por eso forma K⁺ muy fácilmente, clave en los impulsos nerviosos.            |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| -Ej 3: Flúor (F) -> 1681 kJ/mol.                                              |");
        System.out.println("|   Altísima energía de ionización porque el núcleo atrae muy fuerte a sus e⁻.   |");
        System.out.println("|   Por eso NO forma F⁺, sino que gana electrones -> F⁻.                         |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                    |");
        System.out.println("| Los gases nobles tienen las energías de ionización MÁS ALTAS debido a su       |");
        System.out.println("| configuración estable (octeto completo).                                       |");
        System.out.println("==================================================================================");
    }

    private static void TemaElectronesValencia() {
        System.out.println("==========================================================================================");
        System.out.println("|                                  ELECTRONES DE VALENCIA                                |");
        System.out.println("==========================================================================================");
        System.out.println("| Son los electrones de la capa externa de un átomo.                                     |");
        System.out.println("| Determinan:                                                                            |");
        System.out.println("| • Cómo reacciona un elemento.                                                          |");
        System.out.println("| • Qué tipo de enlaces forma (iónicos o covalentes).                                    |");
        System.out.println("| • La geometría y polaridad de las moléculas.                                           |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                              |");
        System.out.println("| -Ej 1: Carbono (C) -> 4 electrones de valencia.                                        |");
        System.out.println("|   Puede formar 4 enlaces: simples (C–C), dobles (C=C), triples (C≡C).                  |");
        System.out.println("|   Esto lo convierte en la base de la química orgánica y la vida.                       |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Silicio (Si) -> 4 electrones de valencia.                                       |");
        System.out.println("|   Forma estructura tetraédrica como en SiO₂ (sílice), presente en arena y vidrio.      |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 3: Oxígeno (O) -> 6 electrones de valencia.                                        |");
        System.out.println("|   Tiende a formar 2 enlaces (O²⁻ en compuestos iónicos o enlaces dobles en covalentes) |");
        System.out.println("|   -> por eso en el agua H₂O, forma 2 enlaces sencillos y 2 pares libres.               |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 4: Cloro (Cl) -> 7 electrones de valencia.                                         |");
        System.out.println("|   Gana 1 electrón -> forma Cl⁻.                                                        |");
        System.out.println("|   También puede formar enlaces covalentes (HCl, Cl₂).                                  |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                            |");
        System.out.println("| • Los electrones de valencia se observan en la configuración electrónica.              |");
        System.out.println("| • Para elementos del bloque d, a veces también cuentan electrones del subnivel (n−1)d. |");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    private static void TemaElectronesPerifericos() {
        System.out.println("=================================================================================================");
        System.out.println("|                                    ELECTRONES PERIFÉRICOS                                     |");
        System.out.println("=================================================================================================");
        System.out.println("| Son los electrones ubicados en la capa más externa del átomo. Son los que primero interactúan |");
        System.out.println("| con otros átomos y determinan su reactividad química.                                         |");
        System.out.println("|                                                                                               |");
        System.out.println("| -Ej 1: Oxígeno (O) -> Electrones periféricos = 6 (capa 2).                                    |");
        System.out.println("|  Configuración externa: 2s² 2p⁴ -> 6 e⁻ periféricos.                                          |");
        System.out.println("|  Es muy reactivo porque solo necesita 2 electrones para completar el octeto.                  |");
        System.out.println("|                                                                                               |");
        System.out.println("| -Ej 2: Azufre (S) -> También tiene 6 electrones periféricos (capa 3).                         |");
        System.out.println("|  Configuración externa: 3s² 3p⁴ -> 6 e⁻ periféricos.                                          |");
        System.out.println("|  Por eso forma 2 enlaces como el oxígeno y compuestos como H₂S.                               |");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    private static void TemaAfinidadElectronica() {
        System.out.println("==================================================================================================");
        System.out.println("|                           AFINIDAD ELECTRÓNICA Y ELECTRONEGATIVIDAD                            |");
        System.out.println("==================================================================================================");
        System.out.println("| Los elementos del grupo 17 (halógenos) son muy reactivos debido a su alta afinidad electrónica |");
        System.out.println("| (liberan energía al ganar un electrón) y su alta electronegatividad (atraen electrones en un   |");
        System.out.println("| enlace químico).                                                                               |");
        System.out.println("|                                                                                                |");
        System.out.println("| -Ej 1: Cloro (Cl) -> Alta afinidad electrónica y alta electronegatividad.                      |");
        System.out.println("|  Cuando Cl gana 1 electrón forma Cl-, el ion presente en la sal común (NaCl).                  |");
        System.out.println("|  También forma el ácido fuerte HCl cuando se disuelve en agua.                                 |");
        System.out.println("|                                                                                                |");
        System.out.println("| -Ej 2: Bromo (Br) -> También gana electrones fácilmente para completar el octeto.              |");
        System.out.println("|  Forma el ion Br⁻ en sales como KBr.                                                           |");
        System.out.println("|  Su molécula Br₂ es líquida a temperatura ambiente, lo cual es inusual en no metales.          |");
        System.out.println("--------------------------------------------------------------------------------------------------");
    }

    private static void TemaConstruccionTablaPeriodica() {
        System.out.println("==============================================================================================");
        System.out.println("|                             CONSTRUCCIÓN DE LA TABLA PERIÓDICA                             |");
        System.out.println("==============================================================================================");
        System.out.println("| La tabla periódica se construye ordenando los elementos por su número atómico (Z), que es  |");
        System.out.println("| la cantidad de protones en el núcleo. A medida que Z aumenta, también cambian sus niveles  |");
        System.out.println("| de energía y su configuración electrónica.                                                 |");
        System.out.println("|                                                                                            |");
        System.out.println("| Las filas se llaman PERIODOS y representan cuántos niveles de energía tiene un átomo.      |");
        System.out.println("| Las columnas se llaman GRUPOS y reúnen elementos con propiedades químicas similares, ya    |");
        System.out.println("| que tienen la misma cantidad de electrones de valencia.                                    |");
        System.out.println("|                                                                                            |");
        System.out.println("| La tabla también se divide en BLOQUES (s, p, d, f) según el tipo de orbital donde termina  |");
        System.out.println("| la configuración electrónica del elemento. Esto permite predecir reactividad, valencias y  |");
        System.out.println("| comportamiento químico.                                                                    |");
        System.out.println("|                                                                                            |");
        System.out.println("| -Ej 1: Helio (He) -> Fila 1, grupo 18 -> Gas noble.                                        |");
        System.out.println("|  Configuración: 1s². Aunque está en el periodo 1 (solo un nivel), su capa está completa,   |");
        System.out.println("|  por eso es extremadamente estable e inerte. Se utiliza en globos, resonadores y sistemas  |");
        System.out.println("|  criogénicos por ser muy ligero y no inflamable.                                           |");
        System.out.println("|                                                                                            |");
        System.out.println("| -Ej 2: Neón (Ne) -> Fila 2, grupo 18 -> Gas noble.                                         |");
        System.out.println("|  Configuración externa: 2s² 2p⁶. Su octeto completo lo vuelve totalmente inerte.           |");
        System.out.println("|  El neón es famoso en los letreros luminosos porque, al pasar corriente eléctrica, emite   |");
        System.out.println("|  un característico brillo rojo-anaranjado.                                                 |");
        System.out.println("|                                                                                            |");
        System.out.println("| La tabla periódica moderna fue desarrollada inicialmente por Mendeleiev y luego ajustada   |");
        System.out.println("| para acomodar las configuraciones electrónicas, lo que permitió predecir elementos aún no  |");
        System.out.println("| descubiertos. Hoy en día, sigue creciendo conforme se sintetizan nuevos elementos.         |");
        System.out.println("---------------------------------------------------------------------------------------------");
    }


    public static void MenuEjemplos() {
        limpiarPantalla();
        System.out.println("================================================");
        System.out.println("|             EJEMPLOS - UNIDAD 3              |");
        System.out.println("================================================");
        System.out.println("| 1. Afinidad electrónica y electronegatividad |");
        System.out.println("| 2. Construcción de la tabla periódica        |");
        System.out.println("| 3. Electrones periféricos                    |");
        System.out.println("| 4. Electrones de valencia                    |");
        System.out.println("| 5. Electrones de transición                  |");
        System.out.println("| 6. Energía de ionización                     |");
        System.out.println("| 7. Metal y no metal                          |");
        System.out.println("| 8. Valencia                                  |");
        System.out.println("| 9. Radio atómico                             |");
        System.out.println("| 10. Propiedades periódicas                   |");
        System.out.println("| 11. Números de oxidación                     |");
        System.out.println("| 0. Regresar al menú principal                |");
        System.out.println("------------------------------------------------");
        System.out.println("Elige una opción: ");
    }

    public static void EjemplosUnidad4() {

        int opcionSubtema = -1;
        do {
            limpiarPantalla();
            System.out.println("==========================================================");
            System.out.println("|                      EJEMPLOS - UNIDAD 4               |");
            System.out.println("==========================================================");
            System.out.println("| 1. Enlace Químico                                      |");
            System.out.println("| 2. Enlace Iónico                                       |");
            System.out.println("| 3. Enlace Covalente                                    |");
            System.out.println("| 4. Tipos de Covalencia                                 |");
            System.out.println("| 5. Enlace Dativo                                       |");
            System.out.println("| 6. Enlaces Especiales                                  |");
            System.out.println("| 7. Hibridación                                         |");
            System.out.println("| 8. Propiedades derivadas del tipo de enlace            |");
            System.out.println("| 0. Regresar al menú principal                          |");
            System.out.println("----------------------------------------------------------");
            System.out.println("Elige una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarTecla(sc);
                continue;
            }

            opcionSubtema = sc.nextInt();
            sc.nextLine(); // limpiar ENTER

            switch (opcionSubtema) {
                case 1:
                    limpiarPantalla();
                    System.out.println("================================================================");
                    System.out.println("|                 EJEMPLO: ENLACE QUÍMICO                      |");
                    System.out.println("================================================================");
                    System.out.println("| Ejemplo de enlace covalente sencillo:                        |");
                    System.out.println("|                                                              |");
                    System.out.println("|   H   +   H   →   H₂                                         |");
                    System.out.println("|                                                              |");
                    System.out.println("| - Cada átomo de hidrógeno aporta 1 electrón.                 |");
                    System.out.println("| - Comparten un par de electrones para alcanzar estabilidad.  |");
                    System.out.println("| - Se forma una molécula diatómica mediante enlace covalente. |");
                    System.out.println("| - Los enlaces covalentes ocurren entre no metales.           |");
                    System.out.println("| - El objetivo es completar el octeto (o dueto en H).         |");
                    System.out.println("================================================================");
                    esperarTecla(sc);
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=============================================================================");
                    System.out.println("|                         EJEMPLO:  ENLACE IÓNICO                           |");
                    System.out.println("=============================================================================");
                    System.out.println("|  Na + Cl = NaCl                                                           |");
                    System.out.println("| - Na cede un electrón y Cl lo recibe, formando atracción electrostática.  |");
                    System.out.println("| Otros ejemplos son:                                                       |");
                    System.out.println("| Óxido de magnesio (MgO)                                                   |");
                    System.out.println("| Ioduro de potasio (KI)                                                    |");
                    System.out.println("| Hidróxido de zinc (Zn(OH)2                                                |");
                    System.out.println("=============================================================================");
                    esperarTecla(sc);
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("==============================================================================");
                    System.out.println("|                      EJEMPLO: ENLACE COVALENTE                             |");
                    System.out.println("==============================================================================");
                    System.out.println("| Ejemplo principal:                                                         |");
                    System.out.println("|                                                                            |");
                    System.out.println("|                               H₂O (Agua)                                   |");
                    System.out.println("|                                                                            |");
                    System.out.println("| - El oxígeno comparte un par de electrones con cada átomo de hidrógeno.    |");
                    System.out.println("| - Todos los átomos logran completar su regla del octeto (excepto H, que    |");
                    System.out.println("|   completa su dueto).                                                      |");
                    System.out.println("| - El enlace entre O-H es covalente polar debido a que el oxígeno tiene     |");
                    System.out.println("|   mayor electronegatividad, generando una carga parcial negativa (δ−) en   |");
                    System.out.println("|   el oxígeno y parcial positiva (δ+) en los hidrógenos.                    |");
                    System.out.println("| - Esto provoca propiedades importantes como la tensión superficial y la    |");
                    System.out.println("|   capacidad de disolver muchas sustancias.                                 |");
                    System.out.println("|                                                                            |");
                    System.out.println("| Otros ejemplos relevantes de enlaces covalentes:                           |");
                    System.out.println("|                                                                            |");
                    System.out.println("| • CO₂ – Dióxido de carbono:                                                |");
                    System.out.println("|   El carbono comparte dos pares de electrones con cada oxígeno, formando   |");
                    System.out.println("|   dos enlaces dobles. Es una molécula lineal y no polar.                   |");
                    System.out.println("|                                                                            |");
                    System.out.println("| • CH₄ – Metano:                                                            |");
                    System.out.println("|   El carbono comparte un electrón con cada hidrógeno, creando 4 enlaces    |");
                    System.out.println("|   covalentes simples. Es una molécula estable y simétrica.                 |");
                    System.out.println("|                                                                            |");
                    System.out.println("| • F₂ – Diflúor:                                                            |");
                    System.out.println("|   Dos átomos de flúor comparten un par de electrones para estabilizarse.   |");
                    System.out.println("|   Es un enlace covalente no polar porque ambos átomos tienen la misma      |");
                    System.out.println("|   electronegatividad.                                                      |");
                    System.out.println("|                                                                            |");
                    System.out.println("| Características clave del enlace covalente:                                |");
                    System.out.println("| - Se da entre no metales.                                                  |");
                    System.out.println("| - Los átomos comparten electrones.                                         |");
                    System.out.println("| - Pueden formar enlaces simples, dobles o triples.                         |");
                    System.out.println("| - Las moléculas pueden ser polares o no polares.                           |");
                    System.out.println("| - Forman sustancias como gases, líquidos y sólidos moleculares.            |");
                    System.out.println("==============================================================================");
                    esperarTecla(sc);
                    break;

                case 4:
                    limpiarPantalla();
                    System.out.println("====================================================================================");
                    System.out.println("|                     EJEMPLO: TIPOS DE COVALENCIA                                 |");
                    System.out.println("====================================================================================");
                    System.out.println("| H2 (simple), O2 (doble), N2 (triple)                                             |");
                    System.out.println("| - La fuerza y longitud de enlace depende de los pares de electrones compartidos. |");
                    System.out.println("| Otros ejemplos son:                                                              |");
                    System.out.println("| H2O:El átomo de oxígeno atrae los electrones con mayor fuerza que los hidrógenos.|");
                    System.out.println("| HCl:El cloro atrae los electrones con más fuerza que el hidrógeno.               |");
                    System.out.println("| SO2:El azufre (S) puede donar un par de electrones al oxígeno (O).               |");
                    System.out.println("====================================================================================");
                    esperarTecla(sc);
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("================================================================");
                    System.out.println("|                    EJEMPLO: ENLACE DATIVO                    |");
                    System.out.println("================================================================");
                    System.out.println("| Ejemplo principal:                                           |");
                    System.out.println("|                                                              |");
                    System.out.println("|               NH₄⁺ (Ion Amonio)                              |");
                    System.out.println("|                                                              |");
                    System.out.println("| - El nitrógeno del NH₃ dona un par de electrones libres      |");
                    System.out.println("|   para unirse con un ion H⁺ que no tiene electrones.         |");
                    System.out.println("| - El enlace formado se llama 'enlace coordinado' o dativo.   |");
                    System.out.println("| - Aunque el par es donado solo por el nitrógeno, una vez     |");
                    System.out.println("|   formado el enlace, se comporta igual que un covalente.     |");
                    System.out.println("| - El ion resultante es un catión estable: NH₄⁺.              |");
                    System.out.println("|                                                              |");
                    System.out.println("| Otros ejemplos importantes:                                  |");
                    System.out.println("|                                                              |");
                    System.out.println("| • Ion Hidronio (H₃O⁺):                                       |");
                    System.out.println("|   El oxígeno del H₂O dona un par de electrones para unirse   |");
                    System.out.println("|   con un ion H⁺ y formar H₃O⁺.                               |");
                    System.out.println("|                                                              |");
                    System.out.println("| • Complejos metálicos:                                       |");
                    System.out.println("|   Moléculas como NH₃, H₂O o CO donan pares de electrones     |");
                    System.out.println("|   a un ion metálico como Cu²⁺ o Fe²⁺ formando complejos.     |");
                    System.out.println("|                                                              |");
                    System.out.println("| Características clave del enlace dativo:                     |");
                    System.out.println("| - Un solo átomo aporta los dos electrones compartidos.       |");
                    System.out.println("| - Se representa con una flecha: A → B.                       |");
                    System.out.println("| - Es común en iones poliatómicos y complejos.                |");
                    System.out.println("| - Tras formarse, el enlace funciona igual que uno covalente. |");
                    System.out.println("================================================================");
                    esperarTecla(sc);
                    break;

                case 6:
                    limpiarPantalla();
                    System.out.println("==================================================================================");
                    System.out.println("|                  EJEMPLO: ENLACES ESPECIALES                                   |");
                    System.out.println("==================================================================================");
                    System.out.println("| H2O intermolecular                                                             |");
                    System.out.println("| - Puentes de hidrógeno entre moléculas polares, no unión directa de átomos.    |");
                    System.out.println("| Otros ejemplos son:                                                            |");
                    System.out.println("| el enlace covalente en el metano CH4 y el enlace metálico en el hierro Fe.     |");
                    System.out.println("==================================================================================");
                    esperarTecla(sc);
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("========================================================");
                    System.out.println("|                EJEMPLO: HIBRIDACIÓN                  |");
                    System.out.println("========================================================");
                    System.out.println("| CH4 – Carbono con hibridación sp3                    |");
                    System.out.println("| - El carbono mezcla un orbital s y tres p para       |");
                    System.out.println("|   formar 4 orbitales híbridos sp3 equivalentes.      |");
                    System.out.println("| - La molécula adopta geometría tetraédrica con       |");
                    System.out.println("|   ángulos aproximados de 109.5°.                     |");
                    System.out.println("| - Esto explica por qué el metano es muy estable.     |");
                    System.out.println("|                                                      |");
                    System.out.println("| Otros ejemplos y tipos de hibridación:               |");
                    System.out.println("|                                                      |");
                    System.out.println("| • Amoniaco (NH3) – Hibridación sp3                   |");
                    System.out.println("|   Tiene geometría piramidal trigonal debido a un     |");
                    System.out.println("|   par de electrones libres en el nitrógeno.          |");
                    System.out.println("|                                                      |");
                    System.out.println("| • Etileno (C2H4) – Hibridación sp2                   |");
                    System.out.println("|   Cada carbono usa hibridación sp2, lo que deja un   |");
                    System.out.println("|   orbital p sin hibridar que forma un enlace π.      |");
                    System.out.println("|   La geometría es trigonal plana.                    |");
                    System.out.println("|                                                      |");
                    System.out.println("| • Benceno (C6H6) – Hibridación sp2                   |");
                    System.out.println("|   Los seis carbonos están hibridados sp2, formando   |");
                    System.out.println("|   un anillo plano con un sistema de electrones π     |");
                    System.out.println("|   deslocalizados que le dan estabilidad aromática.   |");
                    System.out.println("|                                                      |");
                    System.out.println("| ¿Qué es la hibridación?                              |");
                    System.out.println("| - Es el proceso donde orbitales atómicos se mezclan  |");
                    System.out.println("|   para formar nuevos orbitales híbridos con          |");
                    System.out.println("|   energías y formas iguales, facilitando enlaces     |");
                    System.out.println("|   más estables y simétricos.                         |");
                    System.out.println("========================================================");
                    esperarTecla(sc);
                    break;

                case 8:
                    limpiarPantalla();
                    System.out.println("============================================================================");
                    System.out.println("|              EJEMPLO: PROPIEDADES DERIVADAS DE TIPO ENLACE               |");
                    System.out.println("============================================================================");
                    System.out.println("| NaCl sólido (alto punto de fusión)                                       |");
                    System.out.println("| H2O líquido (puentes de hidrógeno)                                       |");
                    System.out.println("| - Las propiedades dependen del tipo de enlace y fuerza entre partículas. |");
                    System.out.println("| Otras propiedades derivadas por el tipo de enlace son:                   |");
                    System.out.println("| °Dureza y fragilidad                                                     |");
                    System.out.println("| °Maleabilidad y ductilidad                                               |");
                    System.out.println("============================================================================");
                    esperarTecla(sc);
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    esperarTecla(sc);
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=======================================");
                    System.out.println("| Opción no válida. Intente de nuevo. |");
                    System.out.println("=======================================");
                    esperarTecla(sc);
                    break;

            }
        } while (opcionSubtema != 0);
    }

    public static int leerOpcion() {
        while (true) {
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                int opcion = sc.nextInt();
                sc.nextLine();
                return opcion;
            } else {
                System.out.println("\n");
                System.out.println("=======================================");
                System.out.println("| Opción no válida. Intente de nuevo. |");
                System.out.println("=======================================");
                sc.nextLine();
                esperarTecla(sc);
            }
        }
    }


    public static void EjemplosUnidad5() {

        int opcion = -1;

        while (opcion != 0) {

            limpiarPantalla();

            System.out.println("==============================================");
            System.out.println("|           UNIDAD 5 – EJEMPLOS              |");
            System.out.println("==============================================");
            System.out.println("|  1. Hidróxidos                             |");
            System.out.println("|  2. Hidruros metálicos                     |");
            System.out.println("|  3. Hidruros no metálicos                  |");
            System.out.println("|  4. Nomenclatura inorgánica                |");
            System.out.println("|  5. Números de oxidación                   |");
            System.out.println("|  6. Óxidos metálicos                       |");
            System.out.println("|  7. Óxidos no metálicos                    |");
            System.out.println("|  8. Oxoácidos                              |");
            System.out.println("|  9. Oxisales                               |");
            System.out.println("| 10. Sales ácidas                           |");
            System.out.println("| 11. Sales binarias                         |");
            System.out.println("|  0. Salir                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n");
                System.out.println("=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                scanner.nextLine(); // limpia basura
                esperarMENU();
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar ENTER


            switch (opcion) {

                case 1 -> {
                    limpiarPantalla();
                    System.out.println("=======================================================");
                    System.out.println("|                     HIDRÓXIDOS                      |");
                    System.out.println("=======================================================");
                    System.out.println("| Los hidróxidos son compuestos formados por:         |");
                    System.out.println("|   - Un metal + el ion hidróxido (OH-)               |");
                    System.out.println("|                                                     |");
                    System.out.println("| Características:                                    |");
                    System.out.println("|   • Son compuestos básicos (aumentan el pH).        |");
                    System.out.println("|   • Pueden ser cáusticos o corrosivos.              |");
                    System.out.println("|   • Reaccionan con ácidos para formar sales + H₂O.  |");
                    System.out.println("|                                                     |");
                    System.out.println("| Nomenclatura:                                       |");
                    System.out.println("|   • Se nombran como hidróxido de + nombre del metal |");
                    System.out.println("|   • Ejemplo: NaOH → hidróxido de sodio              |");
                    System.out.println("|                                                     |");
                    System.out.println("| Reacciones típicas:                                 |");
                    System.out.println("|    NaOH  +  HCl →    NaCl  +  H₂O                   |");
                    System.out.println("|   (base)  (ácido)   (sal)   (agua)                  |");
                    System.out.println("|                                                     |");
                    System.out.println("| Ejemplos comunes:                                   |");
                    System.out.println("|   • NaOH  (hidróxido de sodio)                      |");
                    System.out.println("|   • KOH   (hidróxido de potasio)                    |");
                    System.out.println("|   • Ca(OH)₂  (hidróxido de calcio)                  |");
                    System.out.println("|   • Al(OH)₃  (hidróxido de aluminio)                |");
                    System.out.println("|                                                     |");
                    System.out.println("=======================================================");
                    esperarMENU();
                    break;
                }


                case 2 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                HIDRUROS METÁLICOS                  |");
                    System.out.println("======================================================");
                    System.out.println("| Los hidruros metálicos son compuestos formados por:|");
                    System.out.println("|   - Un metal + hidrógeno con carga negativa (H-)   |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Son sólidos iónicos en su mayoría.             |");
                    System.out.println("|   • Muy reactivos con el agua, liberan H2.         |");
                    System.out.println("|   • Actúan como agentes reductores fuertes.        |");
                    System.out.println("|   • Se usan como almacenadores de hidrógeno.       |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica con agua:                          |");
                    System.out.println("|   CaH₂ +      2 H₂O →    Ca(OH)₂ +   2  H₂↑        |");
                    System.out.println("|   (hidruro)   (agua)   (hidróxido)  (hidrógeno)    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • \"Hidruro de\" + nombre del metal                |");
                    System.out.println("|   • Ejemplo: NaH → hidruro de sodio                |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • NaH  (hidruro de sodio)                        |");
                    System.out.println("|   • CaH₂ (hidruro de calcio)                       |");
                    System.out.println("|   • LiH  (hidruro de litio)                        |");
                    System.out.println("|   • MgH₂ (hidruro de magnesio)                     |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 3 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                 HIDRUROS NO METÁLICOS              |");
                    System.out.println("======================================================");
                    System.out.println("| Los hidruros no metálicos son compuestos donde:    |");
                    System.out.println("|   - El hidrógeno se une covalentemente a un        |");
                    System.out.println("|     elemento no metálico.                          |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Forman moléculas covalentes.                   |");
                    System.out.println("|   • Al disolverse en agua pueden formar ácidos.    |");
                    System.out.println("|   • Su acidez depende del tipo de enlace y         |");
                    System.out.println("|     la electronegatividad del no metal.            |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos y sus ácidos correspondientes:            |");
                    System.out.println("|   • HCl → ácido clorhídrico                        |");
                    System.out.println("|   • HF  → ácido fluorhídrico                       |");
                    System.out.println("|   • H2S → ácido sulfhídrico                        |");
                    System.out.println("|   • HBr → ácido bromhídrico                        |");
                    System.out.println("|   • HI  → ácido yodhídrico                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica en agua:                           |");
                    System.out.println("|      HCl    +  H₂O   →   H₃O⁺ + Cl⁻                |");
                    System.out.println("|   (hidruro)   (agua)   (ión hidronio)              |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • En estado gaseoso: 'Hidruro de + no metal'     |");
                    System.out.println("|        Ejemplo: H₂S (g) → hidruro de azufre        |");
                    System.out.println("|   • En disolución acuosa: 'Ácido + raíz + hídrico' |");
                    System.out.println("|        Ejemplo: H₂S (ac) → ácido sulfhídrico       |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 4 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|               NOMENCLATURA INORGÁNICA              |");
                    System.out.println("======================================================");
                    System.out.println("| La nomenclatura inorgánica establece reglas para   |");
                    System.out.println("| nombrar compuestos químicos de manera clara y      |");
                    System.out.println("| universal.                                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Principales sistemas de nomenclatura:              |");
                    System.out.println("|   • Sistemática (usa prefijos: mono-, di-, tri-)   |");
                    System.out.println("|   • Stock (usa números romanos para el E.O.)       |");
                    System.out.println("|   • Tradicional (nombres antiguos: óxido ferroso)  |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos:                                          |");
                    System.out.println("|   • CO₂ → dióxido de carbono                       |");
                    System.out.println("|   • Fe₂O₃ → óxido de hierro (III)                  |");
                    System.out.println("|   • NaCl → cloruro de sodio                        |");
                    System.out.println("|   • SO₃ → trióxido de azufre                       |");
                    System.out.println("|                                                    |");
                    System.out.println("| Regla general:                                     |");
                    System.out.println("|   • Nombre = anión + de + catión                   |");
                    System.out.println("|   • Para metales con varios E.O.: (metal)(E.O.)    |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 5 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                 NÚMEROS DE OXIDACIÓN               |");
                    System.out.println("======================================================");
                    System.out.println("| El número de oxidación (N.O.) indica cuántos       |");
                    System.out.println("| electrones gana o pierde un átomo al formar un     |");
                    System.out.println("| compuesto.                                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Importancia:                                       |");
                    System.out.println("|   • Permite identificar agentes oxidantes/reduct.  |");
                    System.out.println("|   • Fundamental para balancear ecuaciones REDOX.   |");
                    System.out.println("|   • Ayuda a determinar fórmulas y nomenclatura.    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reglas básicas:                                    |");
                    System.out.println("|   • Elemento libre: 0                              |");
                    System.out.println("|   • Oxígeno: -2 (excepto peróxidos)                |");
                    System.out.println("|   • Hidrógeno: +1 (en metálicos: -1)               |");
                    System.out.println("|   • Metales alcalinos: +1                          |");
                    System.out.println("|   • Metales alcalinotérreos: +2                    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos:                                          |");
                    System.out.println("|   O = -2                                           |");
                    System.out.println("|   H = +1 (en NH₃, por ejemplo)                     |");
                    System.out.println("|   Na = +1                                          |");
                    System.out.println("|   Cl en HCl = -1                                   |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 6 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                   ÓXIDOS METÁLICOS                 |");
                    System.out.println("======================================================");
                    System.out.println("| Los óxidos metálicos son compuestos formados por:  |");
                    System.out.println("|   - Metal + oxígeno (O²⁻).                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Poseen carácter básico.                        |");
                    System.out.println("|   • Reaccionan con agua para formar hidróxidos.    |");
                    System.out.println("|   • Reaccionan con ácidos para formar sales.       |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacciones típicas:                                |");
                    System.out.println("|   1) Con agua:                                     |");
                    System.out.println("|      CaO + H₂O → Ca(OH)₂                           |");
                    System.out.println("|   2) Con ácidos:                                   |");
                    System.out.println("|      MgO + 2HCl → MgCl₂ + H₂O                      |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • Óxido de + metal                               |");
                    System.out.println("|   • Si el metal tiene varios E.O.:                 |");
                    System.out.println("|        óxido de (metal) (E.O.)                     |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • CaO   (óxido de calcio)                        |");
                    System.out.println("|   • MgO   (óxido de magnesio)                      |");
                    System.out.println("|   • Na₂O (óxido de sodio)                          |");
                    System.out.println("|   • FeO   (óxido de hierro II)                     |");
                    System.out.println("|   • Fe₂O₃ (óxido de hierro III)                    |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 7 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                 ÓXIDOS NO METÁLICOS                |");
                    System.out.println("======================================================");
                    System.out.println("| También llamados anhídridos, se forman por:        |");
                    System.out.println("|   - No metal + oxígeno                             |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Presentan carácter ácido.                      |");
                    System.out.println("|   • Reaccionan con agua para formar oxoácidos.     |");
                    System.out.println("|   • Son covalentes (moléculas).                    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacciones típicas con agua:                       |");
                    System.out.println("|   CO₂ + H₂O → H₂CO₃   (ácido carbónico)            |");
                    System.out.println("|   SO₃ + H₂O → H₂SO₄   (ácido sulfúrico)            |");
                    System.out.println("|   N₂O₅ + H₂O → 2HNO₃  (ácido nítrico)              |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • Óxido de + no metal con prefijos               |");
                    System.out.println("|        (mono-, di-, tri-, tetra-, penta-)          |");
                    System.out.println("|        Ejemplo: CO₂ → dióxido de carbono           |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • CO₂   (dióxido de carbono)                     |");
                    System.out.println("|   • SO₃   (trióxido de azufre)                     |");
                    System.out.println("|   • N₂O₅  (pentóxido de dinitrógeno)               |");
                    System.out.println("|   • P₂O₅  (pentóxido de diprósforo)                |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 8 -> {
                    limpiarPantalla();
                    System.out.println("=========================================================");
                    System.out.println("|                       OXOÁCIDOS                       |");
                    System.out.println("=========================================================");
                    System.out.println("| Los oxoácidos (u oxácidos) están formados por:        |");
                    System.out.println("|   - Hidrógeno + No metal + Oxígeno                    |");
                    System.out.println("|                                                       |");
                    System.out.println("| Características:                                      |");
                    System.out.println("|   • Contienen el grupo funcional: H–O–(no metal)      |");
                    System.out.println("|   • Su fuerza depende del número de oxígenos:         |");
                    System.out.println("|        Más O → ácido más fuerte.                      |");
                    System.out.println("|   • Forman oxisales al reaccionar con bases.          |");
                    System.out.println("|   • Son esenciales en química ambiental e industrial. |");
                    System.out.println("|                                                       |");
                    System.out.println("| Ejemplos importantes:                                 |");
                    System.out.println("|   • H₂SO₄ → ácido sulfúrico                           |");
                    System.out.println("|   • HNO₃  → ácido nítrico                             |");
                    System.out.println("|   • H3PO₄ → ácido fosfórico                           |");
                    System.out.println("|   • HClO₄ → ácido perclórico                          |");
                    System.out.println("|                                                       |");
                    System.out.println("| Reacciones típicas con bases (neutralización):        |");
                    System.out.println("|   H₂SO₄ + 2NaOH → Na₂SO₄ + 2H₂O                       |");
                    System.out.println("|                                                       |");
                    System.out.println("| Nomenclatura (Stock y tradicional):                   |");
                    System.out.println("|   • Ácido + raíz + sufijo (ico/oso)                   |");
                    System.out.println("|      - HNO₂ → ácido nitroso                           |");
                    System.out.println("|      - HNO₃ → ácido nítrico                           |");
                    System.out.println("|   • Con prefijos: per- / hipo-                        |");
                    System.out.println("|      - HClO → ácido hipocloroso                       |");
                    System.out.println("|      - HClO₄ → ácido perclórico                       |");
                    System.out.println("|                                                       |");
                    System.out.println("=========================================================");
                    esperarMENU();
                    break;
                }

                case 9 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                      OXISALES                      |");
                    System.out.println("======================================================");
                    System.out.println("| Las oxisales provienen de la reacción entre:       |");
                    System.out.println("|   - Oxoácido + Base                                |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Contienen un metal y un anión oxigenado.       |");
                    System.out.println("|   • Muchos son solubles en agua.                   |");
                    System.out.println("|   • Se usan en agricultura, medicina y limpieza.   |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • Na₂SO₄ → sulfato de sodio                      |");
                    System.out.println("|   • KNO₃   → nitrato de potasio                    |");
                    System.out.println("|   • CaCO₃ → carbonato de calcio                    |");
                    System.out.println("|   • Na₃PO₄ → fosfato de sodio                      |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica de formación (neutralización):     |");
                    System.out.println("|   HNO₃ + KOH → KNO₃ + H₂O                          |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura básica:                               |");
                    System.out.println("|   • Metal + (raíz del oxoácido) + sufijo:          |");
                    System.out.println("|       -ato (de ácidos -ico)                        |");
                    System.out.println("|       -ito (de ácidos -oso)                        |");
                    System.out.println("|   Ejemplos:                                        |");
                    System.out.println("|      - H₂SO₄ → sulfato → Na₂SO₄                    |");
                    System.out.println("|      - H₂SO₃ → sulfito → CaSO₃                     |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }


                case 10 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                    SALES ÁCIDAS                   |");
                    System.out.println("======================================================");
                    System.out.println("| Las sales ácidas son oxisales que conservan uno o |");
                    System.out.println("| más hidrógenos ionizables del oxoácido original.  |");
                    System.out.println("| Se forman por una neutralización parcial entre:   |");
                    System.out.println("|   - Oxoácido + Base (en cantidad insuficiente)    |");
                    System.out.println("|                                                   |");
                    System.out.println("| Características:                                  |");
                    System.out.println("|   • Pueden actuar como ácidos débiles.            |");
                    System.out.println("|   • Contienen el grupo H(XO)n⁻.                   |");
                    System.out.println("|   • Frecuentes en sistemas biológicos y buffer.   |");
                    System.out.println("|                                                   |");
                    System.out.println("| Reacciones típicas de formación:                  |");
                    System.out.println("|   H₂SO₄ + NaOH → NaHSO₄ + H₂O                     |");
                    System.out.println("|   H₂CO₃ + KOH → KHCO₃ + H₂O                       |");
                    System.out.println("|                                                   |");
                    System.out.println("| Ejemplos comunes:                                 |");
                    System.out.println("|   • NaHSO₄ → bisulfato de sodio                   |");
                    System.out.println("|   • KHCO₃  → bicarbonato de potasio               |");
                    System.out.println("|   • NaH₂PO₄ → dihidrogenofosfato de sodio         |");
                    System.out.println("|   • Ca(HCO₃)₂ → bicarbonato de calcio             |");
                    System.out.println("|                                                   |");
                    System.out.println("| Nomenclatura:                                     |");
                    System.out.println("|   • Prefijo 'bi-' o 'hidrógeno-':                 |");
                    System.out.println("|        KHCO₃ → bicarbonato o hidrogenocarbonato   |");
                    System.out.println("|   • Se nombran como:                              |");
                    System.out.println("|        'Hidrógeno' + nombre de la sal.            |");
                    System.out.println("|                                                   |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }

                case 11 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                   SALES BINARIAS                   |");
                    System.out.println("======================================================");
                    System.out.println("| Las sales binarias están formadas por:             |");
                    System.out.println("|   - Metal + No metal (sin oxígeno)                 |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Son compuestos iónicos (metal → catión).       |");
                    System.out.println("|   • El no metal forma aniones como: Cl⁻, Br⁻, F⁻.   |");
                    System.out.println("|   • Se encuentran en alimentos, minerales y sales  |");
                    System.out.println("|     comunes de la vida diaria.                     |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • NaCl → cloruro de sodio                        |");
                    System.out.println("|   • CaF₂ → fluoruro de calcio                      |");
                    System.out.println("|   • KBr  → bromuro de potasio                      |");
                    System.out.println("|   • AgI  → yoduro de plata                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica de formación:                      |");
                    System.out.println("|   2Na + Cl₂ → 2NaCl                                |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • (No metal con terminación -uro) de (metal).    |");
                    System.out.println("|        Ejemplo: MgCl₂ → cloruro de magnesio.       |");
                    System.out.println("|   • Si el metal tiene varios E.O.:                 |");
                    System.out.println("|        FeCl₂ → cloruro de hierro (II)              |");
                    System.out.println("|        FeCl₃ → cloruro de hierro (III)             |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU();
                    break;
                }


                case 0 -> {
                    System.out.println("\n");
                    System.out.println("==============================================");
                    System.out.println("|                 Saliendo...                |");
                    System.out.println("==============================================");
                    esperarMENU();
                    break;

                }

                default -> {
                    System.out.println("\n");
                    System.out.println("==============================================");
                    System.out.println("|              OPCIÓN INVÁLIDA               |");
                    System.out.println("==============================================");
                    System.out.println("| La opción ingresada no es válida.          |");
                    System.out.println("| Por favor ingresa un número entre 0 y 11.  |");
                    System.out.println("==============================================");
                    esperarMENU();
                }
            }
        }
        while (opcion != 0) ;

    }


    public static void tecnicasMnemotecnicas(){
        int opcion=-1;

        do {
            limpiarPantalla();
            mnemotecnias();
            System.out.println("==================================================");
            System.out.println("|              MNEMOTECNIAS QUÍMICA 1            |");
            System.out.println("==================================================");
            System.out.println("| 1. Unidad 1 - Materia                          |");
            System.out.println("| 2. Unidad 2 - Estructura Atómica               |");
            System.out.println("| 3. Unidad 3 - Propiedades Periódicas           |");
            System.out.println("| 4. Unidad 4 - Enlace Químico                   |");
            System.out.println("| 5. Unidad 5 - Nomenclatura Inorgánica          |");
            System.out.println("| 0. Volver al menú principal                    |");
            System.out.println("==================================================");
            System.out.print  ("Selecciona una opción: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarTecla();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar ENTER

            switch (opcion) {
                case 1:
                    menuMnemotecniasUnidad1();
                    break;
                case 2:
                    menuMnemotecniasUnidad2();
                    break;
                case 3:
                    menuMnemotecniasUnidad3();
                    break;
                case 4:
                    menuMnemotecniasUnidad4();
                    break;
                case 5:
                    menuMnemotecniasUnidad5();
                    break;
                case 0:
                    System.out.println("\n================================");
                    System.out.println("| Regresando al menú principal |");
                    System.out.println("================================");
                    esperarTecla();
                    break;
                default:
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
            }

        } while (opcion != 0);

    }



    public static void menuMnemotecniasUnidad1() {
        int opcion_marcado=-1;

        do {
            limpiarPantalla();
            System.out.println("======================================");
            System.out.println("|       MNEMOTECNIAS - UNIDAD 1      |");
            System.out.println("======================================");
            System.out.println("| 1. Introducción a la Química       |");
            System.out.println("| 2. Materia y Energía               |");
            System.out.println("| 3. Propiedades de la Materia       |");
            System.out.println("| 4. Fenómenos Físicos y Químicos    |");
            System.out.println("| 5. Elementos, Compuestos y Mezclas |");
            System.out.println("| 6. Métodos de Separación de Mezclas|");
            System.out.println("| 0. Regresar al menú principal      |");
            System.out.println("--------------------------------------");
            System.out.print  ("Elige una opción: ");

            if (!sc.hasNextInt()) {
                sc.nextLine(); // limpiar basura

                System.out.println("\n=====================");
                System.out.println("| Opción no válida. |");
                System.out.println("=====================");
                esperarTecla();
                continue;
            }

            opcion_marcado = sc.nextInt();
            sc.nextLine();


            switch (opcion_marcado) {

                case 1:
                    mnemotecniaIntroQuimica();
                    break;

                case 2:
                    mnemotecniaMateriaEnergia();
                    break;

                case 3:
                    mnemotecniaPropiedadesMateria();
                    break;

                case 4:
                    mnemotecniaFenomenos();
                    break;

                case 5:
                    mnemotecniaElementosCompuestosMezclas();
                    break;

                case 6:
                    mnemotecniaMetodosSeparacion();
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("===================================");
                    System.out.println("| Regresando al menú principal... |");
                    System.out.println("===================================");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=======================================");
                    System.out.println("| Opción no válida. Intenta de nuevo. |");
                    System.out.println("=======================================");
                    esperarTecla();
                    break;
            }

        } while (opcion_marcado != 0);

    }

    // =====================================================
    // MÉTODOS DE UTILIDAD
    // =====================================================


    public static int leerEntero() {
        int valor;
        try {
            valor = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            valor = -1;
        }
        return valor;
    }

    // =====================================================
    // MNEMOTECNIAS
    // =====================================================

    public static void mnemotecniaIntroQuimica() {
        limpiarPantalla();
        System.out.println("================================================================");
        System.out.println("|                 INTRODUCCIÓN A LA QUÍMICA                    |");
        System.out.println("================================================================");
        System.out.println("|  \u001B[31mMNEMOTECNIA:\u001B[0m                                                |");
        System.out.println("|  PIENSA EN:  “\u001B[31mQUÍMICA = C I E + CAMBIO\u001B[0m”                      |");
        System.out.println("|                                                              |");
        System.out.println("|  - La palabra CIE resume TODO lo que estudia la Química:     |");
        System.out.println("|       \u001B[31mC → Composición\u001B[0m (de qué está hecha la materia)         |");
        System.out.println("|       \u001B[31mI → Interacciones\u001B[0m (cómo se relaciona y combina)        |");
        System.out.println("|       \u001B[31mE → Energía\u001B[0m (cómo se transforma y se mueve)            |");
        System.out.println("|                                                              |");
        System.out.println("|  - Asócialo como si la materia fuera un personaje:           |");
        System.out.println("|      “CIE” es su identidad. Siempre describe lo que es,      |");
        System.out.println("|       cómo actúa, y cuánta energía posee.                    |");
        System.out.println("|                                                              |");
        System.out.println("|  - Y súmale la idea clave:                                   |");
        System.out.println("|        \u001B[31mLA QUÍMICA = CAMBIO\u001B[0m                                   |");
        System.out.println("|    porque TODA reacción química implica transformación.      |");
        System.out.println("|                                                              |");
        System.out.println("|  - Regla mental rápida:                                      |");
        System.out.println("|        \u001B[31mSI CAMBIA SU COMPOSICIÓN → ES QUÍMICA\u001B[0m                 |");
        System.out.println("|        \u001B[31mSI CAMBIA SOLO SU FORMA → NO ES QUÍMICA\u001B[0m               |");
        System.out.println("|                                                              |");
        System.out.println("|  - Si recuerdas CIE + CAMBIO, entiendes la base de TODO.     |");
        System.out.println("================================================================");
        esperarTecla();
    }

    public static void mnemotecniaMateriaEnergia() {
        limpiarPantalla();
        System.out.println("=================================================================================================");
        System.out.println("|                                    MATERIA Y ENERGÍA                                          |");
        System.out.println("=================================================================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m                                                                                  |");
        System.out.println("| PIENSA EN: “\u001B[31mME VA, ME TRANSFORMA\u001B[0m”                                                             |");
        System.out.println("|                                                                                               |");
        System.out.println("| - ME VA: Materia y Energía VAN siempre juntas.                                                |");
        System.out.println("|   La materia nunca actúa sola, siempre necesita energía para cambiar o mantenerse.            |");
        System.out.println("|                                                                                               |");
        System.out.println("| - ME TRANSFORMA: La energía es la responsable de transformar la materia.                      |");
        System.out.println("|   Cada cambio de estado o reacción ocurre porque entra o sale energía.                        |");
        System.out.println("|                                                                                               |");
        System.out.println("| - La materia es TODO lo que tiene masa y ocupa un lugar en el espacio.                        |");
        System.out.println("|                                                                                               |");
        System.out.println("| - La energía es la CAPACIDAD de producir cambios:                                             |");
        System.out.println("|       • Calor (energía térmica)                                                               |");
        System.out.println("|       • Movimiento (energía cinética)                                                         |");
        System.out.println("|       • Posición (energía potencial)                                                          |");
        System.out.println("|       • Luz, electricidad, química, etc.                                                      |");
        System.out.println("|                                                                                               |");
        System.out.println("| - Regla mental rápida:                                                                        |");
        System.out.println("|       Si algo CAMBIA → hubo ENERGÍA.                                                          |");
        System.out.println("|       Sin energía → la materia SE QUEDA IGUAL.                                                |");
        System.out.println("|                                                                                               |");
        System.out.println("| - Si recuerdas “ME VA, ME TRANSFORMA”, jamás olvidarás la relación inseparable entre ellas.   |");
        System.out.println("=================================================================================================");
        esperarTecla();
    }
    public static void mnemotecniaPropiedadesMateria() {
        limpiarPantalla();
        System.out.println("===================================================================================================");
        System.out.println("|                                   PROPIEDADES DE LA MATERIA                                     |");
        System.out.println("===================================================================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m                                                                                    |");
        System.out.println("| PIENSA EN: “\u001B[31mPEFEM\u001B[0m” → Peso, Extensión, Forma, Elasticidad, Masa                                  |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Esta mnemotecnia te recuerda las propiedades GENERALES de la materia:                         |");
        System.out.println("|   Aquellas que TODO objeto del universo posee sin importar de qué esté hecho.                   |");
        System.out.println("|                                                                                                 |");
        System.out.println("|   • \u001B[31mPESO\u001B[0m → Fuerza con la que la gravedad atrae a un cuerpo.                                     |");
        System.out.println("|   • \u001B[31mEXTENSIÓN\u001B[0m → Todo cuerpo ocupa un lugar en el espacio.                                       |");
        System.out.println("|   • \u001B[31mFORMA\u001B[0m → La materia siempre tiene alguna forma (sólido, líquido o gas).                      |");
        System.out.println("|   • \u001B[31mELASTICIDAD\u001B[0m → Capacidad de estirarse o deformarse y regresar a su forma original.           |");
        System.out.println("|   • \u001B[31mMASA\u001B[0m → Cantidad de materia que tiene un cuerpo.                                             |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Regla mental rápida:                                                                          |");
        System.out.println("|       Si es materia → tiene PEFEM.                                                              |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Estas propiedades NO dependen del tipo de sustancia; todas las cosas del universo las tienen. |");
        System.out.println("===================================================================================================");
        esperarTecla();
    }

    public static void mnemotecniaFenomenos() {
        limpiarPantalla();
        System.out.println("===================================================================================================");
        System.out.println("|                                 FENÓMENOS FÍSICOS Y QUÍMICOS                                    |");
        System.out.println("===================================================================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m                                                                                    |");
        System.out.println("| PIENSA EN: “\u001B[31mF-FORMA / Q-QUEDA NUEVO\u001B[0m”                                                            |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Un fenómeno \u001B[31mFÍSICO\u001B[0m cambia solo la FORMA, estado o apariencia.                                 |");
        System.out.println("|   No se crea nada nuevo: sigue siendo la misma sustancia.                                       |");
        System.out.println("|                                                                                                 |");
        System.out.println("|   EJEMPLOS:                                                                                     |");
        System.out.println("|     • Hielo → agua (cambio de estado, pero sigue siendo H₂O).                                   |");
        System.out.println("|     • Romper papel (cambia forma, no composición).                                              |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Un fenómeno \u001B[31mQUÍMICO\u001B[0m CAMBIA la COMPOSICIÓN: aparece una sustancia nueva.                       |");
        System.out.println("|   Aquí SÍ se forman nuevas sustancias con nuevas propiedades.                                   |");
        System.out.println("|                                                                                                 |");
        System.out.println("|   EJEMPLOS:                                                                                     |");
        System.out.println("|     • Oxidación del hierro → se forma óxido (nuevo material).                                   |");
        System.out.println("|     • Combustión del papel → se convierte en ceniza y gases.                                    |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Regla mental rápida:                                                                          |");
        System.out.println("|       \u001B[31mF = Forma cambia / Q = Queda algo nuevo\u001B[0m                                                   |");
        System.out.println("|                                                                                                 |");
        System.out.println("| - Recuérdalo así:                                                                               |");
        System.out.println("|       Fenómeno Físico → \"Se TRANSFORMA\" (pero sigue siendo lo mismo).                           |");
        System.out.println("|       Fenómeno Químico → \"Se FORMA\" algo completamente nuevo.                                   |");
        System.out.println("===================================================================================================");
        esperarTecla();
    }

    public static void mnemotecniaElementosCompuestosMezclas() {
        limpiarPantalla();
        System.out.println("===================================================================================================================");
        System.out.println("|                                  ELEMENTOS, COMPUESTOS Y MEZCLAS                                                |");
        System.out.println("===================================================================================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m                                                                                                    |");
        System.out.println("| PIENSA EN: “\u001B[31mECM = Elemento – Compuesto – Mezcla\u001B[0m”                                                                |");
        System.out.println("|                                                                                                                 |");
        System.out.println("| - La ECM funciona como niveles de complejidad de la materia:                                                    |");
        System.out.println("|                                                                                                                 |");
        System.out.println("|   • \u001B[31mE = ELEMENTO\u001B[0m → \"UNO\"                                                                                        |");
        System.out.println("|       Un solo tipo de átomo. No se puede dividir en sustancias más simples.                                     |");
        System.out.println("|       Ejemplos: O₂, Fe, Na, Au                                                                                  |");
        System.out.println("|                                                                                                                 |");
        System.out.println("|   • \u001B[31mC = COMPUESTO\u001B[0m → \"PAREJA\"                                                                                    |");
        System.out.println("|       Unión química de dos o más elementos en proporciones definidas.                                           |");
        System.out.println("|       Ejemplos: H₂O, CO₂, NaCl                                                                                  |");
        System.out.println("|                                                                                                                 |");
        System.out.println("|   • \u001B[31mM = MEZCLA\u001B[0m → \"GRUPO\"                                                                                        |");
        System.out.println("|       Unión física (no química) de sustancias. Se pueden separar por métodos físicos.                           |");
        System.out.println("|       Ejemplos: aire, ensalada, agua con sal                                                                    |");
        System.out.println("|                                                                                                                 |");
        System.out.println("| - Regla mental rápida:                                                                                          |");
        System.out.println("|       \u001B[31mE = uno solo, C = combinados químicamente, M = varios juntos sin reaccionar\u001B[0m                               |");
        System.out.println("|                                                                                                                 |");
        System.out.println("| - Truco de memoria:                                                                                             |");
        System.out.println("|       Imagina una historia:                                                                                     |");
        System.out.println("|       El \"Elemento\" está solo, encuentra pareja y forma un \"Compuesto\",                                         |");
        System.out.println("|       y luego se junta con muchos más para formar una \"Mezcla\".                                                 |");
        System.out.println("===================================================================================================================");
        esperarTecla();
    }

    public static void mnemotecniaMetodosSeparacion() {
        limpiarPantalla();
        System.out.println("====================================================================================================================");
        System.out.println("|                               MÉTODOS DE SEPARACIÓN DE MEZCLAS                                                   |");
        System.out.println("====================================================================================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m                                                                                                     |");
        System.out.println("| PIENSA EN: “\u001B[31mDECAFIC\u001B[0m” (como un café descafeinado)                                                                 |");
        System.out.println("|                                                                                                                  |");
        System.out.println("| Cada letra representa un método de separación. Imagina que estás preparando un café para recordarlo:             |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mD = Destilación\u001B[0m → Separar líquidos según su punto de ebullición.                                             |");
        System.out.println("|       Ejemplo: alcohol + agua.                                                                                   |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mE = Evaporación\u001B[0m → El líquido se evapora y queda el sólido.                                                   |");
        System.out.println("|       Ejemplo: obtener sal del agua salada.                                                                      |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mC = Cristalización\u001B[0m → Formación de cristales al enfriar o evaporar lentamente.                                |");
        System.out.println("|       Ejemplo: hacer cristales de azúcar.                                                                        |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mA = Atracción Magnética\u001B[0m → Separar materiales metálicos.                                                      |");
        System.out.println("|       Ejemplo: limaduras de hierro en arena.                                                                     |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mF = Filtración\u001B[0m → Separar sólidos de líquidos usando un filtro.                                               |");
        System.out.println("|       Ejemplo: colar café (TRUCO PERFECTO para recordarlo).                                                      |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mI = Imantación\u001B[0m → Uso de imanes para separar metales ferrosos.                                                |");
        System.out.println("|       Ejemplo: separar clavos de arena.                                                                          |");
        System.out.println("|                                                                                                                  |");
        System.out.println("|   • \u001B[31mC = Centrifugación\u001B[0m → Separación por densidad usando rotación rápida.                                         |");
        System.out.println("|       Ejemplo: separar sangre en sus componentes.                                                                |");
        System.out.println("|                                                                                                                  |");
        System.out.println("| - TRUCO MENTAL SUPERFÁCIL:                                                                                       |");
        System.out.println("|       Imagina que vas a preparar un “DECAF” café:                                                                |");
        System.out.println("|       Filtras, evaporas, cristalizas el azúcar, magnetizas la cucharita, etc.                                    |");
        System.out.println("|       Eso activa la memoria para recordar cada método al instante.                                               |");
        System.out.println("====================================================================================================================");
        esperarTecla();
    }

    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";


    public static void menuMnemotecniasUnidad2() {
        int opcion_marcado=-1;
        Scanner sc = new Scanner(System.in);

        do {
            limpiarPantalla();

            System.out.println("==========================================");
            System.out.println("|       MNEMOTECNIAS - UNIDAD 2          |");
            System.out.println("==========================================");
            System.out.println("| 1. Configuración electrónica           |");
            System.out.println("| 2. El átomo                            |");
            System.out.println("| 3. Electrón diferencial                |");
            System.out.println("| 4. Modelos atómicos                    |");
            System.out.println("| 5. Números cuánticos                   |");
            System.out.println("| 6. Principio de aufbau                 |");
            System.out.println("| 7. Tabulación de los números cuánticos |");
            System.out.println("| 0. Regresar al menú                    |");
            System.out.println("------------------------------------------");

            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarEnter(sc);
                continue;
            }

            opcion_marcado = sc.nextInt();
            sc.nextLine(); // limpiar ENTER


            switch (opcion_marcado) {

                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================");
                    System.out.println("|                        CONFIGURACIÓN ELECTRÓNICA                        |");
                    System.out.println("===========================================================================");
                    System.out.println("|- Frase: ¿Sabes Para Donde Van los Electrones?                           |");
                    System.out.println("|- Significado: S=subnivel s, P=subnivel p, D=subnivel d, F=subnivel f    |");
                    System.out.println("|- Recuerda el orden SPDF de llenado                                      |");
                    System.out.println("|- Orden diagonal: 1s² 2s² 2p 3s² 3p^6 4s² 3d^10 4p^6 5s² 4d^10 5p^6 ...  |");
                    System.out.println("|- Frase mnemotécnica: " + ROJO + "Súper Profesores De Física" + RESET + " = s, p, d, f            |");
                    System.out.println("---------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("====================================================================================");
                    System.out.println("|                                  EL ÁTOMO                                        |");
                    System.out.println("====================================================================================");
                    System.out.println("|- Acrónimo: " + ROJO + "NECRO" + RESET + "                                                                 |");
                    System.out.println("|  N = Núcleo, E = Electrones, C = Corteza, R = Regiones de energía, O = Orbitales |");
                    System.out.println("|- Así recuerdas la estructura del átomo                                           |");
                    System.out.println("------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("==============================================================================================================");
                    System.out.println("|                                           ELECTRÓN DIFERENCIAL                                             |");
                    System.out.println("==============================================================================================================");
                    System.out.println("|- Frase: " + ROJO + "El último en llegar define su hogar." + RESET + "                                                               |");
                    System.out.println("|- Explicación: El electrón diferencial es el último que se acomoda en la configuración electrónica.         |");
                    System.out.println("|- Importancia: Este electrón determina el grupo, el periodo y muchas propiedades químicas del elemento.     |");
                    System.out.println("|- Tip: Revisa en qué subnivel termina la configuración (s, p, d o f) para identificarlo rápidamente.        |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;


                case 4:
                    limpiarPantalla();
                    System.out.println("============================================================================");
                    System.out.println("|                           MODELOS ATÓMICOS                               |");
                    System.out.println("============================================================================");
                    System.out.println("|- Acrónimo cronológico:" + ROJO+ " D-T-R-B-S-C" + RESET+"                                       |");
                    System.out.println("|- D=Dalton, T=Thomson, R=Rutherford, B=Bohr, S=Sommerfeld, C=Cuántico     |");
                    System.out.println("|- Frase para recordar: Deliciosas Tartas Rellenas Bien Suaves y Cremosas  |");
                    System.out.println("----------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("===========================================================================");
                    System.out.println("|                             NÚMEROS CUÁNTICOS                           |");
                    System.out.println("===========================================================================");
                    System.out.println("|- Frase: " + ROJO + "No Siempre Tiene Sentido" + RESET + "                                        |");
                    System.out.println("|- N = Nivel principal, S = Secundario/Azimutal, T = Magnético, S = Spin  |");
                    System.out.println("|- Cada número cuántico describe una característica del electrón          |");
                    System.out.println("|- Sirven para ubicar exactamente un electrón dentro del átomo            |");
                    System.out.println("|- Tip: Recuerda que el spin solo puede ser +1/2 o -1/2                   |");
                    System.out.println("---------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 6:
                    limpiarPantalla();
                    System.out.println("==================================================================");
                    System.out.println("|                    PRINCIPIO DE AUFBAU =                       |");
                    System.out.println("==================================================================");
                    System.out.println("|- Frase: " + ROJO + "Los electrones son flojos: llenan lo más bajo primero" + RESET + "  |");
                    System.out.println("|- Los electrones ocupan primero los orbitales de menor energía  |");
                    System.out.println("|- “Aufbau” significa construcción u ordenamiento progresivo     |");
                    System.out.println("|- Este principio explica el orden diagonal de llenado           |");
                    System.out.println("------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;


                case 7:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================");
                    System.out.println("|                         === TABULACIÓN DE LOS NÚMEROS CUÁNTICOS ===                                 |");
                    System.out.println("=======================================================================================================");
                    System.out.println("|- Mnemotecnia visual: la tabla con encabezados (n, l, m, s) = (Nivel, Subnivel, Orientación, Giro)   |");
                    System.out.println("|- Frase:" + ROJO+ " Nadie Sabe Mover Sin práctica" + RESET +  "                                                               |");
                    System.out.println("|- Esta tabla te permite identificar rápidamente los valores permitidos                               |");
                    System.out.println("|- Ejemplo: para n=3 → l puede ser 0,1,2; para l=1 → m = -1,0,1; s = ±1/2                             |");
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("========================================");
                    System.out.println("|    Regresando al menú principal...   |");
                    System.out.println("========================================");
                    esperarEnter(sc);
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("========================================");
                    System.out.println("| Opción no válida. Intenta de nuevo.  |");
                    System.out.println("========================================");
                    esperarEnter(sc);
                    break;
            }

        } while (opcion_marcado != 0);
    }

    private static void esperarEnter(Scanner sc) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }


    public static void menuMnemotecniasUnidad3() {
        int OPCION=-1;
        while (OPCION != 0) {

            limpiarPantalla();
            MENU();

            System.out.print("Elige una opción: ");

            // VALIDACIÓN DE ENTERO
            if (!scanner.hasNextInt()) {
                scanner.nextLine(); // limpiar cadena basura

                System.out.println("\n");
                System.out.println("=================================================");
                System.out.println("| ENTRADA INVÁLIDA. SELECCIONA UN NÚMERO ENTERO |");
                System.out.println("=================================================");

                esperaMenu();
                continue;  //
            }

            OPCION = scanner.nextInt();
            scanner.nextLine();

            // VALIDAR RANGO
            if (OPCION < 0 || OPCION > 11) {
                System.out.println("\n-----------------------------------");
                System.out.println("Opción fuera de rango. Intenta de nuevo.");
                System.out.println("-----------------------------------");
                esperaMenu();
                continue; // 🔥 REGRESA AL MENÚ
            }
            switch (OPCION) {
                case 1:
                    limpiarPantalla();
                    System.out.println("=======================================================================");
                    System.out.println("|               AFINIDAD ELECTRÓNICA Y ELECTRONEGATIVIDAD             |");
                    System.out.println("=======================================================================");
                    System.out.println("| " + "\u001B[31mMnemotecnia:\u001B[0m" + " AE+EN = Atracción y Poder                              |");
                    System.out.println("| - La Afinidad Electrónica (AE) y Electronegatividad (EN) indican    |");
                    System.out.println("|   cuánto atrae un átomo a los electrones                            |");
                    System.out.println("| - Piensa: Átomos poderosos (EN alta) atraen electrones con fuerza.  |");
                    System.out.println("=======================================================================");
                    esperaMenu();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("================================================================================");
                    System.out.println("|                   CONSTRUCCIÓN DE LA TABLA PERIÓDICA                         |");
                    System.out.println("================================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " FILa y COLUMna = ORDEN                                        |");
                    System.out.println("| - Los electrones llenan niveles y subniveles, y así se ordenan los elementos |");
                    System.out.println("|   en filas (periodos) y columnas (grupos).                                   |");
                    System.out.println("| - Recordar: filas = niveles de energía, columnas = propiedades similares.    |");
                    System.out.println("================================================================================");
                    esperaMenu();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("=====================================================================");
                    System.out.println("|                       ELECTRONES PERIFÉRICOS                      |");
                    System.out.println("=====================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " ULTIMOS = PERIFÉRICOS                             |");
                    System.out.println("| - Los electrones de la capa más externa se llaman periféricos,    |");
                    System.out.println("|   son los que participan en enlaces.                              |");
                    System.out.println("| - Piensa: Últimos electrones son los que tocan el mundo exterior. |");
                    System.out.println("=====================================================================");
                    esperaMenu();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("==========================================================================");
                    System.out.println("|                        ELECTRONES DE VALENCIA                          |");
                    System.out.println("==========================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " VALENCIA = ENLACE                                       |");
                    System.out.println("| - Los electrones de valencia son los responsables de la unión química. |");
                    System.out.println("| - Ejemplo mental: piensa que cada electrón de valencia es una mano     |");
                    System.out.println("|   que puede unirse a otra.                                             |");
                    System.out.println("==========================================================================");
                    esperaMenu();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("======================================================================");
                    System.out.println("|                    ELECTRONES DE TRANSICIÓN                        |");
                    System.out.println("======================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " TRANS = INTERMEDIOS                                 |");
                    System.out.println("| - Electrones que ocupan subniveles d (de transición) y determinan  |");
                    System.out.println("|   propiedades especiales de metales.                               |");
                    System.out.println("| - Recuerda: metales de transición tienen electrones entre          |");
                    System.out.println("|   niveles internos y externos.                                     |");
                    System.out.println("======================================================================");
                    esperaMenu();
                    break;

                case 6:
                    limpiarPantalla();
                    System.out.println("=====================================================================================");
                    System.out.println("|                               ENERGÍA DE IONIZACIÓN                               |");
                    System.out.println("=====================================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " EI = ROMPER ENLACE                                                 |");
                    System.out.println("| - Energía necesaria para quitar un electrón de un átomo neutro en estado gaseoso. |");
                    System.out.println("| - Piensa: cuanto mayor la energía, más difícil quitar electrones.                 |");
                    System.out.println("=====================================================================================");
                    esperaMenu();
                    break;
                case 7:
                    limpiarPantalla();
                    System.out.println("========================================================================================");
                    System.out.println("|                                   METAL Y NO METAL                                   |");
                    System.out.println("========================================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " METALES = BRILLANTES y CONDUCTORES; NO METALES = FRÁGILES y AISLANTES |");
                    System.out.println("| - Los metales pierden electrones y los no metales ganan electrones.                  |");
                    System.out.println("========================================================================================");
                    esperaMenu();
                    break;
                case 8:
                    limpiarPantalla();
                    System.out.println("====================================================================================");
                    System.out.println("|                                      VALENCIA                                    |");
                    System.out.println("====================================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " VALENCIA = MANOS QUE SE UNEN                                      |");
                    System.out.println("| - Número de enlaces que un átomo puede formar según sus electrones de valencia.  |");
                    System.out.println("====================================================================================");
                    esperaMenu();
                    break;
                case 9:
                    limpiarPantalla();
                    System.out.println("=============================================================================");
                    System.out.println("|                               RADIO ATÓMICO                               |");
                    System.out.println("=============================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " RADIO = TAMAÑO                                             |");
                    System.out.println("| - Distancia desde el núcleo hasta el electrón más externo.                |");
                    System.out.println("| - Piensa: átomos grandes = radio grande, átomos pequeños = radio pequeño. |");
                    System.out.println("=============================================================================");
                    esperaMenu();
                    break;
                case 10:
                    limpiarPantalla();
                    System.out.println("==================================================================");
                    System.out.println("|                     PROPIEDADES PERIÓDICAS                     |");
                    System.out.println("==================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " PERIODICAS = PATRÓN                             |");
                    System.out.println("| - Propiedades que varían regularmente a lo largo de la tabla:  |");
                    System.out.println("|   radio, electronegatividad, energía de ionización.            |");
                    System.out.println("===================================================================");
                    esperaMenu();
                    break;
                case 11:
                    limpiarPantalla();
                    System.out.println("==========================================================================");
                    System.out.println("|                            NÚMEROS DE OXIDACIÓN                        |");
                    System.out.println("==========================================================================");
                    System.out.println("| - " + "\u001B[31mMnemotecnia:\u001B[0m" + " OXIDACIÓN = CARGA                                       |");
                    System.out.println("| - Carga que adquiere un átomo al formar compuestos químicos.           |");
                    System.out.println("| - Piensa: positivo si pierde electrones, negativo si gana electrones.  |");
                    System.out.println("==========================================================================");
                    esperaMenu();
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("-------------------------------");
                    System.out.println("Regresando al menú principal...");
                    System.out.println("-------------------------------");
                    esperaMenu();
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("-----------------------------------");
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    System.out.println("-----------------------------------");
                    esperaMenu();
                    break;
            }
        }
        while (OPCION != 0);
    }

    private static void MENU() {
        System.out.println("===================================================");
        System.out.println("|              MNEMOTECNIAS - UNIDAD 3            |");
        System.out.println("===================================================");
        System.out.println("| 1.  Afinidad electrónica y electronegatividad   |");
        System.out.println("| 2.  Construcción de la tabla periódica          |");
        System.out.println("| 3.  Electrones periféricos                      |");
        System.out.println("| 4.  Electrones de valencia                      |");
        System.out.println("| 5.  Electrones de transición                    |");
        System.out.println("| 6.  Energía de ionización                       |");
        System.out.println("| 7.  Metal y no metal                            |");
        System.out.println("| 8.  Valencia                                    |");
        System.out.println("| 9.  Radio atómico                               |");
        System.out.println("| 10. Propiedades periódicas                      |");
        System.out.println("| 11. Números de oxidación                        |");
        System.out.println("| 0.  Salir                                       |");
        System.out.println("---------------------------------------------------");
    }

    public static void esperaMenu() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");

        scanner.nextLine(); // espera hasta que se presione ENTER
    }

    public static void menuMnemotecniasUnidad4() {

        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";

        int opcionSubtema=-1;

        do {
            limpiarPantalla();
            System.out.println("===================================================================");
            System.out.println("|                   MNEMOTECNIAS - UNIDAD 4                       |");
            System.out.println("===================================================================");
            System.out.println("| 1. Enlace Químico                                               |");
            System.out.println("| 2. Enlace Iónico                                                |");
            System.out.println("| 3. Enlace Covalente                                             |");
            System.out.println("| 4. Tipos de Covalencia                                          |");
            System.out.println("| 5. Enlace Dativo                                                |");
            System.out.println("| 6. Enlaces Especiales                                           |");
            System.out.println("| 7. Hibridación                                                  |");
            System.out.println("| 8. Propiedades derivadas del tipo de enlace                     |");
            System.out.println("| 0. Regresar al menú principal                                   |");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n=====================");
                System.out.println("| Opción no válida. |");
                System.out.println("=====================");
                esperarTecla();
                continue;
            }

            opcionSubtema = sc.nextInt();
            sc.nextLine();

            switch (opcionSubtema) {
                case 1 -> mnemotecniaEnlaceQuimico();
                case 2 -> mnemotecniaEnlaceIonico();
                case 3 -> mnemotecniaEnlaceCovalente();
                case 4 -> mnemotecniaTiposCovalencia();
                case 5 -> mnemotecniaEnlaceDativo();
                case 6 -> mnemotecniaEnlacesEspeciales();
                case 7 -> mnemotecniaHibridacion();
                case 8 -> mnemotecniaPropiedadesTipoEnlace();
                case 0 -> {
                    System.out.println("\n");
                    System.out.println("=================");
                    System.out.println("| Regresando... |");
                    System.out.println("=================");
                    esperarTecla();
                }
                default -> {
                    System.out.println("\n=====================");
                    System.out.println("| Opción no válida. |");
                    System.out.println("=====================");
                    esperarTecla();
                }
            }

        } while (opcionSubtema != 0);
    }

    public static void mnemotecniaEnlaceQuimico() {
        limpiarPantalla();
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";

        System.out.println("=====================================================================");
        System.out.println("|                      ENLACE QUÍMICO                               |");
        System.out.println("=====================================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                                      |");
        System.out.println("| PIENSA EN: “" + rojoi + "ENLACE = UNIÓN + ESTABILIDAD" + rojof + "”                         |");
        System.out.println("|                                                                   |");
        System.out.println("| - Los átomos se unen buscando estabilidad en su capa de valencia. |");
        System.out.println("|   Imagínalo como amigos que se toman de la mano para sentirse     |");
        System.out.println("|   completos y equilibrados.                                       |");
        System.out.println("|                                                                   |");
        System.out.println("| - Cada átomo quiere completar su nivel energético, por eso se     |");
        System.out.println("|   une con otros para ganar, perder o compartir electrones.        |");
        System.out.println("|                                                                   |");
        System.out.println("| - Regla mental rápida:                                            |");
        System.out.println("|     " + rojoi + "UNIÓN → MAYOR ESTABILIDAD" + rojof + "                                     |");
        System.out.println("|     " + rojoi + "ESTABILIDAD → CAPA DE VALENCIA COMPLETA" + rojof + "                       |");
        System.out.println("|                                                                   |");
        System.out.println("| - Si recuerdas “UNIÓN + ESTABILIDAD”, nunca olvidarás qué es un   |");
        System.out.println("|   enlace químico ni por qué ocurre.                               |");
        System.out.println("=====================================================================");
        esperarTecla();
    }

    public static void mnemotecniaEnlaceIonico() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("============================================================================================");
        System.out.println("|                                   ENLACE IÓNICO                                          |");
        System.out.println("============================================================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                                                             |");
        System.out.println("| PIENSA EN: “" + rojoi + "ION = CARGA + ATRACCIÓN" + rojof + "”                                                     |");
        System.out.println("|                                                                                          |");
        System.out.println("| - Para recordar el enlace iónico, imagina que un átomo fuerte cede electrones para       |");
        System.out.println("|   volverse positivo (catión), y otro los recibe volviéndose negativo (anión).            |");
        System.out.println("|                                                                                          |");
        System.out.println("| - Como tienen cargas opuestas, se atraen con fuerza, igual que imanes.                   |");
        System.out.println("|                                                                                          |");
        System.out.println("| - Regla mental rápida:                                                                   |");
        System.out.println("|       " + rojoi + "CEDER → CATIÓN (+)" + rojof + "                                                                 |");
        System.out.println("|       " + rojoi + "RECIBIR → ANIÓN (-)" + rojof + "                                                                |");
        System.out.println("|       " + rojoi + "+ Y - SE ATRACEN → ENLACE IÓNICO" + rojof + "                                                   |");
        System.out.println("|                                                                                          |");
        System.out.println("| - Si recuerdas “CARGA + ATRACCIÓN”, siempre podrás identificar un enlace iónico.         |");
        System.out.println("============================================================================================");
        esperarTecla();
    }

    public static void  mnemotecniaEnlaceCovalente() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("==================================================================================");
        System.out.println("|                                ENLACE COVALENTE                                |");
        System.out.println("==================================================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                                                   |");
        System.out.println("| PIENSA EN: “" + rojoi + "SIMPLE, DOBLE, TRIPLE = 1, 2, 3 PARES" + rojof + "”                             |");
        System.out.println("|                                                                                |");
        System.out.println("| - En un enlace covalente, los átomos COMPARTEN electrones para alcanzar        |");
        System.out.println("|   estabilidad. No hay transferencia, solo compartir como buenos vecinos.       |");
        System.out.println("|                                                                                |");
        System.out.println("| - Entre más pares de electrones compartidos, más fuerte y corto es el enlace.  |");
        System.out.println("|                                                                                |");
        System.out.println("| - Regla mental rápida:                                                         |");
        System.out.println("|       " + rojoi + "1 PAR = SIMPLE" + rojof + "                                                           |");
        System.out.println("|       " + rojoi + "2 PARES = DOBLE" + rojof + "                                                          |");
        System.out.println("|       " + rojoi + "3 PARES = TRIPLE" + rojof + "                                                         |");
        System.out.println("|                                                                                |");
        System.out.println("| - Si recuerdas “1, 2, 3 PARES”, nunca olvidarás la diferencia entre los tipos  |");
        System.out.println("|   de enlace covalente.                                                         |");
        System.out.println("==================================================================================");
        esperarTecla();
    }

    public static void mnemotecniaTiposCovalencia() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("=============================================================================");
        System.out.println("|                         TIPOS DE COVALENCIA                               |");
        System.out.println("=============================================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                                              |");
        System.out.println("| PIENSA EN: “" + rojoi + "COVA = COMPARTIR ELECTRONES" + rojof + "”                                  |");
        System.out.println("|                                                                           |");
        System.out.println("| - La covalencia SIEMPRE implica COMPARTIR electrones.                     |");
        System.out.println("|   Ningún átomo cede ni roba: ambos aportan para completar su valencia.    |");
        System.out.println("|                                                                           |");
        System.out.println("| - Existen tipos según cómo se comparten:                                  |");
        System.out.println("|       • Covalente pura  → se comparte por igual.                          |");
        System.out.println("|       • Covalente polar → se comparte de forma desigual.                  |");
        System.out.println("|       • Covalente coordinada → un átomo dona el par completo.             |");
        System.out.println("|                                                                           |");
        System.out.println("| - Regla mental rápida:                                                    |");
        System.out.println("|       " + rojoi + "COVA = COMPARTIR (siempre)" + rojof + "                                          |");
        System.out.println("|                                                                           |");
        System.out.println("| - Si recuerdas la palabra “COVA”, jamás olvidarás que lo esencial es      |");
        System.out.println("|   compartir electrones.                                                   |");
        System.out.println("=============================================================================");
        esperarTecla();
    }

    public static void mnemotecniaEnlaceDativo() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("==============================================================");
        System.out.println("|                      ENLACE DATIVO                         |");
        System.out.println("==============================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                               |");
        System.out.println("| PIENSA EN: “" + rojoi + "DATIVO = UN ÁTOMO DONA EL PAR" + rojof + "”                 |");
        System.out.println("|                                                            |");
        System.out.println("| - En un enlace dativo, un solo átomo aporta los DOS        |");
        System.out.println("|   electrones del par compartido.                           |");
        System.out.println("|                                                            |");
        System.out.println("| - El otro átomo simplemente acepta el par sin aportar      |");
        System.out.println("|   electrones.                                              |");
        System.out.println("|                                                            |");
        System.out.println("| - Es como un “préstamo temporal” de un par electrónico.    |");
        System.out.println("|                                                            |");
        System.out.println("| - Regla mental rápida:                                     |");
        System.out.println("|        " + rojoi + "UNO DONA — OTRO ACEPTA" + rojof + "                              |");
        System.out.println("|                                                            |");
        System.out.println("| - Si recuerdas “DONAR EL PAR”, nunca confundirás un enlace |");
        System.out.println("|   dativo con un covalente normal.                          |");
        System.out.println("==============================================================");
        esperarTecla();
    }

    public static void mnemotecniaEnlacesEspeciales() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("======================================================================");
        System.out.println("|                      ENLACES ESPECIALES                            |");
        System.out.println("======================================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                                       |");
        System.out.println("| PIENSA EN: “" + rojoi + "PUENTES DE HIDRÓGENO = FUERZA EXTRA" + rojof + "”                   |");
        System.out.println("|                                                                    |");
        System.out.println("| - Los puentes de hidrógeno actúan como una “mano extra” que une    |");
        System.out.println("|   moléculas entre sí, aumentando la fuerza de atracción.           |");
        System.out.println("|                                                                    |");
        System.out.println("| - Ocurren cuando H está unido a elementos muy electronegativos     |");
        System.out.println("|   como N, O o F.                                                   |");
        System.out.println("|                                                                    |");
        System.out.println("| - Regla mental rápida:                                             |");
        System.out.println("|        " + rojoi + "H + (N, O, F) → PUENTE = FUERZA EXTRA" + rojof + "                       |");
        System.out.println("|                                                                    |");
        System.out.println("| - Si recuerdas “FUERZA EXTRA”, no olvidarás que estos enlaces      |");
        System.out.println("|   aumentan la cohesión molecular.                                  |");
        System.out.println("======================================================================");
        esperarTecla();
    }

    public static void mnemotecniaHibridacion() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("======================================================");
        System.out.println("|                    HIBRIDACIÓN                     |");
        System.out.println("======================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                       |");
        System.out.println("| PIENSA EN: “" + rojoi + "SP, SP2, SP3 = ORBITALES COMBINADOS" + rojof + "”   |");
        System.out.println("|                                                    |");
        System.out.println("| - La hibridación ocurre cuando los orbitales se    |");
        System.out.println("|   mezclan para formar nuevos orbitales estables.   |");
        System.out.println("|                                                    |");
        System.out.println("| - Cada tipo de hibridación genera una geometría:   |");
        System.out.println("|       • sp  → lineal                               |");
        System.out.println("|       • sp2 → trigonal plana                       |");
        System.out.println("|       • sp3 → tetraédrica                          |");
        System.out.println("|                                                    |");
        System.out.println("| - Regla mental rápida:                             |");
        System.out.println("|       " + rojoi + "NÚMERO DE HÍBRIDOS = GEOMETRÍA" + rojof + "               |");
        System.out.println("|                                                    |");
        System.out.println("| - Si recuerdas “ORBITALES COMBINADOS”, nunca       |");
        System.out.println("|   olvidarás qué es la hibridación.                 |");
        System.out.println("======================================================");
        esperarTecla();
    }

    public static void mnemotecniaPropiedadesTipoEnlace() {
        final String rojoi = "\u001B[31m";
        final String rojof = "\u001B[0m";
        limpiarPantalla();
        System.out.println("===========================================================");
        System.out.println("|            PROPIEDADES DERIVADAS DEL ENLACE             |");
        System.out.println("===========================================================");
        System.out.println("| " + rojoi + "MNEMOTECNIA:" + rojof + "                                            |");
        System.out.println("| PIENSA EN: “" + rojoi + "SÓLIDOS = FUERTES / LÍQUIDOS = MODERADOS" + rojof + "”   |");
        System.out.println("|                                                         |");
        System.out.println("| - Las propiedades físicas dependen de la fuerza         |");
        System.out.println("|   de atracción entre las partículas.                    |");
        System.out.println("|                                                         |");
        System.out.println("| - A mayor fuerza del enlace → mayor punto de fusión y   |");
        System.out.println("|   ebullición.                                           |");
        System.out.println("|                                                         |");
        System.out.println("| - Regla mental rápida:                                  |");
        System.out.println("|        " + rojoi + "FUERZA DEL ENLACE = ESTADO FÍSICO" + rojof + "                |");
        System.out.println("|                                                         |");
        System.out.println("| - Si recuerdas “FUERTES vs. MODERADOS”, podrás deducir  |");
        System.out.println("|   el comportamiento físico de los compuestos.           |");
        System.out.println("===========================================================");
        esperarTecla();
    }

    public static void menuMnemotecniasUnidad5() {
        int opcion = -1;

        while (opcion != 0) {
            limpiarPantalla();

            System.out.println("==============================================");
            System.out.println("|          MNEMOTECNIAS - UNIDAD 5           |");
            System.out.println("==============================================");
            System.out.println("| 1. Hidruros metálicos                      |");
            System.out.println("| 2. Hidruros no metálicos                   |");
            System.out.println("| 3. Nomenclatura inorgánica                 |");
            System.out.println("| 4. Determinación de números de oxidación   |");
            System.out.println("| 5. Óxidos metálicos                        |");
            System.out.println("| 6. Óxidos no metálicos                     |");
            System.out.println("| 7. Oxoácidos                               |");
            System.out.println("| 8. Oxosales                                |");
            System.out.println("| 9. Sales ácidas                            |");
            System.out.println("| 10. Sales binarias                         |");
            System.out.println("| 0. Salir                                   |");
            System.out.println("==============================================");
            System.out.print("Selecciona una opción: ");

            // VALIDACIÓN DE ENTERO
            if (!sc.hasNextInt()) {
                sc.nextLine(); // limpiar basura

                System.out.println("\n=====================");
                System.out.println("| Opción no válida. |");
                System.out.println("=====================");
                esperarMENU();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            // VALIDACIÓN DE RANGO
            if (opcion < 0 || opcion > 10) {
                System.out.println("\n=====================");
                System.out.println("| Opción no válida. |");
                System.out.println("=====================");
                esperarMENU();
                continue;
            }

            switch (opcion) {
                case 1 -> temaHidrurosMetalicos();
                case 2 -> temaHidrurosNoMetalicos();
                case 3 -> temaNomenclaturaInorganica();
                case 4 -> temaDeterminacionNO();
                case 5 -> temaOxidosMetalicos2();
                case 6 -> temaOxidosNoMetalicos2();
                case 7 -> temaOxoacidos2();
                case 8 -> temaOxosales2();
                case 9 -> temaSalesAcidas2();
                case 10 -> temaSalesBinarias2();
                case 0 -> {
                    System.out.println("\n");
                    System.out.println("===============");
                    System.out.println("| Saliendo... |");
                    System.out.println("===============");
                    esperarMENU();
                }
            }
        }
    }


    public static void temaHidrurosMetalicos() {
        limpiarPantalla();

        System.out.println("=====================================================================");
        System.out.println("|                           HIDRUROS METÁLICOS                      |");
        System.out.println("=====================================================================");
        System.out.println("|  \u001B[31mMnemotecnia:\u001B[0m HIDRURO METÁLICO = “METAL AGARRA HIDRÓGENO (-1)”    |");
        System.out.println("|                                                                   |");
        System.out.println("|  - Recuerda: cuando el hidrógeno trabaja con metales,             |");
        System.out.println("|    actúa como un “electrón extra” (oxidación -1).                 |");
        System.out.println("|                                                                   |");
        System.out.println("|  - Piensa: El metal adopta al hidrógeno como un hijo,             |");
        System.out.println("|    porque lo recibe con carga negativa.                           |");
        System.out.println("=====================================================================");

        esperarMENU();
    }


    public static void temaHidrurosNoMetalicos() {
        limpiarPantalla();

        System.out.println("============================================================");
        System.out.println("|                      HIDRUROS NO METÁLICOS               |");
        System.out.println("============================================================");
        System.out.println("| " + "\u001B[31mMnemotecnia:\u001B[0m HIDRÓGENO + NO METAL = HÁCIDOS VOLÁTILES    |");
        System.out.println("|                                                          |");
        System.out.println("| - Se forman entre el hidrógeno (H = +1) y un no metal.   |");
        System.out.println("| - Recuerda: Cuando el hidrógeno se une a un no metal,    |");
        System.out.println("|   generalmente produce compuestos gaseosos conocidos     |");
        System.out.println("|   como hidrácidos (ej., HCl, H2S, HF).                   |");
        System.out.println("| - Idea clave: “H unido a no metal = ácido en potencia”.  |");
        System.out.println("============================================================");

        esperarMENU();
    }

    public static void temaNomenclaturaInorganica() {
        limpiarPantalla();
        System.out.println("==================================================");
        System.out.println("|             NOMENCLATURA INORGÁNICA            |");
        System.out.println("==================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m NOMBRAR = REGLAS FIJAS            |");
        System.out.println("| La nomenclatura inorgánica es el conjunto de   |");
        System.out.println("| reglas que permiten asignar nombres correctos  |");
        System.out.println("| y universales a los compuestos químicos.       |");
        System.out.println("==================================================");
        esperarMENU();
    }


    public static void temaDeterminacionNO() {
        limpiarPantalla();
        System.out.println("================================================================");
        System.out.println("|        \u001B[31mMNEMOTECNIA:\u001B[0m  \"EL REINO DE LAS CARGAS\"                |");
        System.out.println("================================================================");
        System.out.println("| Imagina que cada átomo vive en un reino donde cada uno       |");
        System.out.println("| tiene una ‘corona’ que representa su número de oxidación.    |");
        System.out.println("|                                                              |");
        System.out.println("|  1) Los átomos libres andan sin corona → NO = 0              |");
        System.out.println("|     (No pertenecen a ningún ejército, por eso van neutros).  |");
        System.out.println("|                                                              |");
        System.out.println("|  2) Los iones simples llevan una sola corona → su carga      |");
        System.out.println("|     (Si es +2, lleva dos joyas; si es -1, perdió una).       |");
        System.out.println("|                                                              |");
        System.out.println("|  3) El Oxígeno es el ‘Rey de los Secuestradores’ → -2        |");
        System.out.println("|     (Siempre toma 2 electrones para formar su poder).        |");
        System.out.println("|                                                              |");
        System.out.println("|  4) El Hidrógeno es el “Caballero Positivo” → +1             |");
        System.out.println("|     excepto cuando sirve a los metales (hidruros) → -1.      |");
        System.out.println("|                                                              |");
        System.out.println("|  5) La suma de todas las coronas SIEMPRE debe coincidir      |");
        System.out.println("|     con la carga total del compuesto                         |");
        System.out.println("|     (como un consejo real, nada se pierde ni se inventa).    |");
        System.out.println("================================================================");
        esperarMENU();
    }

    public static void temaOxidosMetalicos2() {
        limpiarPantalla();
        System.out.println("==============================================================");
        System.out.println("|                      ÓXIDOS METÁLICOS                      |");
        System.out.println("==============================================================");
        System.out.println("| " + "\u001B[31mMNEMOTECNIA:\u001B[0m                                               |");
        System.out.println("| PIENSA EN: “\u001B[31mMETAL + OXÍGENO = META-OX\u001B[0m”                     |");
        System.out.println("|                                                            |");
        System.out.println("| - Imagina que los metales son guerreros fuertes que        |");
        System.out.println("|   siempre llevan un “escudo de oxígeno”. Ese escudo (O^2−) |");
        System.out.println("|   siempre vale -2, sin excepción.                          |");
        System.out.println("|                                                            |");
        System.out.println("| - El metal, para equilibrarlo, ajusta su carga como si     |");
        System.out.println("|   fuera el “nivel del guerrero”. Entre más carga tenga,    |");
        System.out.println("|   más fuerte es el metal frente al oxígeno.                |");
        System.out.println("|                                                            |");
        System.out.println("| - Por eso piensa: *Si veo M + O, el metal se carga para    |");
        System.out.println("|   mantener el equilibrio*, y nace el óxido metálico.       |");
        System.out.println("|                                                            |");
        System.out.println("| - Regla mental rápida:                                     |");
        System.out.println("|     \u001B[31mOXÍGENO → SIEMPRE -2\u001B[0m                                   |");
        System.out.println("|     \u001B[31mMETAL → LO NECESARIO PARA EQUILIBRAR\u001B[0m                   |");
        System.out.println("|                                                            |");
        System.out.println("| - Si recuerdas “META-OX”, jamás se te olvida cómo empiezan |");
        System.out.println("|   todos los óxidos metálicos.                              |");
        System.out.println("==============================================================");
        esperarMENU();
    }

    public static void temaOxidosNoMetalicos2() {
        limpiarPantalla();
        System.out.println("====================================================================");
        System.out.println("|                      ÓXIDOS NO METÁLICOS                         |");
        System.out.println("====================================================================");
        System.out.println("| " + "\u001B[31mMnemotecnia:\u001B[0m" + " NO-ME-OX = \"NO Metal + OXígeno\"                     |");
        System.out.println("|                                                                  |");
        System.out.println("| Piensa que los *no metales* son elementos \"ligeros\", que         |");
        System.out.println("| prefieren formar moléculas donde el oxígeno los acompaña         |");
        System.out.println("| creando gases o sustancias volátiles.                            |");
        System.out.println("|                                                                  |");
        System.out.println("| NO-ME-OX te recuerda:                                            |");
        System.out.println("|   - NO = No metal                                                |");
        System.out.println("|   - ME = (mentira visual) para recordar que NO es metal          |");
        System.out.println("|   - OX = Oxígeno                                                 |");
        System.out.println("|                                                                  |");
        System.out.println("| Así:                                                             |");
        System.out.println("|   \"Si NO es metal → al unirse con OXígeno → OXIDO NO METÁLICO\"   |");
        System.out.println("|                                                                  |");
        System.out.println("| Ejemplo mental: CO₂ como el \"suspiro químico\" del carbono        |");
        System.out.println("| cuando se combina con oxígeno.                                   |");
        System.out.println("====================================================================");
        esperarMENU();
    }

    public static void temaOxoacidos2() {
        limpiarPantalla();

        System.out.println("================================================");
        System.out.println("|                  OXOÁCIDOS                   |");
        System.out.println("================================================");
        System.out.println("| \u001B[31mMnemotecnia:\u001B[0m                                 |");
        System.out.println("| \"H-O-NO\":                                    |");
        System.out.println("| Imagina que el hidrógeno (H), el oxígeno     |");
        System.out.println("| (O) y un no metal (NO) van tomados de la     |");
        System.out.println("| mano formando un trío inseparable. Si están  |");
        System.out.println("| juntos, SEGURO es un oxoácido.               |");
        System.out.println("|                                              |");
        System.out.println("| → H (cabeza), O (cuerpo), NO metal (cola)    |");
        System.out.println("|   como un dragón químico que ¡SIEMPRE TIENE  |");
        System.out.println("|   OXÍGENO!                                   |");
        System.out.println("================================================");

        esperarMENU();
    }

    public static void temaOxosales2() {
        limpiarPantalla();
        System.out.println("====================================================================");
        System.out.println("|                              OXOSALES                            |");
        System.out.println("====================================================================");
        System.out.println("| " + "\u001B[31mMnemotecnia:\u001B[0m" + " OXO-SA-ME = \"OXOácido – Se sustituye – por MEtal\"   |");
        System.out.println("|                                                                  |");
        System.out.println("| Para recordar qué es una oxosal, piensa que un OXOÁCIDO es como  |");
        System.out.println("| una silla con patas de hidrógeno. Cuando llega un METAL, quita   |");
        System.out.println("| esas patas (hidrógenos) y se sienta él.                          |");
        System.out.println("|                                                                  |");
        System.out.println("| OXO-SA-ME te recuerda:                                           |");
        System.out.println("|   - OXO = Viene de un oxoácido                                   |");
        System.out.println("|   - SA  = Sustituye el hidrógeno                                 |");
        System.out.println("|   - ME  = Entra un metal                                         |");
        System.out.println("|                                                                  |");
        System.out.println("| Idea clave:                                                      |");
        System.out.println("|   \"Si un OXOÁCIDO pierde H y gana un METAL → nace una OXOSAL\"    |");
        System.out.println("|                                                                  |");
        System.out.println("| Imagen mental:                                                   |");
        System.out.println("|   Imagina al H2SO4 como una mesa con 2 patitas (H). Llega el Na  |");
        System.out.println("|   quitando esas patas para ponerse él mismo. Resultado mental:   |");
        System.out.println("|   la mesa queda 'más estable', ahora como Na2SO4.                |");
        System.out.println("|                                                                  |");
        System.out.println("| Así recuerdas fácilmente que:                                    |");
        System.out.println("|   OXOSAL = METAL + (anión derivado de un OXOÁCIDO)               |");
        System.out.println("====================================================================");
        esperarMENU();
    }


    public static void temaSalesAcidas2() {
        limpiarPantalla();
        System.out.println("====================================================================");
        System.out.println("|                           SALES ÁCIDAS                           |");
        System.out.println("====================================================================");
        System.out.println("| " + "\u001B[31mMnemotecnia:\u001B[0m" + " SA-ÁC-HID = \"SAL ÁCida con HIDrógeno\"               |");
        System.out.println("|                                                                  |");
        System.out.println("| Una SAL ÁCIDA es simplemente una ‘sal incompleta’: el ácido      |");
        System.out.println("| original NO entregó todos sus hidrógenos, por eso la sal aún     |");
        System.out.println("| conserva uno o más H en su estructura.                           |");
        System.out.println("|                                                                  |");
        System.out.println("| Usa la mnemotecnia SA-ÁC-HID:                                    |");
        System.out.println("|   - SA  = Es una SAL                                             |");
        System.out.println("|   - ÁC  = Proviene de un ÁCIDO                                   |");
        System.out.println("|   - HID = Aún conserva HIDrógeno                                 |");
        System.out.println("|                                                                  |");
        System.out.println("| Idea clave:                                                      |");
        System.out.println("|   \"Si el ácido entrega solo ALGUNOS hidrógenos → nace una        |");
        System.out.println("|    SAL ÁCIDA\"                                                    |");
        System.out.println("|                                                                  |");
        System.out.println("| Imagen mental:                                                   |");
        System.out.println("|   Imagina al H2SO4 como una botella con 2 tapones (H).           |");
        System.out.println("|   Llega el Na, quita solo UN tapón y se coloca él mismo.         |");
        System.out.println("|   Pero queda un tapón (H) todavía. Eso forma: NaHSO4.            |");
        System.out.println("|                                                                  |");
        System.out.println("| Así recuerdas que:                                               |");
        System.out.println("|   SAL ÁCIDA = METAL + (anión del oxoácido que aún conserva H)    |");
        System.out.println("====================================================================");
        esperarMENU();
    }

    public static void temaSalesBinarias2() {
        limpiarPantalla();
        System.out.println("====================================================================");
        System.out.println("|                          SALES BINARIAS                          |");
        System.out.println("====================================================================");
        System.out.println("| " + "\u001B[31mMnemotecnia:\u001B[0m" + " BI-ME-NO = \"BI (dos) – ME (metal) – NO (no metal)\"  |");
        System.out.println("|                                                                  |");
        System.out.println("| Para recordar qué es una sal binaria, piensa que está hecha de   |");
        System.out.println("| dos partes (BI): un METAL (ME) y un NO METAL (NO).               |");
        System.out.println("|                                                                  |");
        System.out.println("| BI-ME-NO te recuerda:                                            |");
        System.out.println("|   - BI = Dos elementos                                           |");
        System.out.println("|   - ME = Metal                                                   |");
        System.out.println("|   - NO = No metal                                                |");
        System.out.println("|                                                                  |");
        System.out.println("| Idea clave:                                                      |");
        System.out.println("|   \"Metal + No metal → nace una SAL BINARIA\"                      |");
        System.out.println("|                                                                  |");
        System.out.println("| Imagen mental:                                                   |");
        System.out.println("|   Imagina al metal (Na) como un soldado fuerte, y al no metal    |");
        System.out.println("|   (Cl) como un mago con capa. Cuando se unen, forman un dúo      |");
        System.out.println("|   perfecto y estable: NaCl.                                      |");
        System.out.println("|                                                                  |");
        System.out.println("| Así recuerdas fácilmente que:                                    |");
        System.out.println("|   SAL BINARIA = METAL + NO METAL                                 |");
        System.out.println("====================================================================");
        esperarMENU();

    }



    public static void esperarTecla(Scanner scanner) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presione ENTER para continuar... |");
        System.out.println("====================================");
        scanner.nextLine();
    }


    public static void mnemotecnias(){
        System.out.println("\u001B[34m\n" +
                "   ███╗   ███╗ ███╗   ██╗ ███████╗ ███╗   ███╗  ██████╗ ████████╗ ███████╗  ██████╗ ███╗   ██╗ ██╗  █████╗   █████═╗\n" +
                "   ████╗ ████║ ████╗  ██║ ██╔════╝ ████╗ ████║ ██╔═══██╗╚══██╔══╝ ██╔════╝ ██╔════╝ ████╗  ██║ ██║ ██╔══██╗ ██╔════╝\n" +
                "   ██╔████╔██║ ██╔██╗ ██║ █████╗   ██╔████╔██║ ██║   ██║   ██║    █████╗   ██║      ██╔██╗ ██║ ██║ ███████║  █████╗\n" +
                "   ██║╚██╔╝██║ ██║╚██╗██║ ██╔══╝   ██║╚██╔╝██║ ██║   ██║   ██║    ██╔══╝   ██║      ██║╚██╗██║ ██║ ██╔══██║  ╚═══██╗\n" +
                "   ██║ ╚═╝ ██║ ██║ ╚████║ ███████╗ ██║ ╚═╝ ██║ ╚██████╔╝   ██║    ███████╗ ╚██████╗ ██║ ╚████║ ██║ ██║  ██║ ██████╔╝\n" +
                "   ╚═╝     ╚═╝ ╚═╝  ╚═══╝ ╚══════╝ ╚═╝     ╚═╝  ╚═════╝    ╚═╝    ╚══════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚═╝ ╚═╝  ╚═╝ ╚═════╝\n" +
                "\u001B[0m");
    }

    public static void ejemplos(){
        System.out.println("\u001B[38;2;255;165;0m\n" +
                "███████╗      ██╗ ███████╗ ███╗   ███╗ ██████╗  ██╗       ██████╗   █████═╗\n" +
                "██╔════╝      ██║ ██╔════╝ ████╗ ████║ ██╔══██╗ ██║      ██╔═══██╗ ██╔════╝\n" +
                "█████╗        ██║ █████╗   ██╔████╔██║ ██████╔╝ ██║      ██║   ██║  █████╗\n" +
                "██╔══╝   ██   ██║ ██╔══╝   ██║╚██╔╝██║ ██╔═══╝  ██║      ██║   ██║  ╚═══██╗\n" +
                "███████╗ ╚█████╔╝ ███████╗ ██║ ╚═╝ ██║ ██║      ███████╗ ╚██████╔╝ ██████╔╝\n" +
                "╚══════╝  ╚════╝  ╚══════╝ ╚═╝     ╚═╝ ╚═╝      ╚══════╝  ╚═════╝  ╚═════╝\n" +
                "\u001B[0m");

    }

    public static void Tecnicas_estudio(){
        System.out.println("\u001B[38;2;255;180;80m\n" +
                "████████╗ ███████╗  ██████╗ ███╗   ██╗ ██╗  ██████╗  █████╗   █████═╗  ██████╗  ███████╗\n" +
                "╚══██╔══╝ ██╔════╝ ██╔════╝ ████╗  ██║ ██║ ██╔════╝ ██╔══██╗ ██╔════╝  ██╔══██╗ ██╔════╝\n" +
                "   ██║    █████╗   ██║      ██╔██╗ ██║ ██║ ██║      ███████║  █████╗   ██║  ██║ █████╗\n" +
                "   ██║    ██╔══╝   ██║      ██║╚██╗██║ ██║ ██║      ██╔══██║  ╚═══██╗  ██║  ██║ ██╔══╝\n" +
                "   ██║    ███████╗ ╚██████╗ ██║ ╚████║ ██║ ╚██████╗ ██║  ██║ ██████╔╝  ██████╔╝ ███████╗\n" +
                "   ╚═╝    ╚══════╝  ╚═════╝ ╚═╝  ╚═══╝ ╚═╝  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝   ╚═════╝  ╚══════╝\n" +
                "\n" +
                "███████╗  █████═╗ ████████╗ ██╗   ██╗ ██████╗  ██╗  ██████╗\n" +
                "██╔════╝ ██╔════╝ ╚══██╔══╝ ██║   ██║ ██╔══██╗ ██║ ██╔═══██╗\n" +
                "█████╗    █████╗     ██║    ██║   ██║ ██║  ██║ ██║ ██║   ██║\n" +
                "██╔══╝    ╚═══██╗    ██║    ██║   ██║ ██║  ██║ ██║ ██║   ██║\n" +
                "███████╗ ██████╔╝    ██║    ╚██████╔╝ ██████╔╝ ██║ ╚██████╔╝\n" +
                "╚══════╝ ╚═════╝     ╚═╝     ╚═════╝  ╚═════╝  ╚═╝  ╚═════╝\n"+
                "\u001B[0m");
    }

    private static void Recordatorios() {
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

                        if (!fechaValida(nuevaFecha)) {
                            System.out.println("\n===============================================");
                            System.out.println("| Fecha inválida. Revisa día, mes y año.      |");
                            System.out.println("| Ejemplos válidos: 28/02/2025, 29/02/2024   |");
                            System.out.println("===============================================");
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

    public static boolean fechaValida(String fecha) {

        if (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        // Validar mes
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Días máximos por mes
        int diasMaximos;

        switch (mes) {
            case 4, 6, 9, 11 -> diasMaximos = 30;
            case 2 -> {
                // Año bisiesto
                boolean bisiesto =
                        (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
                diasMaximos = bisiesto ? 29 : 28;
            }
            default -> diasMaximos = 31;
        }

        // Validar día
        return dia >= 1 && dia <= diasMaximos;
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
    public static void ModuloTest() {
        Scanner sc = new Scanner(System.in);
        int opcionUnidad = -1;

        do {
            limpiarPantalla();
            test();
            System.out.println("=================================================");
            System.out.println("|        TEST DE CONOCIMIENTOS POR UNIDAD       |");
            System.out.println("=================================================");
            System.out.println("| 1. Unidad 1: Introducción y materia           |");
            System.out.println("| 2. Unidad 2: Estructura atómica               |");
            System.out.println("| 3. Unidad 3: Tabla periódica                  |");
            System.out.println("| 4. Unidad 4: Enlace químico                   |");
            System.out.println("| 5. Unidad 5: Nomenclatura inorgánica          |");
            System.out.println("| 6. Ver calificaciones y promedio              |");
            System.out.println("| 0. Volver al menú principal                   |");
            System.out.println("=================================================");
            System.out.print("Seleccione una opción: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            opcionUnidad = sc.nextInt();
            sc.nextLine();

            if (opcionUnidad < 0 || opcionUnidad > 6) {
                System.out.println("\n");
                System.out.println("=================================================");
                System.out.println("| Opción fuera de rango. Use valores 0 a 6.     |");
                System.out.println("=================================================");
                esperarEnter(sc);
                continue;
            }

            switch (opcionUnidad) {
                case 1:
                    testUnidad1(sc);
                    break;
                case 2:
                    testUnidad2(sc);
                    break;
                case 3:
                    testUnidad3(sc);
                    break;
                case 4:
                    testUnidad4(sc);
                    break;
                case 5:
                    testUnidad5(sc);
                    break;
                case 6:
                    mostrarCalificaciones(sc);
                    break;
                case 0:
                    System.out.println("\n");
                    System.out.println("==================================");
                    System.out.println("| Volviendo al menú principal... |");
                    System.out.println("==================================");
                    esperarEnter();
                    break;

            }

            if (opcionUnidad != 0) esperarEnter(sc);

        } while (opcionUnidad != 0);

    }

    // -------------------------------------------------
    // TEST UNIDAD 1
    // -------------------------------------------------

    static boolean[] preguntaRespondidaU1 = new boolean[6];
    public static void testUnidad1(Scanner sc) {


        int opcion = -1;

        while (true) {

            limpiarPantalla();

            System.out.println("=================================================");
            System.out.println("|     TEST UNIDAD 1: INTRODUCCIÓN Y MATERIA     |");
            System.out.println("=================================================");
            System.out.println("| 1. ¿Qué es la química?                        |");
            System.out.println("| 2. ¿Qué es la materia?                        |");
            System.out.println("| 3. Fenómeno físico vs químico                 |");
            System.out.println("| 4. Estados de la materia                      |");
            System.out.println("| 5. Propiedades físicas y químicas             |");
            System.out.println("| 6. Cambios reversibles e irreversibles        |");
            System.out.println("| 0. Volver                                     |");
            System.out.println("=================================================");
            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion < 0 || opcion > 6) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 0 a 6. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            if (opcion == 0) return;

            switch (opcion) {
                case 1:
                    preguntaQuimica(sc);
                    break;
                case 2:
                    preguntaMateria(sc);
                    break;
                case 3:
                    preguntaFisicoQuimico(sc);
                    break;
                case 4:
                    preguntaEstados(sc);
                    break;
                case 5:
                    preguntaPropiedades(sc);
                    break;
                case 6:
                    preguntaReversibles(sc);
                    break;
            }
        }
    }

    // -------------------------------------------------
    // PREGUNTAS
    // -------------------------------------------------

    public static void preguntaQuimica(Scanner sc) {
        int r;

        while (true) {
            limpiarPantalla();
            System.out.println("===================================================================");
            System.out.println("|                        ¿Qué es la química?                      |");
            System.out.println("===================================================================");
            System.out.println("| 1) Ciencia que estudia elementos de sustancias.                 |");
            System.out.println("| 2) Ciencia que estudia la materia y sus transformaciones.       |");
            System.out.println("| 3) Ciencia que estudia propiedades físicas únicamente.          |");
            System.out.println("===================================================================");
            System.out.print("Respuesta: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // -----------------------------------------
            // VALIDACIÓN DIRECTA DENTRO DEL WHILE
            // -----------------------------------------
            if (r == 2) {
                califU1++;
                if (califU1 > 6) {
                    califU1 = 6;
                }
                System.out.println("\n");
                System.out.println("====================================================================================");
                System.out.println("| Correcto: La química analiza la composición, estructura y cambios de la materia. |");
                System.out.println("====================================================================================");
                esperarEnter(sc);
                break; // <-- Solo se sale si es correcto
            } else {
                System.out.println("\n");
                System.out.println("================================================================================================");
                System.out.println("| Incorrecto: Intenta de nuevo. La química estudia la materia y sus transformaciones.          |");
                System.out.println("================================================================================================");
                esperarEnter(sc);
                // NO salimos: vuelve a preguntar
            }
        }
    }


    public static void preguntaMateria(Scanner sc) {
        int r;

        while (true) {
            limpiarPantalla();
            System.out.println("===================================================================");
            System.out.println("|                        ¿Qué es la materia?                      |");
            System.out.println("===================================================================");
            System.out.println("| 1) Todo lo que tiene masa y ocupa espacio.                      |");
            System.out.println("| 2) Todo lo que tiene densidad.                                  |");
            System.out.println("| 3) Solo sólidos, líquidos y gases.                              |");
            System.out.println("===================================================================");
            System.out.print("Respuesta: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // -------------------------
            // VALIDACIÓN CORRECTA
            // -------------------------
            if (r == 1) {
                califU1++;
                if (califU1 > 6) {
                    califU1 = 6;
                }
                System.out.println("\n");
                System.out.println("=====================================================");
                System.out.println("| Correcto: Toda materia cuenta con masa y volumen. |");
                System.out.println("=====================================================");
                esperarEnter(sc);
                break; // salir solo si es correcto
            } else {
                System.out.println("\n");
                System.out.println("=======================================================");
                System.out.println("| Incorrecto: La materia no incluye cuerpos sin masa. |");
                System.out.println("=======================================================");
                esperarEnter(sc);
                // NO salimos: repetimos el while
            }
        }
    }

    public static void preguntaFisicoQuimico(Scanner sc) {
        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("===================================================================");
            System.out.println("|          Características del cambio físico                      |");
            System.out.println("===================================================================");
            System.out.println("| 1) Cambio que altera composición.                               |");
            System.out.println("| 2) Cambio sin nueva sustancia.                                  |");
            System.out.println("| 3) Cambio que siempre genera calor.                             |");
            System.out.println("===================================================================");
            System.out.print("Respuesta: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            if (r < 1 || r > 3) {
                System.out.println("\n=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // ============================
            // VALIDACIÓN DE RESPUESTA
            // ============================
            if (r == 2) {
                califU1++;
                if (califU1 > 6) {
                    califU1 = 6;
                }
                System.out.println("\n=====================================================================");
                System.out.println("| Correcto: Un fenómeno físico NO altera la composición de materia. |");
                System.out.println("=====================================================================");
                esperarEnter(sc);
                break;  // AHORA si esta dentro del while
            } else {
                System.out.println("\n=================================================================================================");
                System.out.println("| Incorrecto: El fenómeno físico no crea sustancias nuevas, solo cambia estado, forma o tamaño. |");
                System.out.println("=================================================================================================");
                esperarEnter(sc);
                // vuelve a preguntar (por el while)
            }
        }
    }

    public static void preguntaEstados(Scanner sc) {
        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("===========================================================");
            System.out.println("| ¿Cuáles son los estados de la materia?                  |");
            System.out.println("===========================================================");
            System.out.println("| 1) Sólido, líquido, gas.                                |");
            System.out.println("| 2) Plasma, gas, energía.                                |");
            System.out.println("| 3) Sólido, líquido, gas y plasma.                       |");
            System.out.println("===========================================================");
            System.out.print("Respuesta: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            if (r < 1 || r > 3) {
                System.out.println("\n=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // -------- VALIDACIÓN --------
            if (r == 3) {
                califU1++;
                if (califU1 > 6) {
                    califU1 = 6;
                }
                System.out.println("\n================================================================================");
                System.out.println("| Correcto: Existen cuatro estados básicos: sólido, líquido, gaseoso y plasma. |");
                System.out.println("================================================================================");
                esperarEnter(sc);
                break;
            } else {
                System.out.println("\n========================================================================");
                System.out.println("| Incorrecto: Falta incluir el plasma, el cuarto estado de la materia. |");
                System.out.println("========================================================================");
                esperarEnter(sc);
            }
        }
    }


    public static void preguntaPropiedades(Scanner sc) {
        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("============================================================================");
            System.out.println("| Propiedades físicas y químicas                                           |");
            System.out.println("============================================================================");
            System.out.println("| 1) Física no cambia sustancia; química sí.                               |");
            System.out.println("| 2) Física siempre cambia sustancia.                                      |");
            System.out.println("| 3) Ambas cambian sustancia.                                              |");
            System.out.println("============================================================================");
            System.out.print("Respuesta: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            if (r < 1 || r > 3) {
                System.out.println("\n=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // -------- VALIDACIÓN --------
            if (r == 1) {
                califU1++;
                if (califU1 > 6) {
                    califU1 = 6;
                }
                System.out.println("\n=============================================================================");
                System.out.println("| Correcto: Las propiedades físicas se observan sin alterar la composición. |");
                System.out.println("=============================================================================");
                esperarEnter(sc);
                break;
            } else {
                System.out.println("\n==========================================================================");
                System.out.println("| Incorrecto: Solo las propiedades químicas implican una transformación. |");
                System.out.println("==========================================================================");
                esperarEnter(sc);
            }
        }
    }

    public static void preguntaReversibles(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("===============================================================");
            System.out.println("| Cambios reversibles e irreversibles                         |");
            System.out.println("===============================================================");
            System.out.println("| 1) Reversibles regresan al estado original.                 |");
            System.out.println("| 2) Irreversibles se recuperan fácilmente.                   |");
            System.out.println("| 3) Ambos son permanentes.                                   |");
            System.out.println("===============================================================");
            System.out.print("Respuesta: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            if (r < 1 || r > 3) {
                System.out.println("\n=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // ---------- VALIDACIÓN ----------
            if (r == 1) {
                califU1++;

                if (califU1 > 6) {
                    califU1 = 6;
                }

                System.out.println("\n=======================================================================================================");
                System.out.println("| Correcto: Los cambios reversibles pueden regresar a su estado inicial, como el hielo al derretirse. |");
                System.out.println("=======================================================================================================");
                esperarEnter(sc);
                break;  // salir cuando es correcta
            } else {
                System.out.println("\n=======================================================================");
                System.out.println("| Incorrecto: Solo los reversibles pueden volver a su forma original. |");
                System.out.println("=======================================================================");
                esperarEnter(sc);
            }
        }
    }


    // -------------------------------------------------
    // Segunda Unidad
    // -------------------------------------------------

    public static void testUnidad2(Scanner sc) {

        int opcion = -1;

        while (true) {

            limpiarPantalla();

            System.out.println("=================================================");
            System.out.println("|        TEST UNIDAD 2: ESTRUCTURA ATÓMICA      |");
            System.out.println("=================================================");
            System.out.println("| 1. Modelos Atómicos                           |");
            System.out.println("| 2. Partículas en el núcleo                    |");
            System.out.println("| 3. Carga del átomo                            |");
            System.out.println("| 4. Modelo de Thomson                          |");
            System.out.println("| 5. Número atómico y masa atómica              |");
            System.out.println("| 6. Electrón y su carga                        |");
            System.out.println("| 0. Volver                                     |");
            System.out.println("=================================================");
            System.out.print("Elige una opción: ");

            // VALIDACI�N: �Es n�mero?
            if (!sc.hasNextInt()) {
                sc.nextLine(); // limpiar basura
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine(); // limpia salto de l�nea

            // VALIDACI�N: Rango
            if (opcion < 0 || opcion > 6) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 0 a 6. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Salir
            if (opcion == 0) return;

            // Aqui preguntas
            switch (opcion) {
                case 1:
                    preguntaBohr(sc);
                    break;
                case 2:
                    preguntaNucleo(sc);
                    break;
                case 3:
                    preguntaCargaAtomica(sc);
                    break;
                case 4:
                    preguntaThomson(sc);
                    break;
                case 5:
                    preguntaNumeroAtomico(sc);
                    break;
                case 6:
                    preguntaElectron(sc);
                    break;
            }
        }
    }

//Preguntas...

    public static void preguntaBohr(Scanner sc) {

        while (true) {  // SE REPITE HASTA QUE RESPONGA BIEN

            limpiarPantalla();
            System.out.println("=======================================================================");
            System.out.println("| ¿Quién propuso el modelo con electrones girando como planetas?      |");
            System.out.println("=======================================================================");
            System.out.println("| 1) Dalton                                                           |");
            System.out.println("| 2) Thomson                                                          |");
            System.out.println("| 3) Bohr                                                             |");
            System.out.println("=======================================================================");
            System.out.print("Respuesta: ");

            // Validacion: es numero?
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            int r = sc.nextInt();
            sc.nextLine();

            // Validación: rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validacion de respuesta
            if (r == 3) {
                califU2++;
                if (califU2 > 6) {
                    califU2 = 6;
                }
                System.out.println("\n");
                System.out.println("=============================================================================================");
                System.out.println("| Correcto: Bohr propuso el modelo con niveles de energía y electrones orbitando el núcleo. |");
                System.out.println("=============================================================================================");
                esperarEnter(sc);
                break;  // <-- AHORA Si sale del ciclo porque respondio bien
            } else {
                System.out.println("\n");
                System.out.println("======================================================================");
                System.out.println("| Incorrecto: Ese modelo corresponde a Bohr, no a Dalton ni Thomson. |");
                System.out.println("======================================================================");
                esperarEnter(sc);
                // NO HACEMOS break  se repite la pregunta
            }
        }
    }

    public static void preguntaNucleo(Scanner sc) {

        while (true) {  // Se repite hasta que responda bien

            limpiarPantalla();
            System.out.println("===============================================================");
            System.out.println("| ¿Qué partículas se encuentran en el núcleo del átomo?       |");
            System.out.println("===============================================================");
            System.out.println("| 1) Protones y neutrones                                     |");
            System.out.println("| 2) Electrones y protones                                    |");
            System.out.println("| 3) Solo electrones                                          |");
            System.out.println("===============================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            int r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación de respuesta
            if (r == 1) {
                califU2++;
                if (califU2 > 6) {
                    califU2 = 6;
                }
                System.out.println("\n");
                System.out.println("====================================================================================");
                System.out.println("| Correcto: El núcleo está formado por protones (positivos) y neutrones (neutros). |");
                System.out.println("====================================================================================");
                esperarEnter(sc);
                break;   // SALE porque respondió correctamente
            } else {
                System.out.println("\n");
                System.out.println("========================================================================================");
                System.out.println("| Incorrecto: Los electrones NO están en el núcleo; se encuentran orbitando alrededor. |");
                System.out.println("========================================================================================");
                esperarEnter(sc);
                // NO break → se repite la pregunta
            }
        }
    }

    public static void preguntaCargaAtomica(Scanner sc) {

        while (true) {  // Se repite hasta que responda bien

            limpiarPantalla();
            System.out.println("===============================================================");
            System.out.println("| ¿Qué carga eléctrica tiene un átomo en estado basal?        |");
            System.out.println("===============================================================");
            System.out.println("| 1) Positiva                                                 |");
            System.out.println("| 2) Negativa                                                 |");
            System.out.println("| 3) Neutra                                                   |");
            System.out.println("===============================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            int r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación de respuesta
            if (r == 3) {
                califU2++;
                if (califU2 > 6) {
                    califU2 = 6;
                }
                System.out.println("\n");
                System.out.println("==============================================================================================");
                System.out.println("| Correcto: En un átomo neutro (estado basal), protones y electrones son cantidades iguales. |");
                System.out.println("==============================================================================================");
                esperarEnter(sc);
                break;  // Sale del ciclo porque ya respondió correctamente
            } else {
                System.out.println("\n");
                System.out.println("========================================================================================");
                System.out.println("| Incorrecto: Un átomo neutro tiene la MISMA cantidad de cargas positivas y negativas. |");
                System.out.println("========================================================================================");
                esperarEnter(sc);
                // No break → se repite la pregunta
            }
        }
    }

    public static void preguntaThomson(Scanner sc) {

        while (true) {  // Se repite hasta acertar

            limpiarPantalla();
            System.out.println("==============================================================================");
            System.out.println("|    ¿Qué representaba el modelo atómico de Thomson?                         |");
            System.out.println("==============================================================================");
            System.out.println("| 1) Una esfera con cargas positivas y negativas distribuidas uniformemente. |");
            System.out.println("| 2) Un núcleo central con electrones orbitando alrededor.                   |");
            System.out.println("| 3) Una nube de electrones sin núcleo definido.                             |");
            System.out.println("==============================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            int r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación de respuesta correcta
            if (r == 1) {
                califU2++;
                if (califU2 > 6) {
                    califU2 = 6;
                }
                System.out.println("\n");
                System.out.println("==================================================================================================");
                System.out.println("| Correcto: Thomson propuso el 'pastel de pasas': electrones incrustados en una esfera de carga. |");
                System.out.println("==================================================================================================");
                esperarEnter(sc);
                break;   // Sale porque respondió bien
            } else {
                System.out.println("\n");
                System.out.println("====================================================================================================");
                System.out.println("| Incorrecto: Ese modelo corresponde a Rutherford o modelos posteriores, no al de Thomson.         |");
                System.out.println("====================================================================================================");
                esperarEnter(sc);
                // No break → repite la pregunta
            }
        }
    }


    public static void preguntaNumeroAtomico(Scanner sc) {

        while (true) {  // Repetir hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("================================================================");
            System.out.println("| ¿Qué indica el número atómico de un elemento?                |");
            System.out.println("================================================================");
            System.out.println("| 1) La cantidad de neutrones.                                 |");
            System.out.println("| 2) La cantidad de protones.                                  |");
            System.out.println("| 3) La suma de protones y neutrones.                          |");
            System.out.println("================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            int r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación correcta/incorrecta
            if (r == 2) {
                califU2++;
                if (califU2 > 6) {
                    califU2 = 6;
                }
                System.out.println("\n");
                System.out.println("======================================================================================");
                System.out.println("| Correcto: El número atómico indica la cantidad de protones en el núcleo del átomo. |");
                System.out.println("======================================================================================");
                esperarEnter(sc);
                break;  // Sale porque ya respondió bien
            } else {
                System.out.println("\n");
                System.out.println("=======================================================================================");
                System.out.println("| Incorrecto: La suma de protones y neutrones corresponde a la masa atómica, no al Z. |");
                System.out.println("=======================================================================================");
                esperarEnter(sc);
                // No break → se repite
            }
        }
    }


    public static void preguntaElectron(Scanner sc) {

        while (true) {  // Repetir hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("===========================================================================");
            System.out.println("| ¿Qué carga tiene el electrón y dónde se encuentra?                      |");
            System.out.println("===========================================================================");
            System.out.println("| 1) Carga positiva, girando alrededor del núcleo.                        |");
            System.out.println("| 2) Carga negativa, girando alrededor del núcleo.                        |");
            System.out.println("| 3) Carga neutra, dentro del núcleo.                                     |");
            System.out.println("===========================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            int r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación correcta / incorrecta
            if (r == 2) {
                califU2++;
                if (califU2 > 6) {
                    califU2 = 6;
                }
                System.out.println("\n");
                System.out.println("=============================================================================================");
                System.out.println("| Correcto: El electrón tiene carga negativa y se encuentra orbitando alrededor del núcleo. |");
                System.out.println("=============================================================================================");
                esperarEnter(sc);
                break;  // Sale del ciclo porque respondió correctamente
            } else {
                System.out.println("\n");
                System.out.println("==================================================================================");
                System.out.println("| Incorrecto: El electrón NO es positivo ni neutro, y no está dentro del núcleo. |");
                System.out.println("==================================================================================");
                esperarEnter(sc);
                // No break → se repite la pregunta
            }
        }
    }


//Aqui inciia el TestUnidad3

    public static void testUnidad3(Scanner sc) {

        int opcion = -1;

        while (true) {

            limpiarPantalla();

            System.out.println("=================================================");
            System.out.println("|        TEST UNIDAD 3: TABLA PERIÓDICA         |");
            System.out.println("=================================================");
            System.out.println("| 1. Origen de la tabla periódica               |");
            System.out.println("| 2. Número atómico y su significado            |");
            System.out.println("| 3. Organización moderna de la tabla           |");
            System.out.println("| 4. Grupos y periodos                          |");
            System.out.println("| 5. Propiedades periódicas                     |");
            System.out.println("| 6. Clasificación de los elementos             |");
            System.out.println("| 0. Volver                                     |");
            System.out.println("=================================================");
            System.out.print("Elige una opción: ");

            // Validar entrada num�rica
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            // Validar rango
            if (opcion < 0 || opcion > 6) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 0 a 6. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Salir al men� principal
            if (opcion == 0) return;

            // Dependiendo de la ocpion aqui las preguntas
            switch (opcion) {
                case 1:
                    preguntaOrigenTabla(sc);
                    break;
                case 2:
                    preguntaRepresentacionDelNumeroAtomico(sc);
                    break;
                case 3:
                    preguntaOrganizacionTabla(sc);
                    break;
                case 4:
                    preguntaGruposPeriodos(sc);
                    break;
                case 5:
                    preguntaPropiedadesPeriodicas(sc);
                    break;
                case 6:
                    preguntaClasificacionElementos(sc);
                    break;
            }
        }
    }

//Preguntas unidad3

    public static void preguntaOrigenTabla(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("===========================================================================");
            System.out.println("| ¿Quién es considerado el creador de la primera tabla periódica moderna? |");
            System.out.println("===========================================================================");
            System.out.println("| 1) Niels Bohr                                                           |");
            System.out.println("| 2) Dmitri Mendeléiev                                                    |");
            System.out.println("| 3) Ernest Rutherford                                                    |");
            System.out.println("===========================================================================");
            System.out.print("Respuesta: ");

            // Validación para evitar errores con letras o símbolos
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación del rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta
            if (r == 2) {
                califU3++;
                if (califU3 > 6) {
                    califU3 = 6;
                }
                System.out.println("\n");
                System.out.println("============================================================================================================");
                System.out.println("| Correcto: Dmitri Mendeléiev organizó los elementos por sus propiedades y masas, dejando espacios vacíos. |");
                System.out.println("============================================================================================================");
                esperarEnter(sc);
                break;
            }

            // Respuesta incorrecta
            System.out.println("\n");
            System.out.println("==============================================================================================");
            System.out.println("| Incorrecto: El creador de la primera tabla periódica moderna fue Dmitri Mendeléiev (1869). |");
            System.out.println("==============================================================================================");
            esperarEnter(sc);
        }
    }


    public static void preguntaRepresentacionDelNumeroAtomico(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("========================================================================================");
            System.out.println("| ¿Qué representa el número atómico de un elemento químico?                            |");
            System.out.println("========================================================================================");
            System.out.println("| 1) La cantidad total de partículas en el átomo.                                      |");
            System.out.println("| 2) La cantidad de protones en el núcleo, y también de electrones en un átomo neutro. |");
            System.out.println("| 3) La masa promedio de todos los isótopos del elemento.                              |");
            System.out.println("========================================================================================");
            System.out.print("Respuesta: ");

            // Validar número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validar rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta → salir del while
            if (r == 2) {
                califU3++;
                if (califU3 > 6) {
                    califU3 = 6;
                }
                System.out.println("\n");
                System.out.println("==================================================================================================");
                System.out.println("| Correcto: El número atómico indica la cantidad de protones del núcleo, definiendo al elemento. |");
                System.out.println("==================================================================================================");
                esperarEnter(sc);
                break;
            }

            // Respuesta incorrecta → repetir
            System.out.println("\n");
            System.out.println("===================================================================================================");
            System.out.println("| Incorrecto: El número atómico NO es la masa ni el total de partículas; representa los protones. |");
            System.out.println("===================================================================================================");
            esperarEnter(sc);
        }
    }

    public static void preguntaOrganizacionTabla(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("=======================================================================================");
            System.out.println("|       ¿Cómo están organizados los elementos en la tabla periódica actual?           |");
            System.out.println("=======================================================================================");
            System.out.println("| 1) Por masa atómica creciente.                                                      |");
            System.out.println("| 2) Según su número atómico creciente y propiedades químicas semejantes en columnas. |");
            System.out.println("| 3) Por la cantidad de neutrones en el núcleo.                                       |");
            System.out.println("=======================================================================================");
            System.out.print("Respuesta: ");

            // Validar número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validar rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta → salir del ciclo
            if (r == 2) {
                califU3++;
                if (califU3 > 6) {
                    califU3 = 6;
                }
                System.out.println("\n");
                System.out.println("=======================================================================================================================");
                System.out.println("| Correcto: La tabla actual se organiza por número atómico creciente y los elementos con propiedades similares        |");
                System.out.println("| están agrupados en columnas llamadas grupos.                                                                        |");
                System.out.println("=======================================================================================================================");
                esperarEnter(sc);
                break;
            }

            // Respuesta incorrecta → repetir
            System.out.println("\n");
            System.out.println("=======================================================================================================================");
            System.out.println("| Incorrecto: La tabla periódica moderna NO se organiza por masa ni por neutrones, sino por número atómico.           |");
            System.out.println("=======================================================================================================================");
            esperarEnter(sc);
        }
    }


    public static void preguntaGruposPeriodos(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("====================================================================================================================");
            System.out.println("| ¿Qué relación existe entre los grupos y los periodos en la tabla periódica?                                      |");
            System.out.println("====================================================================================================================");
            System.out.println("| 1) Los grupos son filas que agrupan elementos con propiedades químicas semejantes                                |");
            System.out.println("|    y los periodos son columnas con el mismo número de niveles de energía.                                        |");
            System.out.println("| 2) Los grupos son columnas que agrupan elementos con propiedades químicas semejantes,                            |");
            System.out.println("|    y los periodos son filas con el mismo número de niveles de energía.                                           |");
            System.out.println("| 3) Ambos son divisiones sin relación con la estructura electrónica de los átomos.                                |");
            System.out.println("====================================================================================================================");
            System.out.print("Respuesta: ");

            // Validar número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validar rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta → salir del ciclo
            if (r == 2) {
                califU3++;
                if (califU3 > 6) {
                    califU3 = 6;
                }
                System.out.println("\n");
                System.out.println("==================================================================================================");
                System.out.println("| Correcto: Los grupos son columnas con elementos de propiedades semejantes,                     |");
                System.out.println("| y los periodos son filas que representan el nivel energético más alto ocupado.                 |");
                System.out.println("==================================================================================================");
                esperarEnter(sc);
                break;
            }

            // Respuesta incorrecta → repetir
            System.out.println("\n");
            System.out.println("====================================================================================================================");
            System.out.println("| Incorrecto: Los grupos y periodos sí tienen relación: se basan en la configuración electrónica de los átomos.   |");
            System.out.println("====================================================================================================================");
            esperarEnter(sc);
        }
    }

    public static void preguntaPropiedadesPeriodicas(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("===================================================================================");
            System.out.println("| ¿Qué propiedad periódica disminuye de izquierda a derecha en un mismo periodo?  |");
            System.out.println("===================================================================================");
            System.out.println("| 1) Energía de ionización                                                        |");
            System.out.println("| 2) Electronegatividad                                                           |");
            System.out.println("| 3) Radio atómico                                                                |");
            System.out.println("===================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validar rango 1–3
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Si es correcta, salir del while
            if (r == 3) {
                califU3++;
                if (califU3 > 6) {
                    califU3 = 6;
                }
                System.out.println("\n");
                System.out.println("==================================================================================================================");
                System.out.println("| Correcto: El radio atómico disminuye porque la carga nuclear efectiva aumenta a lo largo del periodo,          |");
                System.out.println("| atrayendo más fuertemente a los electrones y reduciendo el tamaño del átomo.                                   |");
                System.out.println("==================================================================================================================");
                esperarEnter(sc);
                break;
            }

            // Si es incorrecta, repetir
            System.out.println("\n");
            System.out.println("==================================================================================================================");
            System.out.println("| Incorrecto: El radio atómico es la propiedad que disminuye en un periodo;                                      |");
            System.out.println("| la energía de ionización y electronegatividad generalmente aumentan.                                           |");
            System.out.println("==================================================================================================================");
            esperarEnter(sc);
        }
    }


    public static void preguntaClasificacionElementos(Scanner sc) {

        int r;

        while (true) {

            limpiarPantalla();
            System.out.println("=====================================================================================================");
            System.out.println("| ¿Cómo se clasifican los elementos de la tabla periódica según sus propiedades generales?         |");
            System.out.println("=====================================================================================================");
            System.out.println("| 1) En metales, no metales y metaloides.                                                          |");
            System.out.println("| 2) En sólidos, líquidos y gases.                                                                 |");
            System.out.println("| 3) En ligeros y pesados.                                                                         |");
            System.out.println("=====================================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta
            if (r == 1) {
                califU3++;
                if (califU3 > 6) {
                    califU3 = 6;
                }
                System.out.println("\n");
                System.out.println("===================================================================================================================");
                System.out.println("| Correcto: Los elementos se clasifican en metales, no metales y metaloides según sus propiedades químicas y su   |");
                System.out.println("| conductividad.                                                                                                  |");
                System.out.println("===================================================================================================================");
                esperarEnter(sc);
                break; // solo salimos cuando está correcta
            }

            // Respuesta incorrecta → repetir ciclo
            System.out.println("\n");
            System.out.println("===================================================================================================================");
            System.out.println("| Incorrecto: La clasificación correcta es metales, no metales y metaloides;                                      |");
            System.out.println("| no se basa en su estado físico ni en su masa.                                                                    |");
            System.out.println("===================================================================================================================");
            esperarEnter(sc);
        }
    }


//Aqui inicia el TestUnidad4

    public static void testUnidad4(Scanner sc) {

        int opcion = -1;

        while (true) {

            limpiarPantalla();

            System.out.println("=================================================");
            System.out.println("|         TEST UNIDAD 4: ENLACE QUÍMICO         |");
            System.out.println("=================================================");
            System.out.println("| 1. Concepto de enlace químico                 |");
            System.out.println("| 2. Diferencia entre enlace iónico y covalente |");
            System.out.println("| 3. Enlace entre no metales                    |");
            System.out.println("| 4. Electronegatividad y tipo de enlace        |");
            System.out.println("| 5. Enlace metálico                            |");
            System.out.println("| 6. Polaridad de los enlaces covalentes        |");
            System.out.println("| 0. Volver                                     |");
            System.out.println("=================================================");
            System.out.print("Elige una opción: ");

            // Validar entrada num�rica
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            // Validar rango
            if (opcion < 0 || opcion > 6) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 0 a 6. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Salir al men� principal
            if (opcion == 0) return;

            // Llamar a la pregunta correspondiente
            switch (opcion) {
                case 1:
                    preguntaConceptoEnlace(sc);
                    break;
                case 2:
                    preguntaDiferenciaIonicoCovalente(sc);
                    break;
                case 3:
                    preguntaEnlaceEntreNoMetales(sc);
                    break;
                case 4:
                    preguntaElectronegatividadTipoEnlace(sc);
                    break;
                case 5:
                    preguntaEnlaceMetalico(sc);
                    break;
                case 6:
                    preguntaPolaridadEnlaceCovalente(sc);
                    break;
            }
        }
    }

    public static void preguntaConceptoEnlace(Scanner sc) {

        int r;

        while (true) {  // Se repetirá toda la pregunta hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("===================================================================");
            System.out.println("| ¿Qué es un enlace químico?                                      |");
            System.out.println("===================================================================");
            System.out.println("| 1) La fuerza que une átomos para formar compuestos o moléculas. |");
            System.out.println("| 2) La unión física entre dos metales.                           |");
            System.out.println("| 3) El intercambio de neutrones entre átomos.                    |");
            System.out.println("===================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue; // vuelve a preguntar
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue; // vuelve a preguntar
            }

            // Evaluación
            if (r == 1) {
                califU4++;
                if (califU4 > 6) {
                    califU4 = 6;
                }
                System.out.println("\n");
                System.out.println("===============================================================================================");
                System.out.println("| Correcto: Un enlace químico es la fuerza que mantiene unidos a los átomos en una sustancia. |");
                System.out.println("===============================================================================================");
                esperarEnter(sc);
                break; // Salimos del while (respuesta correcta)
            } else {
                System.out.println("\n");
                System.out.println("===============================================================================================");
                System.out.println("| Incorrecto: Un enlace químico NO implica intercambio de neutrones ni unión física metálica. |");
                System.out.println("===============================================================================================");
                esperarEnter(sc);
                // NO hay break  se repite la pregunta
            }
        }
    }

    public static void preguntaDiferenciaIonicoCovalente(Scanner sc) {

        int r;

        while (true) { // se repite hasta que respondan bien

            limpiarPantalla();
            System.out.println("=========================================================================================");
            System.out.println("| ¿Cuál es la principal diferencia entre el enlace iónico y el covalente?               |");
            System.out.println("=========================================================================================");
            System.out.println("| 1) El iónico comparte electrones y el covalente los transfiere.                       |");
            System.out.println("| 2) El iónico transfiere electrones y el covalente los comparte.                       |");
            System.out.println("| 3) Ambos comparten electrones por igual.                                              |");
            System.out.println("=========================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Evaluación
            if (r == 2) {
                califU4++;
                if (califU4 > 6) {
                    califU4 = 6;
                }
                System.out.println("\n");
                System.out.println("==================================================================================================");
                System.out.println("| Correcto: En el enlace iónico hay transferencia de electrones; en el covalente, compartición.  |");
                System.out.println("==================================================================================================");
                esperarEnter(sc);
                break; // Respuesta correcta! Salimos del ciclo
            } else {
                System.out.println("\n");
                System.out.println("=======================================================================================================================");
                System.out.println("| Incorrecto: Recuerda que el enlace covalente implica compartir electrones; en el iónico hay transferencia completa. |");
                System.out.println("=======================================================================================================================");
                esperarEnter(sc);
                // no hay break  se repite la pregunta
            }
        }
    }


    public static void preguntaEnlaceEntreNoMetales(Scanner sc) {

        int r;

        while (true) { // REPETIR hasta que respondan correctamente

            limpiarPantalla();
            System.out.println("=====================================================================");
            System.out.println("| ¿Qué tipo de enlace se forma entre dos átomos no metálicos?       |");
            System.out.println("=====================================================================");
            System.out.println("| 1) Enlace covalente                                               |");
            System.out.println("| 2) Enlace iónico                                                  |");
            System.out.println("| 3) Enlace metálico                                                |");
            System.out.println("=====================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Evaluación de respuesta
            if (r == 1) {
                califU4++;
                if (califU4 > 6) {
                    califU4 = 6;
                }
                System.out.println("\n");
                System.out.println("=====================================================================================================");
                System.out.println("| Correcto: Entre no metales se forman enlaces covalentes debido a la compartición de electrones.   |");
                System.out.println("=====================================================================================================");
                esperarEnter(sc);
                break; // <-- Avanzamos a la siguiente pregunta
            } else {
                System.out.println("\n");
                System.out.println("=======================================================================================================================");
                System.out.println("| Incorrecto: Los enlaces iónicos ocurren entre metales y no metales; los metálicos se forman entre átomos metálicos. |");
                System.out.println("=======================================================================================================================");
                esperarEnter(sc);
                // NO hay break se repite la pregunta
            }
        }
    }


    public static void preguntaElectronegatividadTipoEnlace(Scanner sc) {

        int r;

        while (true) { // Se repetirá hasta contestar correctamente

            limpiarPantalla();
            System.out.println("====================================================================================================================");
            System.out.println("| ¿Qué papel juega la electronegatividad en la formación del tipo de enlace?                                       |");
            System.out.println("====================================================================================================================");
            System.out.println("| 1) Determina si los átomos compartirán o transferirán electrones según su diferencia de electronegatividad.      |");
            System.out.println("| 2) No influye, los átomos se enlazan al azar.                                                                    |");
            System.out.println("| 3) Solo afecta a los metales.                                                                                    |");
            System.out.println("====================================================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Evaluación de la respuesta
            if (r == 1) {
                califU4++;
                if (califU4 > 6) {
                    califU4 = 6;
                }
                System.out.println("\n");
                System.out.println("========================================================================================================================");
                System.out.println("| Correcto: La diferencia de electronegatividad permite predecir si el enlace será covalente polar, no polar o iónico. |");
                System.out.println("========================================================================================================================");
                esperarEnter(sc);
                break; // Solo salimos si es correcta
            } else {
                System.out.println("\n");
                System.out.println("============================================================================================================");
                System.out.println("| Incorrecto: La electronegatividad influye directamente en cómo se forman los enlaces entre átomos.       |");
                System.out.println("============================================================================================================");
                esperarEnter(sc);
                // No hay break → la pregunta se repite
            }
        }
    }

    public static void preguntaEnlaceMetalico(Scanner sc) {

        int r;

        while (true) { // Repetir hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("===============================================================================================================");
            System.out.println("| ¿Qué caracteriza al enlace metálico?                                                                        |");
            System.out.println("===============================================================================================================");
            System.out.println("| 1) Los átomos metálicos comparten electrones en pares fijos.                                                |");
            System.out.println("| 2) Los electrones se encuentran deslocalizados, formando una nube electrónica entre núcleos positivos.      |");
            System.out.println("| 3) Cada átomo mantiene sus electrones completamente aislados.                                               |");
            System.out.println("===============================================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Evaluación de respuesta
            if (r == 2) {
                califU4++;
                if (califU4 > 6) {
                    califU4 = 6;
                }
                System.out.println("\n");
                System.out.println("========================================================================================================================");
                System.out.println("| Correcto: En el enlace metálico los electrones están deslocalizados, formando una nube electrónica que permite       |");
                System.out.println("| la conductividad térmica y eléctrica característica de los metales.                                                  |");
                System.out.println("========================================================================================================================");
                esperarEnter(sc);
                break; // Finaliza porque ya contestó bien
            } else {
                System.out.println("\n");
                System.out.println("======================================================================================================================");
                System.out.println("| Incorrecto: En los metales los electrones no están fijos ni aislados; se desplazan libremente formando una nube.   |");
                System.out.println("======================================================================================================================");
                esperarEnter(sc);
                // NO hay break  se repite la pregunta
            }
        }
    }

    public static void preguntaPolaridadEnlaceCovalente(Scanner sc) {

        int r;

        while (true) {  // Se repite hasta que responda correctamente

            limpiarPantalla();
            System.out.println("======================================================================================================================");
            System.out.println("| ¿Cuándo un enlace covalente se considera polar?                                                                    |");
            System.out.println("======================================================================================================================");
            System.out.println("| 1) Cuando los átomos tienen igual electronegatividad y comparten electrones de forma equitativa.                   |");
            System.out.println("| 2) Cuando existe una diferencia de electronegatividad moderada y los electrones se comparten de forma desigual.    |");
            System.out.println("| 3) Cuando uno de los átomos gana completamente los electrones.                                                     |");
            System.out.println("======================================================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta
            if (r == 2) {
                califU4++;
                if (califU4 > 6) {
                    califU4 = 6;
                }
                System.out.println("\n");
                System.out.println("======================================================================================================================");
                System.out.println("| Correcto: Un enlace covalente polar surge cuando los electrones se comparten desigual debido a la diferencia de    |");
                System.out.println("| electronegatividad, generando polos parcial positivo y negativo.                                                   |");
                System.out.println("======================================================================================================================");
                esperarEnter(sc);
                break; //  Sale del ciclo, respuesta correcta
            }

            // Respuesta incorrecta
            System.out.println("\n");
            System.out.println("=====================================================================================================================");
            System.out.println("| Incorrecto: La polaridad ocurre cuando hay una diferencia moderada de electronegatividad; no cuando es igual      |");
            System.out.println("| (no polar) ni cuando los electrones se transfieren por completo (iónico).                                         |");
            System.out.println("=====================================================================================================================");
            esperarEnter(sc);
            // No hay break  se repite la pregunta
        }
    }


    //aqui inicia la unidad5

    public static void testUnidad5(Scanner sc) {

        int opcion = -1;

        while (true) {

            limpiarPantalla();

            System.out.println("==============================================================");
            System.out.println("|     TEST UNIDAD 5: NOMENCLATURA QU�MICA INORG�NICA         |");
            System.out.println("==============================================================");
            System.out.println("| 1. Nombre de NaCl                                          |");
            System.out.println("| 2. Nombre sistemático de H\u2082O                               |");
            System.out.println("| 3. Unión metal + no metal                                  |");
            System.out.println("| 4. Óxidos metálicos y no metálicos                         |");
            System.out.println("| 5. Números de oxidación y prefijos                         |");
            System.out.println("| 6. Hidróxidos e hidrácidos                                 |");
            System.out.println("| 0. Volver                                                  |");
            System.out.println("==============================================================");
            System.out.print("Elige una opción: ");

            // Validaci�n de entrada num�rica
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            // Validaci�n de rango
            if (opcion < 0 || opcion > 6) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 0 a 6. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Salir
            if (opcion == 0) return;

            // Conexi�n futura a las preguntas
            switch (opcion) {
                case 1:
                    preguntaNombreNaCl(sc);
                    break;
                case 2:
                    preguntaNombreH2O(sc);
                    break;
                case 3:
                    preguntaMetalNoMetal(sc);
                    break;
                case 4:
                    preguntaOxidos(sc);
                    break;
                case 5:
                    preguntaPrefijos(sc);
                    break;
                case 6:
                    preguntaHidroxidosHidracidos(sc);
                    break;
            }
        }
    }

    public static void preguntaNombreNaCl(Scanner sc) {

        int r;

        while (true) {  // <-- Se repite hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("==================================================================================");
            System.out.println("| ¿Qué nombre recibe el compuesto NaCl según la nomenclatura tradicional?        |");
            System.out.println("==================================================================================");
            System.out.println("| 1) Cloruro de sodio                                                            |");
            System.out.println("| 2) Monóxido de sodio                                                           |");
            System.out.println("| 3) Sulfato de sodio                                                            |");
            System.out.println("==================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Verificar si es correcta
            if (r == 1) {
                califU5++;
                if (califU5 > 6) {
                    califU5 = 6;
                }
                System.out.println("\n");
                System.out.println("=====================================================================================");
                System.out.println("| Correcto: NaCl es el cloruro de sodio, una sal binaria formada por sodio y cloro. |");
                System.out.println("=====================================================================================");
                esperarEnter(sc);
                break;  // <-- ÚNICO momento donde se sale del ciclo
            } else {
                System.out.println("\n");
                System.out.println("=====================================================================================");
                System.out.println("| Incorrecto: NaCl corresponde al cloruro de sodio, no al monóxido ni al sulfato.   |");
                System.out.println("=====================================================================================");
                esperarEnter(sc);
                // NO hay break: la pregunta se repetirá
            }
        }
    }

    public static void preguntaNombreH2O(Scanner sc) {

        int r;

        while (true) {  // <-- Se repite hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("=================================================================================");
            System.out.println("| ¿Cómo se llama el compuesto H\u2082O según la nomenclatura sistemática?            |");
            System.out.println("=================================================================================");
            System.out.println("| 1) Dihidrógeno monóxido                                                       |");
            System.out.println("| 2) Óxido de hidrógeno                                                         |");
            System.out.println("| 3) Hidróxido de hidrógeno                                                     |");
            System.out.println("=================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación de respuesta correcta
            if (r == 1) {
                califU5++;
                if (califU5 > 6) {
                    califU5 = 6;
                }
                System.out.println("\n");
                System.out.println("=======================================================================");
                System.out.println("| Correcto: H\u2082O se nombra sistemáticamente como dihidrógeno monóxido. |");
                System.out.println("=======================================================================");
                esperarEnter(sc);
                break; // <-- solo aquí sale del bucle
            } else {
                System.out.println("\n");
                System.out.println("======================================================================");
                System.out.println("| Incorrecto: La forma sistemática correcta es dihidrógeno monóxido. |");
                System.out.println("======================================================================");
                esperarEnter(sc);
                // No hay break   se repite la pregunta
            }
        }
    }


    public static void preguntaMetalNoMetal(Scanner sc) {

        int r;

        while (true) {   // <-- Se repite hasta que la respuesta sea correcta

            limpiarPantalla();
            System.out.println("============================================================================");
            System.out.println("| ¿Qué tipo de compuesto se forma al unir un metal con un no metal?        |");
            System.out.println("============================================================================");
            System.out.println("| 1) Óxido                                                                 |");
            System.out.println("| 2) Sal binaria                                                           |");
            System.out.println("| 3) Hidruro                                                               |");
            System.out.println("============================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación de respuesta correcta
            if (r == 2) {
                califU5++;
                if (califU5 > 6) {
                    califU5 = 6;
                }
                System.out.println("\n");
                System.out.println("==================================================================================================");
                System.out.println("| Correcto: La unión de un metal con un no metal forma una sal binaria, como en el caso de NaCl. |");
                System.out.println("==================================================================================================");
                esperarEnter(sc);
                break;  // <-- Aquí sí se sale del ciclo
            } else {
                System.out.println("\n");
                System.out.println("==================================================================================================================");
                System.out.println("| Incorrecto: La combinación metal + no metal produce una sal binaria. Los óxidos e hidruros se forman distinto. |");
                System.out.println("==================================================================================================================");
                esperarEnter(sc);
                // sigue el bucle  se repite la pregunta
            }
        }
    }

    public static void preguntaOxidos(Scanner sc) {

        int r;

        while (true) {  // <-- Se repite hasta que respondas bien

            limpiarPantalla();
            System.out.println("======================================================================================");
            System.out.println("| ¿Cuál es la diferencia entre un óxido metálico y un óxido no metálico?             |");
            System.out.println("======================================================================================");
            System.out.println("| 1) Ambas especies químicas proceden exclusivamente de la reacción                  |");
            System.out.println("|    del oxígeno con elementos metálicos.                                            |");
            System.out.println("| 2) En ambos óxidos, la composición se limita a la unión entre metales y oxígeno,   |");
            System.out.println("|    sin intervención de elementos no metálicos.                                     |");
            System.out.println("| 3) Los dos tipos de óxidos están integrados únicamente por átomos metálicos        |");
            System.out.println("|    combinados con oxígeno.                                                         |");
            System.out.println("======================================================================================");
            System.out.print("Respuesta: ");

            // Validación numérica
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Validación de respuesta correcta
            if (r == 1) {
                califU5++;
                if (califU5 > 6) {
                    califU5 = 6;
                }
                System.out.println("\n");
                System.out.println("==========================================================================================================================");
                System.out.println("| Correcto: Los óxidos metálicos se forman con metales + oxígeno, mientras que los no metálicos provienen de no metales. |");
                System.out.println("==========================================================================================================================");
                esperarEnter(sc);
                break;  // <-- Aquí sí se sale del ciclo
            } else {
                System.out.println("\n");
                System.out.println("============================================================================================================");
                System.out.println("| Incorrecto: La diferencia clave es el tipo de elemento que se combina con el oxígeno: metal o no metal.  |");
                System.out.println("============================================================================================================");
                esperarEnter(sc);
                // No hay break  se repite
            }
        }
    }


    public static void preguntaPrefijos(Scanner sc) {

        int r;

        while (true) {  // <-- Repetir hasta acertar

            limpiarPantalla();
            System.out.println("=========================================================================================");
            System.out.println("| ¿Qué indican los prefijos mono-, di-, tri- en la nomenclatura sistemática?            |");
            System.out.println("=========================================================================================");
            System.out.println("| 1) El número de protones del átomo.                                                   |");
            System.out.println("| 2) El número de átomos de cada elemento en la molécula.                               |");
            System.out.println("| 3) El número de enlaces químicos entre los átomos.                                    |");
            System.out.println("=========================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Respuesta correcta
            if (r == 2) {
                califU5++;
                if (califU5 > 6) {
                    califU5 = 6;
                }
                System.out.println("\n");
                System.out.println("=======================================================================================================================================");
                System.out.println("| Correcto: Los prefijos numéricos indican la cantidad de átomos de cada elemento en la molécula (ejemplo: CO₂ = dióxido de carbono). |");
                System.out.println("=======================================================================================================================================");
                esperarEnter(sc);
                break; // --> salir del ciclo
            } else {
                System.out.println("\n");
                System.out.println("========================================================================================================================");
                System.out.println("| Incorrecto: Estos prefijos no indican protones ni enlaces, sino el número de átomos de cada elemento en la molécula. |");
                System.out.println("========================================================================================================================");
                esperarEnter(sc);
                // no break → se repite la pregunta
            }
        }
    }


    public static void preguntaHidroxidosHidracidos(Scanner sc) {

        int r;

        while (true) {  // <-- Repetir hasta responder correctamente

            limpiarPantalla();
            System.out.println("================================================================================================================");
            System.out.println("| ¿Qué diferencia hay entre un hidróxido y un hidrácido?                                                       |");
            System.out.println("================================================================================================================");
            System.out.println("| 1) El hidróxido tiene el grupo OH- unido a un metal; el hidrácido es un hidrógeno combinado con un no metal. |");
            System.out.println("| 2) Ambos tienen oxígeno y se disuelven igual en agua.                                                        |");
            System.out.println("| 3) Los hidrácidos contienen metales y los hidróxidos no.                                                     |");
            System.out.println("================================================================================================================");
            System.out.print("Respuesta: ");

            // Validación de número
            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("\n");
                System.out.println("==============================================");
                System.out.println("| Entrada inválida. Debe ingresar un número. |");
                System.out.println("==============================================");
                esperarEnter(sc);
                continue;
            }

            r = sc.nextInt();
            sc.nextLine();

            // Validación de rango
            if (r < 1 || r > 3) {
                System.out.println("\n");
                System.out.println("=============================================");
                System.out.println("| Opción fuera de rango. Use valores 1 a 3. |");
                System.out.println("=============================================");
                esperarEnter(sc);
                continue;
            }

            // Resultado
            if (r == 1) {
                califU5++;
                if (califU5 > 6) {
                    califU5 = 6;
                }
                System.out.println("\n");
                System.out.println("====================================================================");
                System.out.println("| Correcto: Los hidróxidos son bases que contienen el grupo OH-,   |");
                System.out.println("| mientras que los hidrácidos son ácidos binarios (como HCl).      |");
                System.out.println("====================================================================");
                esperarEnter(sc);
                break; // <-- salir porque ya respondió bien
            } else {
                System.out.println("\n");
                System.out.println("===================================================================================================");
                System.out.println("| Incorrecto: Los hidrácidos no contienen oxígeno; los hidróxidos sí, porque poseen el grupo OH-. |");
                System.out.println("===================================================================================================");
                esperarEnter(sc);
                // no break → se repite la pregunta
            }
        }
    }


    public static void mostrarCalificaciones(Scanner sc) {
        limpiarPantalla();

        int totalUnidades = 5;
        int totalPreguntas = 6 * totalUnidades;
        int totalAciertos = califU1 + califU2 + califU3 + califU4 + califU5;

        double porcentaje = (totalAciertos * 100.0) / totalPreguntas;

        System.out.println("=================================================");
        System.out.println("|         CALIFICACIONES Y PROMEDIO             |");
        System.out.println("=================================================");
        System.out.println("| Unidad 1: " + califU1 + " / 6                               |");
        System.out.println("| Unidad 2: " + califU2 + " / 6                               |");
        System.out.println("| Unidad 3: " + califU3 + " / 6                               |");
        System.out.println("| Unidad 4: " + califU4 + " / 6                               |");
        System.out.println("| Unidad 5: " + califU5 + " / 6                               |");
        System.out.println("-------------------------------------------------");
        System.out.printf("  Promedio general: %.2f%%\n", porcentaje);
        System.out.println("=================================================");
    }

    public static void test(){
        System.out.println("\u001B[35m" +
                "████████╗ ███████╗ ███████╗ ████████╗  ██████╗ ███████╗  \n" +
                "╚══██╔══╝ ██╔════╝ ██╔════╝ ╚══██╔══╝  ██╔══██╗██╔════╝  \n" +
                "   ██║    █████╗   ███████╗    ██║     ██║  ██║█████╗    \n" +
                "   ██║    ██╔══╝   ╚════██║    ██║     ██║  ██║██╔══╝    \n" +
                "   ██║    ███████╗ ███████║    ██║     ██████╔╝███████╗  \n" +
                "   ╚═╝    ╚══════╝ ╚══════╝    ╚═╝     ╚═════╝ ╚══════╝  \n" +
                "\u001B[0m");
        System.out.println("\u001B[35m" +
                "  ██████╗   ██████╗  ███╗   ██╗  ██████╗   ██████╗  ██╗ ███╗   ███╗ ██╗ ███████╗ ███╗   ██╗ ████████╗  ██████╗    █████╗\n"  +
                " ██╔════╝  ██╔═══██╗ ████╗  ██║ ██╔═══██╗ ██╔════╝  ██║ ████╗ ████║ ██║ ██╔════╝ ████╗  ██║ ╚══██╔══╝ ██╔═══██╗  ██╔═══╝\n" +
                " ██║       ██║   ██║ ██╔██╗ ██║ ██║   ██║ ██║       ██║ ██╔████╔██║ ██║ █████╗   ██╔██╗ ██║    ██║    ██║   ██║  █████╗ \n" +
                " ██║       ██║   ██║ ██║╚██╗██║ ██║   ██║ ██║       ██║ ██║╚██╔╝██║ ██║ ██╔══╝   ██║╚██╗██║    ██║    ██║   ██║  ╚═══██╗\n" +
                " ██║       ██║   ██║ ██║╚██╗██║ ██║   ██║ ██║       ██║ ██║╚██╔╝██║ ██║ ██╔══╝   ██║╚██╗██║    ██║    ██║   ██║  ╚═══██╗\n" +
                " ╚██████╗  ╚██████╔╝ ██║ ╚████║ ╚██████╔╝ ╚██████╗  ██║ ██║ ╚═╝ ██║ ██║ ███████╗ ██║ ╚████║    ██║    ╚██████╔╝ ██████╔╝\n" +
                "  ╚═════╝   ╚═════╝  ╚═╝  ╚═══╝  ╚═════╝   ╚═════╝  ╚═╝ ╚═╝     ╚═╝ ╚═╝ ╚══════╝ ╚═╝  ╚═══╝    ╚═╝     ╚═════╝  ╚═════╝ \n " +
                "\u001B[0m");


    }

    public static void AdministrarContenido() {

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
                    limpiarPantalla();
                    agregarTarjeta();
                    break;

                case 2:
                    limpiarPantalla();
                    verTarjetas();
                    break;

                case 3:
                    limpiarPantalla();
                    eliminarTarjeta();
                    break;

                case 4:
                    limpiarPantalla();
                    editarTarjeta();
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

    public static void agregarTarjeta() {

        if (TOTAL_TARJETAS >= 50) {
            System.out.println("=================================");
            System.out.println("| Límite de tarjetas alcanzado  |");
            System.out.println("=================================");
            esperarEnter();
            return;
        }

        System.out.println("\n");
        System.out.println("=======================");
        System.out.print("Título de la tarjeta: ");
        TITULOS_TARJETAS[TOTAL_TARJETAS] = scanner.nextLine();

        System.out.print("Contenido de la tarjeta: ");
        CONTENIDOS_TARJETAS[TOTAL_TARJETAS] = scanner.nextLine();

        TOTAL_TARJETAS++;

        System.out.println("\nTarjeta agregada correctamente.");
        System.out.println("===================================");
        esperarEnter();
    }


    public static void verTarjetas() {
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
            System.out.printf(" - Tarjeta #%d%n", (i + 1));
            System.out.println("------------------------------------------------");
            System.out.printf("  Título: %s%n", TITULOS_TARJETAS[i]);
            System.out.println(" Contenido:");
            System.out.println("   " + CONTENIDOS_TARJETAS[i]);
            System.out.println("------------------------------------------------\n");
        }

        esperarEnter();
    }

    public static void eliminarTarjeta() {

        // VALIDACIÓN: no hay tarjetas
        if (TOTAL_TARJETAS == 0) {
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
            System.out.println("  Total de tarjetas: " + TOTAL_TARJETAS);
            System.out.println("-------------------------------------------------");
            System.out.println("  Escribe 0 para regresar al menú anterior.");
            System.out.println("-------------------------------------------------");

            // MOSTRAR LISTA DE TARJETAS
            for (int i = 0; i < TOTAL_TARJETAS; i++) {
                System.out.println("  " + (i + 1) + ". " + TITULOS_TARJETAS[i]);
            }

            System.out.println("-------------------------------------------------");
            System.out.print("  Ingrese el número de la tarjeta a eliminar: ");

            // VALIDACIÓN: entrada no numérica
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n===============================================");
                System.out.println("| Entrada inválida. Debes ingresar un número. |");
                System.out.println("===============================================");
                esperarEnter();
                continue;
            }

            int numero = scanner.nextInt();
            scanner.nextLine();

            // REGRESAR AL MENÚ
            if (numero == 0) {
                return;
            }

            int indice = numero - 1;

            // VALIDACIÓN: fuera de rango
            if (indice < 0 || indice >= TOTAL_TARJETAS) {
                System.out.println("\n===============================================");
                System.out.println("| El número no corresponde a ninguna tarjeta. |");
                System.out.println("===============================================");
                esperarEnter();
                continue;
            }

            // CONFIRMACIÓN
            System.out.println("\n-----------------------------------------------");
            System.out.println("¿Estás seguro de eliminar la tarjeta?");
            System.out.println("Título: " + TITULOS_TARJETAS[indice]);
            System.out.print("Confirmar (S/N): ");
            String confirmacion = scanner.nextLine();

            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("\nOperación cancelada.");
                esperarEnter();
                return;
            }

            // ELIMINAR TARJETA (compactar arreglos)
            for (int i = indice; i < TOTAL_TARJETAS - 1; i++) {
                TITULOS_TARJETAS[i] = TITULOS_TARJETAS[i + 1];
                CONTENIDOS_TARJETAS[i] = CONTENIDOS_TARJETAS[i + 1];
            }

            // LIMPIAR ÚLTIMA POSICIÓN
            TITULOS_TARJETAS[TOTAL_TARJETAS - 1] = null;
            CONTENIDOS_TARJETAS[TOTAL_TARJETAS - 1] = null;

            TOTAL_TARJETAS--;

            System.out.println("\n=======================================");
            System.out.println("|   Tarjeta eliminada correctamente   |");
            System.out.println("=======================================");
            esperarEnter();
            return;
        }
    }

    public static void editarTarjeta() {

        if (TOTAL_TARJETAS == 0) {
            limpiarPantalla();
            System.out.println("=================================================");
            System.out.println("|        No hay tarjetas para editar.           |");
            System.out.println("=================================================");
            esperarEnter();
            return;
        }

        while (true) {
            limpiarPantalla();

            System.out.println("=================================================");
            System.out.println("|                EDITAR TARJETA                 |");
            System.out.println("=================================================");
            System.out.println("  Total de tarjetas: " + TOTAL_TARJETAS);
            System.out.println("-------------------------------------------------");
            System.out.println("  Escribe 0 para regresar.");
            System.out.println("-------------------------------------------------");

            // Mostrar tarjetas
            for (int i = 0; i < TOTAL_TARJETAS; i++) {
                System.out.println("  " + (i + 1) + ". " + TITULOS_TARJETAS[i]);
            }

            System.out.println("-------------------------------------------------");
            System.out.print("  Número de tarjeta a editar: ");

            // Validar número
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("\n===============================================");
                System.out.println("| Entrada inválida. Ingresa un número.        |");
                System.out.println("===============================================");
                esperarEnter();
                continue;
            }

            int numero = scanner.nextInt();
            scanner.nextLine();

            if (numero == 0) return;

            int indice = numero - 1;

            if (indice < 0 || indice >= TOTAL_TARJETAS) {
                System.out.println("\n===============================================");
                System.out.println("| Número fuera de rango.                      |");
                System.out.println("===============================================");
                esperarEnter();
                continue;
            }

            // Mostrar tarjeta actual
            limpiarPantalla();
            System.out.println("=================================================");
            System.out.println("|          TARJETA SELECCIONADA                |");
            System.out.println("=================================================");
            System.out.println("Título actual:");
            System.out.println(TITULOS_TARJETAS[indice]);
            System.out.println("\nContenido actual:");
            System.out.println(CONTENIDOS_TARJETAS[indice]);
            System.out.println("-------------------------------------------------");
            System.out.println("Deja el campo vacío para NO cambiarlo.");
            System.out.println("Escribe 0 para cancelar.");
            System.out.println("-------------------------------------------------");

            // Nuevo título
            System.out.print("Nuevo título:\n> ");
            String nuevoTitulo = scanner.nextLine();

            if (nuevoTitulo.equals("0")) return;

            // Nuevo contenido
            System.out.print("\nNuevo contenido:\n> ");
            String nuevoContenido = scanner.nextLine();

            if (nuevoContenido.equals("0")) return;

            // Confirmación
            System.out.println("\n-----------------------------------------------");
            System.out.print("¿Guardar cambios? (S/N): ");
            String confirmacion = scanner.nextLine();

            if (!confirmacion.equalsIgnoreCase("S")) {
                System.out.println("\nEdición cancelada.");
                esperarEnter();
                return;
            }

            // Aplicar cambios solo si hay texto
            if (!nuevoTitulo.trim().isEmpty()) {
                TITULOS_TARJETAS[indice] = nuevoTitulo.trim();
            }

            if (!nuevoContenido.trim().isEmpty()) {
                CONTENIDOS_TARJETAS[indice] = nuevoContenido.trim();
            }

            System.out.println("\n=================================================");
            System.out.println("|   Tarjeta editada correctamente ✔            |");
            System.out.println("=================================================");
            esperarEnter();
            return;
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

    public static void usuario(){
        System.out.println("\u001B[38;2;50;255;0m\n" +
                " ██╗   ██╗  █████═╗ ██╗   ██╗  █████╗  ██████╗  ██╗  ██████╗\n" +
                " ██║   ██║ ██╔════╝ ██║   ██║ ██╔══██╗ ██╔══██╗ ██║ ██╔═══██╗\n" +
                " ██║   ██║  █████╗  ██║   ██║ ███████║ ██████╔╝ ██║ ██║   ██║\n" +
                " ██║   ██║  ╚═══██╗ ██║   ██║ ██╔══██║ ██╔══██╗ ██║ ██║   ██║\n" +
                " ╚██████╔╝ ██████╔╝ ╚██████╔╝ ██║  ██║ ██║  ██║ ██║ ╚██████╔╝\n" +
                "  ╚═════╝  ╚═════╝   ╚═════╝  ╚═╝  ╚═╝ ╚═╝  ╚═╝ ╚═╝  ╚═════╝\n" +
                "\u001B[0m");
    }

    public static void serq(){
        System.out.println("\u001B[38;2;152;255;152m");
        System.out.println("【︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻】");
        System.out.println("【         ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧     ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧   ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧             ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧            】");
        System.out.println("【       ◧◧◧◧◧◧◧◧       ◧◧◧◧◧◧◧◧    ◧◧◧◧◧                 ◧◧◧   ◧◧◧◧               ◧◧◧◧         ◧◧◧◧◧               ◧◧◧◧◧         】");
        System.out.println("【      ◧◧◧◧◧◧            ◧◧◧◧◧◧◧   ◧◧◧◧                    ◧   ◧◧◧                 ◧◧◧◧       ◧◧◧                     ◧◧◧        】");
        System.out.println("【     ◧◧◧◧◧◧◧◧◧◧                   ◧◧◧◧                ◧       ◧◧◧◧               ◧◧◧◧       ◧◧◧                       ◧◧◧       】");
        System.out.println("【       ◧◧◧◧◧◧◧◧◧◧◧◧               ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧       ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧       ◧◧◧                         ◧◧◧      】");
        System.out.println("【          ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧        ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧       ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧         ◧◧◧                         ◧◧◧      】");
        System.out.println("【                ◧◧◧◧◧◧◧◧◧◧◧◧      ◧◧◧◧                ◧       ◧◧◧◧       ◧◧◧◧◧◧◧           ◧◧◧                         ◧◧◧      】");
        System.out.println("【                  ◧◧◧◧◧◧◧◧◧◧      ◧◧◧◧                        ◧◧◧           ◧◧◧◧◧◧          ◧◧◧                ◨◨◨◨◨◨◨ ◧◧◧      】");
        System.out.println("【    ◧◧◧◧◧◧             ◧◧◧◧◧◧     ◧◧◧◧                    ◧   ◧◧◧             ◧◧◧◧◧          ◧◧◧                ◨◨◨◨◨◨◨◧◧◧      】");
        System.out.println("【     ◧◧◧◧◧◧◧◧        ◧◧◧◧◧◧◧◧     ◧◧◧◧◧                 ◧◧◧   ◧◧◧              ◧◧◧◧◧◧         ◧◧◧◧◧              ◧◧◧◧◧◨◨◨◨◨     】");
        System.out.println("【       ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧       ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧   ◧◧◧               ◧◧◧◧◧◧           ◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧◧  ◨◨◨◨◨◨◨◨  】");
        System.out.println("【︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼】");
        System.out.println("\u001B[0m");
    }
}