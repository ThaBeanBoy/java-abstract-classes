public class Square extends Shape {
    //Properties
    private int Width;
    private int Height;

    //Constructor
    public Square(int x, int y, int width, int height){
        //Setting base properties
        super(x, y);

        //Setting the square's properties
        this.Width = width;
        this.Height = height;
    }
    protected String Type() {
        return "Square";
    }

    public double Area() {
        return this.Width * this.Height;
    }
}
