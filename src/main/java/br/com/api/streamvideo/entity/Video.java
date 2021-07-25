package br.com.api.streamvideo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="video")
public class Video {

    @Id
    Long id;
    String titulo;
    String descricao;
    String url;

}
