package aiss.vimeoMiner.models.caption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Caption {

    @JsonProperty("uri")
    private String id;
    @JsonProperty("language")
    private String language;
    @JsonProperty("name")
    private String name;


    // GETTERS AND SETTERS
    @JsonProperty("uri")
    public String getId() {
        return id;
    }

    @JsonProperty("uri")
    public void setId(String id) {
        this.id = id.split("/")[4];
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
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
        return "id=" + id +
                ", language='" + language + '\'' +
                ", name='" + name;
    }
}