package aiss.vimeoMiner.controllers;

import aiss.vimeoMiner.models.caption.Caption;
import aiss.vimeoMiner.services.CaptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CaptionController {
    @Autowired
    CaptionService service;
   // @Autowired
    //RestTemplate restTemplate;
     //final String videoMinerUri = "http://localhost:8080/api/videoMiner/videos";

    @GetMapping
    public List<Caption> findAllCaptions() { return service.getAllCaptions(); }


    @GetMapping("/{id}")
    public Caption getOneCaption(@PathVariable String id) {
        return service.getOneCaption(id);
    }

}
