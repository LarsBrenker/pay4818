package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;

@Schema(name = "Response Example from App", description = "Response Example from App - Description")
public class ResponseFromApp implements Serializable {

    private static final long serialVersionUID = 1;

    @Schema(name = "exceptionKey", description = "the exceptionKey", example = "notvalid")
    private String exceptionKey;

    public String getExceptionKey() {
        return exceptionKey;
    }

    public void setExceptionKey(String exceptionKey) {
        this.exceptionKey = exceptionKey;
    }
}
