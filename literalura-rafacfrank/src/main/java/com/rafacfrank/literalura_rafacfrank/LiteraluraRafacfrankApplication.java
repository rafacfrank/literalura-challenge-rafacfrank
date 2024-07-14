package com.rafacfrank.literalura_rafacfrank;

import com.rafacfrank.literalura_rafacfrank.model.DadosLivros;
import com.rafacfrank.literalura_rafacfrank.service.ConsumoAPI;
import com.rafacfrank.literalura_rafacfrank.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraRafacfrankApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraRafacfrankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://gutendex.com/books/?search=dom+casmurro");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosLivros dados = conversor.obterDados(json, DadosLivros.class);
		System.out.println(dados);

	}
}
