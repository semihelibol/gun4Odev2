package gun4Odev2.Adapter;

import java.rmi.RemoteException;

import gun4Odev2.Abstract.CustomerCheckService; 
import gun4Odev2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	
	@Override
	public boolean CheckIfPerson(Customer customer) {
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(
					  Long.parseLong(customer.getNationalId()), 
					  customer.getFirstName(), 
					  customer.getLastName(), 
					  customer.getYearOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

}
