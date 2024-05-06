package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import java.util.Arrays;
import java.util.List;

@Service
public class ChannelService {

    @Autowired
    RestTemplate restTemplate;
    final String baseUri = "https://api.vimeo.com";

    @GetMapping
    public List<Channel> getAllChannels() {
        String uri = baseUri + "/channels";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<Channel[]> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,Channel[].class);
        List<Channel> channels = Arrays.stream(response.getBody()).toList();
        return channels;
    }

    @GetMapping("/{id}")
    public Channel getOneChannel(String id) {
        String uri = baseUri + "/channels/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<Channel> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,Channel.class);
        Channel channel = response.getBody();
        return channel;
    }

}
