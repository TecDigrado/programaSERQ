
import java.util.Scanner;

class ejemplos5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            limpiarPantalla();

            System.out.println("==============================================");
            System.out.println("|           UNIDAD 5 – EJEMPLOS              |");
            System.out.println("==============================================");
            System.out.println("|  1. Hidróxidos                             |");
            System.out.println("|  2. Hidruros metálicos                     |");
            System.out.println("|  3. Hidruros no metálicos                  |");
            System.out.println("|  4. Nomenclatura inorgánica                |");
            System.out.println("|  5. Números de oxidación                   |");
            System.out.println("|  6. Óxidos metálicos                       |");
            System.out.println("|  7. Óxidos no metálicos                    |");
            System.out.println("|  8. Oxoácidos                              |");
            System.out.println("|  9. Oxisales                               |");
            System.out.println("| 10. Sales ácidas                           |");
            System.out.println("| 11. Sales binarias                         |");
            System.out.println("|  0. Salir                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n");
                System.out.println("=========================");
                System.out.println("|   Ingresa un número   |");
                System.out.println("=========================");
                scanner.nextLine(); // limpia basura
                esperarMENU(scanner);
                continue;
            }

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar ENTER



            switch (opcion) {

                case 1 -> {
                    limpiarPantalla();
                    System.out.println("=======================================================");
                    System.out.println("|                     HIDRÓXIDOS                      |");
                    System.out.println("=======================================================");
                    System.out.println("| Los hidróxidos son compuestos formados por:         |");
                    System.out.println("|   - Un metal + el ion hidróxido (OH-)               |");
                    System.out.println("|                                                     |");
                    System.out.println("| Características:                                    |");
                    System.out.println("|   • Son compuestos básicos (aumentan el pH).        |");
                    System.out.println("|   • Pueden ser cáusticos o corrosivos.              |");
                    System.out.println("|   • Reaccionan con ácidos para formar sales + H₂O.  |");
                    System.out.println("|                                                     |");
                    System.out.println("| Nomenclatura:                                       |");
                    System.out.println("|   • Se nombran como hidróxido de + nombre del metal |");
                    System.out.println("|   • Ejemplo: NaOH → hidróxido de sodio              |");
                    System.out.println("|                                                     |");
                    System.out.println("| Reacciones típicas:                                 |");
                    System.out.println("|    NaOH  +  HCl →    NaCl  +  H₂O                   |");
                    System.out.println("|   (base)  (ácido)   (sal)   (agua)                  |");
                    System.out.println("|                                                     |");
                    System.out.println("| Ejemplos comunes:                                   |");
                    System.out.println("|   • NaOH  (hidróxido de sodio)                      |");
                    System.out.println("|   • KOH   (hidróxido de potasio)                    |");
                    System.out.println("|   • Ca(OH)₂  (hidróxido de calcio)                  |");
                    System.out.println("|   • Al(OH)₃  (hidróxido de aluminio)                |");
                    System.out.println("|                                                     |");
                    System.out.println("=======================================================");
                    esperarMENU(scanner);
                    break;
                }


                case 2 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                HIDRUROS METÁLICOS                  |");
                    System.out.println("======================================================");
                    System.out.println("| Los hidruros metálicos son compuestos formados por:|");
                    System.out.println("|   - Un metal + hidrógeno con carga negativa (H-)   |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Son sólidos iónicos en su mayoría.             |");
                    System.out.println("|   • Muy reactivos con el agua, liberan H2.         |");
                    System.out.println("|   • Actúan como agentes reductores fuertes.        |");
                    System.out.println("|   • Se usan como almacenadores de hidrógeno.       |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica con agua:                          |");
                    System.out.println("|   CaH₂ +      2 H₂O →    Ca(OH)₂ +   2  H₂↑        |");
                    System.out.println("|   (hidruro)   (agua)   (hidróxido)  (hidrógeno)    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • \"Hidruro de\" + nombre del metal                |");
                    System.out.println("|   • Ejemplo: NaH → hidruro de sodio                |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • NaH  (hidruro de sodio)                        |");
                    System.out.println("|   • CaH₂ (hidruro de calcio)                       |");
                    System.out.println("|   • LiH  (hidruro de litio)                        |");
                    System.out.println("|   • MgH₂ (hidruro de magnesio)                     |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 3 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                 HIDRUROS NO METÁLICOS              |");
                    System.out.println("======================================================");
                    System.out.println("| Los hidruros no metálicos son compuestos donde:    |");
                    System.out.println("|   - El hidrógeno se une covalentemente a un        |");
                    System.out.println("|     elemento no metálico.                          |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Forman moléculas covalentes.                   |");
                    System.out.println("|   • Al disolverse en agua pueden formar ácidos.    |");
                    System.out.println("|   • Su acidez depende del tipo de enlace y         |");
                    System.out.println("|     la electronegatividad del no metal.            |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos y sus ácidos correspondientes:            |");
                    System.out.println("|   • HCl → ácido clorhídrico                        |");
                    System.out.println("|   • HF  → ácido fluorhídrico                       |");
                    System.out.println("|   • H2S → ácido sulfhídrico                        |");
                    System.out.println("|   • HBr → ácido bromhídrico                        |");
                    System.out.println("|   • HI  → ácido yodhídrico                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica en agua:                           |");
                    System.out.println("|      HCl    +  H₂O   →   H₃O⁺ + Cl⁻                |");
                    System.out.println("|   (hidruro)   (agua)   (ión hidronio)              |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • En estado gaseoso: 'Hidruro de + no metal'     |");
                    System.out.println("|        Ejemplo: H₂S (g) → hidruro de azufre        |");
                    System.out.println("|   • En disolución acuosa: 'Ácido + raíz + hídrico' |");
                    System.out.println("|        Ejemplo: H₂S (ac) → ácido sulfhídrico       |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 4 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|               NOMENCLATURA INORGÁNICA              |");
                    System.out.println("======================================================");
                    System.out.println("| La nomenclatura inorgánica establece reglas para   |");
                    System.out.println("| nombrar compuestos químicos de manera clara y      |");
                    System.out.println("| universal.                                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Principales sistemas de nomenclatura:              |");
                    System.out.println("|   • Sistemática (usa prefijos: mono-, di-, tri-)   |");
                    System.out.println("|   • Stock (usa números romanos para el E.O.)       |");
                    System.out.println("|   • Tradicional (nombres antiguos: óxido ferroso)  |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos:                                          |");
                    System.out.println("|   • CO₂ → dióxido de carbono                       |");
                    System.out.println("|   • Fe₂O₃ → óxido de hierro (III)                  |");
                    System.out.println("|   • NaCl → cloruro de sodio                        |");
                    System.out.println("|   • SO₃ → trióxido de azufre                       |");
                    System.out.println("|                                                    |");
                    System.out.println("| Regla general:                                     |");
                    System.out.println("|   • Nombre = anión + de + catión                   |");
                    System.out.println("|   • Para metales con varios E.O.: (metal)(E.O.)    |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 5 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                 NÚMEROS DE OXIDACIÓN               |");
                    System.out.println("======================================================");
                    System.out.println("| El número de oxidación (N.O.) indica cuántos       |");
                    System.out.println("| electrones gana o pierde un átomo al formar un     |");
                    System.out.println("| compuesto.                                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Importancia:                                       |");
                    System.out.println("|   • Permite identificar agentes oxidantes/reduct.  |");
                    System.out.println("|   • Fundamental para balancear ecuaciones REDOX.   |");
                    System.out.println("|   • Ayuda a determinar fórmulas y nomenclatura.    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reglas básicas:                                    |");
                    System.out.println("|   • Elemento libre: 0                              |");
                    System.out.println("|   • Oxígeno: -2 (excepto peróxidos)                |");
                    System.out.println("|   • Hidrógeno: +1 (en metálicos: -1)               |");
                    System.out.println("|   • Metales alcalinos: +1                          |");
                    System.out.println("|   • Metales alcalinotérreos: +2                    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos:                                          |");
                    System.out.println("|   O = -2                                           |");
                    System.out.println("|   H = +1 (en NH₃, por ejemplo)                     |");
                    System.out.println("|   Na = +1                                          |");
                    System.out.println("|   Cl en HCl = -1                                   |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 6 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                   ÓXIDOS METÁLICOS                 |");
                    System.out.println("======================================================");
                    System.out.println("| Los óxidos metálicos son compuestos formados por:  |");
                    System.out.println("|   - Metal + oxígeno (O²⁻).                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Poseen carácter básico.                        |");
                    System.out.println("|   • Reaccionan con agua para formar hidróxidos.    |");
                    System.out.println("|   • Reaccionan con ácidos para formar sales.       |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacciones típicas:                                |");
                    System.out.println("|   1) Con agua:                                     |");
                    System.out.println("|      CaO + H₂O → Ca(OH)₂                           |");
                    System.out.println("|   2) Con ácidos:                                   |");
                    System.out.println("|      MgO + 2HCl → MgCl₂ + H₂O                      |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • Óxido de + metal                               |");
                    System.out.println("|   • Si el metal tiene varios E.O.:                 |");
                    System.out.println("|        óxido de (metal) (E.O.)                     |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • CaO   (óxido de calcio)                        |");
                    System.out.println("|   • MgO   (óxido de magnesio)                      |");
                    System.out.println("|   • Na₂O (óxido de sodio)                          |");
                    System.out.println("|   • FeO   (óxido de hierro II)                     |");
                    System.out.println("|   • Fe₂O₃ (óxido de hierro III)                    |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 7 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                 ÓXIDOS NO METÁLICOS                |");
                    System.out.println("======================================================");
                    System.out.println("| También llamados anhídridos, se forman por:        |");
                    System.out.println("|   - No metal + oxígeno                             |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Presentan carácter ácido.                      |");
                    System.out.println("|   • Reaccionan con agua para formar oxoácidos.     |");
                    System.out.println("|   • Son covalentes (moléculas).                    |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacciones típicas con agua:                       |");
                    System.out.println("|   CO₂ + H₂O → H₂CO₃   (ácido carbónico)            |");
                    System.out.println("|   SO₃ + H₂O → H₂SO₄   (ácido sulfúrico)            |");
                    System.out.println("|   N₂O₅ + H₂O → 2HNO₃  (ácido nítrico)              |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • Óxido de + no metal con prefijos               |");
                    System.out.println("|        (mono-, di-, tri-, tetra-, penta-)          |");
                    System.out.println("|        Ejemplo: CO₂ → dióxido de carbono           |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • CO₂   (dióxido de carbono)                     |");
                    System.out.println("|   • SO₃   (trióxido de azufre)                     |");
                    System.out.println("|   • N₂O₅  (pentóxido de dinitrógeno)               |");
                    System.out.println("|   • P₂O₅  (pentóxido de diprósforo)                |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 8 -> {
                    limpiarPantalla();
                    System.out.println("=========================================================");
                    System.out.println("|                       OXOÁCIDOS                       |");
                    System.out.println("=========================================================");
                    System.out.println("| Los oxoácidos (u oxácidos) están formados por:        |");
                    System.out.println("|   - Hidrógeno + No metal + Oxígeno                    |");
                    System.out.println("|                                                       |");
                    System.out.println("| Características:                                      |");
                    System.out.println("|   • Contienen el grupo funcional: H–O–(no metal)      |");
                    System.out.println("|   • Su fuerza depende del número de oxígenos:         |");
                    System.out.println("|        Más O → ácido más fuerte.                      |");
                    System.out.println("|   • Forman oxisales al reaccionar con bases.          |");
                    System.out.println("|   • Son esenciales en química ambiental e industrial. |");
                    System.out.println("|                                                       |");
                    System.out.println("| Ejemplos importantes:                                 |");
                    System.out.println("|   • H₂SO₄ → ácido sulfúrico                           |");
                    System.out.println("|   • HNO₃  → ácido nítrico                             |");
                    System.out.println("|   • H3PO₄ → ácido fosfórico                           |");
                    System.out.println("|   • HClO₄ → ácido perclórico                          |");
                    System.out.println("|                                                       |");
                    System.out.println("| Reacciones típicas con bases (neutralización):        |");
                    System.out.println("|   H₂SO₄ + 2NaOH → Na₂SO₄ + 2H₂O                       |");
                    System.out.println("|                                                       |");
                    System.out.println("| Nomenclatura (Stock y tradicional):                   |");
                    System.out.println("|   • Ácido + raíz + sufijo (ico/oso)                   |");
                    System.out.println("|      - HNO₂ → ácido nitroso                           |");
                    System.out.println("|      - HNO₃ → ácido nítrico                           |");
                    System.out.println("|   • Con prefijos: per- / hipo-                        |");
                    System.out.println("|      - HClO → ácido hipocloroso                       |");
                    System.out.println("|      - HClO₄ → ácido perclórico                       |");
                    System.out.println("|                                                       |");
                    System.out.println("=========================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 9 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                      OXISALES                      |");
                    System.out.println("======================================================");
                    System.out.println("| Las oxisales provienen de la reacción entre:       |");
                    System.out.println("|   - Oxoácido + Base                                |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Contienen un metal y un anión oxigenado.       |");
                    System.out.println("|   • Muchos son solubles en agua.                   |");
                    System.out.println("|   • Se usan en agricultura, medicina y limpieza.   |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • Na₂SO₄ → sulfato de sodio                      |");
                    System.out.println("|   • KNO₃   → nitrato de potasio                    |");
                    System.out.println("|   • CaCO₃ → carbonato de calcio                    |");
                    System.out.println("|   • Na₃PO₄ → fosfato de sodio                      |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica de formación (neutralización):     |");
                    System.out.println("|   HNO₃ + KOH → KNO₃ + H₂O                          |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura básica:                               |");
                    System.out.println("|   • Metal + (raíz del oxoácido) + sufijo:          |");
                    System.out.println("|       -ato (de ácidos -ico)                        |");
                    System.out.println("|       -ito (de ácidos -oso)                        |");
                    System.out.println("|   Ejemplos:                                        |");
                    System.out.println("|      - H₂SO₄ → sulfato → Na₂SO₄                    |");
                    System.out.println("|      - H₂SO₃ → sulfito → CaSO₃                     |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }


                case 10 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                    SALES ÁCIDAS                   |");
                    System.out.println("======================================================");
                    System.out.println("| Las sales ácidas son oxisales que conservan uno o |");
                    System.out.println("| más hidrógenos ionizables del oxoácido original.  |");
                    System.out.println("| Se forman por una neutralización parcial entre:   |");
                    System.out.println("|   - Oxoácido + Base (en cantidad insuficiente)    |");
                    System.out.println("|                                                   |");
                    System.out.println("| Características:                                  |");
                    System.out.println("|   • Pueden actuar como ácidos débiles.            |");
                    System.out.println("|   • Contienen el grupo H(XO)n⁻.                   |");
                    System.out.println("|   • Frecuentes en sistemas biológicos y buffer.   |");
                    System.out.println("|                                                   |");
                    System.out.println("| Reacciones típicas de formación:                  |");
                    System.out.println("|   H₂SO₄ + NaOH → NaHSO₄ + H₂O                     |");
                    System.out.println("|   H₂CO₃ + KOH → KHCO₃ + H₂O                       |");
                    System.out.println("|                                                   |");
                    System.out.println("| Ejemplos comunes:                                 |");
                    System.out.println("|   • NaHSO₄ → bisulfato de sodio                   |");
                    System.out.println("|   • KHCO₃  → bicarbonato de potasio               |");
                    System.out.println("|   • NaH₂PO₄ → dihidrogenofosfato de sodio         |");
                    System.out.println("|   • Ca(HCO₃)₂ → bicarbonato de calcio             |");
                    System.out.println("|                                                   |");
                    System.out.println("| Nomenclatura:                                     |");
                    System.out.println("|   • Prefijo 'bi-' o 'hidrógeno-':                 |");
                    System.out.println("|        KHCO₃ → bicarbonato o hidrogenocarbonato   |");
                    System.out.println("|   • Se nombran como:                              |");
                    System.out.println("|        'Hidrógeno' + nombre de la sal.            |");
                    System.out.println("|                                                   |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }

                case 11 -> {
                    limpiarPantalla();
                    System.out.println("======================================================");
                    System.out.println("|                   SALES BINARIAS                   |");
                    System.out.println("======================================================");
                    System.out.println("| Las sales binarias están formadas por:             |");
                    System.out.println("|   - Metal + No metal (sin oxígeno)                 |");
                    System.out.println("|                                                    |");
                    System.out.println("| Características:                                   |");
                    System.out.println("|   • Son compuestos iónicos (metal → catión).       |");
                    System.out.println("|   • El no metal forma aniones como: Cl⁻, Br⁻, F⁻.   |");
                    System.out.println("|   • Se encuentran en alimentos, minerales y sales  |");
                    System.out.println("|     comunes de la vida diaria.                     |");
                    System.out.println("|                                                    |");
                    System.out.println("| Ejemplos comunes:                                  |");
                    System.out.println("|   • NaCl → cloruro de sodio                        |");
                    System.out.println("|   • CaF₂ → fluoruro de calcio                      |");
                    System.out.println("|   • KBr  → bromuro de potasio                      |");
                    System.out.println("|   • AgI  → yoduro de plata                         |");
                    System.out.println("|                                                    |");
                    System.out.println("| Reacción típica de formación:                      |");
                    System.out.println("|   2Na + Cl₂ → 2NaCl                                |");
                    System.out.println("|                                                    |");
                    System.out.println("| Nomenclatura:                                      |");
                    System.out.println("|   • (No metal con terminación -uro) de (metal).    |");
                    System.out.println("|        Ejemplo: MgCl₂ → cloruro de magnesio.       |");
                    System.out.println("|   • Si el metal tiene varios E.O.:                 |");
                    System.out.println("|        FeCl₂ → cloruro de hierro (II)              |");
                    System.out.println("|        FeCl₃ → cloruro de hierro (III)             |");
                    System.out.println("|                                                    |");
                    System.out.println("======================================================");
                    esperarMENU(scanner);
                    break;
                }


                case 0 -> {
                    System.out.println("\n");
                    System.out.println("==============================================");
                    System.out.println("|                 Saliendo...                |");
                    System.out.println("==============================================");
                    esperarMENU(scanner);
                    break;

                }

                default ->{
                    System.out.println("\n");
                    System.out.println("==============================================");
                    System.out.println("|              OPCIÓN INVÁLIDA               |");
                    System.out.println("==============================================");
                    System.out.println("| La opción ingresada no es válida.          |");
                    System.out.println("| Por favor ingresa un número entre 0 y 11.  |");
                    System.out.println("==============================================");
                    esperarMENU(scanner);
                }
            }
        } while (opcion != 0);

    }



    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void esperarMENU(Scanner sc) {
        System.out.println("\n");
        System.out.println("====================================");
        System.out.println("| Presiona ENTER para continuar... |");
        System.out.println("====================================");
        sc.nextLine();
    }

}