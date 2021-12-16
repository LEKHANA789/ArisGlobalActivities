package trainproject.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import trainproject.reservation.model.passengerdetails;

public interface passengerrepo extends JpaRepository<passengerdetails, Integer>
{
	
}