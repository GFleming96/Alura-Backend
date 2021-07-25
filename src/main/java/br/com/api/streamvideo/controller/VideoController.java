package br.com.api.streamvideo.controller;

import br.com.api.streamvideo.entity.Video;
import br.com.api.streamvideo.service.IVideoService;
import br.com.api.streamvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("video")
public class VideoController implements IVideoController {

    IVideoService service;
    @Autowired
    public VideoController(VideoService service){
        this.service = service;
    }

    @Override
    @GetMapping
    public ResponseEntity exibirVideos() {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.exibirVideos()) ;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity exibirVideosById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.exibirVideosById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity criarVideo(@RequestBody Video video) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.criarVideo(video)) ;
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity atualizarVideo(@PathVariable Long id ,@RequestBody Video video) {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.atualizarVideo(id,video)) ;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity deletarVideo(@PathVariable Long id) {
        this.service.deletarVideo(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
