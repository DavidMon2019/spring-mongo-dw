package net.javaguides.springboot.websocket.repository;

import net.javaguides.springboot.websocket.model.Peliculas;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PeliculasRepository extends ReactiveMongoRepository<Peliculas,String> {
    @Query("{ 'id': ?0}")
    Mono<Peliculas> findByUserCod(String id);

    @Tailable
    Flux<Peliculas> findWithTailableCursorBy();
}
