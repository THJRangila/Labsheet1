public class Area {

    double length;
    double breadth;
    public void setDim (double length , double breadth){
        this.length=length;
        this.breadth=breadth;

    }

    double getArea(){
        return length*breadth;

    }

    public static void main (String[] args){
        Area rec = new Area();

        double length = 5;
        double breadth = 10;
        rec.setDim(length, breadth);

        double area = rec.getArea();
        System.out.println("area of rectangle with length " + length+ " and breadth " + breadth+ " is " +area );
    }
}