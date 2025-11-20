# Semana 02 - Clases, Objetos y Colecciones

## 📝 Descripción
En esta segunda semana, evolucionamos el sistema del **Centro de Adopción "Huellitas Felices"**. Pasamos de gestionar entidades aisladas a gestionar **relaciones** (Mascota-Adoptante) y **listas dinámicas** de procesos de adopción.

## 🎯 Objetivos Cumplidos
- [x] **Nuevas Clases:** Implementación de `VeterinaryCheckup` (Chequeo) y `AdoptionProcess` (Proceso).
- [x] **Relaciones:** `AdoptionProcess` conecta un objeto `AdoptablePet` con un `Adopter`.
- [x] **Colecciones:** Uso de `ArrayList` en la clase `AdoptionCenter` para administrar múltiples procesos.
- [x] **Main Funcional:** Demostración de integración de todos los componentes.

## 📂 Archivos Entregados
- `src/VeterinaryCheckup.java`: Clase simple para historial médico.
- `src/AdoptionProcess.java`: Clase que relaciona mascota y adoptante.
- `src/AdoptionCenter.java`: Clase gestora que contiene la lista (`ArrayList`) de procesos.
- `src/Main.java`: Ejecución y pruebas del sistema.
- *(Incluye copias de `AdoptablePet` y `Adopter` de sem1 para funcionamiento)*.

## 🚀 Instrucciones de Ejecución
```bash
cd semana-02/src
javac *.java
java Main