package co.edu.sena.David.sem3;

import java.util.ArrayList;

public class AdoptionCenter {
    private String name;
    private String address;
    // La lista ahora es privada y usa la clase de la Semana 3
    private ArrayList<AdoptionProcess> processList;

    // Constructor (Sobrecarga opcional)
    public AdoptionCenter(String name, String address) {
        this.name = name;
        this.address = address;
        this.processList = new ArrayList<>();
    }

    // Método para agregar un proceso
    public void addProcess(AdoptionProcess process) {
        processList.add(process);
    }

    // Método que causaba el error - CORREGIDO
    public void showAllProcesses() {
        System.out.println("\n--- Procesos en " + name + " ---");
        if (processList.isEmpty()) {
            System.out.println("No hay procesos registrados.");
            return;
        }
        for (AdoptionProcess p : processList) {
            // USAMOS EL MÉTODO EXISTENTE showSummary() en lugar del obsoleto getDetails()
            p.showSummary();
        }
    }

    // Getters
    public int getTotalProcesses() {
        return processList.size();
    }

    // Método para buscar y mostrar detalles de un proceso por ID (opcional)
    public AdoptionProcess findProcess(String id) {
        for (AdoptionProcess p : processList) {
            if (p.getProcessId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}