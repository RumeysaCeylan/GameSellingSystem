package Abstract;

import java.util.Date;

import Entities.Gamer;

public abstract class  BaseGamerManager implements IGamerService {

public void save(Gamer gamer) {
	System.out.println("SAVED \nNAME--> "+gamer.getName().toUpperCase()+"\nLAST NAME --> "+gamer.getlName().toUpperCase()+"\nSUCCESSFUL");
	Date date = new Date();
	System.out.println("Tarih-->"+date.toString());
}
public void update(Gamer gamer) {
	System.out.println("\nUpdate \nNAME--> "+gamer.getName().toUpperCase()+"\nLAST NAME --> "+gamer.getlName().toUpperCase()+"\nSUCCESSFUL");
	Date date = new Date();
	System.out.println("Tarih-->"+date.toString());
}
public void delete(Gamer gamer) {
	System.out.println("\n!!!!!!!"+gamer.getName()+" your account deleted");
	gamer.setName(null);
	gamer.setlName(null);
	gamer.setTcNo(null);
}


}
