package src;

import java.util.ArrayList;
import java.util.Stack;

public class grafixMask {
	public int x = 600;
	public int y = 400;
	public boolean[][] map = new boolean[x][y];
	
	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}
	
	public void resetMap(){
		map = new boolean[x][y];
	}
	
	public void initializeMap() {
		// initialize map to false;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = false;
			}
		}
	}

	public void setRectangles(Rectangle[] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = r[i].getTLPoint().getX(); j <= r[i].getRBPoint().getX(); j++) {
				for (int k = r[i].getTLPoint().getY(); k <= r[i].getRBPoint().getY(); k++) {
					map[j][k] = true;
				}
			}
		}
	}
	
/*
	public int[] sortedAreas() {
		ArrayList<Integer> areas = new ArrayList<Integer>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == false){
					System.out.println("i: "+i+" j: "+j);
					areas.add(doFill(i, j));
				}
			}
		}

		int[] result = new int[areas.size()];
		System.out.println("areas quantity = " + areas.size());
		for (int i = 0; i < areas.size(); i++) {
			result[i] = areas.get(i);
		}
		java.util.Arrays.sort(result);
		return result;
	}
*/
	
	public int[] sortedAreas(String[] s) {
		Rectangle[] listRectangles = new Rectangle[s.length];
		
		initializeMap();
		
		for(int i=0;i<s.length;i++){
			listRectangles[i]=convertStringToRectangle(s[i]);
		}
		
		setRectangles(listRectangles);
		
		ArrayList<Integer> areas = new ArrayList<Integer>();
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == false){
					areas.add(doFill(i, j));
				}
			}
		}

		int[] result = new int[areas.size()];
		for (int i = 0; i < areas.size(); i++) {
			result[i] = areas.get(i);
		}
		java.util.Arrays.sort(result);
		return result;
	}
	
	public Rectangle convertStringToRectangle(String s){
		Point a = new Point(0,0);
		Point b = new Point(0,0);
		Rectangle rec = new Rectangle(a,b);
		int spaceCount = 0;
		int beginIndex = 0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '&&spaceCount<3){
				if(spaceCount==0)
					a.setY(Integer.parseInt(s.substring(beginIndex, i)));
				
				if(spaceCount==1)
					a.setX(Integer.parseInt(s.substring(beginIndex, i)));
				
				if(spaceCount==2)
					b.setY(Integer.parseInt(s.substring(beginIndex, i)));
				
				beginIndex = i+1;
				
				if(spaceCount==2)
					b.setX(Integer.parseInt(s.substring(beginIndex,s.length())));
				
				spaceCount++;
			}
		}
		
		rec.setTLPoint(a);
		rec.setRBPoint(b);
		
		return rec;
	}

	public int doFill(int x, int y) {
		int result = 0;

		// Declare our stack of nodes, and push our starting node onto the stack
		Stack<Point> s = new Stack<Point>();
		s.push(new Point(x, y));

		while (s.empty() == false) {
			Point top = s.peek();
			s.pop();

			// Check to ensure that we are within the bounds of the grid, if not, continue
			if (top.getX() < 0 || top.getX() >= 600) continue;
			// Similar check for y
			if (top.getY() < 0 || top.getY() >= 400) continue;
			// Check that we haven't already visited this position, as we don't want to count it twice
			if (map[top.getX()][top.getY()]) continue;

			// Record that we have visited this node
			map[top.getX()][top.getY()] = true; 

			// We have found this node to be empty, and part of this connected area, 
			// so add 1 to the result
			result++;

			// Now we know that we have at least one empty square, then we will attempt to
			// visit every node adjacent to this node.
			s.push(new Point(top.getX() + 1, top.getY()));
			s.push(new Point(top.getX() - 1, top.getY()));
			s.push(new Point(top.getX(), top.getY() + 1));
			s.push(new Point(top.getX(), top.getY() - 1));
		}

		return result;
	}

/*
	//Using Recursion cause stact overflow problem
  	public static int doFill(int x, int y) {
		// Check to ensure that we are within the bounds of the grid, if not, return 0
		if (x < 0 || x >= 600) return 0;
		// Similar check for y
		if (y < 0 || y >= 400) return 0;
		// Check that we haven't already visited this position, as we don't want to count it twice
		if (map[x][y] == true) return 0;
		// Record that we have visited this node
		map[x][y] = true;
		// Now we know that we have at least one empty square, then we will recursively attempt to
		// visit every node adjacent to this node, and add those results together to return.
		return 1 + doFill(x - 1, y) + doFill(x + 1, y) + doFill(x, y + 1) + doFill(x, y - 1);
	}
*/
}
