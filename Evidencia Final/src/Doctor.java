public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String id, String nombreCompleto, String especialidad) {
        super(id, nombreCompleto);
        this.especialidad = especialidad;
    }

    public String getId() {
        return this.id;
    }

    // otros getters y setters
}



