package trainproject.reservation.util;


import java.sql.Date;
import java.util.List;


import trainproject.reservation.model.passengerdetails;

public class UserData
{
public UserData(int trainno, Date date, List<passengerdetails> passengers)
{
		super();
		this.trainno = trainno;
		this.date = date;
		this.passengers = passengers;
}
@Override
	public String toString()
	{
		return "UserData [train_no=" + trainno + ", travel_date=" + date + ", pass=" + passengers + "]";
	}
	public int getTrain_no()
	{
		return trainno;
	}
	public void setTrain_no(int trainno) {
		this.trainno = trainno;
	}
	public Date getTravel_date() {
		return date;
	}
	public void setTravel_date(Date date) {
		this.date = date;
	}
	public List<passengerdetails> getPass() {
		return passengers;
	}
	public void setPass(List<passengerdetails> passengers) {
		this.passengers = passengers;
	}
private int trainno;
private Date date;
private List<passengerdetails> passengers;

}
