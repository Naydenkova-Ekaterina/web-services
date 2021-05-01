package service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IllegalFieldExceptionMapper implements ExceptionMapper<IllegalFieldException> {
    @Override
    public Response toResponse(IllegalFieldException e) {
        return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
    }
}