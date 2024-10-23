package pe.edu.cibertec.dswii_ef_cache_castro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DswiiEfCacheCastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheCastroApplication.class, args);
	}

}
