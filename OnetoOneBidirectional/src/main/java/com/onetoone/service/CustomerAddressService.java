package com.onetoone.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.entity.Address;
import com.onetoone.entity.Customer;
import com.onetoone.repository.AddressRepository;
import com.onetoone.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerAddressService {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AddressRepository addressRepository;
	  @Transactional
	public Customer addCustomer(Customer customer) {
		  System.out.println("customer=="+customer.toString());
		return customerRepository.save(customer);
	}

	public Address addAddress(Address address) {
        System.out.println("address="+address.toString());
		return addressRepository.save(address);
		
		
	}

	

	public List<Address> getAddressList() {
		return  addressRepository.findAll();

    }
	
	public List<Customer> getCustomerList() {
		return  customerRepository.findAll();

    }

	
}
