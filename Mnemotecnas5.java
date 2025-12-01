import java.util.Scanner;

public class Mnemotecnas5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
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
        sc.nextLine();
    }
}