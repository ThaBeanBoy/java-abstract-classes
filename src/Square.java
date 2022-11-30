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

    //Getters & setters
    public int getWidth(){
        return this.Width;
    }

    public void setWidth(int width){
        this.Width = Math.abs(width);
    }

    public int getHeight(){
        return this.Height;
    }

    public void setHeight(int height){
        this.Height = height;
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
