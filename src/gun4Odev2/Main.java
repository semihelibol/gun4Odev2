package gun4Odev2;

import java.util.Date;

import gun4Odev2.Adapter.MernisServiceAdapter;
import gun4Odev2.Concrate.BaseCustomerManager;
import gun4Odev2.Concrate.CustomerCheckManager;
import gun4Odev2.Concrate.NeroCustomerManager;
import gun4Odev2.Concrate.StarbucksCustomerManager;
import gun4Odev2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Semih","Elibol","28393829381",new Date(1986,3,26));
		Customer customer2 = new Customer(2,"Engin","Demiroð","12345678901",new Date(1989,2,11));
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.add(customer1);
		neroCustomerManager.add(customer2);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.add(customer1);
		starbucksCustomerManager.add(customer2);


	}

}
