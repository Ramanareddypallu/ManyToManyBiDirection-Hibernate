package manytomanybim8.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	private int id;
	private String name;
	private int fess;
	@ManyToMany
	List<Student> students;

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized int getFess() {
		return fess;
	}

	public synchronized void setFess(int fess) {
		this.fess = fess;
	}

	public synchronized List<Student> getStudents() {
		return students;
	}

	public synchronized void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fess=" + fess + ", students=" + students + "]";
	}
	
	

}
