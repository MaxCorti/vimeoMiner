package aiss.vimeoMiner.models.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class VideoList {
    @JsonProperty("data")
    private List<Video> videos;
    @JsonProperty("data")
    public List<Video> getVideos() {
        return videos;
    }
    @JsonProperty("data")
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
