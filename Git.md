¿Qué es Markdow? 
Markdown es un lenguaje de marcado que facilita la aplicación de formato a un texto empleando una serie de caracteres de una forma especial. En principio, fue pensado para elaborar textos cuyo destino iba a ser la web con más rapidez y sencillez que si estuviésemos empleando directamente HTML. Y si bien ese suele ser el mejor uso que podemos darle, también podemos emplearlo para cualquier tipo de texto, independientemente de cuál vaya a ser su destino.

GIT

1. El Repositorio en Git
Un repositorio es la unidad básica de almacenamiento en Git donde se guarda el código, los archivos y el historial completo de revisiones de cada uno. 
Diferencia con un proyecto "normal": Un proyecto convencional es solo una carpeta con el estado actual de los archivos. Un repositorio de Git incluye una carpeta oculta. git que contiene toda la base de datos del historial, permitiendo viajar en el tiempo a versiones anteriores. 

2. Las Tres Áreas Principales
Git divide el trabajo en tres zonas para dar control sobre qué se guarda: 
Working Directory (Directorio de trabajo): Es la carpeta en tu computadora donde ves y editas los archivos físicamente.
Staging Area (Index): Es un área de preparación o "sala de espera". Aquí colocas los cambios que quieres incluir en tu siguiente confirmación.
Repository (Directorio Git): Donde Git almacena permanentemente las instantáneas (commits) del proyecto de forma comprimida. 

3. Representación Interna de Cambios
Git utiliza cuatro tipos de objetos principales identificados por un hash único (SHA-1): 
Blob: Almacena el contenido de un archivo individual.
Tree (Árbol): Representa la estructura de directorios y nombres de archivos.
Commit: Una instantánea del proyecto que apunta a un tree y al commit anterior.

Tag: Una referencia permanente a un commit específico, usualmente para marcar versiones (ej. v1.0). 
4. Creación y Contenido de un Commit
Se crea con git commit -m "mensaje". Un objeto commit almacena: 
Un puntero al árbol (instantánea del proyecto).
Metadatos: autor, fecha/hora y el mensaje descriptivo.
Puntero al commit padre (excepto el primero).

5. Git Pull vs. Git Fetch
git fetch: Descarga los cambios del servidor remoto a tu base de datos local, pero no los mezcla con tu trabajo actual. Es seguro para revisar qué han hecho otros.
git pull: Es una combinación de git fetch seguido automáticamente de un git merge. Descarga los cambios e intenta unirlos de inmediato a tu rama actual. 

6. Branches (Ramas) y Punteros
Una rama es simplemente un puntero móvil que apunta a uno de los commits en el historial. 
Gestión: Git usa un puntero especial llamado HEAD para saber en qué rama estás trabajando actualmente. Cuando haces un commit, el puntero de la rama actual avanza automáticamente al nuevo commit. 

7. Merge y Conflictos
Un merge une el historial de dos ramas diferentes. 
Conflictos: Ocurren cuando dos personas modifican la misma línea del mismo archivo en ramas distintas y Git no sabe cuál versión elegir.
Resolución: Debes abrir el archivo, elegir manualmente el código correcto, guardar, hacer un git add del archivo resuelto y finalizar con un git commit. 

8. Área de Staging (git add)
Funciona como un filtro. Usas git add <archivo> para seleccionar qué cambios están listos para la foto final. 
Si omites este paso: El comando git commit no encontrará cambios para guardar, ya que por defecto solo registra lo que está en el área de staging. 

9. El archivo .gitignore
Es un archivo de texto donde indicas qué archivos o carpetas Git debe ignorar intencionalmente. 
Influencia: Evita que archivos temporales, logs, configuraciones locales o dependencias pesadas (como node_modules) se suban al repositorio. 

10. Commit Amend vs. Nuevo Commit
git commit --amend: Reemplaza el último commit realizado con uno nuevo que incluye los cambios adicionales. Útil para corregir errores menores o el mensaje del commit sin ensuciar el historial.
Nuevo Commit: Crea un nuevo punto en la línea de tiempo, manteniendo el commit anterior intacto. 

11. Git Stash
Se usa para guardar temporalmente cambios que no están listos para ser un commit, limpiando tu directorio de trabajo. 
Escenario útil: Cuando estás a mitad de una tarea y necesitas cambiar de rama urgentemente para corregir un error crítico en producción sin perder lo que llevas hecho.
 
12. Mecanismos para Deshacer Cambios
git checkout -- : Descarta cambios no preparados en el directorio de trabajo.
git reset: Mueve el puntero de la rama a un commit anterior. Puede ser suave (--soft), manteniendo tus cambios, o duro (--hard), borrándolo todo.
git revert: Crea un nuevo commit que hace lo opuesto a un commit anterior, deshaciendo los cambios de forma segura sin alterar el historial existente. 

13. Remotos (Origin, Upstream) y Forks
origin: Nombre por defecto del servidor remoto desde donde clonaste el proyecto.
upstream: Nombre común para el repositorio original del cual hiciste un fork (copia personal en el servidor).
Forks: Se gestionan clonando tu fork, añadiendo el upstream como remoto y usando git fetch upstream para mantener tu copia sincronizada con el proyecto original. 

14. Inspección del Historial
git log: Muestra la lista de commits realizados con su autor, fecha y mensaje.
git diff: Muestra las diferencias líneas por línea entre archivos o commits.
git show: Muestra la información detallada y los cambios de un objeto específico (normalmente un commit).
