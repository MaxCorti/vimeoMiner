package aiss.vimeoMiner.models.caption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Caption {

    public Caption(Integer id, String language, String name) {
        this.id = id;
        this.language = language;
        this.name = name;
    }

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("language")
    private String language;
    @JsonProperty("name")
    private String name;


    // GETTERS AND SETTERS
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
        return "Caption{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}