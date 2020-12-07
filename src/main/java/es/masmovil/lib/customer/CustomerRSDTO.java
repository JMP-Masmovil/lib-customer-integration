package es.masmovil.lib.customer;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class CustomerRSDTO {

	private String identifier;
	
	private String name;
	
	private String surname;
	
	private String email;
}
