public class Square extends Shape {
    //Properties
    private int Width;
    private int Height;

    //Constructor
    public Square(int x, int y, int width, int height){
        //Setting base properties
        super(x, y);

        //Setting the square's properties
        this.Width = Math.abs(width);
        this.Height = Math.abs(height);
    }
    protected String Type() {
        return "Square";
    }

    public String Details(){
        return super.Details() + "\n" +
                "Width  : " + this.Width + endl() +
                "Height : " + this.Height + endl();
    }

    public double Area() {
        return this.Width * this.Height;
    }
}
