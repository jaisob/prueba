package com.isb.console;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

	@RequestMapping(path = "/{agent}/{id}/attach", method = RequestMethod.POST)
	public void setAttachedData(@PathVariable("agent") String agentId, @PathVariable("id") String interactionId,
			@RequestBody List<AttachData> attachDataList) {
		for (AttachData att : attachDataList) {
			System.out.println(att.toString());
		}
	}
}
