/**
 * @Nick Garrels - nrgarrels
 * CIS175 - Spring 2023
 * 1/24/2023
 */
package model;

public class Student {
	//private vairables
	private String firstName;
	private String lastName;
	private String email;
	private String studentID;
	private int age;
	
	//default no arg
	public Student() {
		super();
		this.firstName = null;
		this.lastName = null;
		this.email = null;
		this.studentID = null;
	}
	
	//constructor
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		

	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(int age) {
		this.studentID = studentID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
