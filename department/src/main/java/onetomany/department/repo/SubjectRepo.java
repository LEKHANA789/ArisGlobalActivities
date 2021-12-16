package onetomany.department.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import onetomany.department.model.Subject;
public interface SubjectRepo extends JpaRepository<Subject, Long>
{
	
}