package aiss.vimeoMiner.controllers;

import aiss.vimeoMiner.models.channel.Channel;
import aiss.vimeoMiner.models.video.Video;
import aiss.vimeoMiner.services.ChannelService;
import aiss.vimeoMiner.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/vimeoMiner")
public class ChannelController {
    @Autowired
    ChannelService service;
    @Autowired
    RestTemplate restTemplate;
    final String videoMinerUri = "http://localhost:8080/api/videoMiner/videos";
    @GetMapping("/{id}")
    public Channel getChannel(@PathVariable String id) {
        return service.getChannel(id);
    }
    @PostMapping("/{id}")
    public Channel sendChannel(@PathVariable String id){
        Channel canal = service.getChannel(id);
        HttpEntity<Channel> request = new HttpEntity<>(canal);
        ResponseEntity<Channel> response = restTemplate.exchange(videoMinerUri, HttpMethod.POST,request, Channel.class);
        return response.getBody();
    }
}
