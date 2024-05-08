package aiss.vimeoMiner.services;

import aiss.vimeoMiner.models.video.Video;
import aiss.vimeoMiner.models.video.VideoList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VideoServiceTest {
    @Autowired
    VideoService service;

    @Test
    void getVideosChannel() {
        String id = "194420";
        List<Video> video = service.getVideosChannel(id);
        assertNotEquals(null, video, "The list of videos is empty");
        System.out.println(video);
    }
}