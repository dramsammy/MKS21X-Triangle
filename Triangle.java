public class Triangle{
  private Point v1,v2,v3;
  public Triangle (Point x, Point y, Point z){
    x = v1;
    y = v2;
    z = v3;
  }
  public Triangle (double a, double b, double c, double d, double e, double f){
    v1 = new Point(a,b);
  	v2 = new Point(c,d);
  	v3 = new Point(e,f);
  }
  public double getPerimeter(){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }
  public Point getVertex(int index){
    Point[] points = {v1,v2,v3};
    return points[index];
}
  public void setVertex(int index, Point p){
    if (index == 0){
      v1 = p;
    }
      else if (index == 1){
        v2 = p;
      }
      else if (index == 2){
        v3 = p;
      }

  }
  public String toString() {
		return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
	}










}
