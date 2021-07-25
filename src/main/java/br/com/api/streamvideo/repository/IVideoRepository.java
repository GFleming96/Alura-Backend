package br.com.api.streamvideo.repository;

import br.com.api.streamvideo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVideoRepository extends JpaRepository<Video,Long> {


}
