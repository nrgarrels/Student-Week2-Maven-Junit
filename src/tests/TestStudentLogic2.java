/**
 * @Nick Garrels - nrgarrels
 * CIS175 - Spring 2023
 * 1/24/2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentLogic;

public class TestStudentLogic2 {
	StudentLogic sLogic = new StudentLogic();
	Student student = new Student("Nick" , "Garrels");
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testCreatStudentIDTrue() {
		student.setAge(17);
		assertTrue(sLogic.isStudentInHS(student));
	}
	@Test
	public void testCreatStudentIDFalse() {
		student.setAge(19);
		assertFalse(sLogic.isStudentInHS(student));
	}
}
