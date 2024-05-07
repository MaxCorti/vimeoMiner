package aiss.vimeoMiner.controllers;

import aiss.vimeoMiner.models.user.User;
import aiss.vimeoMiner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/videoMiner")
public class UserController {

    @Autowired
    UserService service;

    // @Autowired
    // RestTemplate restTemplate;

    // final String vimeoMinerUri = "http://localhost:8080/vimeominer/users";

    @GetMapping
    public List<User> findAllUsers() { return service.getAllUsers(); }

    @GetMapping("/id")
    public User findOneUser(String id) { return service.getOneUser(id); }

}
