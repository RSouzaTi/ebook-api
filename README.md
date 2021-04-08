# ebook-api
Api  Java Rest - desafio

Como executar a aplicação
Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.

git clone 
cd ebook-api
mvn spring-boot:run
Acesse http://localhost:8080/books


# APIs endpoints
GET http://localhost:8080/books [lista todos os Livros]

POST http://localhost:8080/books [cadastra um novo Livro]

POST http://localhost:8080/books/{id}/reserve [Reserva um Livro pela ID]


Importando o projeto no Eclipse ou STS
No terminal, execute a seguinte operação:

mvn eclipse:eclipse
No Eclipse/STS, importe o projeto como projeto Maven.
