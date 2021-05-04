package gun4Odev2.Concrate;

import gun4Odev2.Abstract.CustomerCheckService;
import gun4Odev2.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfPerson(customer)) {
			System.out.println("Nero müþterisi doðrulandý. "
					+ customer.getFirstName()+" "+customer.getLastName()+" gerçek kiþidir.");
			super.add(customer);
		}else {
			System.out.println("Nero müþterisi doðrulanmadý. "
					+customer.getFirstName()+" "+customer.getLastName()+" kiþisi bulunamadý.");
		}
	}
	
	@Override
	public void update(Customer customer) {
		if(customerCheckService.CheckIfPerson(customer)) {
			System.out.println("Nero müþterisi doðrulandý. "
					+ customer.getFirstName()+" "+customer.getLastName()+" gerçek kiþidir.");
			super.update(customer);
		}else {
			System.out.println("Nero müþterisi doðrulanmadý. "
					+ customer.getFirstName()+" "+customer.getLastName()+" kiþisi bulunamadý.");
		}
	}
	
	@Override
	public void delete(Customer customer) {
		super.delete(customer);
	}
	
}
