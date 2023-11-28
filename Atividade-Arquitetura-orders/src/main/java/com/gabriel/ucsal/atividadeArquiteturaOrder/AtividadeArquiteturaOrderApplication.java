package com.gabriel.ucsal.atividadeArquiteturaOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.gabriel.ucsal.atividadeArquiteturaOrder"})
public class AtividadeArquiteturaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeArquiteturaOrderApplication.class, args);
	}

}
