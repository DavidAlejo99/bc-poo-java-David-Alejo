package co.edu.sena.David.sem3;

public class Adopter {
    private String id;
    private String name;
    private String city;
    private int numberOfChildren;
    private String status;

    // Constructor 1: Completo
    public Adopter(String id, String name, String city, int numberOfChildren) {
        setId(id);
        setName(name);
        setCity(city);
        setNumberOfChildren(numberOfChildren);
        this.status = "PENDIENTE";
    }

    // Constructor 2: Básico (Asume Bogotá y 0 niños)
    public Adopter(String id, String name) {
        this(id, name, "Bogota", 0);
    }

    // Setters con Validaciones
    public void setId(String id) {
        if (id != null && id.length() > 3) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID inválido (muy corto o nulo).");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nombre obligatorio.");
        }
    }

    public void setCity(String city) {
        // Si envían ciudad vacía, forzamos Bogotá (Lógica de negocio)
        if (city == null || city.isEmpty()) {
            this.city = "Bogota";
        } else {
            this.city = city;
        }
    }

    public void setNumberOfChildren(int numberOfChildren) {
        if (numberOfChildren >= 0) {
            this.numberOfChildren = numberOfChildren;
        } else {
            throw new IllegalArgumentException("El número de niños no puede ser negativo.");
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNumberOfChildren() { return numberOfChildren; }
    public String getStatus() { return status; }
}