# TallerClientesServicios-AREM2020

This is a server that supports multiple non-concurrent requests, it can return html pages and images

## Running the project

 In order to use this project, first clone this repository or download the project.

After downloading enter the root folder and excecute the following commands

```
mvn package
java -cp target/Taller-Clientes-Servicios-1.0-SNAPSHOT.jar edu.escuelaing.arem.tallerCS.Server
```
In order to generate the documentation of the project use the command 

```
mvn javadoc:javadoc
```
This command will generate the documentation in the folder 
```
 /target/site/apidocs/
 ```
### Prerequisites

You will need maven and java installed on your machine to employ this program

## Running the tests

In order to run the automated tests for this project execute the following command.

```
mvn test
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Daniel Mauricio Cifuentes** - *Escuela Colombiana de Ingeniería Julio Garavito* 

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE.md](LICENSE.md) file for details

