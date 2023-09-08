package gliprest.restcontroller;

import glipBack.services.VideoService;
import gliprest.dto.response.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/video")
public class VideoRestController {
    @Autowired
    private VideoService videoService;
    @GetMapping("")
    public List<VideoResponse> findAll(){
        System.out.println("hello");
        return videoService.findAll().stream().map(VideoResponse::new).collect(Collectors.toList());
    }
}
