package org.beginningee6.book.chapter15.ex12;

import javax.persistence.EntityNotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author: Antonio
 */
public class EntityNotFoundMapper implements
        ExceptionMapper<EntityNotFoundException> {

    public Response toResponse(javax.persistence.EntityNotFoundException ex) {
        return Response.status(404).entity(ex.getMessage()).type(MediaType.TEXT_PLAIN).build();
    }
}
