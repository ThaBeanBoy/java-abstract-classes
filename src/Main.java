public class Main {
    public static void main(String[] args) {
        //Making the square
        Shape[] Shapes = {
                new Square(0, 0, 200, -100),
                new Circle(300, 16, -50)
        };

        for(Shape S : Shapes)
            System.out.println(S.Details());
    }
}