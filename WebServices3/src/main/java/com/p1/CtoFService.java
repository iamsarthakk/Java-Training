package com.p1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		Double fahrenheit;
		Double celcius = 36.8;
		fahrenheit = ((celcius*9)/5)+32;
		String result = 
				"@Produces(\"application/xml\") Output: \n\nC to F Converter Output:\n\n"+ fahrenheit;
		return "<ctofservice>"+"<celcius>"+celcius+"<celcius>"+
				"<ctofoutput>"+result+"</ctofoutput>"+"</ctofservice>";
	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celcius = c;
		fahrenheit = ((celcius*9)/5)+32;
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: "+fahrenheit ;
		return "<ctofservice>"+"<celcius>"+celcius+"</celcius>"+
		"<ctofoutput>"+result+"</ctofoutput>"+"</ctofservice>";
	}
}
