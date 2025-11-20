package co.edu.sena.David.sem2;

public class AdoptionProcess {
    // Atributos
    private String processId;
    private String date;
    // RELACIONES (Composición/Agregación)
    private AdoptablePet pet;  // Una mascota
    private Adopter adopter;   // Un adoptante
    private String status;     // Estado del proceso

    // Constructor: Recibe los objetos para crear la relación
    public AdoptionProcess(String processId, String date, AdoptablePet pet, Adopter adopter) {
        this.processId = processId;
        this.date = date;
        this.pet = pet;
        this.adopter = adopter;
        this.status = "EN_VERIFICACION";
    }

    // Método de negocio: Verifica si la adopción procede
    public void verifyStatus() {
        // Usamos el método isEligible() que creaste en la Semana 1
        if (adopter.isEligible() && pet.getAgeInYears() >= 0) {
            this.status = "APROBADA";
        } else {
            this.status = "RECHAZADA";
        }
    }

    // Método para mostrar detalles (Usa datos de los objetos relacionados)
    public String getDetails() {
        return "ID: " + processId + " | Mascota: " + pet.getName() +
                " | Solicitante: " + adopter.getName() + " | Estado: " + status;
    }
}