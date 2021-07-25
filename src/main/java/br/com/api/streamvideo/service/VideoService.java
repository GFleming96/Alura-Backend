package br.com.api.streamvideo.service;

import br.com.api.streamvideo.entity.Video;
import br.com.api.streamvideo.repository.IVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoService implements IVideoService {

    IVideoRepository repository;
    @Autowired
    public VideoService(IVideoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Video> exibirVideos() {
        return this.repository.findAll();
    }

    @Override
    public Video exibirVideosById(Long id) {
        return this.repository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public Video criarVideo(Video video) {
        return this.repository.save(video);
    }

    @Override
    public Video atualizarVideo(Long id, Video video) {
        Video videoDB = this.repository.findById(id).orElseThrow(NullPointerException::new);
        videoDB.setDescricao(video.getDescricao());
        videoDB.setTitulo(video.getTitulo());
        videoDB.setUrl(video.getUrl());
        return this.repository.save(videoDB);
    }

    @Override
    public void deletarVideo(Long id) {
        this.repository.deleteById(id);
    }
}
