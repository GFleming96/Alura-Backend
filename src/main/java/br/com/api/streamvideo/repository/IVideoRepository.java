package br.com.api.streamvideo.repository;

import br.com.api.streamvideo.entity.Video;

import java.util.List;

public interface IVideoRepository {

    List<Video> exibirVideos();
    Video exibirVideosById(Long id);
    Video criarVideo(Video video);
    Video atualizarVideo(Video video);
    void deletarVideo(Long id);

}
