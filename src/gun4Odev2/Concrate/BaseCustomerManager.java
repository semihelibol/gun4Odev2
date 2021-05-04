package gun4Odev2.Concrate;

import gun4Odev2.Abstract.CustomerService;
import gun4Odev2.Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi: "+ customer.getFirstName()+" "+customer.getLastName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri Güncellendi: "+ customer.getFirstName()+" "+customer.getLastName());
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi: "+ customer.getFirstName()+" "+customer.getLastName());		
	}

}
