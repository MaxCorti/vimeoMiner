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
    @JsonProperty("link")
    private String userLink;
    @JsonProperty("pictures")
    private Pictures pictures;

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


    @JsonProperty("userLink")
    public String getUserLink() { return userLink; }

    @JsonProperty("userLink")
    public void setUserLink(String userLink) { this.userLink = userLink; }


    public Pictures getPictures() {
        return pictures;
    }

    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }

    @JsonProperty("pictureLink")
    public String getPictureLink() { return pictureLink; }

    @JsonProperty("pictureLink")
    public void setPictureLink(String pictureLink) { this.pictureLink = pictureLink; }


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
