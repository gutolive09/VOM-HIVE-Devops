# VomHive

|        Integrantes do projeto
|Alunos                       |Rm        |Salas                    |
|-----------------------------|----------|-------------------------|
| Gabriel Siqueira Rodrigues  | RM98626  | 2TDSPF                  |
| Gustavo de Oliveira Azevedo | RM550548 | 2TDSPF                  |
| Isabella Jorge Ferreira     | RM552329 | 2TDSPF                  |
| Mateus Mantovani Araújo     | RM98524  | 2TDSPF                  |
| Juan de Godoy               | RM551408 | 2TDSPF                  |


# Iniciando a aplicação

- Para pegar o arquivo, clone o repositório ná sua maquina utilizando o comando a seguir:
```
https://github.com/Mmateus106/Challenge-Sprint3.git
```
 Ao abrir o projeto, abra o arquivo ".env" no projeto e coloque os dados de conexão do banco de dados.
 É necessário realizar este passo para realizar a conexão com o banco da oracle!
```
DB_JDBC= "URL do seu banco"
DB_USERNAME= "Seu usuário do banco"
DB_PASSWORD= "Sua senha do banco"
```
- Para buildar a imagem é necessário rodar o seguinte comando
```
docker build -t vomhive-app .  
```
Depois execute o seguinte comando para executar a aplicação em um container
```
docker run -p 8080:80 vomhive-app
```
Lembrando que é essencial ter o docker instalado para executar a aplicação localmente!

# Links do vídeo Pitch / Aplicação

- https://youtu.be/BWO1JMqFGtc
