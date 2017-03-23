package org.beginningee6.book.chapter15.ex09;

import org.beginningee6.book.chapter15.ex05.Customer05;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Path("/09/customers")
public class CustomerResource09 {

    // ======================================
    // =           Public Methods           =
    // ======================================

    @GET
    public List<Customer09> getListOfCustomers() {
        // ...
        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public Response createCustomer(InputStream is) {
        // ...
        return null;
    }

    @PUT
    @Path("{customerId}")
    @Consumes(MediaType.APPLICATION_XML)
    public Response updateCustomer(@PathParam("customerId") String customerId, InputStream is) {
        // ...
        return null;
    }

    @DELETE
    @Path("{customerId}")
    public void deleteCustomer(@PathParam("customerId") String customerId) {
          // ...
    }

}