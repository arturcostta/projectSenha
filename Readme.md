# Api para validar senhas
Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

Nove ou mais caracteres

Ao menos 1 dígito

Ao menos 1 letra minúscula

Ao menos 1 letra maiúscula

Ao menos 1 caractere especial

Considere como especial os seguintes caracteres: !@#$%^&*()-+

Não possuir caracteres repetidos dentro do conjunto

### Instruçoes

Na raiz do projeto executar o comando: 
```shell    
./gradlew bootRun
```

Esperar a aplicaçao iniciar e acessar o endereço: http://localhost:8080/swagger-ui.html

### Soluçao

Foi criada uma api Rest utilizando Spring Boot, Java 11. 

Foi criado uma classe de controler para expor um metodo Get que vai receber a senha e retornar o resultado da validaçao

A logica da validacao foi escrita na classe de serviço SenhaService

A validaçao foi dividida em duas etapas, na primeira a string e varrida procurando caracteres repetidos, na segunda parte e utilizada expressao regular para validar cada uma das definicoes pedidas. 

(?=.*\d) contem um ou mais digitos

(?=.*[a-z]) contem uma ou mais letras minusculas

(?=.*[A-Z]) contem uma ou mais letras maiusculas

(?=.*[!#@$%&^*()-+]) contem um ou mais caracteres especiais

[0-9a-zA-Z!#@$%&^*()-+]{9,} contem ao menos nove dos caracteres mencionados


