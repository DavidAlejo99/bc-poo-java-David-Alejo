package co.edu.sena.David.sem1;

public class AdoptablePet {
    // Atributos privados (Encapsulamiento)
    private String code;
    private String name;
    private String species;
    public String getName() {
        return this.name;
    }
    private int ageInMonths;
    private double weightKg;
    private boolean isVaccinated;

    // Constructor para inicializar el objeto
    public AdoptablePet(String code, String name, String species, int ageInMonths, double weightKg) {
        this.code = code;
        this.name = name;
        this.species = species;
        this.ageInMonths = ageInMonths;
        this.weightKg = weightKg;
        this.isVaccinated = false; // Por defecto, asumimos que no está vacunado
    }

    // Metodo 1: Muestra toda la información de la mascota
    public void showInfo() {
        System.out.println("=== FICHA DE MASCOTA ===");
        System.out.println("Código: " + this.code);
        System.out.println("Nombre: " + this.name);
        System.out.println("Especie: " + this.species);
        System.out.println("Edad: " + this.ageInMonths + " meses (" + this.getAgeInYears() + " años)");
        System.out.println("Peso: " + this.weightKg + " Kg");
        // Operador Ternario para mostrar SÍ o NO
        System.out.println("Vacunado: " + (this.isVaccinated ? "SÍ" : "NO"));
        System.out.println("========================");
    }

    // Metodo 2: Convierte la edad de meses a años
    public int getAgeInYears() {
        return this.ageInMonths / 12;
    }

    // Metodo 3: Actualiza el estado de vacunación
    public void setVaccinated(boolean vaccinated) {
        this.isVaccinated = vaccinated;
    }

    // Metodo 4: Getter para obtener el código (ejemplo de acceso)
    public String getCode() {
        return code;
    }
}