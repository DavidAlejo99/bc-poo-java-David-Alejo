package co.edu.sena.David.sem2;

import java.util.ArrayList; // Importación necesaria para listas

public class AdoptionCenter {
    private String name;
    private String address;
    // COLECCIÓN: Lista de procesos de adopción
    private ArrayList<AdoptionProcess> processes;

    public AdoptionCenter(String name, String address) {
        this.name = name;
        this.address = address;
        // Inicializar el ArrayList vacío
        this.processes = new ArrayList<>();
    }

    // Método para agregar un proceso a la lista
    public void addProcess(AdoptionProcess process) {
        this.processes.add(process);
    }

    // Método para recorrer la lista y mostrar todo
    public void showAllProcesses() {
        System.out.println("\n=== REPORTE DE PROCESOS: " + this.name + " ===");
        System.out.println("Dirección: " + this.address);
        System.out.println("-----------------------------------------");

        if (processes.isEmpty()) {
            System.out.println("No hay procesos registrados.");
        } else {
            // Bucle For-Each para recorrer la lista
            for (AdoptionProcess p : processes) {
                System.out.println(p.getDetails());
            }
        }
        System.out.println("-----------------------------------------");
    }

    // Método extra para contar
    public int getTotalProcesses() {
        return processes.size();
    }
}