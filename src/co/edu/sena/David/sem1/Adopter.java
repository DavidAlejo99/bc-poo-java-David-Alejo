package co.edu.sena.David.sem1;

public class Adopter {
    // Atributos privados (Encapsulamiento)
    private String adopterId;
    private  String name;
    private  String city;
    private  int numberOfChildren;
    private  String status; // Ej: PENDIENTE, APROBADO, RECHAZADO

    // Atributo constante
    private static final double BASE_ADOPTION_FEE = 50.0;

    // Constructor
    public Adopter(String adopterId, String name, String city, int numberOfChildren, String status) {
        this.adopterId = adopterId;
        this.name = name;
        this.city = city;
        this.numberOfChildren = numberOfChildren;
        this.status = status;
    }

    // Metodo 1: Muestra la información del adoptante
    public void showInfo() {
        System.out.println("--- SOLICITANTE ---");
        System.out.println("ID: " + this.adopterId);
        System.out.println("Nombre: " + this.name);
        System.out.println("Ciudad: " + this.city);
        System.out.println("Niños en casa: " + this.numberOfChildren);
        System.out.println("Estado: " + this.status);
    }

    // Metodo 2: Evalúa si es elegible para la adopción (criterio: sin niños en casa)
    public boolean isEligible() {
        return this.numberOfChildren == 0;
    }

    // Metodo 3: Calcula la tarifa de adopción con descuento
    public double calculateAdoptionFee() {
        // Aplica un descuento de 5.0 si el solicitante es de Bogota
        if (this.city.equalsIgnoreCase("Bogota")) {
            return BASE_ADOPTION_FEE - 5.0;
        }
        return BASE_ADOPTION_FEE;
    }

    // Metodo 4: Getter para obtener el nombre
    public String getName() {
        return name;
    }
}