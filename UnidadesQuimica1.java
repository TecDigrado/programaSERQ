import java.util.Scanner;

public class UnidadesQuimica1 {

    static Scanner sc = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuUnidades();
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
                    System.out.println("| La química es la ciencia que estudia la materia, su composición, estructura, propiedades y cómo cambia en diversas reacciones químicas. |");
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
                    System.out.println("| Es todo aquello que ocupa un lugar en el espacio y tiene masa. Está compuesta por átomos y puede encontrarse en diferentes estados físicos (sólido, líquido, gas) |");
                    System.out.println("=====================================================================================================================================================================");
                    esperarTecla();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("===================================================================================");
                    System.out.println("|                                           ¿QUÉ ES LA ENERGÍA?                   |");
                    System.out.println("===================================================================================");
                    System.out.println("| Es la capacidad de realizar trabajo o provocar cambios en la materia.           |");
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
                    System.out.println("=====================================================================================================================================");
                    System.out.println("|                                           CLASIFICACIÓN DE LAS SUSTANCIAS PURAS                                                   |");
                    System.out.println("=====================================================================================================================================");
                    System.out.println("| Las sustancias puras se clasifican principalmente en elementos y compuestos.                                                      |");
                    System.out.println("| Los elementos son sustancias simples que no pueden descomponerse en otras más sencillas mediante reacciones químicas ordinarias,  |");
                    System.out.println("| mientras que los compuestos son sustancias formadas por la unión química de dos o más elementos en proporciones fijas.            |");
                    System.out.println("=====================================================================================================================================");
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

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("\n");
            System.out.println("=======================================");
            System.out.println("| Entrada inválida. Intente de nuevo. | ");
            System.out.println("=======================================");
            sc.next();
        }
        int num = sc.nextInt();
        sc.nextLine();
        return num;
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
                        System.out.println("|               CONFIGURACIÓN ELECTRÓNICA CON GAS NOBLE                     |");
                        System.out.println("=============================================================================");
                        System.out.println("|Configuración electrónica del elemento con Z=83 (Bismuto) usando gas noble |");
                        System.out.println("|[Xe₅₄] 4f¹⁴ 5d¹⁰ 6s² 6p³                                                   |");
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
                        System.out.println("|                                         ¿QUÉ ES EL ÁTOMO?                                                   |");
                        System.out.println("===============================================================================================================");
                        System.out.println("| Un átomo es la unidad básica de la materia, compuesto por un núcleo (protones y neutrones) y                |");
                        System.out.println("| electrones que giran alrededor. Es la mínima porción de un elemento que conserva sus propiedades químicas.  |");
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
                        System.out.println("===========================================================================================================================");
                        System.out.println("|                                        PRINCIPIO DE INCERTIDUMBRE DE HEISENBERG                                         |");
                        System.out.println("===========================================================================================================================");
                        System.out.println("| El principio de incertidumbre de Heisenberg establece que no se pueden conocer con precisión simultánea ciertos pares   |");
                        System.out.println("| de variables físicas de una partícula, como su posición y su momento lineal. Cuanto mayor es la precisión con la que se |");
                        System.out.println("| determina la posición, menor es la precisión con la que se puede conocer su momento (masa por velocidad), y viceversa.  |");
                        System.out.println("===========================================================================================================================");
                        esperarTecla();
                        break;
                    case 2:
                        limpiarPantalla();
                        System.out.println("==============================================================================================================");
                        System.out.println("|                              SOLUCIONES DE LA ECUACION DE SCHRÖDINGER                                      |");
                        System.out.println("==============================================================================================================");
                        System.out.println("| La ecuación de Schrödinger describe matemáticamente el comportamiento del electrón en el átomo.            |");
                        System.out.println("| Sus soluciones son las funciones de onda ψ y sus valores permitidos dan los orbitales y los .              |");
                        System.out.println("| niveles de energía                                                                                         |");
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
                        case 1: temaHidrurosMetalicos(); break;
                        case 2: temaHidrurosNoMetalicos(); break;
                        case 3: temaNomenclaturaInorganica(); break;
                        case 4: temaDeterminacionNO(); break;
                        case 5: temaOxidosMetalicos(); break;
                        case 6: temaOxidosNoMetalicos(); break;
                        case 7: temaOxoacidos(); break;
                        case 8: temaOxosales(); break;
                        case 9: temaSalesAcidas(); break;
                        case 10: temaSalesBinarias(); break;
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

            public static void temaHidrurosMetalicos() {
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

            public static void temaHidrurosNoMetalicos() {
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

            public static void temaNomenclaturaInorganica() {
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


            public static void temaDeterminacionNO() {
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


            public static void temaOxidosMetalicos() {
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


            public static void temaOxidosNoMetalicos() {
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


            public static void temaOxoacidos() {
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

            public static void temaOxosales() {
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

            public static void temaSalesAcidas() {
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

            public static void temaSalesBinarias() {
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
}









