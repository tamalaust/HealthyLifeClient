package com.healthylife.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.healthylife.dao.ITransactionBO;

@Component
@Path("/api")
public class TestRest {

	@Autowired
	private ITransactionBO transactionBo;

	@GET
	@Path("/basic")
	public Response GetTestInfo() {
		String result =transactionBo.retrive();

		return Response.status(200).entity(result).build();

	}

}
