package co.edu.sena.David.sem2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HUELLITAS FELICES - SISTEMA SEMANA 02 ===");

        // 1. Crear Objetos Base (De la semana 1)
        // Constructor: code, name, species, age, weight
        AdoptablePet luna = new AdoptablePet("PET-01", "Luna", "Perro", 24, 15.0);
        AdoptablePet michi = new AdoptablePet("PET-02", "Michi", "Gato", 12, 4.5);

        // 2. Crear Adoptantes (CORREGIDO: Se agregó el estado "PENDIENTE")
        // Constructor: id, name, city, children, STATUS
        Adopter juan = new Adopter("AD-01", "Juan Perez", "Bogota", 0, "PENDIENTE"); // Aprobable
        Adopter ana = new Adopter("AD-02", "Ana Gomez", "Medellin", 2, "PENDIENTE"); // No probable

        // 3. Probar Clase Nueva (Chequeo)
        VeterinaryCheckup checkup = new VeterinaryCheckup("2023-10-27", "Dr. House", "Vacunación Rabia", 50.0);
        System.out.println("\n--- Chequeo Registrado ---");
        checkup.showSummary();

        // 4. Crear Relaciones (Procesos de Adopción)
        AdoptionProcess proceso1 = new AdoptionProcess("PROC-001", "27/10/2023", luna, juan);
        AdoptionProcess proceso2 = new AdoptionProcess("PROC-002", "28/10/2023", michi, ana);

        // Verificar compatibilidad (Lógica de negocio)
        proceso1.verifyStatus();
        proceso2.verifyStatus();

        // 5. Usar la Clase Gestora (ArrayList)
        AdoptionCenter centro = new AdoptionCenter("Huellitas Felices Norte", "Calle 123 # 45-67");

        // Agregar a la lista
        centro.addProcess(proceso1);
        centro.addProcess(proceso2);

        // 6. Mostrar Resultados Finales
        centro.showAllProcesses();
        System.out.println("Total procesos gestionados: " + centro.getTotalProcesses());
    }
}