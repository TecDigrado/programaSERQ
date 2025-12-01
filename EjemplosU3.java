import java.util.Scanner;
public class EjemplosU3 {
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        int opcionejemplos = -1;
        while (opcionejemplos != 0){
            MenuEjemplos();
            while (true){
                if (scanner.hasNextInt()) {
                    opcionejemplos = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcionejemplos){
                        case 0:
                            System.out.println("\n");
                            System.out.println("=====================================");
                            System.out.println("| Regresando al menú de ejemplos... |");
                            System.out.println("=====================================");
                            esperarMENU();
                            break;
                        case 1:
                            limpiarPantalla();
                            TemaAfinidadElectronica();
                            esperarMENU();
                            break;
                        case 2:
                            limpiarPantalla();
                            TemaConstruccionTablaPeriodica();
                            esperarMENU();
                            break;
                        case 3:
                            limpiarPantalla();
                            TemaElectronesPerifericos();
                            esperarMENU();
                            break;
                        case 4:
                            limpiarPantalla();
                            TemaElectronesValencia();
                            esperarMENU();
                            break;
                        case 5:
                            limpiarPantalla();
                            TemaElementosTransicion();
                            esperarMENU();
                            break;
                        case 6:
                            limpiarPantalla();
                            TemaEnergiaIonizacion();
                            esperarMENU();
                            break;
                        case 7:
                            limpiarPantalla();
                            TemaMetalNoMetal();
                            esperarMENU();
                            break;
                        case 8:
                            limpiarPantalla();
                            TemaValencia();
                            esperarMENU();
                            break;
                        case 9:
                            limpiarPantalla();
                            TemaRadioAtomico();
                            esperarMENU();
                            break;
                        case 10:
                            limpiarPantalla();
                            TemaPropiedadesPeriodicas();
                            esperarMENU();
                            break;
                        case 11:
                            limpiarPantalla();
                            NumeroOxidacion();
                            esperarMENU();
                            break;
                        default:
                            System.out.println("\n");
                            System.out.println("----------------------------------");
                            System.out.println("Opción no válida. Intenta de nuevo");
                            System.out.println("----------------------------------");
                            esperarMENU();
                            break;
                    }
                    break;
                }
                else{
                    System.out.println("\n");
                    System.out.println("--------------------------------------------");
                    System.out.println("OPCIÓN INVÁLIDA. SELECCIONE UN NÚMERO ENTERO");
                    System.out.println("--------------------------------------------");
                    esperarMENU();
                    scanner.nextLine();
                    break;
                }
            }
        }
    }
    private static void NumeroOxidacion() {
        System.out.println("===============================================================================");
        System.out.println("|                             NÚMEROS DE OXIDACIÓN                            |");
        System.out.println("===============================================================================");
        System.out.println("| Representan la carga aparente que un átomo tiene dentro de un compuesto.    |");
        System.out.println("| Se usan para identificar agentes oxidantes y reductores.                    |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| REGLAS PRINCIPALES:                                                         |");
        System.out.println("| • Elementos libres = 0 (Ej: Fe, O₂, S₈).                                    |");
        System.out.println("| • Iones simples = su carga (Ej: Cl– = –1; Mg²+ = +2).                       |");
        System.out.println("| • Oxígeno = –2 (salvo peróxidos = –1 y superóxidos = –1/2).                 |");
        System.out.println("| • Hidrógeno = +1 (con metales = –1).                                        |");
        System.out.println("| • Halógenos = –1 (salvo con O o halógenos más electronegativos).            |");
        System.out.println("| • La suma total debe igualar la carga del compuesto.                        |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                   |");
        System.out.println("| -Ej 1: O en H₂O = –2.                                                       |");
        System.out.println("|       2H(+1) + O(–2) = 0 → correcto.                                        |");
        System.out.println("|                                                                             |");
        System.out.println("| -Ej 2: Fe en Fe₂O₃ = +3.                                                    |");
        System.out.println("|       3 oxígenos = –6 total, 2 Fe aportan +6 → +3 cada uno.                 |");
        System.out.println("|                                                                             |");
        System.out.println("| -Ej 3: El peróxido H₂O₂: O = –1.                                            |");
        System.out.println("|       2H(+1) + 2O(–1) = 0 → peróxido.                                       |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| IMPORTANCIA:                                                                |");
        System.out.println("| Permiten balancear reacciones REDOX y entender transferencia de electrones. |");
        System.out.println("-------------------------------------------------------------------------------");
    }

    private static void TemaPropiedadesPeriodicas() {
        System.out.println("==================================================================");
        System.out.println("|                    PROPIEDADES PERIÓDICAS                      |");
        System.out.println("==================================================================");
        System.out.println("| Son tendencias generales de los elementos en la tabla.         |");
        System.out.println("| Se explican por el tamaño atómico y la carga nuclear efectiva. |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| RADIO ATÓMICO                                                  |");
        System.out.println("| -Disminuye en un periodo (→) porque aumenta la atracción.      |");
        System.out.println("| -Aumenta en un grupo (↓) porque hay más niveles energéticos.   |");
        System.out.println("| Ej: Li > Be > B > C (se hace más pequeño).                     |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| ENERGÍA DE IONIZACIÓN                                          |");
        System.out.println("| Energía necesaria para quitar un electrón.                     |");
        System.out.println("| Aumenta a la derecha y arriba.                                 |");
        System.out.println("| Ej: Li < Be < B < C.                                           |");
        System.out.println("| Excepciones: B < Be y O < N por estabilidad electrónica.       |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| ELECTRONEGATIVIDAD                                             |");
        System.out.println("| Tendencia a atraer electrones en un enlace.                    |");
        System.out.println("| Aumenta a la derecha y arriba.                                 |");
        System.out.println("| Ej: C < N < O < F.                                             |");
        System.out.println("| El flúor es el más electronegativo.                            |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| AFINIDAD ELECTRÓNICA                                           |");
        System.out.println("| Energía liberada al ganar un electrón.                         |");
        System.out.println("| Aumenta hacia la derecha y arriba.                             |");
        System.out.println("| Los halógenos tienen altos valores.                            |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| CARÁCTER METÁLICO                                              |");
        System.out.println("| Aumenta hacia la izquierda y abajo de la tabla.                |");
        System.out.println("| Los metales pierden electrones con facilidad.                  |");
        System.out.println("------------------------------------------------------------------");
    }


    private static void TemaRadioAtomico() {
        System.out.println("======================================================================================");
        System.out.println("|                                   RADIO ATÓMICO                                    |");
        System.out.println("======================================================================================");
        System.out.println("| El radio atómico es la distancia entre el núcleo y el último electrón.             |");
        System.out.println("| Depende del número de niveles de energía y la carga nuclear efectiva.              |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| TENDENCIAS EN LA TABLA PERIÓDICA:                                                  |");
        System.out.println("| • AUMENTA de ARRIBA hacia ABAJO (↓): se agregan más niveles electrónicos.          |");
        System.out.println("| • AUMENTA de DERECHA hacia IZQUIERDA (←): menor atracción del núcleo.              |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                          |");
        System.out.println("| -Ej 1: Li (Litio) vs F (Flúor)                                                     |");
        System.out.println("|   Li tiene MAYOR radio atómico porque está más a la IZQUIERDA en el mismo periodo. |");
        System.out.println("|                                                                                    |");
        System.out.println("| -Ej 2: Na > F pero Na < K                                                          |");
        System.out.println("|   • Na es mayor que F porque está más ABAJO y a la IZQUIERDA.                      |");
        System.out.println("|   • Na es menor que K porque K tiene un nivel energético adicional.                |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| NOTA IMPORTANTE:                                                                   |");
        System.out.println("| Los metales suelen tener radios mayores que los no metales en un mismo periodo.    |");
        System.out.println("| Los cationes reducen su radio; los aniones aumentan su radio.                      |");
        System.out.println("--------------------------------------------------------------------------------------");
    }


    private static void TemaMetalNoMetal() {
        System.out.println("=================================================================================================");
        System.out.println("|                                     METAL vs NO METAL                                         |");
        System.out.println("=================================================================================================");
        System.out.println("| Los elementos se clasifican según sus propiedades físicas y su tendencia a perder o ganar e⁻. |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| CARACTERÍSTICAS DE LOS METALES:                                                               |");
        System.out.println("| • Pierden electrones y forman cationes (+).                                                   |");
        System.out.println("| • Son buenos conductores de calor y electricidad.                                             |");
        System.out.println("| • Son maleables, dúctiles y tienen brillo metálico.                                           |");
        System.out.println("| • Se encuentran en la parte izquierda y centro de la tabla.                                   |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| CARACTERÍSTICAS DE LOS NO METALES:                                                            |");
        System.out.println("| • Ganan electrones y forman aniones (–).                                                      |");
        System.out.println("| • Son aislantes o malos conductores.                                                          |");
        System.out.println("| • Muchos son gases o sólidos frágiles.                                                        |");
        System.out.println("| • Se encuentran en la parte superior derecha de la tabla.                                     |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                                     |");
        System.out.println("| -Ej 1: Sodio (Na) -> METAL -> pierde electrones                                               |");
        System.out.println("|   Es blando, conductor y reacciona fuertemente con agua formando:                             |");
        System.out.println("|   Na + H₂O -> NaOH + 1/2 H₂  (reacción exotérmica).                                           |");
        System.out.println("|                                                                                               |");
        System.out.println("| -Ej 2: Cloro (Cl) -> NO METAL -> gana electrones                                              |");
        System.out.println("|   • Como gas Cl₂ es tóxico e irritante.                                                       |");
        System.out.println("|   • Como ion Cl⁻ es estable e inocuo.                                                         |");
        System.out.println("|   • Presente en sales: NaCl, KCl, CaCl₂, etc.                                                 |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                                   |");
        System.out.println("| Los metaloides presentan propiedades intermedias (Si, B, Ge, As...).                          |");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    private static void TemaValencia() {
        System.out.println("======================================================================================");
        System.out.println("|                        VALENCIA (CAPACIDAD DE COMBINACIÓN)                         |");
        System.out.println("======================================================================================");
        System.out.println("| La valencia indica cuántos electrones puede ganar, perder o compartir un átomo.    |");
        System.out.println("| Se relaciona con el número de electrones en la capa de valencia.                   |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                          |");
        System.out.println("| -Ej 1: Nitrógeno (N) -> valencia 3 en NH₃.                                         |");
        System.out.println("|   Forma 3 enlaces covalentes usando 3 electrones, dejando 1 par libre.             |");
        System.out.println("|   Esto le permite aceptar un H⁺ -> formando NH₄⁺ (base de Brønsted).               |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Nitrógeno (N) -> valencia 5 en HNO₃.                                        |");
        System.out.println("|   En combinación con oxígeno puede expandir su capacidad de enlace aparente.       |");
        System.out.println("|   Por eso el ácido nítrico es un oxiácido fuerte con estructura resonante estable. |");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| INFORMACIÓN EXTRA:                                                                 |");
        System.out.println("| • Algunos elementos tienen VALENCIA VARIABLE (Fe: 2 y 3, S: 2, 4, 6, P: 3 y 5).    |");
        System.out.println("| • La valencia NO siempre es igual al número de oxidación, aunque a veces coincide. |");
        System.out.println("| • Los gases nobles tienen valencia 0 en condiciones normales (no forman enlaces).  |");
        System.out.println("--------------------------------------------------------------------------------------");
    }

    private static void TemaElementosTransicion() {
        System.out.println("===========================================================================================");
        System.out.println("|                                ELEMENTOS DE TRANSICIÓN                                  |");
        System.out.println("===========================================================================================");
        System.out.println("| Son elementos del bloque d y f, caracterizados por tener electrones en el subnivel      |");
        System.out.println("| d parcialmente lleno. Esto les permite propiedades especiales y estados variables.      |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| CARACTERÍSTICAS PRINCIPALES:                                                            |");
        System.out.println("| • Poseen múltiples números de oxidación.                                                |");
        System.out.println("| • Forman compuestos intensamente coloreados.                                            |");
        System.out.println("| • Son buenos catalizadores (Fe, Ni, Pt, V₂O₅).                                          |");
        System.out.println("| • Presentan propiedades magnéticas (Fe, Co, Ni).                                        |");
        System.out.println("| • Suelen ser metales duros y con altos puntos de fusión.                                |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                               |");
        System.out.println("| -Ej 1: Hierro (Fe) -> configuración [Ar] 3d⁶ 4s².                                       |");
        System.out.println("|   Sus electrones 3d permiten formar Fe²⁺ y Fe³⁺.                                        |");
        System.out.println("|   Es ferromagnético y esencial en hemoglobina, aceros y catalizadores.                  |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Cromo (Cr) -> configuración [Ar] 3d⁵ 4s¹.                                        |");
        System.out.println("|   Tiene estados de oxidación +2, +3 y +6.                                               |");
        System.out.println("|   • Cr³⁺: estable, presente en pigmentos verdes y compuestos coloridos.                 |");
        System.out.println("|   • Cr⁶⁺: fuerte agente oxidante en dicromatos (naranja intenso).                       |");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                             |");
        System.out.println("| Los elementos del bloque f (lantánidos y actínidos) también suelen llamarse de          |");
        System.out.println("| transición interna. Son responsables de imanes potentes, láseres y reactores nucleares. |");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    private static void TemaEnergiaIonizacion() {
        System.out.println("==================================================================================");
        System.out.println("|                              ENERGÍA DE IONIZACIÓN                             |");
        System.out.println("==================================================================================");
        System.out.println("| Es la energía necesaria para remover un electrón de un átomo en estado gaseoso |");
        System.out.println("| y formar un ion positivo (catión).                                             |");
        System.out.println("| Mientras más fuerte el núcleo atrae a los electrones, mayor es esta energía.   |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| TENDENCIAS PERIÓDICAS:                                                         |");
        System.out.println("| • Aumenta de izquierda → derecha en un periodo (el núcleo atrae más).          |");
        System.out.println("| • Disminuye de arriba ↓ abajo en un grupo (más capas electrónicas).            |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                      |");
        System.out.println("| -Ej 1: Sodio (Na) -> 496 kJ/mol.                                               |");
        System.out.println("|   Tiene 1 e⁻ externo poco atraído -> lo pierde fácilmente -> Na⁺.              |");
        System.out.println("|   Su baja ionización explica su alta reactividad y uso biológico (iones Na⁺).  |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Potasio (K) -> 419 kJ/mol, aún menor que Na.                            |");
        System.out.println("|   Es más grande, el e⁻ externo está más lejos del núcleo.                      |");
        System.out.println("|   Por eso forma K⁺ muy fácilmente, clave en los impulsos nerviosos.            |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| -Ej 3: Flúor (F) -> 1681 kJ/mol.                                              |");
        System.out.println("|   Altísima energía de ionización porque el núcleo atrae muy fuerte a sus e⁻.   |");
        System.out.println("|   Por eso NO forma F⁺, sino que gana electrones -> F⁻.                         |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                    |");
        System.out.println("| Los gases nobles tienen las energías de ionización MÁS ALTAS debido a su       |");
        System.out.println("| configuración estable (octeto completo).                                       |");
        System.out.println("==================================================================================");
    }

    private static void TemaElectronesValencia() {
        System.out.println("==========================================================================================");
        System.out.println("|                                  ELECTRONES DE VALENCIA                                |");
        System.out.println("==========================================================================================");
        System.out.println("| Son los electrones de la capa externa de un átomo.                                     |");
        System.out.println("| Determinan:                                                                            |");
        System.out.println("| • Cómo reacciona un elemento.                                                          |");
        System.out.println("| • Qué tipo de enlaces forma (iónicos o covalentes).                                    |");
        System.out.println("| • La geometría y polaridad de las moléculas.                                           |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| EJEMPLOS:                                                                              |");
        System.out.println("| -Ej 1: Carbono (C) -> 4 electrones de valencia.                                        |");
        System.out.println("|   Puede formar 4 enlaces: simples (C–C), dobles (C=C), triples (C≡C).                  |");
        System.out.println("|   Esto lo convierte en la base de la química orgánica y la vida.                       |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 2: Silicio (Si) -> 4 electrones de valencia.                                       |");
        System.out.println("|   Forma estructura tetraédrica como en SiO₂ (sílice), presente en arena y vidrio.      |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 3: Oxígeno (O) -> 6 electrones de valencia.                                        |");
        System.out.println("|   Tiende a formar 2 enlaces (O²⁻ en compuestos iónicos o enlaces dobles en covalentes) |");
        System.out.println("|   -> por eso en el agua H₂O, forma 2 enlaces sencillos y 2 pares libres.               |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| -Ej 4: Cloro (Cl) -> 7 electrones de valencia.                                         |");
        System.out.println("|   Gana 1 electrón -> forma Cl⁻.                                                        |");
        System.out.println("|   También puede formar enlaces covalentes (HCl, Cl₂).                                  |");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("| DATO EXTRA:                                                                            |");
        System.out.println("| • Los electrones de valencia se observan en la configuración electrónica.              |");
        System.out.println("| • Para elementos del bloque d, a veces también cuentan electrones del subnivel (n−1)d. |");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    private static void TemaElectronesPerifericos() {
        System.out.println("=================================================================================================");
        System.out.println("|                                    ELECTRONES PERIFÉRICOS                                     |");
        System.out.println("=================================================================================================");
        System.out.println("| Son los electrones ubicados en la capa más externa del átomo. Son los que primero interactúan |");
        System.out.println("| con otros átomos y determinan su reactividad química.                                         |");
        System.out.println("|                                                                                               |");
        System.out.println("| -Ej 1: Oxígeno (O) -> Electrones periféricos = 6 (capa 2).                                    |");
        System.out.println("|  Configuración externa: 2s² 2p⁴ -> 6 e⁻ periféricos.                                          |");
        System.out.println("|  Es muy reactivo porque solo necesita 2 electrones para completar el octeto.                  |");
        System.out.println("|                                                                                               |");
        System.out.println("| -Ej 2: Azufre (S) -> También tiene 6 electrones periféricos (capa 3).                         |");
        System.out.println("|  Configuración externa: 3s² 3p⁴ -> 6 e⁻ periféricos.                                          |");
        System.out.println("|  Por eso forma 2 enlaces como el oxígeno y compuestos como H₂S.                               |");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    private static void TemaAfinidadElectronica() {
        System.out.println("==================================================================================================");
        System.out.println("|                           AFINIDAD ELECTRÓNICA Y ELECTRONEGATIVIDAD                            |");
        System.out.println("==================================================================================================");
        System.out.println("| Los elementos del grupo 17 (halógenos) son muy reactivos debido a su alta afinidad electrónica |");
        System.out.println("| (liberan energía al ganar un electrón) y su alta electronegatividad (atraen electrones en un   |");
        System.out.println("| enlace químico).                                                                               |");
        System.out.println("|                                                                                                |");
        System.out.println("| -Ej 1: Cloro (Cl) -> Alta afinidad electrónica y alta electronegatividad.                      |");
        System.out.println("|  Cuando Cl gana 1 electrón forma Cl-, el ion presente en la sal común (NaCl).                  |");
        System.out.println("|  También forma el ácido fuerte HCl cuando se disuelve en agua.                                 |");
        System.out.println("|                                                                                                |");
        System.out.println("| -Ej 2: Bromo (Br) -> También gana electrones fácilmente para completar el octeto.              |");
        System.out.println("|  Forma el ion Br⁻ en sales como KBr.                                                           |");
        System.out.println("|  Su molécula Br₂ es líquida a temperatura ambiente, lo cual es inusual en no metales.          |");
        System.out.println("--------------------------------------------------------------------------------------------------");
    }

    private static void TemaConstruccionTablaPeriodica() {
        System.out.println("==============================================================================================");
        System.out.println("|                             CONSTRUCCIÓN DE LA TABLA PERIÓDICA                             |");
        System.out.println("==============================================================================================");
        System.out.println("| La tabla periódica se construye ordenando los elementos por su número atómico (Z), que es  |");
        System.out.println("| la cantidad de protones en el núcleo. A medida que Z aumenta, también cambian sus niveles  |");
        System.out.println("| de energía y su configuración electrónica.                                                 |");
        System.out.println("|                                                                                            |");
        System.out.println("| Las filas se llaman PERIODOS y representan cuántos niveles de energía tiene un átomo.      |");
        System.out.println("| Las columnas se llaman GRUPOS y reúnen elementos con propiedades químicas similares, ya    |");
        System.out.println("| que tienen la misma cantidad de electrones de valencia.                                    |");
        System.out.println("|                                                                                            |");
        System.out.println("| La tabla también se divide en BLOQUES (s, p, d, f) según el tipo de orbital donde termina  |");
        System.out.println("| la configuración electrónica del elemento. Esto permite predecir reactividad, valencias y  |");
        System.out.println("| comportamiento químico.                                                                    |");
        System.out.println("|                                                                                            |");
        System.out.println("| -Ej 1: Helio (He) -> Fila 1, grupo 18 -> Gas noble.                                        |");
        System.out.println("|  Configuración: 1s². Aunque está en el periodo 1 (solo un nivel), su capa está completa,   |");
        System.out.println("|  por eso es extremadamente estable e inerte. Se utiliza en globos, resonadores y sistemas  |");
        System.out.println("|  criogénicos por ser muy ligero y no inflamable.                                           |");
        System.out.println("|                                                                                            |");
        System.out.println("| -Ej 2: Neón (Ne) -> Fila 2, grupo 18 -> Gas noble.                                         |");
        System.out.println("|  Configuración externa: 2s² 2p⁶. Su octeto completo lo vuelve totalmente inerte.           |");
        System.out.println("|  El neón es famoso en los letreros luminosos porque, al pasar corriente eléctrica, emite   |");
        System.out.println("|  un característico brillo rojo-anaranjado.                                                 |");
        System.out.println("|                                                                                            |");
        System.out.println("| La tabla periódica moderna fue desarrollada inicialmente por Mendeleiev y luego ajustada   |");
        System.out.println("| para acomodar las configuraciones electrónicas, lo que permitió predecir elementos aún no  |");
        System.out.println("| descubiertos. Hoy en día, sigue creciendo conforme se sintetizan nuevos elementos.         |");
        System.out.println("---------------------------------------------------------------------------------------------");
    }


    public static void MenuEjemplos(){
        limpiarPantalla();
        System.out.println("================================================");
        System.out.println("|             EJEMPLOS - UNIDAD 3              |");
        System.out.println("================================================");
        System.out.println("| 1. Afinidad electrónica y electronegatividad |");
        System.out.println("| 2. Construcción de la tabla periódica        |");
        System.out.println("| 3. Electrones periféricos                    |");
        System.out.println("| 4. Electrones de valencia                    |");
        System.out.println("| 5. Electrones de transición                  |");
        System.out.println("| 6. Energía de ionización                     |");
        System.out.println("| 7. Metal y no metal                          |");
        System.out.println("| 8. Valencia                                  |");
        System.out.println("| 9. Radio atómico                             |");
        System.out.println("| 10. Propiedades periódicas                   |");
        System.out.println("| 11. Números de oxidación                     |");
        System.out.println("| 0. Regresar al menú principal                |");
        System.out.println("------------------------------------------------");
        System.out.println("Elige una opción: ");
    }
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++){
            System.out.println();
        }
    }
    public static void esperarMENU(){
        System.out.println("\n");
        System.out.println("================================");
        System.out.println("| Presiona Enter para regresar |");
        System.out.println("================================");
        scanner.nextLine();
    }
}
