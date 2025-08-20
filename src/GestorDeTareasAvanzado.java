import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestorDeTareasAvanzado {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Tarea> listaTareas = new ArrayList<>();
    private static final HashMap<String, Tarea> mapaTareas = new HashMap<>();
    private static int acumuladorPrioridades = 0;

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> agregarTarea();
                case 2 -> listarTareas();
                case 3 -> buscarTarea();
                case 4 -> eliminarTarea();
                case 5 -> mostrarAcumulador();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

    }

    public static void mostrarMenu() {
        System.out.println("\n=== Menú de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Buscar tarea por ID");
        System.out.println("4. Eliminar tarea por ID");
        System.out.println("5. Ver total acumulado de prioridades");
        System.out.println("6. Salir");
        System.out.print("Elegí una opción: ");
    }

    private static void agregarTarea() {
        System.out.print("ID de la tarea: ");
        var id = sc.nextLine(); // var local

        if (mapaTareas.containsKey(id)){
            System.out.println("Ya existe una tarea con ese ID.");
            return;
        }

        System.out.print("Nombre de la tarea: ");
        var nombre = sc.nextLine(); // var local

        System.out.print("Prioridad (1 a 5): ");
        var prioridad = Integer.parseInt(sc.nextLine()); // var local

        if (prioridad < 1 || prioridad > 5) {
            System.out.println("Prioridad no válida.");
            return;
        }

        var nueva = new Tarea(nombre, prioridad); // var local
        listaTareas.add(nueva);
        mapaTareas.put(id, nueva);
        acumuladorPrioridades += prioridad;

        System.out.println("Tarea agregada con éxito");
        System.out.println("Total acumulado de prioridades: " + acumuladorPrioridades);
    }

    private static void listarTareas() {
        if (mapaTareas.isEmpty()) {
            System.out.println("No hay tareas para mostrar.");
            return;
        }

        System.out.println("\n=== Tareas Registradas ===");

        // lambda + forEach
        mapaTareas.forEach((id, tarea) -> {
            System.out.print("ID: " + id + " - ");
            tarea.ejecutar();
        });
    }

    private static void buscarTarea() {
        System.out.print("Ingresá el ID de la tarea a buscar: ");
        var id = sc.nextLine(); // var local

        var t = mapaTareas.get(id); // var local
        if (t != null) {
            System.out.println("Tarea encontrada: ");
            t.ejecutar();
        } else {
            System.out.println("No se encontró ninguna tarea con ese ID.");
        }
    }

    private static void eliminarTarea() {
        System.out.print("Ingresá el ID de la tarea a eliminar: ");
        var id = sc.nextLine(); // var local

        var eliminada = mapaTareas.remove(id); // var local
        if (eliminada != null) {
            listaTareas.remove(eliminada);
            acumuladorPrioridades -= eliminada.getPrioridad();
            System.out.println("Tarea eliminada correctamente.");
            System.out.println("Total acumulado actualizado: " + acumuladorPrioridades);
        } else {
            System.out.println("No se encontró ninguna tarea con ese ID.");
        }
    }

    private static void mostrarAcumulador() {
        System.out.println("Acumulador de prioridades: " + acumuladorPrioridades);
    }

}