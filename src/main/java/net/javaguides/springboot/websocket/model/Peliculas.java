package net.javaguides.springboot.websocket.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Peliculas")
public class Peliculas {
    @Id
    private String id = new ObjectId().toString();
    private String nombre, genero, idioma, fechaEstreno, duracion, clasificacion, resumen, link;

    public Peliculas() {
    }

    public Peliculas(String link,String id, String nombre, String genero, String idioma, String fecha_estreno, String duracion, String clasificacion, String resumen) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.idioma = idioma;
        this.fechaEstreno = fecha_estreno;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.resumen = resumen;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fecha_estreno) {
        this.fechaEstreno = fecha_estreno;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    public String getLink(){
        return link;
    }
    public void setLink(String link){
        this.link = link;
    }
}
