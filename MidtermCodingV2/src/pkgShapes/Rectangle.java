package pkgShapes;

public class Rectangle extends Shape implements Comparable{

	private int iWidth;
	private int iLength;
	
	public Rectangle(int iLength, int iWidth) {
		this.iLength = iLength;
		this.iWidth = iWidth;
	}
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return iLength * iWidth;
	}

	@Override
	public double perimeter() {
		return (iLength * 2) + (iWidth * 2);
	}
	
	@Override
	public String toString() {
		return iLength + " " + iWidth;
	}
	
	@Override
	public int compareTo(Object o) {
		Rectangle r = (Rectangle) o;
		int compareValue = ((Double)this.area()).compareTo((Double)r.area());
		if (compareValue != 0)
			return compareValue;
		return ((Double)this.perimeter()).compareTo((Double)r.perimeter());
	}
}