package es.masmovil.lib.customer.client;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import es.masmovil.lib.customer.CustomerRSDTO;

@ConditionalOnProperty(name = "api.ms.url.customer")
@FeignClient(name = "customerClient", url = "${api.ms.url.customer}", decode404 = true)
public interface CustomerFeignClient {

	@GetMapping("/{id}")
	ResponseEntity<CustomerRSDTO> getCustomer(@PathVariable String id);

	@PostMapping("/")
	ResponseEntity<CustomerRSDTO> createCustomer(@RequestBody CustomerRSDTO customerRSDTO);

	@DeleteMapping("/{id}")
	ResponseEntity<Void> deleteCustomer(@PathVariable String id);

}
