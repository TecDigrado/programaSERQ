import java.util.Scanner;

public class MenuEjemplos {

    static Scanner sc = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void esperarTecla(Scanner scanner) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        scanner.nextLine();
    }

    public static void esperarMENU(){
        System.out.println("\n");
        System.out.println("================================");
        System.out.println("| Presiona Enter para regresar |");
        System.out.println("================================");
        scanner.nextLine();
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

    private static void esperarEnter(Scanner sc) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }

}




