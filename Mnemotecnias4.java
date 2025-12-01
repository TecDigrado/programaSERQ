import java.util.Scanner;

public class Mnemotecnias4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MnemotecniasUnidad4();
    }

    public static void MnemotecniasUnidad4() {

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



    public static void esperarTecla() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
}