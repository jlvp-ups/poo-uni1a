# Proyecto de Programación Orientada a Objetos - Unidad 2

## 🎯 Objetivos y Propósito del Proyecto

Este proyecto tiene como objetivo aplicar conceptos avanzados de Programación Orientada a Objetos (POO) en Java, tales como:

- Herencia, asociación, agregación y composición.
- Integración de nuevas clases a un sistema existente.
- Creación de un diagrama UML de clases.
- Desarrollo de un sistema funcional con relaciones correctamente estructuradas.
- Gestión de versiones y colaboración a través de GitHub.

El propósito del sistema es representar y manejar contenido audiovisual como películas, series de TV y documentales, permitiendo ampliar su estructura mediante nuevas clases y funcionalidades que simulan un escenario realista.

---

## 🧩 Nuevas Clases y Funcionalidades Añadidas

Se incorporaron varias clases al sistema base, respetando los principios de POO:

- `Actor`: Asociada a la clase `Película`. Representa a los actores que participan en una película.
- `Temporada`: Asociada a la clase `SerieDeTV`. Representa una temporada específica dentro de una serie.
- `Investigador`: Asociada a la clase `Documental`. Representa a la persona responsable de la investigación en un documental.
- Nuevas subclases que heredan de `ContenidoAudiovisual`, como:
  - `Cortometraje`
  - `VideoYouTube` *(o cualquier otra clase creada por iniciativa propia)*

Cada clase incluye atributos, constructores y métodos relevantes, además de relaciones adecuadas (asociación, agregación o composición) con las clases existentes.

---

## ⚙️ Instrucciones para Clonar y Ejecutar el Proyecto

### Prerrequisitos

- Java JDK 8 o superior
- Eclipse o cualquier IDE compatible con proyectos Java
- Git instalado

### Clonado del repositorio

```bash
git clone https://github.com/jlvp-ups/poo-uni1a.git
```

### Importación en Eclipse

Abre Eclipse.

Selecciona File > Import > Projects from Git > Clone URI.

Pega la URL del repositorio: https://github.com/jlvp-ups/poo-uni1a.git.

Finaliza la importación seleccionando el proyecto.

### Ejecución

Una vez importado, ve al archivo Main.java o equivalente dentro de src/main/java/.

Ejecuta el proyecto como una aplicación Java.

Asegúrate de probar la creación y relación entre objetos de todas las clases.

### 🚀 Mejoras y Optimización

Se organizaron correctamente los paquetes del proyecto (src/main/java).

Se realizaron al menos tres commits significativos que documentan el progreso del desarrollo.

Se creó un diagrama UML con todas las clases y relaciones del sistema.

### 📄 Ver Diagrama UML del Proyecto

Se realizaron pruebas manuales del sistema para verificar la correcta interacción entre clases.

Código optimizado respetando buenas prácticas: encapsulamiento, uso de constructores y métodos bien definidos, etc.

### 📁 Estructura del Proyecto

```
poo-uni1a/
├── src/
│   └── main/
│       └── java/
│           ├── contenido/              # Clases base como ContenidoAudiovisual
│           ├── peliculas/              # Clases Película y Actor
│           ├── series/                 # Clases SerieDeTV y Temporada
│           ├── documentales/           # Clases Documental e Investigador
│           └── adicionales/            # Subclases como Cortometraje, VideoYouTube
├── diagramas/
│   └── [UML en Drive]
├── README.md
👨‍💻 Autor
```
Proyecto realizado por: José Valdiviezo
Universidad Politécnica Salesiana
Asignatura: Programación Orientada a Objetos - Unidad 2
