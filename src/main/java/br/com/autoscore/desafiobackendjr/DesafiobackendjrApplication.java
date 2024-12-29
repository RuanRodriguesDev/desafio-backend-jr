package br.com.autoscore.desafiobackendjr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafiobackendjrApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiobackendjrApplication.class, args);
	}

}
