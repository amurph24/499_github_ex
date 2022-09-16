package pkg1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectListTest {

	@Test
    public void testMyList() {
        ObjectList<Integer> list = new ObjectList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        assertTrue(4 == list.get(4));
        assertTrue(2 == list.get(1));
        assertTrue(3 == list.get(2));
    }


    @Test
    public void testStringSort() {
    	ObjectList<String> list = new ObjectList<String>();
        list.add("and");
        list.add("duck");
        list.add("elephant");
        list.add("boat");
        list.add("cat");
        list.StringSortAlphabet();
        System.out.println(list.show());
        assertTrue("boat".equals(list.get(1)));
    }

    @Test
    public void testList() {
    	ObjectList<Integer> list = new ObjectList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        assertTrue(4 == list.get(4));
        assertTrue(2 == list.get(1));
        assertTrue(3 == list.get(2));
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


