package manytomanybim8.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybim8.dto.Course;
import manytomanybim8.dto.Student;

public class StudentCourseController {

	public static void main(String[] args) {


		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Ramana Reddy");
		student1.setAddress("Banglore");
		
		Student student2  = new Student();
		student2.setId(2);
		student2.setName("Pavithra Reddy");
		student2.setAddress("Banglore");
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Chalama Reddy");
		student3.setAddress("Banglore");
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Java");
		course1.setFess(5000);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Advance Java");
		course2.setFess(5000);
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("sql");
		course3.setFess(5000);
		
		List<Course> CoursesofRam = new ArrayList<Course>();
		CoursesofRam.add(course1);
		CoursesofRam.add(course2);
		CoursesofRam.add(course3);
		
		student1.setCourses(CoursesofRam);
		student2.setCourses(CoursesofRam);
		student3.setCourses(CoursesofRam);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		course1.setStudents(students);
		course2.setStudents(students);
		course3.setStudents(students);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
		
		
		

	}

}
