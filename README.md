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
    implementation 'net.serenity-bdd:serenity-core:3.6.23'
    testImplementation 'net.serenity-bdd:serenity-junit:3.6.23'
    testImplementation 'net.serenity-bdd:serenity-cucumber:3.6.23'
    testImplementation 'io.cucumber:cucumber-java:7.3.3'
    testImplementation 'io.cucumber:cucumber-junit:7.3.3'
    testImplementation 'io.github.bonigarcia:webdrivermanager:5.6.3'
    testImplementation 'junit:junit:4.13.2'
    implementation 'net.serenity-bdd:serenity-screenplay:3.6.23'
    implementation 'net.serenity-bdd:serenity-screenplay-webdriver:3.6.23'
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
