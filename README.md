# Memoria Práctica ISO2
[Enunciado del Proyecto](docs/Especificación, Análisis y Diseño parcial del sistema.md)
## 1. Análisis de Requisitos

El proyecto que nos han encargado, consiste en realizar un programa de gestión de vacunas para el COVID-19, donde hay que gestionar como se recogen lotes provenientes de las farmaceúticas, junto con el reparto entre las diferentes comunidades autónomas dependiendo del grado de prioridad, que se calcula a partir de los grupos prioritarios, la incidencia acumulada y la población de dicha comunidad. Finalmente, se tienen que registrar las vacunaciones a cada paciente.

Para empezar, observamos que la aplicación va a ser usada por dos tipos de usuarios: los que trabajarán en el Sistema Nacional de Salud  (SNS) y los que trabajan en los sistemas regionales de salud (SRS), cuyas funciones serán distintas.

En el caso del SNS, el trabajador deberá primero poder dar de alta un lote de vacunas que reciba procedente de una farmaceútica, donde se debe conocer: su ID, que es obligatoria y única; el número de vacunas recibidas; el tipo de vacuna, que está formado por nombre y proveedor; y la fecha en la que se reciben. Una vez que se da de alta el lote, hay que repartir las vacunas entre las comunidades autónomas, pero cada una tendrá un grado de prioridad que previamente hemos definido. Por último, el trabajador podrá observar unas estadísticas a nivel nacional, o si se diese el caso a nivel de comunidades autónomas, donde se mostrarán: el número total de vacunados y el porcentaje de vacunados respecto a las vacunas entregadas.

En el caso del SRS, el trabajador debe dar de alta una entrega de vacunas procedente del SNS, cuyos datos son: su ID, la fecha en la que se recibe, el tipo de vacuna, la ID del lote del que procede, la cantidad de vacunas y el grupo prioritario para el que se hará la entrega. Además, se encargará de administrar las vacunas a sus respectivos pacientes, donde habrá que registrar los datos de este, la fecha de la vacunación, el tipo de vacuna y el número de la dosis que se le administra. Por último, podrá consultar las estadísticas de su comunidad autónoma, pudiendo revisar el número total de vacunas inoculadas, junto con el porcentaje de las vacunas recibidas.

## 2. Diseño del Programa
Una vez recogidos los requisitos, nos encargamos de construir la arquitectura del proyecto. Para ello, obtuvimos el diagrama UML que nos proporcionó nuestro cliente, y con el cual generamos el esqueleto del código que implementaríamos.  

## 3. Construcción del Programa 
Una vez creado el esqueleto, lo transformamos en un proyecto Maven con el objetivo de gestionar el proyecto en su totalidad, ya fuera las dependencias, manejar las "build", etc.

A continuación, para poder trabajar de forma independiente en el proyecto, se creó un repositorio en GitHub, desde donde se suben las modificaciones relacionadas con el proyecto, donde participan tanto los desarrolladores, como nuestro cliente. El proyecto se realizará en codigo Java, usando el Eclipse y el Apache Netbeans.



