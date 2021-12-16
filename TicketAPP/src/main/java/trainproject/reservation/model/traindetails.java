package trainproject.reservation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class traindetails
{
	@Id
	private int trainno;
	private String trainname;
	private String source;
	private String destination;
	private Double ticketprice;
	
	public traindetails()
	{
		
	}

	public int getTrainno() 
	{
		return trainno;
	}

	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}
	

}