package aiss.vimeoMiner.models.video;

import aiss.vimeoMiner.models.caption.Caption;
import aiss.vimeoMiner.models.comment.Comment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Video {
    @JsonProperty("uri")
    private String id;
    @JsonProperty("name")
    @NotEmpty(message = "Video name cannot be empty")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("release_time")
    private String releaseTime;
    @JsonProperty("texttracks")
    private List<Caption> captions;
    @JsonProperty("comments")
    private List<Comment> comments;


    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }
    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    @JsonProperty("texttracks")
    public List<Caption> getCaptions() {
        return captions;
    }
    @JsonProperty("texttracks")
    public void setCaptions(List<Caption> captions) {
        this.captions = captions;
    }


    public Video(){
        this.captions = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    /*@JsonProperty("metadata")
    private List<VideoConnections> metadata;
    @JsonProperty("metadata")
    public List<VideoConnections> getMetadata() {
        return metadata;
    }
    @JsonProperty("metadata")
    public void setMetadata(List<VideoConnections> metadata) {
        this.metadata = metadata;
    }
@JsonProperty("comments")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "videoId")
    @NotNull(message = "Video comments cannot be null")
    private List<Comment> comments;*/

    /*@JsonProperty("captions")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "videoId")
    @NotNull(message = "Video captions cannot be null")
    private List<Caption> captions;*/

    @JsonProperty("uri")
    public String getId() {
        return id;
    }
    @JsonProperty("uri")
    public void setId(String id) {
        this.id = id.split("/")[2];
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", captions=" + captions + '\'' +
                ", comments=" + comments + '\'' +
                '}';
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("release_time")
    public String getReleaseTime() {
        return releaseTime;
    }

    @JsonProperty("release_time")
    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }


   /* @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }*/

    /*@JsonProperty("captions")
    public List<Caption> getCaptions() { return captions; }

    @JsonProperty("captions")
    public void setCaptions(List<Caption> captions) {
        this.captions = captions;
    }*/

}
