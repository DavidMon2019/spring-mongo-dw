package net.javaguides.springboot.websocket.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Comentarios")
public class Comentarios {

    @Id
    private String id = new ObjectId().toString();
    private String usuario, comentario, idPelicula;

    public Comentarios(String s) {
    }

    public Comentarios(String id, String usuario, String comentario, String idPelicula) {
        this.id = id;
        this.usuario = usuario;
        this.comentario = comentario;
        this.idPelicula = idPelicula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }
}