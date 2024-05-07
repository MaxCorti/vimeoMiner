package aiss.vimeoMiner.models.user;

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
    @JsonProperty("userLink")
    private String userLink;
    @JsonProperty("pictureLink")
    private String pictureLink;



    // SETTERS AND GETTERS

    @JsonProperty("id")
    public String getId() { return id; }

    @JsonProperty("id")
    public void setId(String id) { this.id = id; }


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
