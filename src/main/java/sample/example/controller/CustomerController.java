package sample.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.example.entities.Customer;
import sample.example.exceptions.NoSuchCustomerException;
import sample.example.model.WellsCustomer;
import sample.example.model.WellsCustomerInput;
import sample.example.service.CustomerService;

@RestController
@RequestMapping("/customer")
@Validated
public class CustomerController {
	
	@Autowired
	CustomerService custSer;
	
	@PostMapping            
	public Customer addCustomer(@RequestBody Customer cust) {
		return custSer.addCustomerToDB(cust);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers() {
		return custSer.getAllCustomers();
	}
	
	@DeleteMapping("/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") Integer custId) throws NoSuchCustomerException {
		
		System.out.println("customer id is " + custId);
		return custSer.deleteCustomer(custId);
	}
	
	@GetMapping("/validation")
	public String validateParams(@RequestParam("numbers") @Min(value = 3, message = "value cannot be less than 3") 
														  @Max(value = 10, message = "value cannot be greater than 10")
														  Integer numbers) {
		return "successful deletion complete for validation";
	}
	
	@PostMapping("/wcis")
	public List<WellsCustomer> addWcisCustomer(@RequestBody WellsCustomerInput wellsCustomerIn){
		List<WellsCustomer> custList = new ArrayList<>();
		WellsCustomer wc1 = new WellsCustomer();
		wc1.setIcisClientId(123456789);
		wc1.setLegalName("Konrad Jelonkiewicz");
		wc1.setLegalType("CORP");
		wc1.setAltName("Konrad");
		
		WellsCustomer wc2 = new WellsCustomer();
		wc2.setIcisClientId(987654321);
		wc2.setLegalName("Konrad CORP");
		wc2.setLegalType("CORP");
		wc2.setAltName("Konrad CORP");
		custList.add(wc1);
		custList.add(wc2);
		return custList;
	}
	
}
