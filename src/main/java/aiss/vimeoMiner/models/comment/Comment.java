package aiss.vimeoMiner.models.comment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Comment {

    @JsonProperty("uri")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("created_on")
    private String createdOn;


    // GETTERS AND SETTERS
    @JsonProperty("uri")
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

    @Override
    public String toString() {
        return "id=" + id +
                ", language='" + text + '\'' +
                ", name='" + createdOn;
    }
}
