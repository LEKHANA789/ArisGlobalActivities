package onetomany.department.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
@Entity
@Table(name="STUDENT")
public class StudentModel
{
	
	
	public StudentModel(long id, String name, Integer age, List<Subject> subject) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public StudentModel()
	{
		
	}
	
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private long id;
	@Column
	private String name;
	@Column
	private Integer age;
    @OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_SUBJECT", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "SUBJECT_ID") })
	private List<Subject> subject;

}