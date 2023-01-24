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

public class TestStudentLogic {

	StudentLogic sLogic = new StudentLogic();
	Student student = new Student("Nick" , "Garrels");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateEmail() {
		
		String testStudent = sLogic.createEmail(student);
		assertEquals("NG@dmacc.edu", testStudent);
	}
	
	@Test
	public void testCreatStudentID() {
		
		String testStudent = sLogic.createStudentID(student);
		assertEquals("9009NickG", testStudent);
	}
}
