package com.blog.darkos.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.blog.darkos.restJersey.VOUser;

@Path("/aplication")
public class LogginService {
	@Path("/validation")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public VOUser valid(VOUser user){
		user.setValidUser(false);
		if(user.getUserName().equals("test") && user.getPasswd().equals("passwd")){
			user.setValidUser(true);
		}else{
			user.setValidUser(false);
		}
		user.setPasswd("XXX");
		return user;
	}
}