package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.video.Video;
import aiss.vimeoMiner.models.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import java.util.List;

@Service
public class ChannelService {
    @Autowired
    VideoService service;

    @Autowired
    RestTemplate restTemplate;
    final String baseUri = "https://api.vimeo.com";

    public Channel getChannel(String id, Long maxVideos, Long maxComments) {
        String uri = baseUri + "/channels/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<Channel> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,Channel.class);
        Channel res = response.getBody();
        channelParser(res, maxVideos, maxComments);
        return res;
    }

    public void channelParser(Channel channel, Long maxVideos, Long maxComments) {
        List<Video> videos = service.getVideosChannel(channel.getId(), maxComments).stream().limit(maxVideos).toList();
        channel.getVideos().addAll(videos);
    }

}
