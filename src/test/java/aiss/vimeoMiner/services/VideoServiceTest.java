package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.Video;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VideoServiceTest {
    @Autowired
    VideoService service;

    @Test
    void getOneVideo() {
        String id = "56456";
        Video video = service.getOneVideo(id);
        assertNotEquals(null, video, "The list of videos is empty");
        System.out.println(video);
    }
}