# 🧩 Gestor de Usuarios con MVC y Patrones de Diseño

## 📘 Descripción del proyecto
Este proyecto implementa un **Gestor de Usuarios** desarrollado en **Java**, aplicando el patrón arquitectónico **Modelo–Vista–Controlador (MVC)** como marco organizador general.  
El sistema permite **registrar, listar y gestionar usuarios**, diferenciando entre distintos tipos de usuarios (por ejemplo, *Administrador* y *Cliente*).

El objetivo principal es integrar tres patrones de diseño del catálogo de [Refactoring.Guru](https://refactoring.guru/es/design-patterns) en un escenario conjunto y funcional.

---

## 🧠 Estructura general (MVC)

| Capa | Responsabilidad | Paquete |
|------|-----------------|----------|
| **Modelo** | Contiene la lógica del negocio y la creación de objetos (usuarios). | `model` |
| **Vista** | Administra la interfaz gráfica y su decoración. | `view` |
| **Controlador** | Gestiona los eventos y comandos que conectan vista y modelo. | `controller` |

---

## 🧩 Patrones de diseño utilizados

| Tipo | Patrón | Aplicación en el proyecto | Rol dentro del MVC |
|------|---------|----------------------------|--------------------|
| **Creacional** | 🏭 **Factory Method** | Crea diferentes tipos de usuarios (`Administrador`, `Cliente`) desde una clase fábrica (`UsuarioFactory`). | **Modelo** |
| **Estructural** | 🎨 **Decorator** | Permite añadir características visuales adicionales a la vista (por ejemplo, resaltar usuarios activos) sin modificar la vista base. | **Vista** |
| **Comportamiento** | 🎮 **Command** | Encapsula acciones del usuario como objetos de comando (`CrearUsuarioCommand`, `EliminarUsuarioCommand`, etc.). | **Controlador** |

---

## 🏗️ Estructura de carpetas

