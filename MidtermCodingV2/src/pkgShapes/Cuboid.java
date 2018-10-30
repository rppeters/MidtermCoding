package pkgShapes;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable{
	
	private int iDepth;
	
	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;		
	}
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double area() {
		return (this.getiLength() * this.getiWidth() * 2) + 
				(this.getiWidth() * iDepth * 2) +
				(this.getiLength() * iDepth * 2);
	}
	
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public double volume() {
		return (this.getiLength() * this.getiWidth() * iDepth);
	}
	
	@Override
	public int compareTo(Object o) {
		Cuboid c = (Cuboid) o;
		int compareValue = ((Double)this.volume()).compareTo((Double)c.volume());
		if (compareValue != 0)
			return compareValue;
		return ((Double)this.area()).compareTo((Double)c.area());
	}

	public class SortByArea implements Comparator<Cuboid>{
		
		public SortByArea() {}
		
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.area() - c2.area());
		}
	}
		
	public class SortByVolume implements Comparator<Cuboid>{
		
		public SortByVolume() {}
		
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.volume() - c2.volume());
		}
	}
}
