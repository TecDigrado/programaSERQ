import java.util.Scanner;


public class Unidad2LDS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuUnidad2();
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


    public static void esperarTecla() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");

        sc.nextLine(); // espera hasta que se presione ENTER
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
}
