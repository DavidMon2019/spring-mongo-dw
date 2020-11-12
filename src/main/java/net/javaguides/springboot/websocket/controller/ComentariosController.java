package net.javaguides.springboot.websocket.controller;


import net.javaguides.springboot.websocket.model.Comentarios;
import net.javaguides.springboot.websocket.repository.ComentariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ComentariosController {

    @Autowired
    private ComentariosRepository comentRep;

    @PostMapping("/comment")
    @SendTo("/topic/comment")
    public Comentarios greeting(Comentarios message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Comentarios("Hello, " + HtmlUtils.htmlEscape(message.getComentario()) + "!");

//        return comentRep.save(message);
    }
}
