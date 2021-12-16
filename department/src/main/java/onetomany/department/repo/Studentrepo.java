package onetomany.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import onetomany.department.model.StudentModel;

public interface Studentrepo extends JpaRepository<StudentModel, Long>
{
	
}