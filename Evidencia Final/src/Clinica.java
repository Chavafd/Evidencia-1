import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clinica {
    private static List<Doctor> doctores = new ArrayList<>();
    private static List<Paciente> pacientes = new ArrayList<>();
    private static List<Cita> citas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Clinica XXXXX");
        System.out.println("Ingrese ID y contraseña");
        String ID_admin = scanner.nextLine();
        String password = scanner.nextLine();

        // Verificar en archivo con datos de administradores
        if (ID_admin != null && !ID_admin.isEmpty()) {
            while (true) {
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
                        doctores.add(new Doctor(IDD, nombreD, Especialidad));
                        break;
                    case 2:
                        System.out.println("Introduzca nombre del paciente");
                        String nombreP = scanner.nextLine();
                        System.out.println("Introduzca ID del paciente");
                        String IDP = scanner.nextLine();
                        pacientes.add(new Paciente(IDP, nombreP));
                        break;
                    case 3:
                        System.out.println("Introduzca ID de la cita");
                        String IDC = scanner.nextLine();
                        System.out.println("Introduzca fecha y hora de la cita (formato: yyyy-MM-dd HH:mm)");
                        String fechaHoraStr = scanner.nextLine();
                        LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                        System.out.println("Introduzca motivo de la cita");
                        String motivo = scanner.nextLine();
                        System.out.println("Introduzca ID del doctor");
                        String doctorID = scanner.nextLine();
                        Doctor doctor = doctores.stream().filter(d -> d.getId().equals(doctorID)).findFirst().orElse(null);
                        System.out.println("Introduzca ID del paciente");
                        String pacienteID = scanner.nextLine();
                        Paciente paciente = pacientes.stream().filter(p -> p.getId().equals(pacienteID)).findFirst().orElse(null);
                        if (doctor != null && paciente != null) {
                            citas.add(new Cita(IDC, fechaHora, motivo, doctor, paciente));
                        } else {
                            System.out.println("Error: doctor o paciente no encontrado");
                        }
                        break;
                    case 4:
                        // Aquí deberías implementar la funcionalidad para verificar una cita
                        break;
                    case 5:
                        System.out.println("Salir");
                        System.exit(0);
                    default:
                        System.out.println("Error: opción no válida");
                        break;
                }
            }
        }
    }
}

