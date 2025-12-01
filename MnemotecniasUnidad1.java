import java.util.Scanner;

public class MnemotecniasUnidad1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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

}
