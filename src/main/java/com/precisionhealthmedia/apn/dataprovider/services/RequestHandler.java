package com.precisionhealthmedia.apn.dataprovider.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;


public class RequestHandler
{
    Logger logger = Logger.getLogger(RequestHandler.class);

    @Path("/get_data")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public String getSegments(@QueryParam("query") final String query)
    {
    	return query;
    }

   

}
