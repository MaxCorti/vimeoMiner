package aiss.vimeoMiner.models.comment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CommentList {
    @JsonProperty("data")
    private List<Comment> comments;

    @JsonProperty("data")
    public List<Comment> getCommentList() {
        return comments;
    }

    @JsonProperty("data")
    public void setCommentList(List<Comment> comments) {
        this.comments = comments;
    }
}
