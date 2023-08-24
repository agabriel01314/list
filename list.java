package list;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        ArrayList<String> eventos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un evento");
            System.out.println("2. Marcar evento como realizado");
            System.out.println("3. Enlistar eventos");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del evento: ");
                    scanner.nextLine();
                    String nuevoEvento = scanner.nextLine();
                    eventos.add(nuevoEvento);
                    System.out.println("Evento agregado: " + nuevoEvento);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del evento a marcar como realizado: ");
                    scanner.nextLine();
                    String eventoRealizado = scanner.nextLine();
                    if (eventos.remove(eventoRealizado)) {
                        System.out.println("Evento marcado como realizado: " + eventoRealizado);
                    } else {
                        System.out.println("El evento no existe en la lista.");
                    }
                    break;
                case 3:
                    if (eventos.isEmpty()) {
                        System.out.println("La lista de eventos está vacía.");
                    } else {
                        System.out.println("Lista de eventos:");
                        for (int i = 0; i < eventos.size(); i++) {
                            System.out.println((i + 1) + ". " + eventos.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}