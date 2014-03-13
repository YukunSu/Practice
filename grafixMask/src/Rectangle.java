package src;

public class Rectangle {
	
	private Point topLeft = new Point(0,0);
	private Point rightBottom = new Point(0,0);
	
	public Rectangle(){
		this.topLeft = new Point(0,0);
		this.rightBottom = new Point(0,0);
	}
	
	public Rectangle (Point topLeft, Point rightBottom){
		this.topLeft = topLeft;
		this.rightBottom = rightBottom;
	}
	
	public void setTLPoint(Point topLeft){
		this.topLeft = topLeft;
	}
	
	public void setRBPoint(Point rightBottom){
		this.rightBottom = rightBottom;
	}

	public Point getTLPoint(){
		return this.topLeft;
	}
	
	public Point getRBPoint(){
		return this.rightBottom;
	}
	
	public int getArea(){
		return getLength()*getWidth();
	}
	
	public int getPerimeter(){
		return 2*(getLength()+getWidth());
	}
	
	public int getLength(){
		return Math.abs(this.topLeft.getX()-this.rightBottom.getX());
	}
	
	public int getWidth(){
		return Math.abs(this.topLeft.getY()-this.rightBottom.getY());
	}
}
