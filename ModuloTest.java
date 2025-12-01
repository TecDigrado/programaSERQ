import java.util.Scanner;

public class ModuloTest {

    // CALIFICACIONES POR UNIDAD (0 a 6 aciertos)
    static int califU1 = 0;
    static int califU2 = 0;
    static int califU3 = 0;
    static int califU4 = 0;
    static int califU5 = 0;


    public static void main(String[] args) {
        moduloTest();
    }

    public static void moduloTest() {

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
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("=================================================");
                    System.out.println("| Opción fuera de rango. Use valores 0 a 6.     |");
                    System.out.println("=================================================");
                    esperarEnter(sc);
                    break;
            }

            if (opcionUnidad != 0) esperarEnter(sc);

        } while (opcionUnidad != 0);

        sc.close();
    }

    // -------------------------------------------------
    // M�TODOS AUXILIARES
    // -------------------------------------------------

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static void esperarEnter(Scanner sc) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presione ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
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
}
