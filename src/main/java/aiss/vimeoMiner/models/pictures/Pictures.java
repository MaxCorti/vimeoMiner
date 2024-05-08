package aiss.vimeoMiner.models.pictures;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pictures {

    @JsonProperty("base_link")
    private String baseLink;


    @JsonProperty("base_link")
    public String getBaseLink() {
        return baseLink;
    }
    @JsonProperty("base_link")
    public void setBaseLink(String baseLink) {
        this.baseLink = baseLink;
    }


    @Override
    public String toString() {
        return "Pictures{" +
                "baseLink='" + baseLink + '\'' +
                '}';
    }

}
