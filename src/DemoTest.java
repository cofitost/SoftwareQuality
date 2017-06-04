import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {
	Book book = new Book();

	@Test
	public void testCheckPhoneType() {
		assertTrue(book.CheckPhoneType("0939354732"));
		assertFalse(book.CheckPhoneType("093935432"));
		assertFalse(book.CheckPhoneType("1739354732"));
	}
	
	@Test
	public void testcheckTime(){
		assertTrue(book.checkTime("21:30"));
		assertTrue(book.checkTime("00:00"));
		assertFalse(book.checkTime("11:33"));
		assertFalse(book.checkTime("87:00"));
	}
	
	@Test
	public void testcheckWeek(){
		assertTrue(book.checkWeek("四"));
		assertTrue(book.checkWeek("日"));
		assertFalse(book.checkWeek("八"));
		assertFalse(book.checkWeek("八七"));
	}

}
