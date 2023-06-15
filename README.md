# Evidencia-1

Descripción:

El participante aplicará sus conocimientos obtenidos en el curso para crear un programa que simulará un sistema de administración de citas para un consultorio clínico. El programa deberá poder realizar las siguientes acciones: • Dar de alta doctores. • Dar de alta pacientes. • Crear una cita con fecha y hora. • Relacionar una cita con un doctor y un paciente. • Tener control de acceso mediante administradores, esto es, solo ciertos usuarios podrán acceder al sistema mediante un identificador y una contraseña. La evidencia se dividirá en tres etapas: • Avance 1: ambiente de desarrollo, diagrama de flujo. • Avance 2: diseño del programa, diagrama de clases y pseudocódigo de la aplicación. • Entrega final: documentación de uso.

Objetivo:

Que el estudiante aplique los conocimientos adquiridos durante la clase creando un programa en Java que simulará un sistema de administración de citas para un consultorio clínico. Requerimientos:

Kit de desarrollo de Java 11 instalado y configurado.
Entorno integrado de desarrollo IntelliJ IDEA instalado y configurado.
Sistema de control de versiones Git instalado y configurado.
Cuenta en un servicio de repositorios en línea.
INSTRUCCIONES

NOTA: Aunque en cada avance se piden puntos específicos para calificar la entrega, tanto el profesor como los participantes deben estar conscientes que se espera un avance continuo de programación, por lo que en ningún momento se debe aplazar el inicio de la programación del programa hasta las últimas semanas del curso.

A continuación se describen los requerimientos del programa: El producto final será un programa que simulará un sistema de administración de citas con las siguientes funcionalidades: • Dar de alta doctores: se deberán poder dar de alta los doctores del consultorio médico, los datos básicos serán: • Identificador único. • Nombre completo. • Especialidad. • Dar de alta pacientes: se deberán poder registrar los pacientes que acudan al consultorio médico, los datos básicos serán: • Identificador único. • Nombre completo. • Crear una cita con fecha y hora: se deberán poder crear múltiples citas, los datos básicos serán: • Identificador único. • Fecha y hora de la cita. • Motivo de la cita. • Relacionar una cita con un doctor y un paciente: cada una de las citas creadas deberá estar relacionada con un doctor y un paciente. • Tener control de acceso mediante administradores: solo ciertos usuarios podrán acceder al sistema mediante un identificador y una contraseña. • Toda la información deberá ser almacenada en archivos de texto plano con formato CSV, o en su defecto utilizar algún formato más avanzado como JSON o XML. La aplicación será totalmente portable, es decir, que se podrá ejecutar en cualquier sistema operativo que tenga instalado Java, para ello deberá ser configurada para compilarse como un archivo tipo FAT JAR y garantizar que todas las dependencias estarán incluidas. La aplicación contará con el manejo correcto de recursos y excepciones, es decir, si ocurre una excepción, el programa no saldrá, sino que seguirá ejecutándose y mostrará el mensaje de error en la pantalla.

Avance 1

Ambiente de desarrollo Como parte de la primera entrega, tendrás que crear tu ambiente de desarrollo donde realizarás el programa. • Instalar JDK 11 en su versión más reciente. • Instalar y configurar IntelliJ IDEA. • Instalar y configurar el sistema de control de versiones Git. • Crear una cuenta en GitHub como usuario normal o estudiante (https://education.github.com/) con tu cuenta de correo. • Crear un repositorio en el servicio de repositorios en línea, una vez completado este punto se incluirá la liga del repositorio donde se recibirá el código en la entrega final. Los requerimientos del repositorio son los siguientes: • Archivo README.md con las siguientes secciones: • Instalación y configuración. • Uso del programa. • Créditos. • Licencia. • Archivo .gitignore para ignorar los archivos .class, .swp y los archivos de proyecto de tu IDE seleccionado. • Crear el branch principal master. • Crear un branch llamado develop donde se registrarán todos los cambios en tu código.
Diagrama de flujo Elaborar un diagrama de flujo del programa que cubra los requerimientos previamente mencionados. Criterios de evaluación:
Criterio Puntaje

Ambiente de desarrollo configurado. 40
Diagrama de flujo. 60 Entregable:
Realizar un reporte explicando la configuración del ambiente de desarrollo, incluir capturas de pantalla como evidencia. Realizar el diagrama de flujo e incluirlo en el reporte. Incluir la liga al repositorio donde se subirá el código de la evidencia final. • Documento en formato DOC, DOCX o PDF. • Incluir la liga al repositorio en el reporte realizado.

Avance 2

Diseño del programa (diagrama de clases) Después de avanzar en los conocimientos sobre programación orientada a objetos, se realizará un diagrama de clases donde se desglosarán los componentes de la aplicación. Se deberán estructurar los componentes de acuerdo con las funcionalidades del sistema, por ejemplo: • Clase Principal. • Clase para Doctor. • Clase para Paciente. • Clase para Cita. El reto es pensar en otras clases, tanto abstractas como concretas, así como posibles interfaces que sean necesarias para implementar correctamente las funcionalidades del programa, no olvidar tomar en cuenta los conceptos de herencia y polimorfismo.
Pseudocódigo Con base en el diagrama, parte de la entrega 1, traducirlo a pseudocódigo. Si es necesario, mejorar el diagrama de flujo.
Criterios de evaluación:

Criterio Puntaje

Diagrama de clases. 60
Pseudocódigo. 40 Entregable: Realizar un reporte explicando la implementación del diagrama de clases, incluir capturas de pantalla como evidencia. Realizar el pseudocódigo e incluirlo en el reporte. • Documento en formato DOC, DOCX o PDF. • Incluir la liga al repositorio en el reporte realizado. NOTA: En este punto el participante deberá, por muy tarde, comenzar la programación de la aplicación.
