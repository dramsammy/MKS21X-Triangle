public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distance(Point a){
    double coord1 = a.getX();
    double coord2 = a.getY();
    double coord3 = getX();
    double coord4 = getY();
    double distance = Math.sqrt(Math.pow((coord3 - coord1), 2) + Math.pow((coord4 - coord2),2 ));
    return distance;
  }
  public static double distanceTo(Point a, Point b){
    double coord1 = a.getX();
    double coord2 = a.getY();
    double coord3 = b.getX();
    double coord4 = b.getY();
    double distance = Math.sqrt(Math.pow((coord3 - coord1), 2) + Math.pow((coord4 - coord2),2 ));
    return distance;
  }
  public String toString(){
    return ("(" + x + "," + y + ")");
  }
}
