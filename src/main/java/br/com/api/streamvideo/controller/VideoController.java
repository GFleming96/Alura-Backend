package br.com.api.streamvideo.controller;

import br.com.api.streamvideo.entity.Video;
import org.springframework.http.ResponseEntity;

public class VideoController implements IVideoController {

    @Override
    public ResponseEntity exibirVideos() {
        return null;
    }

    @Override
    public ResponseEntity exibirVideosById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity criarVideo(Video video) {
        return null;
    }

    @Override
    public ResponseEntity atualizarVideo(Video video) {
        return null;
    }

    @Override
    public ResponseEntity deletarVideo(Long id) {
        return null;
    }

}
