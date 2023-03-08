package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnsortedListTest {

	@Test
	public void testEstListVide() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		assertEquals("List vide",0,List.size());
	}
	@Test(expected = EmptyListException.class )
	public void testPopListVide() throws Exception{
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.pop();
	}
	@Test(expected = EmptyListException.class )
	public void testPopLastListVide() throws Exception {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.popLast();
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemoveListVide() throws Exception {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.remove(0);
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemoveListVideMauvaisePosition() throws Exception {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.remove(2);
	}
	@Test
	public void testInsertListVide() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.insert(3, 0);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(3);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testSizeList() {
		boolean ok = true;
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		for(int i = 0 ; i < 20000; i++ ) {
			if (List.size()!= i) {
				ok = false;
			}
			List.insert(i, i);
		}
		assertTrue(ok);
	}
	@Test
	public void testPrependPremierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(2,3,5,6,8);
		List.prepend(1);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,2,3,5,6,8);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testPrependListVide() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.prepend(10);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(10);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testMultiPrepend() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.prepend(1);
		List.prepend(2);
		List.prepend(3);
		List.prepend(4);
		List.prepend(5);
		List.prepend(6);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(6,5,4,3,2,1);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testSizePrepend() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.prepend(4);
		assertEquals("size update",4,List.size());
	}
	@Test
	public void testAppendDernierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(2,3,5,6,8);
		List.append(1);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(2,3,5,6,8,1);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testAppendListVide() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.append(10);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(10);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testMultiAppend() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.append(1);
		List.append(2);
		List.append(3);
		List.append(4);
		List.append(5);
		List.append(6);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,2,3,4,5,6);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testSizeAppend() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.append(4);
		assertEquals("size update",4,List.size());
	}

	@Test
	public void testInsertPremierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of();
		List.insert(11,0);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(11);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testInsertDernierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.insert(4,3);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,2,3,4);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testInsert() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.insert(4,1);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,4,2,3);
	    assertTrue(List.equals(List2)); 
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testInsertMauvaisePosition()throws Exception{
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.insert(4,12);
	}
	
	@Test
	public void testmultiInsert() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.insert(4,3);
		List.insert(6,0);
		List.insert(8,4);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(6,1,2,3,8,4);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testSizeInsert() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.insert(4,3);
		assertEquals("size update",4,List.size());
	}
	@Test
	public void testPopPremierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.pop();
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(2,3);
	    assertTrue(List.equals(List2)); 
	}
	public void testMultiPop() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3,4,5);
		List.pop();
		List.pop();
		List.pop();
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(4,5);
	    assertTrue(List.equals(List2)); 
	}

	@Test
	public void testPopLastDernierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.popLast();
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,2);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testMultiPopLast() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3,4,5);
		List.popLast();
		List.popLast();
		List.popLast();
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,2);
	    assertTrue(List.equals(List2)); 
	}
	
	@Test
	public void testRemove() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.remove(1);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,3);
	    assertTrue(List.equals(List2)); 
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemoveMauvaisePosition() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.remove(4);
	}
	@Test
	public void testMultiRemove() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,6,2,3,4);
		List.remove(1);
		List.remove(1);
		List.remove(2);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(1,3);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testRemovePremierElement() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.remove(0);
		MyUnsortedList<Integer> List2 = MyUnsortedList.of(2,3);
	    assertTrue(List.equals(List2)); 
	}
	@Test
	public void testsizeAppend() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.append(0);
		assertEquals("size after append",4,List.size());
	}
	
	@Test
	public void testSizeRemove() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.remove(0);
		assertEquals("size after remove",2,List.size());
	}
	@Test
	public void testSizePopLast() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		List.popLast();
		assertEquals("size after popLast",2,List.size());
	}
	@Test
	public void testPopLastReturn() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		int test = List.popLast();
		assertEquals("pop last return  value",3,test);
	}
	@Test
	public void testPopReturn() {
		MyUnsortedList<Integer> List = MyUnsortedList.of(1,2,3);
		int test = List.pop();
		assertEquals("pop last return  value",1,test);
	}
}
