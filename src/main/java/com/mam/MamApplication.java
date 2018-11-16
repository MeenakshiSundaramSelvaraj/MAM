package com.mam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MamApplication.class, args);
	}
}
//DataBase   :: https://www.w3resource.com/sql-exercises/movie-database-exercise/joins-exercises-on-movie-database.php
//   :https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
