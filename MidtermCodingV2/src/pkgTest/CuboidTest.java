package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pkgShapes.Cuboid;

class CuboidTest {

	@Test
	public void Construction_Test() {
		pkgShapes.Cuboid c = new pkgShapes.Cuboid(2, 3, 4);
	}
	
	@Test
	public void SetterGetter_Test() {
		pkgShapes.Cuboid c = new pkgShapes.Cuboid(2, 3, 4);
		assertEquals(c.getiLength(), 2);
		assertEquals(c.getiWidth(), 3);
		assertEquals(c.getiDepth(), 4);
		
		c.setiLength(3);
		c.setiWidth(4);
		c.setiDepth(5);
		
		assertEquals(c.getiLength(), 3);
		assertEquals(c.getiWidth(), 4);
		assertEquals(c.getiDepth(), 5);
	}
	
	@Test 
	public void Area_Test() {
		pkgShapes.Cuboid c = new pkgShapes.Cuboid(2, 3, 4);
		assertEquals(c.area(), 52);
		
		c.setiLength(8);
		c.setiWidth(9);
		c.setiDepth(10);
		
		assertEquals(c.area(), 484);
	}
	
	@Test
	public void Volume_Test() {
		pkgShapes.Cuboid c = new pkgShapes.Cuboid(2, 3, 4);
		assertEquals(c.volume(), 24);
		
		c.setiLength(8);
		c.setiWidth(9);
		c.setiDepth(10);
		
		assertEquals(c.volume(), 720);
	}

	@Test
	public void Perimeter_Test() {
		//Used JUnit5 instead of JUnit4
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {
			pkgShapes.Cuboid c = new pkgShapes.Cuboid(2, 3, 4);
			double d = c.perimeter();
		}); 
	}
	
	@Test
	public void SortByArea_Test() {
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>();
		Cuboid c1 = new Cuboid(6,7,8);
		Cuboid c2 = new Cuboid(2,3,4);
		
		arr.add(c1);
		arr.add(c2);
		Cuboid[] expected = {c2, c1};
		Collections.sort(arr, c1.new SortByArea());
		
		assertArrayEquals(arr.toArray(), expected);
		
		ArrayList<Cuboid> arr2 = new ArrayList<Cuboid>();
		Cuboid cc1 = new Cuboid(3,20,1); //larger area (106), smaller volume (60)
		Cuboid cc2 = new Cuboid(4,4,4); //smaller area (96), larger volume (64)
		
		arr2.add(cc1);
		arr2.add(cc2);
		
		Cuboid[] expected2 = {cc2, cc1};
		Collections.sort(arr2, cc1.new SortByArea());
		
		assertArrayEquals(arr2.toArray(), expected2);
	}
	
	@Test 
	public void SortByVolume_Test() {
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>();
		Cuboid c1 = new Cuboid(4,5,6);
		Cuboid c2 = new Cuboid(1,2,3);
		Cuboid c3 = new Cuboid(10,11,12);
		Cuboid c4 = new Cuboid(7,8,9);
		
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		arr.add(c4);
		
		Cuboid[] expected = {c2, c1, c4, c3};
		Collections.sort(arr, c1.new SortByVolume());
		
		assertArrayEquals(arr.toArray(), expected);
		
		ArrayList<Cuboid> arr2 = new ArrayList<Cuboid>();
		Cuboid cc1 = new Cuboid(4,4,4); //smaller area (96), larger volume (64)
		Cuboid cc2 = new Cuboid(3,20,1); //larger area (106), smaller volume (60)
		arr2.add(cc1);
		arr2.add(cc2);
		
		Cuboid[] expected2 = {cc2, cc1};
		Collections.sort(arr2, cc1.new SortByVolume());
		
		assertArrayEquals(arr2.toArray(), expected2);
		
	}
}
