public class PointA {
	private Integer x;
	private Integer y;

	public PointA(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public PointA(PointA point) {
		this.x = point.x;
		this.y = point.y;
	}
}
