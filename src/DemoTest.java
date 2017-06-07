import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

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
	public void testCheckTime(){
		assertTrue(book.checkTime("21:30"));
		assertTrue(book.checkTime("00:00"));
		assertFalse(book.checkTime("11:33"));
		assertFalse(book.checkTime("87:00"));
	}
	
	@Test
	public void testCheckWeek(){
		assertTrue(book.checkWeek("三"));
		assertTrue(book.checkWeek("日"));
		assertFalse(book.checkWeek("七"));
		assertFalse(book.checkWeek("八七"));
	}
	
	@Test
	public void testHowMuch(){
		assertEquals(135,book.howMuch("一", "08:00", "0918739200", true, false));
		assertEquals(90,book.howMuch("六", "15:30", "0918937200", true, true));
	}

}
