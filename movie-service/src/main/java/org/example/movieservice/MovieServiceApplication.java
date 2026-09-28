package org.example.movieservice;

import org.example.movieservice.models.entities.Movie;
import org.example.movieservice.models.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@EnableCaching
public class MovieServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner initData(MovieRepository movieRepository) {
//        return args -> {
//            if (movieRepository.count() == 0) {
//                movieRepository.saveAll(List.of(
//                        new Movie(null, "Harry Potter", "Newest version", new BigDecimal("200000"), 30),
//                        new Movie(null, "The Odyssey", "For the history", new BigDecimal("150000"), 10),
//                        new Movie(null, "Doraemon", "For all ages", new BigDecimal("90000"), 5)
//                ));
//            }
//        };
//    }
}

