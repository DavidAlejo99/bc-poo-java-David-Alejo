package co.edu.sena.David.sem2;

public class VeterinaryCheckup {
    // Atributos
    private String date;
    private String vetName;
    private String diagnosis;
    private double cost;

    // Constructor
    public VeterinaryCheckup(String date, String vetName, String diagnosis, double cost) {
        this.date = date;
        this.vetName = vetName;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    // Método de negocio
    public void showSummary() {
        System.out.println("   [VET] " + date + " - " + diagnosis + " ($" + cost + ")");
    }

    // Getters básicos
    public double getCost() {
        return cost;
    }
}