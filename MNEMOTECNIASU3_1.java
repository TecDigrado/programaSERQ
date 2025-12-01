import java.util.Scanner;

public class MNEMOTECNIASU3_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
        System.out.println("|              MNEMOTECNIAS UNIDAD 3              |");
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
        System.out.println("--------------------------------------------------");
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++)
            System.out.println();
    }

    public static void esperaMenu() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");

        scanner.nextLine(); // espera hasta que se presione ENTER
    }
}
