package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.caption.Caption;
import aiss.vimeoMiner.models.video.Video;
import aiss.vimeoMiner.models.video.VideoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class VideoService {
    @Autowired
    RestTemplate restTemplate;
    final String baseUri = "https://api.vimeo.com/channels/";

    public List<Video> getVideosChannel(String id) {
        String uri = baseUri + id + "/videos";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<VideoList> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,VideoList.class);
        VideoList videos = response.getBody();
        return videos.getVideos();
    }

}
