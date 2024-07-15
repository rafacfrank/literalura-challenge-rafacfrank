package com.rafacfrank.literalura_rafacfrank;

import com.rafacfrank.literalura_rafacfrank.model.DadosLivros;
import com.rafacfrank.literalura_rafacfrank.service.ConsumoAPI;
import com.rafacfrank.literalura_rafacfrank.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();
	}
}
}
