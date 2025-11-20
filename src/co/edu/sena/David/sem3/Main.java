package co.edu.sena.David.sem3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HUELLITAS FELICES - SEMANA 03 (VALIDACIONES) ===");

        // CASO 1: Crear objetos correctamente usando Sobrecarga
        System.out.println("\n1. Probando Constructores Sobrecargados:");

        // Constructor Completo de AdoptablePet
        AdoptablePet pet1 = new AdoptablePet("P01", "Rex", "Perro", 12, 20.0);
        System.out.print("Rex (Completo) -> ");
        pet1.showInfo();

        // Constructor Básico de AdoptablePet (Solo código y nombre)
        AdoptablePet pet2 = new AdoptablePet("P02", "Nemo");
        System.out.print("Nemo (Básico) -> ");
        pet2.showInfo(); // Debería usar los valores por defecto

        // CASO 2: Probando Validaciones (Setters y Constructores con Try-Catch)
        System.out.println("\n2. Probando Validaciones de Errores:");

        try {
            System.out.println("Intentando crear mascota con peso negativo...");
            // Esto fallará y lanzará una excepción
            AdoptablePet petBad = new AdoptablePet("P03", "Error", "Gato", 5, -5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("🔴 ERROR CAPTURADO (Mascota): " + e.getMessage());
        }

        try {
            System.out.println("Intentando asignar -2 hijos a un adoptante...");
            Adopter adopter = new Adopter("ID-1234", "Carlos"); // Usa constructor sobrecargado
            adopter.setNumberOfChildren(-2); // Esto fallará
        } catch (IllegalArgumentException e) {
            System.out.println("🔴 ERROR CAPTURADO (Adoptante): " + e.getMessage());
        }

        // CASO 3: Validación exitosa y uso de Getters
        System.out.println("\n3. Validación exitosa:");
        VeterinaryCheckup check = new VeterinaryCheckup("2023-11-20", "Dr. House", "Vacuna", 50.0);
        check.showSummary();
        System.out.println("Costo con Getter: $" + check.getCost());
    }
}