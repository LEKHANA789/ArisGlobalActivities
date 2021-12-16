package trainproject.reservation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import trainproject.reservation.model.passengerdetails;
import trainproject.reservation.model.ticketdetails;
import trainproject.reservation.model.traindetails;
import trainproject.reservation.repo.passengerrepo;
import trainproject.reservation.repo.ticketrepo;
import trainproject.reservation.repo.trainrepo;
import trainproject.reservation.service.userservice;
import trainproject.reservation.util.UserData;
@RestController
public class maincontroller
{
	@Autowired
	private trainrepo tro;
	@Autowired
	private passengerrepo pr;
	@Autowired
	private ticketrepo trpo;
	@Autowired
	private userservice us;
	
	/*
	 * @PostMapping("/add") public passengerdetails useradds(passengerdetails p) {
	 * return us.adduser(p); }
	 * 
	 * @GetMapping("/display") public List<passengerdetails> display() { return
	 * us.getuser(); }
	 */
	@GetMapping("/displaytrains") 
	public List<traindetails> display()
	{ 
		return tro.findAll();	
	}
	@GetMapping("/displaypassengers") 
	public List<passengerdetails> displaypassengers()
	{ 
		return pr.findAll();	
	}
	
	@GetMapping("/displayticketdetails") 
	public List<ticketdetails> displayticketdetails()
	{ 
		return trpo.findAll();	
	}
	
	@PostMapping("/add")
	public String pnr(@RequestBody UserData usa)
	{
		return us.generatePNR(usa);
	}
	
}