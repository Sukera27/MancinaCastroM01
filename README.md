# EJERCICIO 04

Añade un Fragment mas que se llame API y sigue el tutorial (para la parte del consumo de la API) proporcionado para consumir un API con android(en esta entrega no tendrás que reflejar los resultado en la interfaz gráfica, solo en el log). Por otro lado crea un microservicio con una sola entidad.

# Login 

![login](https://github.com/Sukera27/MancinaCastroM02/assets/122563964/3e939e7a-7581-4ced-bac5-46752c457b4b)


La pantalla de inicio de sesión contiene un formulario simple con campos para el nombre de usuario y la contraseña. Si el usuario y la contraseña ingresados coinciden con "admin", se mostrará un mensaje indicando que la información es correcta. De lo contrario, se mostrará un mensaje de error. Al hacer clic en el botón de inicio de sesión, la aplicación pasará a la pantalla del contador.

### Componentes Destacados:

- `EditText` para el nombre de usuario.
- `EditText` para la contraseña.
- Botón de inicio de sesión.
- `TextView` para mostrar mensajes de resultado.

### Funcionalidad:

- Verificación de nombre de usuario y contraseña.
- Mensajes de resultado dinámicos.
- Transición a la pantalla del contador al iniciar sesión.

## NavigationMenu

Este activity implementa un menú de navegación (`BottomNavigationView`) con tres fragments: **Home**, **Counter**, y **Salir**.

### Componentes Destacados:

- `BottomNavigationView` para la barra de navegación.
- `FrameLayout` espacio donde aparecen los distintos fragments.

### Funcionalidad:

- Navegación fluida entre los fragments mediante el menú de navegación.

# Fragments

## Home

![Home](https://github.com/Sukera27/MancinaCastroM01/assets/122563964/74842217-c241-4153-8486-4a4e90cf6c7c)


- Pantalla de inicio de la aplicacion tras hacer el login correctamente.


## Contador

![counter](https://github.com/Sukera27/MancinaCastroM01/assets/122563964/e6558007-f48d-4cfd-b586-280ff9c411c9)



Este es un simple proyecto de aplicación Android que implementa un contador. La aplicación utiliza `ConstraintLayout` para organizar los elementos de la interfaz de usuario y presenta botones para incrementar, decrementar y reiniciar el contador.

## Características Principales

- **Contador**: La aplicación muestra un número en un `TextView` que puede ser incrementado, decrementado o reiniciado.
  
- **Botones de Operación**: Tres botones permiten realizar operaciones en el contador: sumar, restar y reiniciar.

- **Diseño**: La interfaz de usuario utiliza colores llamativos y una tipografía agradable para mejorar la experiencia visual.
- El nombre del usuario sale especificado en la parte inferior de la pantalla en un `TextView`.

## Uso

1. Verás el contador inicializado a cero.
2. Utiliza los botones "+" y "-" para aumentar y disminuir el contador, respectivamente.
3. El botón "RESET" restablecerá el contador a cero.

## Requisitos de Desarrollo

- **Android Studio**: Esta aplicación fue desarrollada utilizando Android Studio.

## Instrucciones de Instalación

1. Abre el proyecto en Android Studio.
2. Conecta tu dispositivo Android o utiliza un emulador.
3. Ejecuta la aplicación.

## Personalización

Si deseas personalizar la aplicación, puedes hacer lo siguiente:

- **Cambiar Colores**: Modifica los valores de `android:background` y `android:textColor` en los elementos XML para ajustar los colores de fondo y texto.
  
- **Modificar Tipografía**: Reemplaza las fuentes en el directorio `res/font/` con tus propias fuentes personalizadas.

## API

![LogAPI](https://github.com/Sukera27/MancinaCastroM01/assets/122563964/3ea7e7b4-c1e6-44cd-9ba6-49e2f6b3f53d)

- Ahora simplemente demostrar que cuando pulso en el `BottomNavigationView` del fragment correspondiente a la `API` aparezca los insert de los productos en el Log.

![API](https://github.com/Sukera27/MancinaCastroM01/assets/122563964/43a1e1dd-f810-4483-8df1-a56a462c5baf)


## Salir
- Sale a la pantalla de login.
## Autor

- **Rafael Mancina**: Desarrollador de la aplicación.


