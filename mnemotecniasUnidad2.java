import java.util.Scanner;

public class mnemotecniasUnidad2 {

    public static final String ROJO = "\u001B[31m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) {
        int opcion_marcado=-1;
        Scanner sc = new Scanner(System.in);

        do {
            limpiarPantalla();

            System.out.println("==========================================");
            System.out.println("|       MNEMOTECNIAS - UNIDAD 2          |");
            System.out.println("==========================================");
            System.out.println("| 1. Configuración electrónica           |");
            System.out.println("| 2. El átomo                            |");
            System.out.println("| 3. Electrón diferencial                |");
            System.out.println("| 4. Modelos atómicos                    |");
            System.out.println("| 5. Números cuánticos                   |");
            System.out.println("| 6. Principio de aufbau                 |");
            System.out.println("| 7. Tabulación de los números cuánticos |");
            System.out.println("| 0. Regresar al menú                    |");
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
            sc.nextLine(); // limpiar ENTER


            switch (opcion_marcado) {

                case 1:
                    limpiarPantalla();
                    System.out.println("===========================================================================");
                    System.out.println("|                        CONFIGURACIÓN ELECTRÓNICA                        |");
                    System.out.println("===========================================================================");
                    System.out.println("|- Frase: ¿Sabes Para Donde Van los Electrones?                           |");
                    System.out.println("|- Significado: S=subnivel s, P=subnivel p, D=subnivel d, F=subnivel f    |");
                    System.out.println("|- Recuerda el orden SPDF de llenado                                      |");
                    System.out.println("|- Orden diagonal: 1s² 2s² 2p 3s² 3p^6 4s² 3d^10 4p^6 5s² 4d^10 5p^6 ...  |");
                    System.out.println("|- Frase mnemotécnica: " + ROJO + "Súper Profesores De Física" + RESET + " = s, p, d, f            |");
                    System.out.println("---------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("====================================================================================");
                    System.out.println("|                                  EL ÁTOMO                                        |");
                    System.out.println("====================================================================================");
                    System.out.println("|- Acrónimo: " + ROJO + "NECRO" + RESET + "                                                                 |");
                    System.out.println("|  N = Núcleo, E = Electrones, C = Corteza, R = Regiones de energía, O = Orbitales |");
                    System.out.println("|- Así recuerdas la estructura del átomo                                           |");
                    System.out.println("------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 3:
                    limpiarPantalla();
                    System.out.println("==============================================================================================================");
                    System.out.println("|                                           ELECTRÓN DIFERENCIAL                                             |");
                    System.out.println("==============================================================================================================");
                    System.out.println("|- Frase: " + ROJO + "El último en llegar define su hogar." + RESET + "                                                               |");
                    System.out.println("|- Explicación: El electrón diferencial es el último que se acomoda en la configuración electrónica.         |");
                    System.out.println("|- Importancia: Este electrón determina el grupo, el periodo y muchas propiedades químicas del elemento.     |");
                    System.out.println("|- Tip: Revisa en qué subnivel termina la configuración (s, p, d o f) para identificarlo rápidamente.        |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;


                case 4:
                    limpiarPantalla();
                    System.out.println("============================================================================");
                    System.out.println("|                           MODELOS ATÓMICOS                               |");
                    System.out.println("============================================================================");
                    System.out.println("|- Acrónimo cronológico:" + ROJO+ " D-T-R-B-S-C" + RESET+"                                       |");
                    System.out.println("|- D=Dalton, T=Thomson, R=Rutherford, B=Bohr, S=Sommerfeld, C=Cuántico     |");
                    System.out.println("|- Frase para recordar: Deliciosas Tartas Rellenas Bien Suaves y Cremosas  |");
                    System.out.println("----------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 5:
                    limpiarPantalla();
                    System.out.println("===========================================================================");
                    System.out.println("|                             NÚMEROS CUÁNTICOS                           |");
                    System.out.println("===========================================================================");
                    System.out.println("|- Frase: " + ROJO + "No Siempre Tiene Sentido" + RESET + "                                        |");
                    System.out.println("|- N = Nivel principal, S = Secundario/Azimutal, T = Magnético, S = Spin  |");
                    System.out.println("|- Cada número cuántico describe una característica del electrón          |");
                    System.out.println("|- Sirven para ubicar exactamente un electrón dentro del átomo            |");
                    System.out.println("|- Tip: Recuerda que el spin solo puede ser +1/2 o -1/2                   |");
                    System.out.println("---------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 6:
                    limpiarPantalla();
                    System.out.println("==================================================================");
                    System.out.println("|                    PRINCIPIO DE AUFBAU =                       |");
                    System.out.println("==================================================================");
                    System.out.println("|- Frase: " + ROJO + "Los electrones son flojos: llenan lo más bajo primero" + RESET + "  |");
                    System.out.println("|- Los electrones ocupan primero los orbitales de menor energía  |");
                    System.out.println("|- “Aufbau” significa construcción u ordenamiento progresivo     |");
                    System.out.println("|- Este principio explica el orden diagonal de llenado           |");
                    System.out.println("------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;


                case 7:
                    limpiarPantalla();
                    System.out.println("=======================================================================================================");
                    System.out.println("|                         === TABULACIÓN DE LOS NÚMEROS CUÁNTICOS ===                                 |");
                    System.out.println("=======================================================================================================");
                    System.out.println("|- Mnemotecnia visual: la tabla con encabezados (n, l, m, s) = (Nivel, Subnivel, Orientación, Giro)   |");
                    System.out.println("|- Frase:" + ROJO+ " Nadie Sabe Mover Sin práctica" + RESET +  "                                                               |");
                    System.out.println("|- Esta tabla te permite identificar rápidamente los valores permitidos                               |");
                    System.out.println("|- Ejemplo: para n=3 → l puede ser 0,1,2; para l=1 → m = -1,0,1; s = ±1/2                             |");
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("\n");
                    System.out.println("========================================");
                    System.out.println("|    Regresando al menú principal...   |");
                    System.out.println("========================================");
                    esperarEnter(sc);
                    break;

                default:
                    System.out.println("\n");
                    System.out.println("========================================");
                    System.out.println("| Opción no válida. Intenta de nuevo.  |");
                    System.out.println("========================================");
                    esperarEnter(sc);
                    break;
            }

        } while (opcion_marcado != 0);
    }


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
