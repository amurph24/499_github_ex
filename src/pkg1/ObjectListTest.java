package pkg1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectListTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void IntSort() {
		ObjectList<Integer> list = new ObjectList<Integer>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(99);
        list.IntSort();
        assertTrue(2 == list.get(1));
        assertTrue(7 == list.get(3));
	}

}
