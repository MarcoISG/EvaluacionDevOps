# EvaluacionDevOps - Microservicio de Préstamos


## Descripción del proyecto

Este proyecto trata de un microservicio hecho en Spring Boot para gestionar préstamos de libros en una biblioteca.

La idea de este repositorio fue tomar ese proyecto como base para aplicar un flujo de trabajo con Git, GitHub y GitHub Actions, para poder trabajar con ramas, commits, pull requests y una automatización básica.


## Tecnologías utilizadas

- Java
- Spring Boot
- Maven
- Git
- GitHub
- GitHub Actions


## Estrategia de trabajo

Para este proyecto trabajamos con una estrategia basada en **GitFlow simplificado**.


Las ramas que se usaron fueron:

- `main`: rama principal y estable
- `develop`: rama donde se integraron los cambios antes de pasarlos a la versión final
- `feature/<nombre>`: ramas para nuevas funcionalidades
- `hotfix/<nombre>`: ramas para corregir errores puntuales


## ¿Por qué usamos esta estrategia?


Elegimos esta forma de trabajo porque nos ayudó a tener más orden en el proyecto y a no mezclar todos los cambios en una sola rama.

Además, nos permitió separar mejor:

- la parte estable del proyecto
- las funcionalidades nuevas
- las correcciones
- la integración final de los cambios

También sirvió para dejar más claro qué se hizo en cada rama y cómo se fue armando el trabajo.


## Flujo de trabajo aplicado


El flujo que seguimos fue este:


1. Se trabajó con `main` como rama principal.
2. Se usó `develop` como rama de integración.
3. Cada funcionalidad nueva se hizo en una rama `feature`.
4. La corrección puntual se trabajó en una rama `hotfix`.
5. Los cambios se integraron mediante **Pull Requests** hacia `develop`.
6. Al final, después de revisar los cambios, `develop` se integró en `main`.

## Naming de ramas


Para mantener orden, se usaron nombres de ramas relacionados con cada cambio realizado:


- `feature/listar-prestamo`
- `feature/registrar-prestamo`
- `hotfix/corregir-actualizacion-prestamo`
- `feature/documentacion-readme`


## Convención de commits

Se usó una convención simple para que el historial se entendiera mejor:


- `feat:` para nuevas funcionalidades
- `fix:` para correcciones
- `docs:` para documentación
- `chore:` para tareas generales de configuración o mantenimiento

### Ejemplos

- `feat: agregar listado ordenado de prestamos`
- `feat: agregar validacion en registro de prestamos`
- `fix: corregir actualizacion de prestamos por id`
- `docs: agregar documentacion del repositorio`


## Flujo de merge

Los cambios no se incorporaron directamente a la rama principal, sino mediante **Pull Requests**.


La idea fue seguir este orden:

- las ramas `feature` y `hotfix` se integran primero en `develop`
- una vez revisados los cambios, `develop` se integra en `main`


De esta forma, el historial queda más claro y es más fácil seguir los cambios realizados durante el proyecto.


## Estrategia de revisión

La revisión se hizo mediante Pull Requests, considerando principalmente:

- que la rama tuviera un nombre correcto
- que el cambio tuviera un objetivo claro
- que el commit fuera entendible
- que la integración se hiciera hacia la rama correspondiente

Esto ayudó a mantener más orden durante el desarrollo y a revisar los cambios antes de integrarlos.


## Funcionalidades desarrolladas

Durante el trabajo colaborativo se desarrollaron las siguientes ramas:

### Feature 1

`feature/listar-prestamo`


En esta rama se agregó una mejora para listar los préstamos de forma ordenada.

### Feature 2
`feature/registrar-prestamo`

En esta rama se agregó una validación básica al momento de registrar préstamos.

### Hotfix
`hotfix/corregir-actualizacion-prestamo`

En esta rama se corrigió un problema relacionado con la actualización de préstamos por id.


## GitHub Actions

Se configuró una acción básica de GitHub Actions para automatizar una verificación simple del proyecto.


Esta automatización se ejecuta en:

- cada `push` a `develop`
- cada `pull request` hacia `main`


Con esto se apoya de forma básica el flujo de integración continua solicitado en la evaluación.


## Buenas prácticas aplicadas

Durante el desarrollo se aplicaron las siguientes buenas prácticas:

- uso de ramas separadas según el tipo de cambio
- commits con mensajes claros
- integración mediante Pull Requests
- separación entre rama estable y rama de desarrollo
- exclusión de archivos innecesarios mediante `.gitignore`


## Uso de IA

- Se utilizó IA solo como apoyo para ordenar ideas y mejorar parte de la redacción de la documentación.
- El contenido fue elaborado por el equipo y la IA se usó únicamente como apoyo.


## Integrantes

- Marco Suarez
- Bárbara Tolorza

