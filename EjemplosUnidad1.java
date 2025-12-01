import java.util.Scanner;

public class EjemplosUnidad1 {

    static Scanner sc = new Scanner(System.in);

    // =============================================================
    // ===============          MENÚ PRINCIPAL          ============
    // =============================================================
    public static void menuEjemplosUnidad1() {
        int opcion_marcado=-1;

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
                esperarTecla();
                continue;
            }

            opcion_marcado = sc.nextInt();
            sc.nextLine(); // limpiar ENTER


            switch (opcion_marcado) {
                case 1: ejemploIntroQuimica(); break;
                case 2: ejemploMateriaEnergia(); break;
                case 3: ejemploPropiedadesMateria(); break;
                case 4: ejemploFenomenos(); break;
                case 5: ejemploElementosCompuestosMezclas(); break;
                case 6: ejemploMetodosSeparacion(); break;

                case 0:
                    System.out.println("\n");
                    System.out.println("====================================");
                    System.out.println("| Saliendo del menú de ejemplos... |");
                    System.out.println("====================================");
                    esperarTecla();
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=======================================");
                    System.out.println("| Opción no válida. Intenta de nuevo. |");
                    System.out.println("=======================================");
                    esperarTecla();
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
            esperarTecla();
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
        esperarTecla();
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
        esperarTecla();
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
        esperarTecla();
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
        esperarTecla();
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
        esperarTecla();
    }


    // =============================================================
    // ===============           UTILIDADES            =============
    // =============================================================

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static void esperarTecla() {
        System.out.println("\n====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }

    // =============================================================
    // ===============           MAIN OPCIONAL          =============
    // =============================================================
    // Puedes usarlo para probar la clase directamente.
    public static void main(String[] args) {
        menuEjemplosUnidad1();
    }
}
