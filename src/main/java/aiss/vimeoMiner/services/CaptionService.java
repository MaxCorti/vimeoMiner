package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.caption.Caption;
import aiss.vimeoMiner.models.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CaptionService {

    @Autowired
    RestTemplate restTemplate;
    final String baseUri = "https://api.vimeo.com/";


    public List<Caption> getAllCaptions(){
        String uri = baseUri + "/videos/" + Video.uri + "/texttracks";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");

        HttpEntity<String[]> request = new HttpEntity<>(null,headers);
        ResponseEntity<Caption[]> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,Caption[].class);
        List<Caption> captions = Arrays.stream(response.getBody()).toList();
        return captions;

    }

    @GetMapping("/{id}")
    public Caption getOneCaption(String id) {
        String uri = baseUri + "/videos/" + Video.uri + "/texttracks/" +  id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<Caption> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,Caption.class);
        Caption caption = response.getBody();
        return caption;
    }

}