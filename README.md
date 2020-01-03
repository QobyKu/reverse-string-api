## Boot up instructions

Open your favorite Terminal and run these commands.

In the directory where you wish to store this project, clone it using Git:
```sh
$ git clone https://github.com/QobyKu/reverse-string-api
```

cd into the project folder and run with (note that this requires you to have Maven installed):
```sh
$ mvn spring-boot:run
```

The API service is now good to go! It will accept HTTP GET requests at:
```sh
$ http://localhost:8080/reverse/<string>
```
and return `<string>` reversed as the response. e.g., http://localhost:8080/reverse/orangepeel returns leepegnaro. 
