# Instrucciones para ejecutar pruebas automatizadas con Serenity-BDD
Este documento proporciona una guía paso a paso para configurar y ejecutar pruebas automatizadas utilizando Serenity-BDD, así como instrucciones para visualizar los informes generados.

## 1. Prerequisitos

- Sistema Operativo: Windows 11
- Software IDE: IntelliJ IDEA 2022.3.3 (Community Edition)
- Java Versión: 11
- Gradle Version: 7.6.1

## 2. Comandos de instalación

Ejecuta el siguiente comando para ejecutar el codigo:

```shell
./gradlew test   
```

## 3. Instrucciones para ejecutar los test

- **Configuración del Entorno**
  
  Antes de ejecutar las pruebas, asegúrate de tener instalado IntelliJ y de haber configurado el proyecto para usar Karate. Si aún no has configurado Karate en tu proyecto, sigue estos pasos:

  1. **Añadir dependencias de Serenity-BDD:** Edita el archivo `build.gradle` de tu proyecto (o el archivo de configuración correspondiente si estás utilizando otro sistema de gestión de proyectos) para incluir las dependencias de Serenity-BDD.

   ```groovy
    implementation group: 'net.serenity-bdd', name: 'serenity-core', version: '3.6.23'
    testImplementation group: 'net.serenity-bdd', name: 'serenity-junit', version: '3.6.23'
    testImplementation group: 'net.serenity-bdd', name: 'serenity-cucumber', version: '3.6.23'
    testImplementation 'io.cucumber:cucumber-java:7.3.3'
    testImplementation 'io.cucumber:cucumber-junit:7.3.3'
    testImplementation 'io.github.bonigarcia:webdrivermanager:5.7.0'
    testImplementation 'junit:junit:4.13.2'
    implementation group: 'net.serenity-bdd', name: 'serenity-screenplay', version: '3.6.23'
    implementation group: 'net.serenity-bdd', name: 'serenity-screenplay-webdriver', version: '3.6.23'
    implementation 'com.opencsv:opencsv:5.6'
    ```

  2. **Sincronizar dependencias:** Asegúrate de sincronizar las dependencias en IntelliJ para que el proyecto reconozca Serenity-BDD.

- **Ejecución de las Pruebas**

  Para ejecutar las pruebas automatizadas, sigue estos pasos:

  1. **Navegar al paquete de pruebas:** Dirígete al paquete `org.nttdata` dentro de tu proyecto, donde encontrarás `runners` con la clase `RunnerTest`.

  2. **Ejecutar `RunnerTest`:** Haz clic derecho en la clase `RunnerTest` y selecciona `Run 'RunnerTest'`. Esto ejecutará las pruebas definidas en el archivo `shop.feature`.

- **Visualización de Reportes**

  Los informes generados por Serenity-BDD se puede ver de la siguiente manera:

  1. **Acceso directo a los archivos de reporte:**

     - Navega a la carpeta `build` generada en la raíz del proyecto.
     - Dentro de `build`, localiza y abre la carpeta `reports`.
     - Busca el archivo `index.html`.
     - Haz clic derecho en el archivo y selecciona `Open in >`, luego elige Google Chrome para ver el informe.

Siguiendo estos pasos, podrás configurar, ejecutar tus pruebas automatizadas con Karate, y visualizar los informes generados para analizar los resultados de tus pruebas.

## 4. Ingreso de Datos mediante Archivo CSV

Para facilitar el ingreso o actualización de los datos necesarios para el sistema, se utiliza un archivo en formato CSV (`data.csv`). A continuación, se detallan los pasos y el formato requerido para editar este archivo correctamente.

### Ubicación del Archivo

El archivo `data.csv` se encuentra ubicado en la siguiente ruta del proyecto src\test\resources


Es importante asegurarse de que cualquier cambio se realice directamente en este archivo y en la ubicación especificada.

### Cómo Editar el Archivo CSV

Para agregar nuevos datos o modificar los existentes en el archivo `data.csv`, sigue estos pasos:

1. Abre el archivo `data.csv` con un editor de texto plano (como Notepad) o con una aplicación de hojas de cálculo (como Microsoft Excel o Google Sheets). Si usas una aplicación de hojas de cálculo, asegúrate de guardar el archivo en formato CSV después de realizar los cambios.

2. Cada línea del archivo representa un conjunto de datos específico. El formato debe seguir estrictamente el siguiente orden de columnas:
   - **Usuario (user)**
   - **Contraseña (password)**
   - **Nombre (firstName)**
   - **Apellido (lastName)**
   - **Código Postal (ZIP)**

   Por ejemplo, para ingresar un nuevo usuario, debes agregar una línea con los datos correspondientes, siguiendo el formato mencionado:

- usuario_ejemplo,contraseña123,Juan,Pérez,00000

3. Asegúrate de no dejar espacios adicionales entre los datos y de utilizar comas para separar cada valor. No se deben agregar comillas a menos que formen parte del dato en sí.

4. Una vez que hayas terminado de editar o agregar la información deseada, guarda los cambios en el archivo. Si estás utilizando una aplicación de hojas de cálculo, recuerda exportar o guardar el archivo en el formato CSV.

### Ejemplo de Datos en el Archivo CSV

A continuación, se muestra un ejemplo de cómo se verían los datos dentro del archivo `data.csv`:

- standard_user,secret_sauce,Lenin,Basantes,170101
- usuario_ejemplo,contraseña123,Juan,Pérez,00000


Al seguir estos pasos y recomendaciones, podrás asegurar que el archivo CSV esté correctamente formateado y listo para ser utilizado por el sistema.
