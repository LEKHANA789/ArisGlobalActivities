package trainproject.reservation.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import trainproject.reservation.model.traindetails;

public interface trainrepo extends JpaRepository<traindetails, Integer>
{
	@Query("select t from traindetails t where t.trainno=?1")
	traindetails findtrainbynumber(Integer trainno);
}