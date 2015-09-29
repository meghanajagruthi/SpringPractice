public class PointB extends PointA {
	private Integer z;

	public PointB(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public PointB(PointB point) {
		super(point); // Call Super class constructor here
		this.z = point.z;
	}
}