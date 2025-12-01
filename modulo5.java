import java.util.Scanner;

public class modulo5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
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




    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void esperarMENU() {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");

        sc.nextLine(); // espera hasta que se presione ENTER
    }
}
