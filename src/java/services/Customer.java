package services;



import beans.CustomerManager;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Path("customer")
public class Customer {
    
    @EJB
    CustomerManager manager;
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getCustomerCount() {
        
        return "<h1>Customer count: "+manager.getCustomerCount()+"</h1>";
    }
    
}
