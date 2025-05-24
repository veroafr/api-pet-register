package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(PetRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Pet("Rex", "cachorro", "Labrador", 5, "João")));
      log.info("Preloading " + repository.save(new Pet("Mimi", "gato", "Persa", 3, "Ana")));
    };
  }
}
