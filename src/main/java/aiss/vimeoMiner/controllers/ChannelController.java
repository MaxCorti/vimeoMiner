package aiss.vimeoMiner.controllers;

import aiss.vimeoMiner.models.channel.Channel;
import aiss.vimeoMiner.services.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/videoMiner")
public class ChannelController {

    @Autowired
    ChannelService service;

    // @Autowired
    // RestTemplate restTemplate;

    // final String vimeoMinerUri = "http://localhost:8080/vimeominer/channels";


    @GetMapping
    public List<Channel> findAllChannels(){
        return service.getAllChannels();
    }

    @GetMapping("/{id}")
    public Channel findOneChannel(String id) {
        return service.getOneChannel(id);
    }

}
