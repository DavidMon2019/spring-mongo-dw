package net.javaguides.springboot.websocket.repository;

import net.javaguides.springboot.websocket.model.Comentarios;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentariosRepository  extends ReactiveMongoRepository<Comentarios,String> {
    
}
