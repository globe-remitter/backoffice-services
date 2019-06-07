package com.gr.backoffice.common.health;

import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gr.backoffice.common.exception.GlobeRemitterErrorCode;
import com.gr.backoffice.common.exception.GlobeRemitterError;
import com.gr.backoffice.common.exception.GlobeRemitterException;

@RestController
@RequestMapping
public class HealthController {
	
	@GetMapping("/active")
	public Map<String,String> isActive()
	{
		Map<String,String> activeMap = new LinkedHashMap<>();
		activeMap.put("status", "OK");
		activeMap.put("dateTime", new Date().toInstant().atZone(ZoneId.of("UTC")).toLocalDateTime().toString());
		return activeMap;
	}
	
	@GetMapping("/exception")
	public String error()
	{
		throw new GlobeRemitterException(HttpStatus.NOT_FOUND, new GlobeRemitterError(GlobeRemitterErrorCode.NO_DATA_FOUND));
	}

}
