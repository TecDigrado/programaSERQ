import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuUnidad4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuUnidad4();
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
}