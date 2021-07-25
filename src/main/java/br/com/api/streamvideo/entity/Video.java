package br.com.api.streamvideo.entity;

import javax.persistence.*;

@Entity
@Table(name="video")
public class Video {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String titulo;
    String descricao;
    String url;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
