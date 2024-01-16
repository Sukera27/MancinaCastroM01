# Ejercicio 02

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean `admin` en el `TextView` de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura en el `AndroidManifest.xml.` Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).

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


# Contador

![Contador](https://github.com/Sukera27/MancinaCastroM02/assets/122563964/bae5a83e-74c4-4da3-9db2-207e88af39af)

Este es un simple proyecto de aplicación Android que implementa un contador. La aplicación utiliza `ConstraintLayout` para organizar los elementos de la interfaz de usuario y presenta botones para incrementar, decrementar y reiniciar el contador.

## Características Principales

- **Contador**: La aplicación muestra un número en un `TextView` que puede ser incrementado, decrementado o reiniciado.
  
- **Botones de Operación**: Tres botones permiten realizar operaciones en el contador: sumar, restar y reiniciar.

- **Diseño**: La interfaz de usuario utiliza colores llamativos y una tipografía agradable para mejorar la experiencia visual.
- El nombre del usuario sale especificado en la parte inferior de la pantalla en un `TextView`.

## Uso

1. Al introdcuir el login correctamente, verás el contador inicializado a cero.
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

## Autor

- **Rafael Mancina**: Desarrollador de la aplicación.


