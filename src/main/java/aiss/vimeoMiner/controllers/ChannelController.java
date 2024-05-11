package aiss.vimeoMiner.controllers;

import aiss.vimeoMiner.models.channel.Channel;
import aiss.vimeoMiner.services.ChannelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/vimeoMiner")
public class ChannelController {
    @Autowired
    ChannelService service;
    @Autowired
    RestTemplate restTemplate;
    final String videoMinerUri = "http://localhost:8080/videominer/channels";

    @GetMapping("/{id}")
    public Channel getChannel(@PathVariable String id) {
        return service.getChannel(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{id}")
    public Channel sendChannel(@PathVariable String id){
        Channel canal = service.getChannel(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Channel> request = new HttpEntity<>(canal, headers);
        ResponseEntity<Channel> response = restTemplate.exchange(videoMinerUri,
                HttpMethod.POST,request,Channel.class);
        return response.getBody();
    }
}
