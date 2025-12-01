import java.util.Scanner;

public class Unidad3_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
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
                            TemaAfinidadElectronica();
                            break;
                        case 2:
                            limpiarPantalla();
                            TemaConstruccionTablaPeriodica();
                            break;
                        case 3:
                            limpiarPantalla();
                            TemaElectronesPerifericos();
                            break;
                        case 4:
                            limpiarPantalla();
                            TemaElectronesValencia();
                            break;
                        case 5:
                            limpiarPantalla();
                            TemaElementosTransicion();
                            break;
                        case 6:
                            limpiarPantalla();
                            TemaEnergiaIonizacion();
                            break;
                        case 7:
                            limpiarPantalla();
                            TemaMetalNoMetal();
                            break;
                        case 8:
                            limpiarPantalla();
                            TemaValencia();
                            break;
                        case 9:
                            limpiarPantalla();
                            TemaRadioAtomico();
                            break;
                        case 10:
                            limpiarPantalla();
                            TemaPropiedadesPeriodicas();
                            break;
                        case 11:
                            limpiarPantalla();
                            NumeroOxidacion();
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

    private static void NumeroOxidacion() {
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

    private static void TemaPropiedadesPeriodicas() {
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

    private static void TemaRadioAtomico() {
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
                    System.out.println("================================================================");
                    System.out.println("|                        DEFINICIÓN                            |");
                    System.out.println("================================================================");
                    System.out.println("| Medida del tamaño del átomo; suele definirse por la          |");
                    System.out.println("| mitad de la distancia entre núcleos en cristales diatómicos. |");
                    System.out.println("================================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("==========================================================================================");
                    System.out.println("|                                   CÓMO SE MIDEN                                        |");
                    System.out.println("==========================================================================================");
                    System.out.println("| Difracción de rayos X, cálculos teóricos y medidas de distancia interatómica.          |");
                    System.out.println("==========================================================================================");
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

    private static void TemaMetalNoMetal() {
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
                    System.out.println("|                                 METAL:                                    |");
                    System.out.println("=============================================================================");
                    System.out.println("| Buen conductor, maleable, tendencia a ceder electrones (formar cationes). |");
                    System.out.println("=============================================================================");
                    esperarMENU();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("=======================================================================");
                    System.out.println("|                              NO METAL:                              |");
                    System.out.println("=======================================================================");
                    System.out.println("| No metal: mal conductor, puede ganar electrones (formar aniones) o  |");
                    System.out.println("| compartirlos en enlaces covalentes.                                 |");
                    System.out.println("=======================================================================");
                    esperarMENU();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("====================================================================");
                    System.out.println("|                  PROPIEDADES FÍSICAS Y QUÍMICAS                  |");
                    System.out.println("====================================================================");
                    System.out.println("| Comparación: punto de fusión, conductividad, electronegatividad, |");
                    System.out.println("| formación de óxidos ácidos/ básicos.                             |");
                    System.out.println("====================================================================");
                    esperarMENU();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("===================================================================");
                    System.out.println("|                EJEMPLOS Y TENDENCIAS PERIÓDICAS                 |");
                    System.out.println("===================================================================");
                    System.out.println("| Na (metal), O (no metal), metaloides (propiedades intermedias). |");
                    System.out.println("===================================================================");
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

    private static void TemaValencia() {
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

    private static void TemaElementosTransicion() {
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

    private static void TemaEnergiaIonizacion() {
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
                    System.out.println("===============================================================================");
                    System.out.println("| Energía mínima para remover un electrón de un átomo/ión en estado gaseoso.  |");
                    System.out.println("===============================================================================");
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

    private static void TemaElectronesValencia() {
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
                    System.out.println("======================================================");
                    System.out.println("|                     DEFINICIÓN                     |");
                    System.out.println("======================================================");
                    System.out.println("| Electrones de valencia = electrones en la capa más |");
                    System.out.println("| externa que participan en enlaces.                 |");
                    System.out.println("======================================================");
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

    private static void TemaElectronesPerifericos() {
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
                    System.out.println("================================================================");
                    System.out.println("|                   ELECTRONES PERIFÉRICOS:                    |");
                    System.out.println("================================================================");
                    System.out.println("| Término usado para referirse a los electrones que participan |");
                    System.out.println("| activamente en enlaces químicos y reacciones                 |");
                    System.out.println("================================================================");
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

    private static void TemaAfinidadElectronica() {
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

    private static void TemaConstruccionTablaPeriodica() {
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
                    System.out.println("| Dimitri Mendeleiev propuso una tabla basada en masas atómicas y propiedades |");
                    System.out.println("| La versión moderna se basa en Z (Número atómico).                           |");
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
        System.out.println("|        UNIDAD 3 - PROPIEDADES PERIÓDICAS     |");
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

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
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
}