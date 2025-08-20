# 🗂️ Gestor de Tareas Avanzado - CLI

> Un gestor de tareas por línea de comandos desarrollado en Java que permite gestionar tareas con diferentes prioridades.

## ✨ Características

- ✅ **Agregar** nuevas tareas con ID único
- 📋 **Listar** todas las tareas registradas  
- 🔍 **Buscar** tareas por ID
- 🗑️ **Eliminar** tareas por ID
- 📊 **Mostrar** el total acumulado de prioridades
- 🎯 Sistema de **prioridades** (1-5)
- 🏗️ Implementación con **herencia** y **clases abstractas**

## 📁 Estructura del Proyecto

```
GestorDeTareas/
├── Actividad.java                 # Clase abstracta base
├── Tarea.java                    # Clase que extiende Actividad
├── GestorDeTareasAvanzado.java   # Programa principal con menú interactivo
└── README.md                     # Este archivo
```

## ⚙️ Requisitos

- **Java JDK 8** o superior
- Terminal/Consola para ejecución

## 🚀 Compilación y Ejecución

1. **Compila** todos los archivos Java:
```bash
javac *.java
```

2. **Ejecuta** el programa principal:
```bash
java GestorDeTareasAvanzado
```

## 📖 Uso

El programa presenta un **menú interactivo** con las siguientes opciones:

| Opción | Descripción |
|--------|-------------|
| 1. **Agregar tarea** | Solicita ID, nombre y prioridad (1-5) |
| 2. **Listar tareas** | Muestra todas las tareas con sus detalles |
| 3. **Buscar tarea por ID** | Encuentra una tarea específica |
| 4. **Eliminar tarea por ID** | Elimina una tarea del sistema |
| 5. **Ver total acumulado de prioridades** | Muestra la suma de todas las prioridades |
| 6. **Salir** | Finaliza el programa |

## 🧩 Diseño Orientado a Objetos

| Clase | Descripción |
|-------|-------------|
| **Actividad** | Clase abstracta que define la estructura base |
| **Tarea** | Clase concreta que implementa la funcionalidad específica |
| **GestorDeTareasAvanzado** | Clase principal que maneja la lógica de la aplicación |

## 💻 Notas Técnicas

- Utiliza `var` para **inferencia de tipos locales** (Java 10+)
- Implementa **lambda expressions** para iteraciones
- Emplea **HashMap** para búsquedas eficientes por ID
- Maneja **excepciones** de entrada de usuario
- Mantiene **consistencia** entre ArrayList y HashMap para las tareas

## 🎯 Ejemplo de Uso

```
=== Menú de Tareas ===
1. Agregar tarea
2. Listar tareas  
3. Buscar tarea por ID
4. Eliminar tarea por ID
5. Ver total acumulado de prioridades
6. Salir
Elegí una opción: 1

ID de la tarea: t1
Nombre de la tarea: Estudiar Java
Prioridad (1 a 5): 3
Tarea agregada con éxito
```

## 👨‍💻 Autor

Desarrollado por Yamil Arturo Rafart, como ejemplo educativo de aplicación Java con interfaz de línea de comandos.

---
