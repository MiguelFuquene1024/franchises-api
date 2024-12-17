# Franchises-api

## Api de Franquicias, Sucursales y Productos

## Autor

- Miguel Angel Fuquene Arias

## Contrucción

- IntelliJ-Editor de código y ambiente de desarrollo(IDE)
- Maven-gestor de dependencias
- SpringBoot- Framework creación de APIs
- MySql- Base de datos
- Postman- Herramienta para envio de solicitudes a servidores web y recibir las respuestas correspondientes.
- Docker - Plataforma de contenedores para desplegar y prueba del proyecto como segunda opcion.


## Requerimientos
- Java 17 o superior
- Tener un Ide como IntelliJ, Eclipse o STS
- Spring framework
- Maven 3.0 o superior
- Tener instalado Postman para envio de peticiones


## Pasos para ejecucion

- En su directorio de preferencia ejecute el comando git clone https://github.com/MiguelFuquene1024/franchises-api.git
- Acceda a su IDE por ejemplo IntelliJ, busque la ruta donde clono el repositorio y abra el proyecto.
- Abra la terminal y ejecute los siguientes comandos
  . mvn clean
  . mvn compile
- Luego corra la aplicación,deberá verse como la imagen a continuación:

![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/ApiRunning.png)


-  En esta api podra crear franquicias,sucursales y productos sin embargo antes de continuar tenga en cuenta las siguientes reglas:
- No podrá crear un producto si no crea una sucursal antes.
- No podrá crear una sucursal si no ha creado una franquicia antes.


- Para crear una nueva franquicia abra postman, cree una nueva petición de tipo POST, pegue la siguiente url (http://localhost:8080/franchise) y en el body haga un JSON con nombre.
- Debe obtener una respuesta como la que se muestra en la siguiente imagen:


![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/CreateFranchise.png)


- Para crear una nueva sucursal abra postman, cree una nueva petición de tipo POST, pegue la siguiente url (http://localhost:8080/branch) y en el body haga un JSON con nombre y objeto en formato JSON llamado franchise con un id en su interior como lo meutra la siguiente imagen.
- Debe obtener una respuesta como la que se muestra en la siguiente imagen:

![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/CreateBranch.png)


- Para crear una nuevo producto abra postman, cree una nueva petición de tipo POST, pegue la siguiente url (http://localhost:8080/producto) y en el body haga un JSON con nombre.
- Debe obtener una respuesta como la que se muestra en la siguiente imagen:

![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/CreateProduct.png)

-   Para actualizar la cantidad de un producto en especifico, , cree una nueva petición de tipo PUT, pegue la siguiente url (http://localhost:8080/producto/) seguido del id del producto que desea actualizar y en el body haga un JSON con el atributo amount y el valor por el que desea actualizarlo.

![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/UpdateProduct.png)


- Si no sabe el id del producto puede tambien consultar todos los productos existente con el siguiente endpoint en postman:
  - Peticion tipo GET http://localhost:8080/product

 ![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/GetProducts.png)
- Asi mismo puede consultar tambien las sucursales y las franquicias con los siguientes:
  - Peticion Franquicias tipo GET http://localhost:8080/franchise
  
  ![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/GetFranchises.png)
  
  - Peticion Sucursales tipo GET http://localhost:8080/branch
  
  ![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/GetBranches.png)
  
- Tambien puede consultar sobre una franquicia,sucursal o producto añadiendole un / seguido del id que quiera consultar.

- Para eliminar el producto de una sucursal, cree una nueva petición de tipo DELETE, peque la siguiente url (http://localhost:8080/producto/) seguido del id del producto que desea borrar.

![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/DeleteProduct.png)

- Finalmente si quiere saber cual es el producto que mas stock tiene por sucursal para una francquicia puntual, cree una nueva petición de tipo GET, pegue la siguiente url (http://localhost:8080/product/getQuery/)seguido del id de la franquicia que desea consultar.
- Debera tener algo como en la siguiente imagen.
  
![](https://github.com/MiguelFuquene1024/franchises-api/blob/master/IMG/GetQuery.png)

# DockerFile
- IMPORTANTE: Debe tener Docker instalado previamente.
- Si se quiere correr el proyecto con docker debemos realizar los siguientes pasos:
  - Entramos al cmd y nos ubicamos en la raiz de proyecto, alli ejecutamos el comando "mvn package", este nos compilara el proyecto y creara el archivo .jar llamado spring-api-docker-franchise.jar
  - Luego alli mismo ejecutamos el comando "docker build -t spring-api-docker-franchise.jar .", este creara uan docker imagen a partir del jar que se genero y a partir de las instrucciones dadas en el archivo Dockerdile del proyecto.
  - Podemos ejecutar "docker image ls" y se nos mostrara las docker images que tengamos, debera haber una llamada spring-api-dcoker-franchise.jar
  - Por ultimo para correr esta imagen  ejecutamos "docker run -p 9090:8080 spring-api-docker-franchise.jar" este levantara la imagen creada en el puerto 9090.
  - Probamos cualquier endpoint mencionado anteriormente cambiando el puerto por el 9090 en vez del 8080 y funcionara igualmente.


