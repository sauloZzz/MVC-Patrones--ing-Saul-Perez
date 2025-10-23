# 🧠 Gestor de Usuarios — MVC con Patrones de Diseño

### 👨‍💻 Desarrollado por:
- **Saúl Pérez**

---

## 📋 Descripción del proyecto

Este proyecto implementa un **Gestor de Usuarios** utilizando el lenguaje **Java** bajo la arquitectura **Modelo–Vista–Controlador (MVC)**, integrando **tres patrones de diseño** del catálogo de Refactoring.Guru:

- 🏭 **Factory Method** (Patrón Creacional)
- 🎨 **Decorator** (Patrón Estructural)
- ⚙️ **Command** (Patrón de Comportamiento)

El sistema permite:
- Registrar usuarios de diferentes tipos (Administrador, Cliente e Invitado).
- Mostrar una lista visual con los usuarios agregados.
- Eliminar usuarios seleccionados.
- Validar que el correo electrónico tenga un formato correcto (`@` y `.com`).
- Impedir la creación o eliminación de usuarios sin completar los campos requeridos.

---

## 🧱 Estructura del Proyecto

src/

├── controller/

│ ├── AgregarUsuarioCommand.java

│ ├── BuscarUsuarioCommand.java

│ ├── EliminarUsuarioCommand.java

│ ├── Command.java

│ ├── Controlador.java

│ └── UsuarioControlador.java
│

├── model/

│ ├── Usuario.java

│ ├── AdminUsuario.java

│ ├── ClienteUsuario.java

│ ├── InvitadoUsuario.java

│ └── UsuarioFactory.java

│
├── view/

│ ├── UsuarioVista.java

│ ├── VentanaPrincipal.java

│ ├── VistaDecorator.java

│ └── VistaDetallada.java

│

├── Main.java

└── README.md


---

## 🧩 Patrones de Diseño Utilizados

### 🏭 **Factory Method (Modelo)**
Ubicación: `model/UsuarioFactory.java`  
Este patrón se utiliza para **crear distintos tipos de usuarios** (`AdminUsuario`, `ClienteUsuario`, `InvitadoUsuario`) sin exponer la lógica de instanciación.  
El controlador simplemente solicita a la fábrica la creación de un nuevo usuario.

**Ventaja:** facilita la extensión del sistema si se agregan nuevos tipos de usuario en el futuro.

---

### 🎨 **Decorator (Vista)**
Ubicación: `view/VistaDecorator.java`, `view/VistaDetallada.java`  
Permite **extender dinámicamente la funcionalidad de las vistas** sin modificar sus clases base.  
La vista detallada agrega más información o estilos al componente `UsuarioVista`.

**Ventaja:** promueve la reutilización de componentes visuales.

---

### ⚙️ **Command (Controlador)**
Ubicación: `controller/*.java`  
Cada acción del sistema (agregar, eliminar, buscar) está encapsulada en un objeto comando.  
Esto desacopla las acciones concretas del controlador principal y facilita la escalabilidad.

**Ventaja:** permite agregar o modificar comandos sin alterar el controlador.

---

## 🧠 Integración con el Patrón MVC

| Componente | Carpeta | Descripción |
|-------------|----------|--------------|
| **Modelo (Model)** | `model/` | Gestiona la lógica de datos y creación de usuarios. |
| **Vista (View)** | `view/` | Contiene la interfaz gráfica (Swing) y la presentación de datos. |
| **Controlador (Controller)** | `controller/` | Gestiona los eventos de la vista y coordina la comunicación con el modelo. |

---

## 💻 Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/sauloZzz/MVC-Patrones--ing-Saul-Perez.git
