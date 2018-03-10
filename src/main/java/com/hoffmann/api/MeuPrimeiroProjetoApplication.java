package com.hoffmann.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hoffmann.api.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {

	@Value("${paginacao.qtd-item-pagina}")
	private int qtdItensPagina;

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
		System.out.println("teste de algo");
	}

	@Bean
	public CommandLineRunner runner() {

		String encoded = SenhaUtils.gerarBcrypt("123456");
		
		System.out.println(encoded);
		
		return args -> {
			System.out.println("passou a quantidade" + qtdItensPagina);
		};
	}

}
