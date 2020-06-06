package sample.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.example.entities.Customer;
import sample.example.exceptions.NoSuchCustomerException;
import sample.example.repository.AddressRepository;
import sample.example.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	AddressRepository addRepo;
	
	public Customer addCustomerToDB(Customer cust) {
		return custRepo.save(cust);
	}
	
	public List<Customer> getAllCustomers(){
		return custRepo.findAll();
	}
	
	public String deleteCustomer(Integer custId) throws NoSuchCustomerException{
		try {
			custRepo.deleteById(custId);
			return "customerDeleted";
		} catch (Exception e) {
			throw new NoSuchCustomerException("Customer Not Found");
		}
		
	}
	
}
