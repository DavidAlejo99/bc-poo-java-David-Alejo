# Análisis Orientado a Objetos - Centro de Adopción "Huellitas Felices"

**Estudiante:** David Esteban Alejo Baracaldo

**Ficha:** 3228973A

***

## 1. Identificación del Dominio

---

**Nombre del negocio:** Huellitas Felices
**Tipo:** Centro de Adopción de Animales
**Descripción:** Huellitas Felices es un centro de protección animal que gestiona el rescate, cuidado y adopción responsable de perros y gatos. El sistema se enfoca en modelar la informacion de las mascotas disponibles y los adoptantes.

***

## 2. Objetos Identificados

---

### Objeto Principal: `AdoptablePet`

**¿Qué es?:** Representa a una mascota (perro o gato) que ha sido rescatada y está disponible para iniciar un proceso de adopción.

**Atributos identificados:** (Cumple con los 5+ atributos requeridos)

* `petCode:` String - Código único de identificación de la mascota.
* `name:` String - Nombre asignado a la mascota.
* `species:` String - Especie (Perro o Gato).
* `weightKg:` double - Peso en kilogramos para control veterinario.
* `ageMonths:` int - Edad de la mascota en meses.
* `isVaccinated:` boolean - Indica si tiene todas las vacunas al día.

**Métodos identificados:** (Cumple con los 4+ métodos requeridos)

* `showInfo():` Muestra toda la información de la mascota en consola (Requisito `void`).
* `calculateApproxYears():` Calcula y retorna la edad aproximada en años (Requisito `retorna valor`).
* `getPetCode():` Sirve para leer el código de la mascota (Requisito `getter`).
* `setVaccinated(boolean)`: Modifica el estado de vacunación de la mascota (Requisito `setter`).

### Objeto Secundario: `Adopter`

**¿Qué es?:** Representa a la persona o familia que solicita el proceso de adopción de una mascota. Cada adoptante pasa por un filtro para ser aprobado.

**Atributos identificados:** (Cumple con los 4+ atributos requeridos)

* `adopterId`: String - Identificador único del adoptante (ej. Cédula).
* `fullName`: String - Nombre completo del solicitante.
* `city`: String - Ciudad de residencia.
* `hasPreviousPets`: boolean - Indica si el adoptante tiene experiencia previa con mascotas.
* `isApproved`: boolean - Indica si pasó el filtro de elegibilidad.

**Métodos identificados:** (Cumple con los 3+ métodos requeridos)

* `showAdopterData():` Muestra la información de contacto y estado del adoptante (Requisito `void`).
* `calculateAdoptionFee():` Retorna un costo administrativo base por el proceso (Requisito `retorna valor`).
* `isEligible():` Valida si es elegible (ej. si `isApproved` es true) (Requisito `retorna valor`).
* `getFullName():` Lee el nombre completo (Requisito `getter`).

***

## 3. Relación entre Objetos

---

**Tipo de relación:** Asociación Simple

**Descripción:** Un **`Adopter`** (Adoptante) es quien inicia un proceso para adquirir un **`AdoptablePet`** (Mascota Adoptable). Cada mascota tendrá un único adoptante final. En esta etapa inicial, la relación es conceptual, reflejando que los adoptantes interactúan con las mascotas para el proceso de adopción.

***

## 4. Justificación del Diseño

---

**¿Por qué elegí estos objetos?**

Elegí **`AdoptablePet`** y **`Adopter`** porque son las entidades **esenciales** para el flujo de trabajo en el centro de adopción. La gestión se centra en el "producto" (la mascota) y el "cliente" (el adoptante). Sin estos dos objetos, el negocio no tiene razón de ser.

**¿Por qué estos atributos son importantes?**

Cada atributo permite la correcta gestión del proceso:
* Los datos de la mascota (`weightKg`, `isVaccinated`, `ageMonths`) son vitales para su salud y para determinar si está lista para ser adoptada.
* Los datos del adoptante (`adopterId`, `isApproved`, `city`) son necesarios para la validación y el seguimiento post-adopción.

**¿Por qué estos métodos son necesarios?**

Los métodos simulan las acciones del negocio y cumplen con el encapsulamiento:
* `showInfo()` / `showAdopterData()` son esenciales para la depuración y la presentación de información.
* `setVaccinated()` permite al veterinario actualizar el estado de la mascota de forma controlada.
* `calculateApproxYears()` implementa la lógica funcional de retorno de un valor, cumpliendo con el requisito del ejercicio.
* Los `getters` protegen los datos internos del objeto.

***

## 5. Comparación: POO vs Programación Estructurada

---

**Sin POO (Estructurado):**

Para manejar 5 mascotas se usarían **funciones** externas que recibirían múltiples **variables sueltas** (`nombre1`, `peso1`, `vacunado1`, `nombre2`, `peso2`, `vacunado2`, etc.). Si se necesita *vacunar* a una mascota, se llamaría a una función `vacunar_mascota(estado_vacunacion, codigo)`. Los datos y la acción están separados, haciendo el código desorganizado y propenso a errores.

**Con POO:**

La clase **`AdoptablePet`** encapsula todos sus atributos y métodos. Cada objeto (`perro1`, `gato2`) es una unidad de información completa. Al escribir `perro1.setVaccinated(true)`, se sabe exactamente qué objeto está siendo modificado y con qué comportamiento.

**Ventajas específicas en mi dominio:**

1.  **Organización:** Mantiene la salud (`weightKg`, `isVaccinated`) y la identidad (`name`, `petCode`) de cada animal perfectamente agrupadas en su propia instancia.
2.  **Coherencia:** Garantiza que cada objeto `AdoptablePet` se cree con un constructor que inicializa todos los campos obligatorios.
3.  **Mantenibilidad:** Si se necesita añadir el estado de esterilización (`isSterilized`), solo se añade un atributo y métodos a la clase `AdoptablePet`, sin afectar la clase `Adopter`.

***


