package br.com.VomHive.VomHive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

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
