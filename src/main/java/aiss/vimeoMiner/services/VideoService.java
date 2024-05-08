package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.caption.Caption;
import aiss.vimeoMiner.models.comment.Comment;
import aiss.vimeoMiner.models.video.Video;
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
    static RestTemplate restTemplate;
    final static String baseUri = "https://api.vimeo.com";

    public static List<Video> getVideosChannel(String id) {
        String uri = baseUri + "/channels/" + id + "/videos";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<Video[]> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,Video[].class);
        List<Video> videos = Arrays.stream(response.getBody()).toList();
        return videos;
    }

    public void videoParser(List<Video> videos) {
        for (Video v: videos)
            if (v != null) {
                String id = v.getId();
                String name = v.getName();
                String description = v.getDescription();
                String releaseTime = v.getReleaseTime();
                List<Caption> captions = CaptionService.getCaptionsVideo(id);
                // List<Comment> comments = CommentsService.getCommentsVideo(id);
            }
    }
}
