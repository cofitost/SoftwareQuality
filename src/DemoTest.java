import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoTest {
	Book book = new Book();

	@Test
	public void testCheckPhoneType() {
		assertTrue(book.CheckPhoneType("0939354732"));
		assertTrue(book.CheckPhoneType("0900000000"));
		assertFalse(book.CheckPhoneType("092"));
		assertFalse(book.CheckPhoneType("1739354732"));
	}

	@Test
	public void testCheckTime() {
		assertTrue(book.checkTime("21:30"));
		assertTrue(book.checkTime("00:00"));
		assertFalse(book.checkTime("11:33"));
		assertFalse(book.checkTime("87:00"));
		assertFalse(book.checkTime("03:00"));
		assertFalse(book.checkTime("3:00"));
	}

	@Test
	public void testCheckWeek() {
		assertTrue(book.checkWeek("�T"));
		assertTrue(book.checkWeek("��"));
		assertFalse(book.checkWeek("�C"));
		assertFalse(book.checkWeek("�K�C"));
	}

	@Test
	public void testHowMuch() throws Exception {
		assertEquals(210, book.howMuch("�@", "00:00", "0918739200", false, false));
		assertEquals(180, book.howMuch("�G", "15:30", "0918739200", false, false));
		assertEquals(150, book.howMuch("�|", "21:00", "0918739200", false, false));
		assertEquals(189, book.howMuch("�@", "08:00", "0918739200", true, false));
		assertEquals(135, book.howMuch("��", "08:00", "0918739200", true, false));
		assertEquals(100, book.howMuch("��", "11:30", "0918739200", false, true));
		assertEquals(90, book.howMuch("��", "15:30", "0918937200", true, true));
	}
	
	@Test
	public void testException() {
		try {
			assertEquals(189, book.howMuch("�@", "8:00", "0918739200", true, false));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testException2() {
		try {
			assertEquals(189, book.howMuch("�@", "08:00", "09187200", true, false));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testException3() {
		try {
			assertEquals(189, book.howMuch("�Q", "08:00", "0918739200", true, false));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
