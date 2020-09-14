package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Schema(name = "Error Response", description = "POJO that represents an error response.")
public class ErrorResponseDto implements Serializable {

    private static final long serialVersionUID = 1;

    @Schema(name = "details", description = "List with detailed error information.", implementation = ErrorDetailResponseDto.class, type = SchemaType.ARRAY)
    private List<ErrorDetailResponseDto> details = new ArrayList<>();

    public void setDetails(List<ErrorDetailResponseDto> details) {
        this.details = details;
    }

    public List<ErrorDetailResponseDto> getDetails() {
        return details;
    }
}
