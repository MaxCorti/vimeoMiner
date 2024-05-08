package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.user.User;
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
public class UserService {

    @Autowired
    RestTemplate restTemplate;
    final String baseUri = "https://api.vimeo.com";

    @GetMapping
    public List<User> getAllUsers() {
        String uri = baseUri + "/users";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<User[]> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,User[].class);
        List<User> users = Arrays.stream(response.getBody()).toList();
        parseUsers(users);
        return users;
    }

    public void parseUsers(List<User> users) {
        for (User u : users) {
            if (u != null) {
                u.setPictureLink(u.getPictures().getBaseLink());
            }
        }
    }

    @GetMapping("/{id}")
    public User getOneUser(String id) {
        String uri = baseUri + "/users/" + id;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "fa32ef1e6b3cb17f6e81ed1b44edf7f7");
        HttpEntity<String[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<User> response = restTemplate.exchange(uri,
                HttpMethod.GET,request,User.class);
        User user = response.getBody();
        user.setPictureLink(user.getPictures().getBaseLink());
        return user;
    }

}
