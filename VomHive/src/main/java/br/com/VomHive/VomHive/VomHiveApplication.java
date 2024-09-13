package br.com.VomHive.VomHive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
/*Sprint 3 - Requisitos:

Aplicação MVC inicial/parcial para solução proposta.
Nesta 3ª Sprint, a equipe precisa desenvolver uma aplicação web MVC que suporte a solução proposta. O grupo deve criar os seguintes artefatos:
Código fonte da aplicação (70 pts)

A aplicação deve utilizar oThymeleaf em conjunto com o framework Spring Boot
É importante que a solução de software já apresente templates dinâmicos
Integração com o banco de dados, pelos menos 2 CRUDS.
Vídeo com a apresentação da aplicação funcionando com duração máxima de  10 minutos (30 pts).
O vídeo deve abordar os seguintes tópicos:

Objetivo
Arquitetura da solução
Funcionamento da aplicação
Dificuldades encontradas até o momento
Próximos passos
Entrega

A entrega deve ser feita via repositório público do GitHub.*/
@EntityScan
@ComponentScan
@SpringBootApplication
public class VomHiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(VomHiveApplication.class, args);
	}
	@GetMapping(value = "/")
	public String index(){
		return "VOM-HIVE";
	}

}
