package aiss.vimeoMiner.models.comment;

import aiss.vimeoMiner.models.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

    public Comment(String id, String text, String createdOn, User author) {
        this.id = id;
        this.text = text;
        this.createdOn = createdOn;
        this.author = author;
    }

    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("created_on")
    private String createdOn;
    @JsonProperty("user")
    private User author;


    // GETTERS AND SETTERS
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("uri")
    public void setId(String id) {
        this.id = id.split("/")[4];
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("created_on")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("created_on")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", language='" + text + '\'' +
                ", name='" + createdOn;
    }
}
