package com.p1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException{
		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 98.24;
		Double celcius;
		celcius = (fahrenheit-32)*5/9;
		jsonObject.put("F Value", fahrenheit);
		jsonObject.put("C Value", celcius);
		
		String result = "@Produces(\"applicaition/json\") Output: \n\nF to C Converter Output: \n\n"+jsonObject;
		return Response.status(200).entity(result).build();
	}
	
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f)
				throws JSONException{
		
		JSONObject jsonObject = new JSONObject();
		float celcius;
		celcius = (f-32)*5/9;
		jsonObject.put("F Value", f);
		jsonObject.put("C Vlaue", celcius);
		
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n"+ jsonObject;
		return Response.status(200).entity(result).build();
	}
}