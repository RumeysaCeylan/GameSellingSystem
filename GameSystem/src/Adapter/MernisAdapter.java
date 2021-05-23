package Adapter;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements IGamerCheckService {

	@Override
	public boolean GamerCheck(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result=true;
		
		try {
			result= proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getTcNo()), gamer.getName().toUpperCase(),
					gamer.getlName().toUpperCase(), gamer.getDate());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

}
