package pkgMidterm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
	private Rectangle A;
	private Rectangle a;

	@Test
	public void Rectangle_test(){
		A = new Rectangle(3,4);
		assertTrue((3 == A.getWidth()&&(4 == A.getLength())));	
	}
	@Test
	public void getWidth_test(){
		A = new Rectangle(3,4);
		assertTrue(3 == A.getWidth());
	}
	@Test
	public void setWidth_test(){
		A = new Rectangle(3,4);
		int iWidth = 3;
		A.setWidth(3);
		int width = A.getWidth();
		assertTrue(iWidth == width);
	}
	@Test
	public void setLength_test(){
		A = new Rectangle(3,4);
		int iLength = 4;
		A.setLength(4);
		int Length = A.getLength();
		assertTrue(iLength == Length);
	}
	@Test
	public void area_test() {
		A = new Rectangle(3,4);
		assertTrue(12 == A.area());
	}
	@Test
	public void perimeter_test(){
		A = new Rectangle(3,4);
		assertFalse(100 == A.perimeter());
	}
	@Test
	public void compareTo_test1() {
		A = new Rectangle(3,4);
		a = new Rectangle(3,4);
		assertTrue(0==a.compareTo(A));
	}
	@Test
	public void compareTo_test2() {
		A = new Rectangle(3,4);
		a = new Rectangle(3,8);
		assertTrue(1==a.compareTo(A));
	}
	@Test
	public void compareTo_test3() {
		A = new Rectangle(3,8);
		a = new Rectangle(3,4);
		assertTrue(-1==a.compareTo(A));
	}
	
}