# Feedback 2 Programación dirigida por Eventos: Aplicación de gestión de novelas (actualizada)
### Enlace al repositorio: https://github.com/itsedupablo/Feedback2-Prog.Eventos
## **Descripción de la tarea**
El objetivo de este ejercicio es desarrollar una aplicación Android que permita a los usuarios gestionar una lista de novelas. Esto incluye agregar nuevas novelas, eliminar las existentes y ver detalles de cada una. Además, los usuarios podrán marcar sus novelas favoritas y añadir reseñas. Este ejercicio aplicará los conocimientos adquiridos durante la unidad didáctica.
## **Instrucciones**
### *1. Agregar Novelas:*
La aplicación debe permitir al usuario añadir una nueva novela proporcionando título, autor, año de publicación y una breve sinopsis.
### *2. Eliminar Novelas:*
Los usuarios deben poder eliminar novelas de su lista.
### *3. Ver Detalles de las Novelas:*
Al seleccionar una novela de la lista, la aplicación debe mostrar los detalles completos de la novela, incluyendo la sinopsis y la posibilidad de marcarla como favorita.
### *4. Marcar Novelas Favoritas:*
Los usuarios deben poder marcar una novela como favorita. Las novelas marcadas como favoritas deben destacarse en la lista principal.
### *5. Añadir Reseñas:*
La aplicación debe permitir a los usuarios añadir y ver reseñas para cada novela.
### *6. Interfaz de Usuario:*
La interfaz debe ser intuitiva y fácil de usar. Utilizar vistas y layouts apropiados para organizar los elementos de la interfaz de usuario.

## **Activities y pantallas**
### *1. Splash Screen:*
Esta pantalla aparece inmediatamene después de la aparición del logo de android al iniciar la app. En ella aparece el logo de la aplicació (diseñado en DALL·E) y el nombre "GestionNovelas". Está formada por un fichero xml: "activity_splash" y la clase "SplashActivity".
### *2. Pantalla Acceso:*
Esta pantalla es la siguiente en aparecer una vez se ha cargado la app. En ella el usuario debe introducir un correo electrónico y una contraseña para acceder a la app. Si no está registrada su cuenta deberá hacerlo antes de pulsar el botón de login que lo dirigira a la pantalla principal una vez "logeado". Se ha utilizado el servicio de autenticación de Firebase para montar esta pantalla y la gestión de datos de acceso se hace en segundo plano gracias a JobScheduler. Está formada por un fichero xml: "activity_access" y la clase AccessActivity.
### *3. Pantalla Principal:*
En esta pantalla se debe dar acceso a todas las operaciones CRUD con la base de datos de novelas. La idea es agregar botones para agregar y eliminar novelas, además de mostrar una vista con las novelas ya añadidas, a las que se podrá acceder para modificar información propia o añadir reseñas. Hace uso del servicio de firestore (BD de Firebase), y está definida por la clase **MainActivity.java**, y los archivos xml activity_main y agregar_novela_dialog.

## **SIN IMPLEMENTAR** 
### Faltan por añadir funcionalidades y aún no funciona correctamente la opción de añadir novelas (que es la única implementada de momento), aunque si deja interactuar con las cajas de texto para añadir información de las novelas. Faltaría solucionar lo anteriormente dicho y tratar de añadir los siguientes servicios de firebase:
### - Firebase Cloud Messaging (FCM): Para enviar notificaciones push a los usuarios, por ejemplo, cuando se agregan nuevas novelas o se actualizan comentarios.
### - Firebase Analytics: Para obtener información sobre el uso de la aplicación y el comportamiento de los usuarios.
### - Firebase Crashlytics: Para monitorear y reportar fallos en la aplicación, ayudando a mejorar la estabilidad y la experiencia del usuario. (aún por ver si es necesario)


