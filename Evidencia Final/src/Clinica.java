import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Clinica San Javier");
        System.out.println("Ingrese ID y contraseña");
        String ID_admin = scanner.nextLine();
        String password = scanner.nextLine();

        // Verificar en archivo con datos de administradores
        if (ID_admin != null && !ID_admin.isEmpty()) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Alta Doctor");
            System.out.println("2. Alta Paciente");
            System.out.println("3. Agendar Cita");
            System.out.println("4. Verificar cita");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca nombre del doctor");
                    String nombreD = scanner.nextLine();
                    System.out.println("Introduzca ID del doctor");
                    String IDD = scanner.nextLine();
                    System.out.println("Introduzca especialidad del doctor");
                    String Especialidad = scanner.nextLine();
                    // Aquí deberías crear un nuevo Doctor y añadirlo a tu sistema
                    break;
                case 2:
                    System.out.println("Introduzca nombre del paciente");
                    String nombreP = scanner.nextLine();
                    System.out.println("Introduzca ID del paciente");
                    String IDP = scanner.nextLine();
                    // Aquí deberías crear un nuevo Paciente y añadirlo a tu sistema
                    break;
                case 3:
                    System.out.println("Introduzca hora y fecha de la cita");
                    String HF = scanner.nextLine();
                    System.out.println("Introduzca ID de la cita");
                    String IDC = scanner.nextLine();
                    System.out.println("Introduzca motivo de la cita");
                    String Motivo = scanner.nextLine();
                    // Aquí deberías crear una nueva Cita y añadirla a tu sistema
                    break;
                case 4:
                    System.out.println("Introduzca la ID de la cita a revisar");
                    String IDC2 = scanner.nextLine();
                    // Aquí deberías buscar la Cita con la ID proporcionada y mostrarla si existe
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Error: opción no válida");
                    break;
            }
        }
    }
}

