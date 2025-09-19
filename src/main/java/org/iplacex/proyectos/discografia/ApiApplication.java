package org.iplacex.proyectos.discografia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {
    "org.iplacex.proyectos.discografia",
    "org.iplacex.proyectos.artistas",
    "org.iplacex.proyectos.discos"
})
@EnableMongoRepositories(basePackages = {
    "org.iplacex.proyectos.artistas",
    "org.iplacex.proyectos.discos"
})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
