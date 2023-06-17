import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

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
    public static void guardarDoctores() {
        try {
            PrintWriter writer = new PrintWriter(new File("db/doctores.txt"));
            for (Doctor doctor : doctores) {
                writer.println(doctor.getId() + "," + doctor.getNombreCompleto() + "," + doctor.getEspecialidad());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al guardar los doctores: " + e.getMessage());
        }
    }

    public static void cargarDoctores() {
        try {
            Scanner scanner = new Scanner(new File("db/doctores.txt"));
            while (scanner.hasNextLine()) {
                String[] partes = scanner.nextLine().split(",");
                doctores.add(new Doctor(partes[0], partes[1], partes[2]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar los doctores: " + e.getMessage());
        }
    }
    public static void guardarPacientes() {
        try {
            PrintWriter writer = new PrintWriter(new File("db/pacientes.txt"));
            for (Paciente paciente : pacientes) {
                writer.println(paciente.getId() + "," + paciente.getNombreCompleto());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al guardar los pacientes: " + e.getMessage());
        }
    }

    public static void cargarPacientes() {
        try {
            Scanner scanner = new Scanner(new File("db/pacientes.txt"));
            while (scanner.hasNextLine()) {
                String[] partes = scanner.nextLine().split(",");
                pacientes.add(new Paciente(partes[0], partes[1]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar los pacientes: " + e.getMessage());
        }
    }

    public static void guardarCitas() {
        try {
            PrintWriter writer = new PrintWriter(new File("db/citas.txt"));
            for (Cita cita : citas) {
                writer.println(cita.getId() + "," + cita.getFechaHora() + "," + cita.getMotivo() + "," + cita.getDoctor().getId() + "," + cita.getPaciente().getId());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al guardar las citas: " + e.getMessage());
        }
    }

    public static void cargarCitas() {
        try {
            Scanner scanner = new Scanner(new File("db/citas.txt"));
            while (scanner.hasNextLine()) {
                String[] partes = scanner.nextLine().split(",");
                String idCita = partes[0];
                LocalDateTime fechaHora = LocalDateTime.parse(partes[1], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                String motivo = partes[2];
                String idDoctor = partes[3];
                String idPaciente = partes[4];

                Doctor doctor = doctores.stream().filter(d -> d.getId().equals(idDoctor)).findFirst().orElse(null);
                Paciente paciente = pacientes.stream().filter(p -> p.getId().equals(idPaciente)).findFirst().orElse(null);

                if (doctor != null && paciente != null) {
                    citas.add(new Cita(idCita, fechaHora, motivo, doctor, paciente));
                } else {
                    System.out.println("Error: doctor o paciente no encontrado");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar las citas: " + e.getMessage());
        }
    }

}

