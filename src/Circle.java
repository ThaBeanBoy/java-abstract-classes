public class Circle extends Shape{
    //Properties
    int Radius;

    //Constructor
    public Circle(int x, int y, int radius){
        //Setting base class properties
        super(x, y);

        //Setting circle properties
        this.Radius = Math.abs(radius);
    }

    //Getters & setters
    public int getRadius(){
        return this.Radius;
    }

    public void setRadius(int radius){
        this.Radius = radius;
    }

    protected String Type() {
        return "Circle";
    }

    public double Area(){
        return Math.PI * Math.pow(this.Radius, 2);
    }

    public String Details(){
        return super.Details() + "\nradius : " + this.Radius;
    }
}
