package aiss.vimeoMiner.controllers;

import aiss.vimeoMiner.models.Video;
import aiss.vimeoMiner.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/vimeoMiner")
public class VideoController {
    @Autowired
    VideoService service;
    @Autowired
    RestTemplate restTemplate;
    final String videoMinerUri = "http://localhost:8080/api/videoMiner/videos";
    @GetMapping("/{id}")
    public Video getOneVideo(@PathVariable String id) {
        return service.getOneVideo(id);
    }
    @PostMapping("/{id}")
    public Video sendVideo(@PathVariable String id){
        Video video = service.getOneVideo(id);
        HttpEntity<Video> request = new HttpEntity<>(video);
        ResponseEntity<Video> response = restTemplate.exchange(videoMinerUri, HttpMethod.POST,request, Video.class);
        return response.getBody();
    }
}
