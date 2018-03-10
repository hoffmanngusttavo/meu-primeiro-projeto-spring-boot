package com.hoffmann.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MeuPrimeiroProjetoApplicationTests {

	@Value("${paginacao.qtd-item-pagina}")
	private int qtdItens;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testQtdItens() {
		
		assertEquals(100, qtdItens);
		
	}

}
