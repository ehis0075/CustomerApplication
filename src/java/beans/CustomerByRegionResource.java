/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author Fincode
 */
@Path("customerByRegionz")
public class CustomerByRegionResource {

    @Context
    private UriInfo context;
    
    @EJB
    CustomerManager manager;
    

    /**
     * Creates a new instance of CustomerByRegionResource
     */
    public CustomerByRegionResource() {
    }

    /**
     * Retrieves representation of an instance of beans.CustomerByRegionResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<h3>All Customers: "+ manager.getCustomerCount() +"</h3>";
    }
    
    @GET
    @Path("byRegion")
    @Produces(MediaType.TEXT_HTML)
    public String getCustomerByRegionPath(@QueryParam("r") @DefaultValue("west") String region) {
        return "<h3>Customer By Region: "+ manager.getCustomerCountByRegion(region) +"</h3>";
    }
    
    @GET
    @Path("{r}")
    @Produces(MediaType.TEXT_HTML)
    public String getCustomerByRegion(@PathParam("r") String region) {
        return "<h3>Customer By Region: "+ manager.getCustomerCountByRegion(region) +"</h3>";
    }
    
    
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String getCustomerByRegionPost(@FormParam("region")String r){
        return "<h3>Customer By Region: "+ manager.getCustomerCountByRegion(r) +"</h3>";
    
    }

    
}
