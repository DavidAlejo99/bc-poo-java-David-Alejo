package co.edu.sena.David.sem3;

public class AdoptionProcess {
    private String processId;
    private String date;
    private AdoptablePet pet;
    private Adopter adopter;

    public AdoptionProcess(String processId, String date, AdoptablePet pet, Adopter adopter) {
        this.processId = processId;
        this.date = date;
        this.pet = pet;
        this.adopter = adopter;
    }

    // ELIMINAMOS el método verifyStatus() que causaba el error
    // porque usaba la lógica antigua (isEligible y getAgeInYears).
    /*
    public void verifyStatus() {
        if (adopter.isEligible()) { // <- ESTO CAUSA ERROR
            System.out.println("Proceso " + processId + ": Adoptante " + adopter.getName() + " es apto.");
        } else {
            System.out.println("Proceso " + processId + ": Adoptante " + adopter.getName() + " NO es apto.");
        }
    }
    */

    public String getProcessId() { return processId; }
    public String getDate() { return date; }
    public AdoptablePet getPet() { return pet; }
    public Adopter getAdopter() { return adopter; }

    // Dejamos este método simple para la Semana 03
    public void showSummary() {
        System.out.println("PROCESO ID: " + processId + " | Mascota: " + pet.getName() + " | Adoptante: " + adopter.getName());
    }
}