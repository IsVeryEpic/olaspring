# Olaspring

Primeira aplicação Spring Boot da UFCD 10791. Java 25, Spring Boot 4.1.1 e Maven Wrapper 3.9.16.

## Executar

No Windows: `mvnw.cmd spring-boot:run`. Compilar e testar: `mvnw.cmd clean package`.

## Endpoints

- `/ola`: saudação à turma.
- `/saudacao?nome=Giovanni`: saudação personalizada; sem nome, usa visitante.
- `/api/aluno`: um aluno em JSON.
- `/api/turma`: três alunos de exemplo em JSON.
- `/api/dado`: número aleatório de 1 a 6 e data/hora.

A raiz `/` não tem controlador e devolve 404. Porta padrão: 8080.
Para experimentar outra porta, usar `server.port=8081` em `application.properties`.

Projeto preparado e verificado com apoio do ChatGPT/Codex.
