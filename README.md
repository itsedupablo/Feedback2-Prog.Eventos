# Feedback 6 Programación dirigida por Eventos: Aplicación de gestión de novelas (actualizada)
### Enlace al repositorio: https://github.com/itsedupablo/Feedback3-Prog.Eventos
## **IMPORTANTE: Sobre las entregas de feedbacks**
En este repositorio estoy subiendo el proyecto completo de "Gestion Novelas" entrega tras entrega y es el único que existe ahora mismo habilitado para ello, lo que significa que solo hay una única versión subida de el mismo (la más reciente que se corresponde con la última entrega). Entonces este proyecto incluye la versión final y las de las anteriores entregas "Feedback" todo unificado.
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
En esta pantalla se debe dar acceso a todas las operaciones CRUD con la base de datos de novelas. El usuario puede ver una lista con las novelas añdidas y añadir nuevas novelas presionando el botón "Agregar Novela" y acceder a las marcadas como favoritas presionando "Ver Favoritos". Para añadir novelas a favoritos, eliminarlas y ver detalles de cada una, se debe presionar las novelas de la lista y aparecerá un menú desplegable con estas opciones.
### *4. Pantalla Favoritos:*
En esta pantalla definida también por una activity se muestran en forma de lista igual que en la pantalla principal las novelas que han sido previamente marcadas como favoritas. 
### *5. Vista de Detalles:*
En esta "mini" pantalla definida con un fragment el usuario puede ver la información almacenada en la BD de cada novela que seleccione sin salir de la Pantalla Principal.
### *6. Pantalla de Ubicación*
Esta pantalla permite al usuario ver su ubicación actual en un mapa (simulada). 
### *7. Pantalla de Ubicación de Novelas*
Esta pantalla permite al usuario ver la ubicación de una novela específica tras haberla añadido a la BD. La ubicación será la actual del dispositivo (simulada). 
### *8. Pantalla de Mapa de Novelas*
Esta pantalla permite al usuario ver la ubicación de todas las novelas en un mapa.
