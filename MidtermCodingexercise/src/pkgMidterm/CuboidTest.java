package pkgMidterm;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class CuboidTest {
	private Cuboid b;
	private Cuboid B;
	@Test
	public void Cuboid_test(){
		B = new Cuboid(1,2,3);
		assertTrue(6 == B.volume());
	}
	@Test
	public void getDepth_test(){
		B = new Cuboid(1,2,3);
		assertFalse(3 != B.getDepth());
	}
	@Test
	public void setDepth_test(){
		B = new Cuboid(1,2,3);
		int depth = B.getDepth();
		assertFalse(3 != depth);
	}
	@Test
	public void volume_test(){
		B = new Cuboid(1,2,3);
		assertFalse(6 != B.volume());
	}
	@Test
	public void area_test(){
		B = new Cuboid(1,2,3);
		assertTrue(30 != B.area());
	}
	@Test
	public void setDepth_Test() {
		B = new Cuboid(10,20,30);
		B.setDepth(30);
		int BB = B.getDepth();
		assertTrue(BB == 30);
	}
	@Test
	public void compareTo_1() {
		B= new Cuboid(40,50,60);
		b= new Cuboid(45,55,65);
		assertTrue(B.compareTo(b)==-1);
	}
	@Test
	public void compareTo_2() {
		B= new Cuboid(40,50,60);
		b= new Cuboid(123,234,456);
		assertTrue(b.compareTo(B)==1);
	}
	@Test
	public void compareTo_3() {
		B= new Cuboid(40,50,60);
		b= new Cuboid(40,50,60);
		assertTrue(B.compareTo(b)==0);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void Exception_1() {
		B = new Cuboid(45646,50,20);
		B.perimeter();
		}
	@Test(expected = IllegalArgumentException.class)
	public void Exception_2() {
		B = new Cuboid(62668465,82906,1);
		B.setDepth(-7);
		}
	@Test(expected = IllegalArgumentException.class)
	public void Exception_3() {
		B = new Cuboid(54600,10000,-8789);
	}
}
