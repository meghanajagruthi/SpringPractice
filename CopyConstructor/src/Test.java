class Test {
	public static void main(String[] args) {
		PointA one = new PointA(1, 2);
		PointB two = new PointB(5, 6, 3);
		System.out.println("---------------------");
		System.out.println(one.getClass());
		System.out.println(two.getClass());
		PointA clone1 = new PointA(one);
		PointA clone2 = new PointA(two);

		// Let check for class types
		System.out.println("---------------------");
		System.out.println(clone1.getClass());
		System.out.println(clone2.getClass());
	}
}