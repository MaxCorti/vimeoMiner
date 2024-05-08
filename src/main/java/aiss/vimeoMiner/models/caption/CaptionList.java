package aiss.vimeoMiner.models.caption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CaptionList {
    @JsonProperty("data")
    private List<Caption> captions;

    @JsonProperty("data")
    public List<Caption> getCaptionsList() {
        return captions;
    }

    @JsonProperty("data")
    public void setCaptionsList(List<Caption> captions) {
        this.captions = captions;
    }
}
