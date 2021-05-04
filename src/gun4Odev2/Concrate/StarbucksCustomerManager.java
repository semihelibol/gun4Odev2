package gun4Odev2.Concrate;

import gun4Odev2.Abstract.CustomerCheckService;
import gun4Odev2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfPerson(customer)) {
			System.out.println("Starbucks m��terisi do�ruland�. "
					+ customer.getFirstName()+" "+customer.getLastName()+" ger�ek ki�idir.");
			super.add(customer);
		}else {
			System.out.println("Starbucks m��terisi do�rulanmad�. "
					+customer.getFirstName()+" "+customer.getLastName()+" ki�isi bulunamad�.");
		}
	}
	
	@Override
	public void update(Customer customer) {
		if(customerCheckService.CheckIfPerson(customer)) {
			System.out.println("Starbucks m��terisi do�ruland�. "
					+ customer.getFirstName()+" "+customer.getLastName()+" ger�ek ki�idir.");
			super.update(customer);
		}else {
			System.out.println("Starbucks m��terisi do�rulanmad�. "
					+ customer.getFirstName()+" "+customer.getLastName()+" ki�isi bulunamad�.");
		}
	}
	
	@Override
	public void delete(Customer customer) {
		super.delete(customer);
	}
	
}
