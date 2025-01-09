package com.onetoone.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.entity.Address;
import com.onetoone.entity.Customer;
import com.onetoone.service.CustomerAddressService;

@RestController
@RequestMapping("/one2one")
public class CustomerAddressController {
	
	@Autowired
	CustomerAddressService customerAddressService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerAddressService.addCustomer(customer);
		
	}
	
	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address) {	
		
		return customerAddressService.addAddress(address);
	}
	
	@GetMapping("/getCustomerList")
	public List<Customer> getCustomerList(){
		return customerAddressService.getCustomerList();
	}
	
	@GetMapping("/getAddressList")
	public List<Address> getAddressList(){
		return customerAddressService.getAddressList();
		
	}

}
