package co.edu.sena.David.sem3;

public class VeterinaryCheckup {
    // Atributos Private
    private String date;
    private String vetName;
    private String description;
    private double cost;

    // Constructor (Usa setter para validar el costo al crear)
    public VeterinaryCheckup(String date, String vetName, String description, double cost) {
        this.date = date;
        this.vetName = vetName;
        this.description = description;
        setCost(cost);
    }

    // Getter
    public double getCost() { return cost; }

    // Setter con Validación
    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("El costo no puede ser negativo.");
        }
    }

    // Método de negocio (opcional para el ejercicio, pero útil)
    public void showSummary() {
        System.out.println("Chequeo: " + description + " | Costo: $" + cost);
    }
}