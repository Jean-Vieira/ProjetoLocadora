package jean.ProjetoLocadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "jean.ProjetoLocadora.Models")
@ComponentScan(basePackages = {"jean.*"})
public class ProjetoLocadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoLocadoraApplication.class, args);
	}

}
