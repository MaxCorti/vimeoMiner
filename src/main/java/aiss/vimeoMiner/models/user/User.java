package aiss.vimeoMiner.models.user;

import aiss.vimeoMiner.models.pictures.Pictures;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    public User(String id, String name, String userLink, String pictureLink) {
        this.id = id;
        this.name = name;
        this.userLink = userLink;
        this.pictureLink = pictureLink;
    }

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("user_link")
    private String userLink;
    @JsonProperty("picture_link")
    private String pictureLink;




    // SETTERS AND GETTERS

    @JsonProperty("id")
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


    @JsonProperty("user_link")
    public String getUserLink() { return userLink; }

    @JsonProperty("link")
    public void setUserLink(String userLink) { this.userLink = userLink; }

    @JsonProperty("picture_link")
    public String getPictureLink() { return pictureLink; }

    @JsonProperty("pictures")
    public void setPictureLink(Pictures picture) { this.pictureLink = picture.getBaseLink(); }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userLink='" + userLink + '\'' +
                ", pictureLink='" + pictureLink + '\'' +
                '}';
    }
}
