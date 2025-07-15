<h1>Place Service</h1>

API para gerenciar lugares (CRUD) que faz parte do desafio para pessoas denvolvedoras nackend que se candidatam para a ClickBus

<h2>Tecnologias</h2>

<ul>
<li>Spring Boot</li>
<li>Spring WebFlux</li>
<li>Spring Data + R2DBC</li>
</ul>

<h2>Como Executar</h2>

Localmente

<ul>
<li>Clonar Repositório Git</li>
<li>Construir Projeto</li>
</ul>

```bash
./mvnw clean package
```
<ul><li>Executar</li></ul>

```bash
java -jar place-service/target/place-service-0.0.1-SNAPSHOT.jar
```
A API poderá ser acessada em localhost:8080.

<h2>API Endpoints</h2>

para fazer as requisições HTTP abaixo, foi utilizada a ferramenta httpie:

<ul><li>POST /places</li></ul>

```bash
http POST :8080/places name="Place" state="State"

HTTP/1.1 200 OK
Content-Length: 129
Content-Type: application/json

{
  "createdAT": "2025-07-20T12:00:08.246132",
  "name": "Place",
  "slug": "place",
  "state": "State",
  "updatedAt": "2025-07-20T12:00:08.246132"

}
```
