public abstract class Shape {
    //Properties
    protected int x;
    protected int y;

    //Constructor
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Methods
    protected abstract String Type();

    public abstract double Area();
    public String Details(){
        return "Shape type : " + Type() + endl() +
                "x    : " + this.x + "px" + endl() +
                "y    : " + this.y + "px" + endl() +
                "Area : " + this.Area() + "px^2";
    }

    //Getters & setters
    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    //Utility function
    protected String endl(){
        return "\n";
    }

    protected  String endl(int breaks){
        String out = "";
        for(int i=0; i<breaks; i++)
            out += endl();

        return out;
    }
}
