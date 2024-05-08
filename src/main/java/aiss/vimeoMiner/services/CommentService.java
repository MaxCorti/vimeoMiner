package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.comment.Comment;
import aiss.vimeoMiner.models.comment.CommentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    RestTemplate restTemplate;
    final String baseUri = "https://api.vimeo.com";


    public List<Comment> getCommentsVideo(String id){
        String uri = baseUri + "/videos/" + id + "/comments";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null,headers);
        ResponseEntity<CommentList> response = restTemplate.exchange(uri,
                HttpMethod.GET,request, CommentList.class);
        List<Comment> comments = response.getBody().getCommentList();
        return comments;
    }

}
