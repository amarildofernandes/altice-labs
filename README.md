# LabSeq Sequence Calculator

Este é um projeto Java para calcular a sequência LabSeq e expor um serviço REST para recuperar os valores da sequência.

## Instruções de Execução com Docker

1. **Pré-requisitos:**
   - Certifique-se de ter o Docker instalado em sua máquina.

2. **Compilação do Projeto:**
   - Navegue até o diretório raiz do seu projeto Spring Boot.
   - Execute o seguinte comando para compilar o projeto:
     ```
     mvn clean package
     ```

3. **Construção da Imagem Docker:**
   - No diretório raiz do seu projeto, onde o arquivo `Dockerfile` está localizado.
   - Execute o seguinte comando para construir a imagem Docker:
     ```
     docker build -t app .
     ```

4. **Execução do Contêiner:**
   - Após a construção da imagem Docker, você pode iniciar um contêiner usando o seguinte comando:
     ```
     docker run -d -p 8080:8080 app
     ```

5. **Teste:**
   - Você pode acessar o seu serviço REST em `http://localhost:8080/labseq/{n}`, onde `{n}` é o índice da sequência LabSeq que você deseja calcular.

## API REST Documentação - Swagger

- A documentação da API REST está disponível em `http://localhost:8080/swagger-ui.html`, após iniciar o contêiner Docker.
