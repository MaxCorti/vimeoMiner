/*package aiss.vimeoMiner.controllers;


import aiss.vimeoMiner.models.channel.Channel;
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



    // @Autowired
    // RestTemplate restTemplate;

    // final String vimeoMinerUri = "http://localhost:8081/vimeominer/channels";


   // @GetMapping
  //  public List<Channel> findAllChannels(){
  //      return service.getAllChannels();
  //  }

  //  @GetMapping("/{id}")
  //  public Channel findOneChannel(String id) {
  //      return service.getOneChannel(id);
  //  }



    // .............
    @Autowired
    ChannelService service;
    @Autowired
    RestTemplate restTemplate;
    final String videoMinerUri = "http://localhost:8080/api/videoMiner/videos";

    @GetMapping("/{id}")
    public Channel getOneChannel(@PathVariable String id) {
        return service.getOneChannel(id);
    }

    @PostMapping("/{id}")
    public Channel sendChannel(@PathVariable String id){
        Channel channel = service.getOneChannel(id);
        HttpEntity<Channel> request = new HttpEntity<>(channel);
        ResponseEntity<Channel> response = restTemplate.exchange(videoMinerUri, HttpMethod.POST,request, Channel.class);
        return response.getBody();
    }


}*/
