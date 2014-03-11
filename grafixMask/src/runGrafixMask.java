package src;

public class runGrafixMask {
	public static void main(String[] args){
		grafixMask tmp = new grafixMask();
		tmp.initializeMap();
		
//		Point tlPoint1 = new Point(192, 48);
//		Point rbPoint1 = new Point(207, 351);
//		Point tlPoint2 = new Point(392, 48);
//		Point rbPoint2 = new Point(407, 351);
//		Point tlPoint3 = new Point(52, 120);
//		Point rbPoint3 = new Point(547, 135);
//		Point tlPoint4 = new Point(52, 260);
//		Point rbPoint4 = new Point(547, 275);
//		Rectangle r1 = new Rectangle(tlPoint1, rbPoint1);
//		Rectangle r2 = new Rectangle(tlPoint2, rbPoint2);
//		Rectangle r3 = new Rectangle(tlPoint3, rbPoint3);
//		Rectangle r4 = new Rectangle(tlPoint4, rbPoint4);
//		Rectangle[] listRectangles = { r1,r2,r3,r4 };
		
		Point tlPoint1 = new Point(292, 0);
		Point rbPoint1 = new Point(307, 399);
		Rectangle r1 = new Rectangle(tlPoint1, rbPoint1);
		Rectangle[] listRectangles = { r1 };

		tmp.setRectangles(listRectangles);
		int[] result = tmp.sortedAreas();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
