package src;

public class runGrafixMask {
	public static void main(String[] args){
		grafixMask tmp = new grafixMask();
		tmp.initializeMap();
		String[] ss = {"48 192 351 207", "48 392 351 407", "120 52 135 547", "260 52 275 547"};
		String[] sd = {"0 292 399 307"};
		grafixMask tmp2 = new grafixMask();
		Rectangle a = tmp2.convertStringToRectangle(sd[0]);
		System.out.println(a.getTLPoint().getX());
		System.out.println(a.getTLPoint().getY());
		System.out.println(a.getRBPoint().getX());
		System.out.println(a.getRBPoint().getY());
		int[] temp = tmp2.sortedAreas(ss);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
