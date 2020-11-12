package net.javaguides.springboot.websocket.controller;

import net.javaguides.springboot.websocket.model.Peliculas;
import net.javaguides.springboot.websocket.repository.PeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
    @Autowired
    private PeliculasRepository pelisRep;

    @GetMapping("/all-pelis")
    public Flux<Peliculas> getPeliculas() {
        return pelisRep.findAll();
    }

    /*obtener peliculas* por id*/
    @GetMapping("/pelis/{id}")
    public Mono<Peliculas> obtenerRegistros(
            @PathVariable(value = "id") String id) {
        System.out.println(id);
        return pelisRep.findByUserCod(id);
    }

}
