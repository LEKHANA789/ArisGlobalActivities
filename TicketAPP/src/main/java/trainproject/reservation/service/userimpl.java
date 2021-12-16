package trainproject.reservation.service;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trainproject.reservation.model.passengerdetails;
import trainproject.reservation.model.traindetails;
import trainproject.reservation.repo.passengerrepo;
import trainproject.reservation.repo.ticketrepo;
import trainproject.reservation.repo.trainrepo;
import trainproject.reservation.util.UserData;

@Service
public class userimpl implements userservice
{
		@Autowired
		private ticketrepo trpo;
		@Autowired
		private passengerrepo prpo;
		@Autowired
		private trainrepo tpo;
		
		
	    private traindetails train;
	    private TreeMap<passengerdetails, Double> passengers;
	    private GregorianCalendar travelDate;
	    private int counter=100;

	    public userimpl() 
	    {
	    	this.travelDate=new GregorianCalendar(2021,2,12);
	    }
	    
		@Override
		public String generatePNR(UserData users) 
		{
			traindetails train=tpo.findtrainbynumber(users.getTrain_no());
			if(train==null) {
				return "Train Number Entered is invalid";
			}
			String pnr=Character.toString(train.getSource().charAt(0)) +
	                   Character.toString(train.getDestination().charAt(0)) + "_" +
	                   users.getTravel_date().toString()+
	                  ++counter;
			/*
			 * for(PassengerModel p:users.getPass()) { addPassenger(p,train); }
			 */
					/* Double totalprice = calTotalPrice(passengers); */
			         return pnr;
		}
		/*
		 * private Double calTotalPrice(TreeMap<passengerdetails, Double> passengers) {
		 * Double total = 0.0; for(Map.Entry<passengerdetails,Double> e:
		 * passengers.entrySet()) { total=total+e.getValue(); }
		 * 
		 * return total; }
		 */

		/*
		 * public Double calculateFare(passengerdetails pass, traindetails train) {
		 * 
		 * if (pass.getAge() <= 12) { return train.getTicketprice() * 0.5; } if
		 * (pass.getAge() >= 60) { return train.getTicketprice() *0.6; } if
		 * (pass.getGender() =="FEMALE" || pass.getGender() =="female") { return
		 * train.getTicketprice() * 0.75; } else{ return train.getTicket_price(); }
		 * 
		 * }
		 */
		/*
		 * public void addPassenger(passengerdetails pass,traindetails train) {
		 * passengers.put(pass,calculateFare(pass,train)); }
		 */
}