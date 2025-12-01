import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuUnidad1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuUnidad1();
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
}
