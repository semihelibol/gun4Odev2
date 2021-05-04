package gun4Odev2.Concrate;

import gun4Odev2.Abstract.CustomerCheckService;
import gun4Odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfPerson(Customer customer) {
		if (customer.getNationalId().length()==11) {
			return true;
		}
		return false;
	}

}
