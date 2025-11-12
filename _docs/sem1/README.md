# Semana 01 - Introducción a la Programación Orientada a Objetos (POO)

---

## 📝 Descripción

Durante esta semana se desarrolló un sistema básico para la **gestión de mascotas y adoptantes** en el **Centro de Adopción "Huellitas Felices"**, aplicando los conceptos fundamentales de la **programación orientada a objetos** (POO). Se implementaron dos clases principales que representan los objetos del dominio: **AdoptablePet** y **Adopter**, junto con una clase **Main** para demostrar su funcionamiento.

## 🎯 Objetivos Cumplidos
- [x] Implementar clase principal del dominio (`AdoptablePet`)
- [x] Implementar clase secundaria relacionada (`Adopter`)
- [x] Crear programa de demostración (`Main`)
- [x] Documentar análisis del dominio (`ANALISIS.md`)

## 📂 Archivos Entregados

- `src/AdoptablePet.java` — Clase principal del dominio. Representa una mascota con atributos como código, nombre, edad, peso y estado de vacunación.
- `src/Adopter.java` — Clase secundaria relacionada. Representa al solicitante con datos de contacto, elegibilidad y estado de aprobación.
- `src/Main.java` — Programa principal que crea objetos de ambas clases y demuestra la interacción de sus métodos (getters, setters, lógica funcional).
- `docs/ANALISIS.md` — Documento con el análisis del dominio, justificación del diseño y comparación entre POO y programación estructurada.

## 🚀 Instrucciones de Ejecución

---
```bash
cd src
javac *.java
java Main

## 📊 Salida Esperada
=== DEMOSTRACIÓN - HUELLITAS FELICES ===

=======================================
           PRUEBA DE MASCOTAS         
=======================================

=== FICHA DE MASCOTA ===
Código: PET-001
Nombre: Luna
Especie: Perro
Edad: 18 meses (1 años)
Peso: 15.5 Kg
Vacunado: NO
========================
Código de Luna (Getter): PET-001
Edad de Michi en años: 0

¡Mascota Luna marcada como vacunada!

=== FICHA DE MASCOTA ===
Código: PET-001
Nombre: Luna
Especie: Perro
Edad: 18 meses (1 años)
Peso: 15.5 Kg
Vacunado: SÍ
========================

=======================================
      PRUEBA DE ADOPTANTES       
=======================================

--- SOLICITANTE ---
ID: ID-456
Nombre: Laura Pérez
Ciudad: Bogota
Niños en casa: 2
Estado: PENDIENTE
Nombre del Adoptante (Getter): Laura Pérez
¿Laura es elegible para adopción?: true
Tarifa de adopción de Laura (con descuento): $45.0

--- SOLICITANTE ---
ID: ID-789
Nombre: Carlos Velez
Ciudad: Medellin
Niños en casa: 0
Estado: APROBADO
¿Carlos es elegible para adopción?: false
Tarifa de adopción de Carlos (sin descuento): $50.0

=== DEMOSTRACIÓN FINALIZADA ===

## 🔍 Conceptos Aplicados

---

* **Clases y objetos:** Modelado de entidades del mundo real (`AdoptablePet`, `Adopter`).
* **Atributos y métodos:** Definición de características y comportamientos (ej. `setVaccinated()`, `isEligible()`).
* **Constructores:** Inicialización de objetos con valores obligatorios.
* **Encapsulación (getters y setters):** Control de acceso y modificación de estado.
* **Relaciones entre clases:** Asociación conceptual entre `AdoptablePet` y `Adopter`.
* **Lógica de Negocio:** Implementación de validaciones y cálculos simples.
* **Uso de System.out.println():** Para mostrar información y resultados en consola.