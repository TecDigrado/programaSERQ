import java.util.Scanner;

public class EjemplosUnidad2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion_marcado=-1;

        do {
            limpiarPantalla();

            System.out.println("==========================================");
            System.out.println("|          Ejemplos - unidad 2           |");
            System.out.println("==========================================");
            System.out.println("| 1. Configuración electrónica           |");
            System.out.println("| 2. El átomo                            |");
            System.out.println("| 3. Electrón diferencial                |");
            System.out.println("| 4. Modelos atómicos                    |");
            System.out.println("| 5. Números cuánticos                   |");
            System.out.println("| 6. Principio de aufbau                 |");
            System.out.println("| 7. Tabulación de números cuánticos     |");
            System.out.println("| 0. Regresar al menú principal          |");
            System.out.println("------------------------------------------");
            System.out.print("Elige una opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("\n=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                sc.nextLine(); // limpia basura
                esperarEnter(sc);
                continue;
            }

            opcion_marcado = sc.nextInt();
            sc.nextLine();


            switch (opcion_marcado) {

                case 1:
                    ejemploConfiguracionElectronica();
                    esperarEnter(sc);
                    break;

                case 2:
                    ejemploElAtomo();
                    esperarEnter(sc);
                    break;

                case 3:
                    ejemploElectronDiferencial();
                    esperarEnter(sc);
                    break;

                case 4:
                    ejemploModelosAtomicos();
                    esperarEnter(sc);
                    break;

                case 5:
                    ejemploNumerosCuanticos();
                    esperarEnter(sc);
                    break;

                case 6:
                    ejemploPrincipioAufbau();
                    esperarEnter(sc);
                    break;

                case 7:
                    ejemploTabulacionCuanticos();
                    esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("=====================================");
                    System.out.println("| Saliendo del menú de ejemplos...  |");
                    System.out.println("=====================================");
                    esperarEnter(sc);
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("=====================================");
                    System.out.println("|Opción no válida. Intenta de nuevo.|");
                    System.out.println("=====================================");
                    esperarEnter(sc);
                    break;
            }

        } while (opcion_marcado != 0);
    }


    //──────────────────────────────────────────────
    // MÉTODOS QUE EL SWITCH LLAMA
    //──────────────────────────────────────────────

    public static void ejemploConfiguracionElectronica() {
        limpiarPantalla();
        System.out.println("==========================================================================");
        System.out.println("|                        CONFIGURACIÓN ELECTRÓNICA                       |");
        System.out.println("==========================================================================");
        System.out.println("| Ejemplo: El sodio (Na), número atómico Z = 11                          |");
        System.out.println("|                                                                        |");
        System.out.println("| Configuración electrónica completa:                                    |");
        System.out.println("|  - 1s² 2s² 2p⁶ 3s¹                                                     |");
        System.out.println("|                                                                        |");
        System.out.println("| Explicación:                                                           |");
        System.out.println("|  - El número atómico 11 indica que tiene 11 electrones.                |");
        System.out.println("|  - Estos se acomodan siguiendo el Principio de Aufbau (menor energía). |");
        System.out.println("|  - En los orbitales s caben máximo 2 electrones; en p, máximo 6.       |");
        System.out.println("|                                                                        |");
        System.out.println("| Último electrón:                                                       |");
        System.out.println("|  - Termina en 3s¹ → este es el electrón diferencial.                   |");
        System.out.println("|  - Gracias a esto, Na pertenece al grupo 1 (metales alcalinos).        |");
        System.out.println("|  - Su nivel de energía más externo es n = 3 → periodo 3.               |");
        System.out.println("|                                                                        |");
        System.out.println("| Representación por diagrama de cajas:                                  |");
        System.out.println("|  1s [↑↓]   2s [↑↓]   2p [↑↓][↑↓][↑↓]   3s [↑ ]                         |");
        System.out.println("--------------------------------------------------------------------------");
    }


    public static void ejemploElAtomo() {
        limpiarPantalla();
        System.out.println("==========================================================");
        System.out.println("|                         EL ÁTOMO                       |");
        System.out.println("==========================================================");
        System.out.println("| Ejemplo: Átomo de Carbono (C)                          |");
        System.out.println("|                                                        |");
        System.out.println("| Composición:                                           |");
        System.out.println("|  - 6 protones (carga +)                                |");
        System.out.println("|  - 6 electrones (carga -)                              |");
        System.out.println("|  - 6 neutrones (carga 0)                               |");
        System.out.println("|                                                        |");
        System.out.println("| Masa atómica: ~12 uma                                  |");
        System.out.println("|  - Se debe principalmente a protones y neutrones.      |");
        System.out.println("|  - Los electrones casi no aportan masa.                |");
        System.out.println("|                                                        |");
        System.out.println("|Estructura del átomo:                                   |");
        System.out.println("|  - Núcleo: protones + neutrones                        |");
        System.out.println("|  - Nube electrónica: electrones rodeando el núcleo     |");
        System.out.println("|                                                        |");
        System.out.println("| Configuración electrónica:                             |");
        System.out.println("|  - 1s² 2s² 2p²                                         |");
        System.out.println("|                                                        |");
        System.out.println("| Información que aporta la configuración:               |");
        System.out.println("|  - Tiene 4 electrones en la capa de valencia (2s² 2p²) |");
        System.out.println("|  - Pertenece al grupo 14 de la tabla periódica.        |");
        System.out.println("|  - Se localiza en el periodo 2 (nivel n=2).            |");
        System.out.println("----------------------------------------------------------");
    }


    public static void ejemploElectronDiferencial() {
        limpiarPantalla();
        System.out.println("===================================================================================");
        System.out.println("|                              ELECTRÓN DIFERENCIAL                               |");
        System.out.println("===================================================================================");
        System.out.println("| Ejemplo: Magnesio (Mg, Z=12)                                                    |");
        System.out.println("|  - Configuración electrónica: 1s² 2s² 2p⁶ 3s²                                   |");
        System.out.println("|  - El electrón diferencial es el último electrón que se acomoda según el        |");
        System.out.println("|    diagrama de Aufbau.                                                          |");
        System.out.println("|  - En el Mg, dicho electrón está en el orbital 3s.                              |");
        System.out.println("|  - Este electrón define:                                                        |");
        System.out.println("|    • Su número cuántico principal (n=3).                                        |");
        System.out.println("|    • El subnivel energético (s).                                                |");
        System.out.println("|    • Que pertenece al grupo 2 (metales alcalinotérreos).                        |");
        System.out.println("|  - También explica:                                                             |");
        System.out.println("|    • Que el Mg forma iones Mg²⁺ (pierde 2 electrones del subnivel 3s).          |");
        System.out.println("|    • Su reactividad moderada.                                                   |");
        System.out.println("|    • Su configuración de valencia: 3s²                                          |");
        System.out.println("-----------------------------------------------------------------------------------");
    }


    public static void ejemploModelosAtomicos() {
        limpiarPantalla();
        System.out.println("===========================================================================================");
        System.out.println("|                                    MODELOS ATÓMICOS                                     |");
        System.out.println("===========================================================================================");
        System.out.println("| Dalton:                                                                                 |");
        System.out.println("|  - Átomos indivisibles y esféricos, cada elemento tiene átomos iguales.                 |");
        System.out.println("|  - Explica leyes ponderales (proporciones múltiples y definidas).                       |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Thomson:                                                                                |");
        System.out.println("|  - Modelo del 'pudín con pasas': electrones incrustados en una masa positiva.           |");
        System.out.println("|  - Primer modelo en incluir partículas subatómicas.                                     |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Rutherford:                                                                             |");
        System.out.println("|  - Descubre el núcleo mediante la lámina de oro.                                        |");
        System.out.println("|  - El átomo es casi vacío; los electrones giran alrededor del núcleo.                   |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Bohr:                                                                                   |");
        System.out.println("|  - Electrones en órbitas fijas y niveles de energía cuantizados.                        |");
        System.out.println("|  - Explica las líneas espectrales del hidrógeno.                                        |");
        System.out.println("|-----------------------------------------------------------------------------------------|");
        System.out.println("| Modelo Cuántico:                                                                        |");
        System.out.println("|  - Sustituye las órbitas por orbitales: regiones donde es más probable encontrar        |");
        System.out.println("|    al electrón.                                                                         |");
        System.out.println("|  - Basado en Schrödinger, Heisenberg y Dirac.                                           |");
        System.out.println("|  - Describe al electrón como onda y partícula (dualidad).                               |");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void ejemploNumerosCuanticos() {
        limpiarPantalla();
        System.out.println("=====================================================");
        System.out.println("|                    NÚMEROS CUÁNTICOS              |");
        System.out.println("=====================================================");
        System.out.println("| Ejemplo: electrón en 3p²                          |");
        System.out.println("|                                                   |");
        System.out.println("| - n = 3  → Número cuántico principal              |");
        System.out.println("|   Indica el nivel de energía y el tamaño          |");
        System.out.println("|   promedio del orbital.                           |");
        System.out.println("|                                                   |");
        System.out.println("| - l = 1  → Número cuántico azimutal               |");
        System.out.println("|   Define el subnivel (0=s, 1=p, 2=d, 3=f).        |");
        System.out.println("|   Determina la forma del orbital.                 |");
        System.out.println("|                                                   |");
        System.out.println("| - m = -1 → Número cuántico magnético              |");
        System.out.println("|   Indica la orientación espacial del orbital.     |");
        System.out.println("|   En p existen tres posiciones posibles: -1,0,+1  |");
        System.out.println("|                                                   |");
        System.out.println("| - s = +1/2 → Número cuántico de spin              |");
        System.out.println("|   Representa el giro interno del electrón.        |");
        System.out.println("|   Puede ser +1/2 (↑) o -1/2 (↓).                  |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| Este conjunto describe completamente el estado    |");
        System.out.println("| del electrón dentro del átomo según el modelo     |");
        System.out.println("| cuántico moderno.                                 |");
        System.out.println("-----------------------------------------------------");
    }

    public static void ejemploPrincipioAufbau() {
        limpiarPantalla();
        System.out.println("==============================================================================");
        System.out.println("|                             PRINCIPIO DE AUFBAU                            |");
        System.out.println("==============================================================================");
        System.out.println("| Ejemplo: Oxígeno (Z = 8)                                                   |");
        System.out.println("| Configuración: 1s² 2s² 2p⁴                                                 |");
        System.out.println("|                                                                            |");
        System.out.println("| - El principio de Aufbau establece que los electrones                      |");
        System.out.println("|  siempre ocupan primero los orbitales de menor energía antes               |");
        System.out.println("|  de pasar a los de mayor energía.                                          |");
        System.out.println("|                                                                            |");
        System.out.println("| - Por eso se llenan en el orden:                                           |");
        System.out.println("|  1s → 2s → 2p → 3s → 3p → 4s → 3d → 4p ...                                 |");
        System.out.println("|                                                                            |");
        System.out.println("| - En el caso del oxígeno:                                                  |");
        System.out.println("|   * Primero se completa 1s (2 electrones).                                 |");
        System.out.println("|   * Luego 2s (2 electrones).                                               |");
        System.out.println("|   * Finalmente van 4 electrones al subnivel 2p.                            |");
        System.out.println("|                                                                            |");
        System.out.println("| - Esto determina su reactividad, ya que los 2 electrones faltantes         |");
        System.out.println("|   para completar el 2p hacen que el oxígeno sea muy reactivo.              |");
        System.out.println("------------------------------------------------------------------------------");
    }

    public static void ejemploTabulacionCuanticos() {
        limpiarPantalla();
        System.out.println("===========================================================================");
        System.out.println("|                  TABULACIÓN DE LOS NÚMEROS CUÁNTICOS                    |");
        System.out.println("===========================================================================");
        System.out.println("|Ejemplo: Oxígeno (O)                                                     |");
        System.out.println("|Configuración electrónica: 1s² 2s² 2p⁴                                   |");
        System.out.println("|                                                                         |");
        System.out.println("|Los electrones del subnivel 2p deben tabularse mediante sus números      |");
        System.out.println("|cuánticos (n, l, m, s).                                                  |");
        System.out.println("|                                                                         |");
        System.out.println("|Subnivel 2p ⇒ n = 2, l = 1                                               |");
        System.out.println("|Orbitales disponibles (m): -1, 0, +1                                     |");
        System.out.println("|Espín posible (s): +1/2 o -1/2                                           |");
        System.out.println("|                                                                         |");
        System.out.println("|Para 2p⁴, la tabulación queda así (Regla de Hund):                       |");
        System.out.println("|- Los primeros tres electrones ocupan m = -1, 0 y +1 con espín +1/2      |");
        System.out.println("|- El cuarto electrón se empareja en uno de los orbitales con s = -1/2    |");
        System.out.println("|                                                                         |");
        System.out.println("|Ejemplo de tabulación para los 4 electrones 2p:                          |");
        System.out.println("|  e1: n=2, l=1, m=-1, s=+1/2                                             |");
        System.out.println("|  e2: n=2, l=1, m= 0, s=+1/2                                             |");
        System.out.println("|  e3: n=2, l=1, m=+1, s=+1/2                                             |");
        System.out.println("|  e4: n=2, l=1, m=-1, s=-1/2   (se empareja)                             |");
        System.out.println("---------------------------------------------------------------------------");
    }



    //──────────────────────────────────────────────
    // UTILIDADES
    //──────────────────────────────────────────────

    private static void esperarEnter(Scanner sc) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 40; i++) System.out.println();
    }
}
