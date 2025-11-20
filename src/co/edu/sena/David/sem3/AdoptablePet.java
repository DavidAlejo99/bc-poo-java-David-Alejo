package co.edu.sena.David.sem3;

public class AdoptablePet {
    // 1. Atributos Private (Encapsulamiento Riguroso)
    private String code;
    private String name;
    private String species;
    private int ageInMonths;
    private double weightKg;
    private boolean isVaccinated;

    // 2. Sobrecarga de Constructores

    // Constructor 1: Completo (Usa setters para validar desde el inicio)
    public AdoptablePet(String code, String name, String species, int ageInMonths, double weightKg) {
        setCode(code);
        setName(name);
        setSpecies(species);
        setAgeInMonths(ageInMonths);
        setWeightKg(weightKg);
        this.isVaccinated = false; // Por defecto
    }

    // Constructor 2: Básico (Sobrecarga - llama al completo con valores por defecto)
    public AdoptablePet(String code, String name) {
        // Asume valores por defecto si solo se da el código y nombre
        this(code, name, "Desconocido", 0, 1.0);
    }

    // 3. Getters y Setters con Validaciones

    public String getCode() { return code; }

    public void setCode(String code) {
        if (validateString(code)) {
            this.code = code;
        } else {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (validateString(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }
    }

    public String getSpecies() { return species; }

    public void setSpecies(String species) {
        if (validateString(species)) {
            this.species = species;
        } else {
            throw new IllegalArgumentException("La especie es obligatoria.");
        }
    }

    public int getAgeInMonths() { return ageInMonths; }

    public void setAgeInMonths(int ageInMonths) {
        if (ageInMonths >= 0) {
            this.ageInMonths = ageInMonths;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }

    public double getWeightKg() { return weightKg; }

    public void setWeightKg(double weightKg) {
        if (weightKg > 0) {
            this.weightKg = weightKg;
        } else {
            throw new IllegalArgumentException("El peso debe ser mayor a 0.");
        }
    }

    public boolean isVaccinated() { return isVaccinated; }

    public void setVaccinated(boolean vaccinated) {
        this.isVaccinated = vaccinated;
    }

    // 4. Método Auxiliar Privado (para no repetir la lógica de string)
    private boolean validateString(String value) {
        return value != null && !value.trim().isEmpty();
    }

    // Método de negocio (opcional para el ejercicio, pero útil)
    public void showInfo() {
        System.out.println("Mascota: " + name + " (" + species + ") - " + ageInMonths + " meses.");
    }
}