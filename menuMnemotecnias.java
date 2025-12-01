import java.util.Scanner;
public class menuMnemotecnias {

    static Scanner sc = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


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

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void esperarTecla() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }

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
                case 5 -> temaOxidosMetalicos();
                case 6 -> temaOxidosNoMetalicos();
                case 7 -> temaOxoacidos();
                case 8 -> temaOxosales();
                case 9 -> temaSalesAcidas();
                case 10 -> temaSalesBinarias();
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

    public static void temaOxidosMetalicos() {
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

    public static void temaOxidosNoMetalicos() {
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

    public static void temaOxoacidos() {
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

    public static void temaOxosales() {
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


    public static void temaSalesAcidas() {
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

    public static void temaSalesBinarias() {
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

    public static void esperarMENU() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
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

}




