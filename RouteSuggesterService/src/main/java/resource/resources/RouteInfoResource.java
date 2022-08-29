package resource.resources;

import io.dropwizard.hibernate.UnitOfWork;
import service.services.RouteInfoService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/routes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RouteInfoResource {
    private final RouteInfoService routeInfoService;

    public RouteInfoResource(RouteInfoService routeInfoService) {
        this.routeInfoService = routeInfoService;
    }

    @POST
    @UnitOfWork
    public void getRoutes(String body) {

    }

    @POST
    @UnitOfWork
    public void getSuggestedRoutes(String body) {
        
    }

    public RouteInfoService getRouteInfoService() {
        return routeInfoService;
    }
}
