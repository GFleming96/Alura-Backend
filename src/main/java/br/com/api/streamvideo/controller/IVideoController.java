package br.com.api.streamvideo.controller;

import br.com.api.streamvideo.entity.Video;
import org.springframework.http.ResponseEntity;

public interface IVideoController {

    ResponseEntity exibirVideos();
    ResponseEntity exibirVideosById(Long id);
    ResponseEntity criarVideo(Video video);
    ResponseEntity atualizarVideo(Video video);
    ResponseEntity deletarVideo(Long id);

}
