package net.javaguides.springboot.websocket.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Comentarios")
public class Comentarios {

    @Id
    private String id = new ObjectId().toString();
    private String Usuario, Comentario, IdPelicula;

    public Comentarios(String s) {
    }

    public Comentarios(String id, String usuario, String comentario, String idPelicula) {
        this.id = id;
        Usuario = usuario;
        Comentario = comentario;
        IdPelicula = idPelicula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public String getIdPelicula() {
        return IdPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        IdPelicula = idPelicula;
    }
}