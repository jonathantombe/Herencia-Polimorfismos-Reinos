import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear los reinos y especies
        ReinoAnimal animalia = new ReinoAnimal("Animalia", "Animalia", "Reino que incluye organismos pluricelulares heterótrofos.");
        Especie leon = new Especie("León", "Carnívora", "Pulmonar", "Sexual", "Cuadrúpeda");
        animalia.agregarEspecie(leon);

        ReinoVegetal plantae = new ReinoVegetal("Plantae", "Plantae", "Reino que incluye organismos autótrofos con células con pared celular de celulosa.");
        Especie rosa = new Especie("Rosa", "Autótrofa", "Pulmonar", "Sexual", "Sésil");
        plantae.agregarEspecie(rosa);

        ReinoFungi fungi = new ReinoFungi("Fungi", "Fungi", "Reino que incluye organismos heterótrofos con pared celular de quitina.");
        Especie seta = new Especie("Seta", "Saprofita", "Pulmonar", "Sexual", "Sésil");
        fungi.agregarEspecie(seta);

        ReinoProtoctista protista = new ReinoProtoctista("Protista", "Protista", "Reino que incluye organismos eucariotas unicelulares.");
        Especie ameba = new Especie("Ameba", "Heterótrofa", "Pulmonar", "Asexual", "Sésil");
        protista.agregarEspecie(ameba);

        ReinoMonera monera = new ReinoMonera("Monera", "Monera", "Reino que incluye organismos procariotas unicelulares.");
        Especie bacteria = new Especie("Bacteria", "Heterótrofa", "Pulmonar", "Asexual", "Flagelo");
        monera.agregarEspecie(bacteria);

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Listar los reinos en los que se clasifican los seres vivos");
            System.out.println("2. Seleccionar un reino y listar sus características");
            System.out.println("3. Seleccionar un reino y listar las especies por las que está compuesto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nLos reinos en los que se clasifican los seres vivos son:");
                    System.out.println("- Animalia");
                    System.out.println("- Plantae");
                    System.out.println("- Fungi");
                    System.out.println("- Protista");
                    System.out.println("- Monera");
                    break;
                case 2:
                    System.out.println("\nSeleccione un reino:");
                    System.out.println("1. Animalia");
                    System.out.println("2. Vegetal");
                    System.out.println("3. Fungi");
                    System.out.println("4. Monera");
                    System.out.println("5. Prototista");

                    // Agregar las demás opciones
                    int seleccionReino = scanner.nextInt();
                    if (seleccionReino == 1) {
                        System.out.println("\nCaracterísticas del reino Animalia:");
                        animalia.mostrarCaracteristicas();
                        // Agregar los demás casos para los otros reinos
                    } else {
                        System.out.println("Reino no válido.");
                    }
                    break;
                case 3:
                    System.out.println("\nSeleccione un reino:");
                    System.out.println("1. Animalia");
                    System.out.println("2. Plantae");
                    System.out.println("3. Fungi");
                    System.out.println("4. Protista");
                    System.out.println("5. Monera");
                    int seleccionReino2 = scanner.nextInt();
                    switch (seleccionReino2) {
                        case 1:
                            System.out.println("\nEspecies en el reino Animalia:");
                            animalia.mostrarEspecies();
                            break;
                        case 2:
                            System.out.println("\nEspecies en el reino Plantae:");
                            plantae.mostrarEspecies();
                            break;
                        case 3:
                            System.out.println("\nEspecies en el reino Fungi:");
                            fungi.mostrarEspecies();
                            break;
                        case 4:
                            System.out.println("\nEspecies en el reino Protista:");
                            protista.mostrarEspecies();
                            break;
                        case 5:
                            System.out.println("\nEspecies en el reino Monera:");
                            monera.mostrarEspecies();
                            break;
                        default:
                            System.out.println("Reino no válido.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}