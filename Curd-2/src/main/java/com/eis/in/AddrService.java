package com.eis.in;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;


@Service
public class AddrService {
	
	
	
	public boolean addAddress(Integer empId, Address address) {
		System.out.println("Just Performing Some Dummy Changes Here");
		System.out.println("Added 1st Inside");
				
		return false;
		}
		
	}
