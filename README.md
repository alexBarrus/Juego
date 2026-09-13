# Juego — Administrador de Personajes RPG

Proyecto académico en **Java (Swing + NetBeans)** que modela las entidades de un videojuego de rol (RPG) por turnos —personajes, armas y habilidades— y expone un **panel de administración de escritorio** para crear, consultar, actualizar, borrar y destruir instancias de cada tipo de entidad.

> Estado: proyecto en desarrollo / uso académico. La persistencia es solo en memoria (ver [Limitaciones conocidas](#limitaciones-conocidas)).

## Tabla de contenidos

- [Descripción](#descripción)
- [Autores](#autores)
- [Contenido de la entrega](#contenido-de-la-entrega)
- [Tecnologías](#tecnologías)
- [Requisitos previos](#requisitos-previos)
- [Estructura del proyecto](#estructura-del-proyecto)
- [Modelo de dominio](#modelo-de-dominio)
- [Funcionalidades](#funcionalidades)
- [Validaciones de datos](#validaciones-de-datos)
- [Cómo ejecutar el proyecto](#cómo-ejecutar-el-proyecto)
- [Limitaciones conocidas](#limitaciones-conocidas)
- [Mejoras futuras](#mejoras-futuras)

## Descripción

`Juego` es un ejercicio de Programación Orientada a Objetos que separa el proyecto en dos capas:

- **BackEnd**: modelo de dominio (clases abstractas y jerarquías de herencia para personajes, armas y habilidades).
- **FrontEnd**: interfaz gráfica de escritorio (`Swing`) que actúa como panel de administración/CRUD sobre esas clases, útil para crear datos de prueba y validar el modelo sin necesidad de una base de datos.

La ventana principal (`GUIPersonaje`) se titula **"Administrador de Personajes del Juego"** y organiza todas las entidades en pestañas (`JTabbedPane`).

## Autores

- Barrutieta Nulutagua, Juan Alexander
- Alcalá Bejarano, Jennifer Paola

## Contenido de la entrega

Este repositorio cumple con lo solicitado en el enunciado de la práctica:

- ✅ **Clases desarrolladas**: 12 clases en [`src/BackEnd/`](src/BackEnd/), organizadas en 3 jerarquías de herencia (Personaje, Armas, Habilidad) — ver [Modelo de dominio](#modelo-de-dominio).
- ✅ **Constructores**: cada clase tiene un constructor vacío y un constructor con todos sus atributos.
- ✅ **Métodos `get`, `set` y `toString()`**: implementados en todas las clases del BackEnd.
- ✅ **Interfaz gráfica**: [`src/FrontEnd/GUIPersonaje.java`](src/FrontEnd/GUIPersonaje.java) (Swing), panel de administración con una pestaña por entidad y operaciones CRUD.
- ✅ **Clase principal**: `GUIPersonaje` (contiene el método `main`), definida como `main.class` en `nbproject/project.properties`.
- ✅ **Archivos necesarios para ejecutar el proyecto**: [`build.xml`](build.xml), [`manifest.mf`](manifest.mf) y la carpeta `nbproject/` (proyecto NetBeans/Ant listo para abrir o compilar) — ver [Cómo ejecutar el proyecto](#cómo-ejecutar-el-proyecto).

El código de este repositorio corresponde a la versión demostrada en el video de la entrega.

## Tecnologías

- **Java 16** (`javac.source` / `javac.target` = 16, según `nbproject/project.properties`)
- **Swing** para la interfaz gráfica (formulario generado con el editor de NetBeans, `GroupLayout`)
- **Apache Ant** como sistema de build (proyecto NetBeans estándar, `build.xml` + `nbproject/build-impl.xml`)
- Sin dependencias externas ni librerías de terceros (`javac.classpath` vacío)
- Sin base de datos ni framework de persistencia — todo el estado vive en memoria mientras la aplicación está abierta

## Requisitos previos

- **JDK 16** o superior instalado y configurado (`JAVA_HOME`)
- **NetBeans IDE** (recomendado, ya que el proyecto trae metadatos `nbproject/`) o **Apache Ant** si se quiere compilar por línea de comandos
- Sistema operativo con soporte para interfaz gráfica (Swing requiere entorno con display; en Windows funciona sin configuración adicional)

## Estructura del proyecto

```
Juego/
├── build.xml                  # Punto de entrada de Ant (delega en nbproject/build-impl.xml)
├── manifest.mf                # Manifest del JAR (Main-Class se añade automáticamente al compilar)
├── nbproject/                 # Metadatos y configuración del proyecto NetBeans
│   ├── project.properties     # javac.source/target=16, main.class=FrontEnd.GUIPersonaje, etc.
│   └── project.xml
└── src/
    ├── BackEnd/                # Modelo de dominio (POJOs)
    │   ├── Personaje.java      # Clase abstracta base
    │   ├── Protagonista.java
    │   ├── Enemigo.java
    │   ├── Jefe.java
    │   ├── Armas.java          # Clase abstracta base
    │   ├── Arco.java
    │   ├── Baston.java
    │   ├── Espada.java
    │   ├── Escudo.java
    │   ├── Habilidad.java      # Clase abstracta base
    │   ├── Ataque.java
    │   ├── Buffo.java
    │   └── Curacion.java
    └── FrontEnd/
        └── GUIPersonaje.java   # Ventana principal (Swing) — panel de administración
```

## Modelo de dominio

Tres jerarquías de herencia, cada una con una clase abstracta base:

```
Personaje (abstracta)
├── Protagonista   (Experiencia, Inventario)
├── Enemigo        (DistanciaDeteccion, RecompensaXP)
└── Jefe           (Fases, multiplicadorFuria)      [clase final]

Armas (abstracta)
├── Arco           (daño, alcance)
├── Baston         (dañoMagico, bonusMana)
├── Espada         (daño, filo)
└── Escudo         (defensaExtra, durabilidad)

Habilidad (abstracta)
├── Ataque         (dañoExtra)
├── Buffo          (duracionTurnos)
└── Curacion       (puntosRestaurados)
```

**Atributos comunes de `Personaje`:** Tipo, Nombre (atributo primario), Vida, nivel, daño, defensa, EstaVivo.

**Atributos comunes de `Armas`:** Nombre, Daño, Durabilidad (cada subclase además declara sus propios campos específicos).

**Atributos comunes de `Habilidad`:** Nombre, Costo, Poder.

Todas las clases del BackEnd implementan `equals()`/`hashCode()` (basados en el nombre/tipo como atributo primario) y `toString()` para su representación en texto.

## Funcionalidades

La GUI (`GUIPersonaje`) ofrece **10 pestañas**, una por cada entidad concreta del modelo:

`Enemigo` · `Protagonista` · `Jefe` · `Arco` · `Baston` · `Escudo` · `Espada` · `Ataque` · `Buffo` · `Curacion`

Cada pestaña incluye un formulario con sus campos correspondientes y 6 operaciones tipo CRUD, aplicadas sobre **una única instancia en memoria por tipo de entidad**:

| Botón | Acción |
|---|---|
| **Crear** | Valida los campos del formulario y crea la instancia (falla si ya existe una sin destruir). |
| **Buscar** | Pide un nombre por diálogo y compara contra el nombre de la instancia actual. |
| **Mostrar** | Vuelca el `toString()` de la instancia actual en el área de texto de la pestaña. |
| **Actualizar** | Revalida los campos y sobrescribe los atributos de la instancia existente. |
| **Borrar** | Pide confirmación y resetea los atributos de la instancia a valores vacíos/por defecto (sin eliminar la referencia). |
| **Destruir** | Pide confirmación y elimina la instancia (`= null`), liberando la pestaña para crear una nueva. |

Los mensajes de éxito/error y las confirmaciones se muestran con `JOptionPane`.

## Validaciones de datos

Implementadas en `GUIPersonaje` (métodos `validarNombre`, `validarEntero`, `validarDecimal`):

- **Nombre** (atributo primario de cada entidad): obligatorio, entre 2 y 30 caracteres, solo letras y espacios (`[\p{L} ]{2,30}`).
- **Campos numéricos enteros** (Vida, nivel, daño, defensa, XP, fases, costo, poder, etc.): obligatorios, deben ser enteros válidos y estar dentro de un rango mínimo/máximo definido por campo.
- **Campos numéricos decimales** (distancia de detección, alcance, multiplicador de furia, etc.): obligatorios, deben ser `double`/`float` válidos y estar dentro de rango.
- Cualquier fallo de validación lanza `IllegalArgumentException`, capturada para mostrar el mensaje de error correspondiente sin cerrar la aplicación.

## Cómo ejecutar el proyecto

### Opción A — NetBeans IDE (recomendado)
1. Abrir NetBeans → `File > Open Project…` → seleccionar la carpeta `Juego`.
2. Click derecho sobre el proyecto → **Run** (o `Shift+F6` sobre `GUIPersonaje.java`).

### Opción B — Línea de comandos con Ant
```bash
# Compilar
ant build

# Ejecutar
ant run

# Generar el JAR ejecutable (dist/Juego.jar)
ant jar
java -jar dist/Juego.jar
```

### Opción C — javac/java manual
```bash
mkdir -p build/classes
javac -d build/classes -encoding UTF-8 src/BackEnd/*.java src/FrontEnd/*.java
java -cp build/classes FrontEnd.GUIPersonaje
```

## Limitaciones conocidas

- **Sin persistencia real**: los datos existen solo mientras la aplicación está abierta; no hay guardado en archivo ni base de datos.
- **Una sola instancia por tipo**: cada pestaña administra un único objeto a la vez (no una lista/colección), por lo que "Buscar" solo puede comparar contra esa instancia.
- No hay relación funcional entre pestañas (p. ej. asignar un `Arco` o una `Habilidad` a un `Protagonista` desde la GUI).
- No incluye pruebas automatizadas (la carpeta `test/` existe pero está vacía).

## Mejoras futuras

- Persistir los datos (archivo `.json`/`.csv` o base de datos embebida).
- Reemplazar la instancia única por colecciones (listas) con CRUD completo y tabla (`JTable`) de resultados.
- Vincular equipo (armas) y habilidades a los personajes.
- Añadir pruebas unitarias sobre el BackEnd.
- Empaquetar como instalador o JAR autocontenible multiplataforma.
