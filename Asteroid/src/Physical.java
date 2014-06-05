import java.awt.Image;
import java.awt.Point;


public class Physical {
	Image pict;
	Point position;
	Point vitesse;
	float angle;
	int vitesseAng;
	
	void incrSpeed(){}
	void decrSpeed(){}
	void turnRight(){}
	void turnLeft(){}
	Point centrer(){
		return new Point(position.x - pict.getWidth(null)/2,position.y - pict.getHeight(null)/2);
	}
	Point getPosition(){
		return position;
	}
}
