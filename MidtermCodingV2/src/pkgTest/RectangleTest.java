package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class RectangleTest extends TestCase {
	
	@Test
	public void Construction_Test() {
		pkgShapes.Rectangle r = new pkgShapes.Rectangle(4,6);
		assertEquals(r.getiLength(), 4);
		assertEquals(r.getiWidth(), 6);
		
		pkgShapes.Rectangle r2 = new pkgShapes.Rectangle(20,10);
		assertEquals(r2.getiLength(), 20);
		assertEquals(r2.getiWidth(), 10);
	}
	
	@Test
	public void GetterSetter_Test() {
		pkgShapes.Rectangle r = new pkgShapes.Rectangle(1,2);
		assertEquals(r.getiLength(), 1);
		assertEquals(r.getiWidth(), 2);
		
		r.setiLength(3);
		r.setiWidth(4);
		
		assertEquals(r.getiLength(), 3);
		assertEquals(r.getiWidth(), 4);
	}
	
	@Test
	public void Area_Test() {
		pkgShapes.Rectangle r = new pkgShapes.Rectangle(5,6);
		assertEquals(r.area(), 30.0);
		
		r.setiLength(6);
		r.setiWidth(9);
		assertEquals(r.area(), 54.0);
	}
	
	@Test 
	public void Perimeter_Test() {
		pkgShapes.Rectangle r = new pkgShapes.Rectangle(3, 4);
		assertEquals(r.perimeter(), 14.0);
		
		r.setiLength(6);
		r.setiWidth(3);
		assertEquals(r.perimeter(), 18.0);
	}
	
	@Test
	public void compareTo_Test() {
		ArrayList<pkgShapes.Rectangle> arr = new ArrayList<pkgShapes.Rectangle>();
		pkgShapes.Rectangle r1 = new pkgShapes.Rectangle(4,4);
		pkgShapes.Rectangle r2 = new pkgShapes.Rectangle(2,2);
		arr.add(r1);
		arr.add(r2);
		
		pkgShapes.Rectangle[] expected = {r2, r1};
		
		Collections.sort(arr);
		
		assertArrayEquals(arr.toArray(), expected);
		
		//larger list with two having the same area but different perimeter
		ArrayList<pkgShapes.Rectangle> arr2 = new ArrayList<pkgShapes.Rectangle>();
		pkgShapes.Rectangle rr1 = new pkgShapes.Rectangle(5,7);
		pkgShapes.Rectangle rr2 = new pkgShapes.Rectangle(6,5);
		pkgShapes.Rectangle rr3 = new pkgShapes.Rectangle(3,4);
		pkgShapes.Rectangle rr4 = new pkgShapes.Rectangle(3,10);
		arr2.add(rr1);
		arr2.add(rr2);
		arr2.add(rr3);
		arr2.add(rr4);
		
		pkgShapes.Rectangle[] expected2 = {rr3, rr2, rr4, rr1};
		Collections.sort(arr2);
		
		assertArrayEquals(arr2.toArray(), expected2);
		
	}
}
