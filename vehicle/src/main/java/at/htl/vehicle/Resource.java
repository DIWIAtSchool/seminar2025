package at.htl.vehicle;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/vehicles")
public class Resource {

    @Inject
    Repository repo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVehicles() {
        return Response.ok(repo.listAll()).build();
    }
}
