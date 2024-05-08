package aiss.vimeoMiner.models.channel;

import aiss.vimeoMiner.models.video.Video;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {

    @JsonProperty("uri")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("videos")
    private List<Video> videos;

    public Channel(){
        this.videos = new ArrayList<>();
    }


    // GETTERS AND SETTERS
    @JsonProperty("uri")
    public String getId() { return id; }

    @JsonProperty("uri")
    public void setId(String id) { this.id = id.split("/")[2]; }


    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }


    @JsonProperty("created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("created_time")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    @JsonProperty("videos")
    public List<Video> getVideos() { return videos; }

    @JsonProperty("videos")
    public void setVideos(List<Video> videos) { this.videos = videos; }


    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description=" + description +
                ", createdTime='" + createdTime + '\'' +
                ", videos=" + videos + '\'' +
                '}';
    }
}
