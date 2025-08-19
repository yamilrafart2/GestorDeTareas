import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPrioridad = 0;

        System.out.println("=== Gestor de Tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas (pendiente)");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar

        // Valida que esté entre 1 y 3
        if (opcion >= 1 && opcion <= 3) {
            if (opcion == 1){
                System.out.println("Nombre de la tarea: ");
                String nombreTarea = sc.nextLine();

                System.out.println("Prioridad (1 a 5): ");
                int prioridad = sc.nextInt();

                // Validación básica con operador lógico
                boolean esValida = prioridad >= 1 && prioridad <= 5;
                System.out.println("¿Prioridad válida? " + esValida);

                // Operación aritmética: suma de prioridades
                totalPrioridad += prioridad;

                System.out.println("Tarea agregada: " + nombreTarea + " (prioridad " + prioridad +")");
                System.out.println("Suma total de prioridades: " + totalPrioridad);
            } else if (opcion == 2) {
                System.out.println("Función 'ver tarea' aún no implementada.");
            } else {
                System.out.println("¡Hasta luego!");
            }
        } else {
            System.out.println("Opción inválida");
        }

        sc.close();

    }
}