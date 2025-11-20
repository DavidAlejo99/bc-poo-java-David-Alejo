# Mejoras - Semana 03 (Huellitas Felices)

## Encapsulación Aplicada

### Clase: AdoptablePet
- **Atributos encapsulados:** `code`, `name`, `species`, `ageInMonths`, `weightKg`, `isVaccinated` ahora son privados y solo accesibles vía métodos públicos (`getters` y `setters`).
- **Validaciones agregadas:**
    - `ageInMonths`: No puede ser negativo.
    - `weightKg`: Debe ser mayor a 0.
    - `code`, `name`, `species`: No pueden ser nulos ni vacíos (se usa un método auxiliar privado `validateString`).

### Clase: Adopter
- **Atributos encapsulados:** Todos los atributos ahora son privados.
- **Validaciones agregadas:**
    - `numberOfChildren`: No puede ser negativo.
    - `id`: Debe tener más de 3 caracteres.
    - `city`: Si se ingresa vacío, se asigna "Bogota" automáticamente.

### Clase: VeterinaryCheckup
- **Atributos encapsulados:** Todos los atributos ahora son privados.
- **Validaciones agregadas:**
    - `cost`: No puede ser negativo.

---

## Constructores Sobrecargados

### Clase: AdoptablePet
- **Constructor 1 (Completo):** Recibe todos los atributos para inicializar una mascota detallada (usa `this` y llama a los `setters` para validar).
- **Constructor 2 (Básico):** Recibe solo `code` y `name`. Llama al constructor completo, asignando valores por defecto (`"Desconocido"` como especie, `0` meses y `1.0` kg).

### Clase: Adopter
- **Constructor 1 (Completo):** Requiere ID, Nombre, Ciudad y número de niños.
- **Constructor 2 (Rápido):** Recibe solo ID y Nombre. Llama al constructor completo, asumiendo ciudad `"Bogota"` y `0` hijos.

---

## Beneficios Logrados
1.  **Integridad de Datos:** Es imposible crear o modificar un objeto con datos ilógicos (edades/pesos/costos negativos, nombres vacíos), lo que previene errores en tiempo de ejecución.
2.  **Flexibilidad de Creación:** Los constructores sobrecargados permiten registrar entidades con datos mínimos o completos, mejorando la usabilidad del sistema en diferentes escenarios.
3.  **Mantenibilidad:** El uso del patrón `this()` en los constructores reduce la duplicidad de código, y los `setters` centralizan la lógica de validación, facilitando futuras modificaciones.