package ru.kazakovushka.edu.musiclibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.kazakovushka.edu.musiclibrary.repository.GenreRepository;
import ru.kazakovushka.edu.musiclibrary.repository.SingerRepository;
import ru.kazakovushka.edu.musiclibrary.repository.SongRepository;
import ru.kazakovushka.edu.musiclibrary.service.*;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2
public class MusiclibraryApplication {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public GenreService genreService(GenreRepository genreRepository) {
        return new GenreServiceImpl(genreRepository);
    }

    @Bean
    public SongService songService(SongRepository songRepository) {
        return new SongServiceImpl(songRepository);
    }


    @Bean
    public SingerService singerService(SingerRepository singerRepository) {
        return new SingerServiceImpl(singerRepository);
    }

    public static void main(String[] args) {
        SpringApplication.run(MusiclibraryApplication.class, args);
    }


}
