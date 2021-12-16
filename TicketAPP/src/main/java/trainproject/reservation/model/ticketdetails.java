package trainproject.reservation.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ticketdetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticketid")
	private int ticketid;
	private Date date;
	private String pnr;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Ticket_Passenger", joinColumns = { @JoinColumn(name = "ticketid") }, inverseJoinColumns = { @JoinColumn(name = "pid") })
	private List<passengerdetails> passengers;
	
	@OneToOne(cascade = CascadeType.ALL)
	private traindetails train;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public ticketdetails()
	{
		
	}
	
	
	
}