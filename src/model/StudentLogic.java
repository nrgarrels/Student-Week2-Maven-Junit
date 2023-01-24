/**
 * @Nick Garrels - nrgarrels
 * CIS175 - Spring 2023
 * 1/24/2023
 */
package model;

public class StudentLogic {
	
	//method to create email
	public static String createEmail(Student Student) {
		
		String email = Student.getFirstName().substring(0,1) + Student.getLastName().substring(0,1) + "@dmacc.edu";
		
		return email;
	}
	
	//method to create studentID
	public static String createStudentID(Student Student) {
		
		String studentID = "9009" + Student.getFirstName()+ Student.getLastName().substring(0,1);
		
		return studentID;
	}
	
	//method to create studentID
	public static boolean isStudentInHS(Student Student) {
		boolean isHsStudent;
		
	if (Student.getAge() < 18) {
		
		isHsStudent = true;
	}else {
		
		isHsStudent = false;
	}
		
		return isHsStudent;
	}
}
