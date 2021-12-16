package trainproject.reservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import trainproject.reservation.model.ticketdetails;

public interface ticketrepo extends JpaRepository<ticketdetails, Integer>
{
	
}