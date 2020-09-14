package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "Error Detail", description = "POJO that represents a detailed error info.")
public class ErrorDetailResponseDto implements Serializable {

    private static final long serialVersionUID = 1;

    @Schema(name = "key", description = "e.g. the field name", example = "id")
    private String key;
    @Schema(name = "value", description = "why is this key invalid", example = "value required")
    private String value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
