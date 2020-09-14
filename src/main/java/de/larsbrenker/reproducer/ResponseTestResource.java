package de.larsbrenker.reproducer;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("responsetest")
@RequestScoped
public class ResponseTestResource {

    @GET
    @Path("intern")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Testing internal schema class", description = "Testing internal schema class")
    @APIResponses({
            @APIResponse(responseCode = "200", description = "Successful, returning ok.", content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = ResponseFromApp.class)))
    })
    public Response testIntern() {
        return Response.ok().build();
    }
}