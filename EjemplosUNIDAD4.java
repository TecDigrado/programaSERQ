import java.util.Scanner;

public class EjemplosUNIDAD4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        EjemplosUnidad4();
    }


    public static void EjemplosUnidad4() {

        int opcionSubtema=-1;
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
                esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    esperarTecla();
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
                    System.out.println("| Opción no válida. Intente de nuevo. |");
                    System.out.println("=======================================");
                    esperarTecla();
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
                esperarTecla();
            }
        }
    }



    public static void esperarTecla() {
        System.out.println("\n====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }


    public static void limpiarPantalla() {

        for (int i = 0; i < 50; i++) System.out.println();
    }
}
