package co.edu.sena.David.sem1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN - HUELLITAS FELICES ===");
        System.out.println("\n=======================================");
        System.out.println("           PRUEBA DE MASCOTAS         ");
        System.out.println("=======================================");

        // 1. Crear un objeto AdoptablePet
        AdoptablePet luna = new AdoptablePet("PET-001", "Luna", "Perro", 18, 15.5);
        AdoptablePet michi = new AdoptablePet("PET-002", "Michi", "Gato", 9, 3.8);

        // 2. Mostrar información inicial (con isVaccinated = NO por defecto)
        luna.showInfo();

        // 3. Demostrar Getters y conversión de edad
        System.out.println("Código de Luna (Getter): " + luna.getCode());
        System.out.println("Edad de Michi en años: " + michi.getAgeInYears());

        // 4. Demostrar Setter (marcar como vacunado)
        luna.setVaccinated(true);
        System.out.println("\n¡Mascota " + luna.getName() + " marcada como vacunada!"); // USAR ESTO

        // 5. Mostrar información actualizada
        luna.showInfo();

        // -------------------------------------------------------------

        System.out.println("\n=======================================");
        System.out.println("           PRUEBA DE ADOPTANTES       ");
        System.out.println("=======================================");

        // 6. Crear objetos Adopter
        Adopter laura = new Adopter("ID-456", "Laura Pérez", "Bogota", 2, "PENDIENTE");
        Adopter carlos = new Adopter("ID-789", "Carlos Velez", "Medellin", 0, "APROBADO");

        // 7. Demostrar métodos en objeto laura
        laura.showInfo();
        System.out.println("Nombre del Adoptante (Getter): " + laura.getName());
        System.out.println("¿Laura es elegible para adopción?: " + laura.isEligible());
        System.out.println("Tarifa de adopción de Laura (con descuento): $" + laura.calculateAdoptionFee());

        // 8. Demostrar métodos en objeto carlos
        carlos.showInfo();
        System.out.println("¿Carlos es elegible para adopción?: " + carlos.isEligible());
        System.out.println("Tarifa de adopción de Carlos (sin descuento): $" + carlos.calculateAdoptionFee());

        System.out.println("\n=== DEMOSTRACIÓN FINALIZADA ===");
    }
}