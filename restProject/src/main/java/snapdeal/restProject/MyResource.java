
package snapdeal.restProject;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
    	System.out.println("atul");
    	return "atul";
    }
    
    @GET
    @Path("/method1")
    
    @Produces("text/plain")
    public String method1()
    {
    	System.out.println("Hi how r u");
    	return "I reached method1";
    
    }
    
    @POST
    @Path("/appointmentService")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Appointment saveAppointmentToDB(Appointment appointment)
    { System.out.println("inAppointment");
    	
    	return appointment;
    }
}
