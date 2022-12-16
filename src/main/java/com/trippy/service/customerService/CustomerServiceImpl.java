//package com.trippy.service.customerService;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.trippy.exception.CustomerException;
//import com.trippy.models.Customer;
//import com.trippy.repository.CustomerRepo;
//
//public class CustomerServiceImpl implements CustomerService {
//	
//	@Autowired
//	private CustomerRepo customerRepo;
//
//	@Override
//	public Customer insertCustomer(Customer customer) throws CustomerException {
//		Customer addedCustomer = customerRepo.save(customer);
//		if(addedCustomer==null) {
//			throw new CustomerException("Enter valid customer informations.........!");
//		}
//		
//		return addedCustomer;
//	}
//
//	@Override
//	public Customer deleteCustomer(Integer customerId) throws CustomerException {
//		Customer deletedCustomer = customerRepo.findById(customerId).get();
//		 
//		 if(deletedCustomer==null) {
//			 throw new CustomerException("Customer not found with the ID : "+customerId);
//		 }
//		 else {
//			 customerRepo.deleteById(customerId);
//		 }
//		return deletedCustomer;
//	}
//
//	@Override
//	public Customer updateCustomer(Customer customer) throws CustomerException {
//		Customer getCustomer = customerRepo.findById(customer.getCustomerId()).get();
//		
//		if(getCustomer==null) {
//			 throw new CustomerException("Customer not found with the ID : "+customer.getCustomerId());
//		}
//		
//		Customer updatedCustomer = customerRepo.save(customer);
//		
//		return updatedCustomer;
//
//	}
//
//	@Override
//	public List<Customer> viewCustomer() throws CustomerException {
//		
//		List<Customer> list = customerRepo.findAll();
//		
//		if(list.size()==0) {
//			throw new CustomerException("Customer List id empty.....!");
//		}
//		return list;
//	}
//
//	@Override
//	public Customer viewCustomerwithId(Integer customerId) throws CustomerException {
//		
//		Customer getCustomer = customerRepo.findById(customerId).get();
//		
//		if(getCustomer==null) {
//			 throw new CustomerException("Customer not found with the ID : "+customerId);
//
//		}
//		
//		return getCustomer;
//	}
//
//	@Override
//	public Customer validateCustomer(String userName, String password) throws CustomerException {
//		
//		Customer validatedCustomer = customerRepo.validateCustomer(userName, password);
//		
//		if(validatedCustomer==null) {
//			 throw new CustomerException("Invalid username or password.......! ");
//
//		}
//		
//		return validatedCustomer;
//		
//		
//	}
//
//	
//	
//	
//	
//	
//	
//
//}
