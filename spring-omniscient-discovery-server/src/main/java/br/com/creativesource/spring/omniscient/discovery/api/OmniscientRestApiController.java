package br.com.creativesource.spring.omniscient.discovery.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.creativesource.omniscient.api.Service;

@RestController
@RequestMapping("/discovery")
public class OmniscientRestApiController {
	
	@RequestMapping(value = "/services", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Service> getServices(){
		List<Service> services = new ArrayList<>();
		Service service = Service.builder()
				.name("test-service")
				.build();
		services.add(service);
		return services;
		
	}

	@RequestMapping(value = "/services/{serviceName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Service getService(@PathVariable String serviceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/service", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void register(@RequestBody Service service) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@RequestMapping(value = "/service/{serviceName}", method = RequestMethod.DELETE)
	public void unregister(@PathVariable String serviceName) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
