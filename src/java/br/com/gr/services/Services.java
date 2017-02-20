/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gr.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Marcos Benevides
 */
@Path("/helloworld")
public class Services {

    @GET
    @Produces("text/plain")
    public String showhelloWorld(){
        return "<html>"
                + "<head></head>"
                + "<body><H1>Hello Word</h1><br>"
                + "<p>Web Service its working well!</p>"
                + "</body></html>";
    }

}
