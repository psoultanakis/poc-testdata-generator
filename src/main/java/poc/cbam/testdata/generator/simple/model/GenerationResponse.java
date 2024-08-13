package poc.cbam.testdata.generator.simple.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("generation_response")
public class GenerationResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean success;

    public GenerationResponse completed(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Indicates whether an entry operator exists
     * @return exists
     */

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerationResponse generationResponse = (GenerationResponse) o;
        return Objects.equals(this.success, generationResponse.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerationResponse {\n");
        sb.append("    generation success: ").append(toIndentedString(success)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
