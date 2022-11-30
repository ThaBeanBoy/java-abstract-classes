# Abstract Class Experiment

## Description

While learning Java, I wanted to experiment with a couple of things. mainly
- Abstract Classes
- Class inheritance
- Polymorphism

## UML
![UML Diagram of classes](uml.png)

## Abstract Classes

Judging from the UML diagram above, I decided to make shape the abstract base class

### Shape Class
```java
public abstract class Shape {
    protected abstract String Type();

    public abstract double Area();
    public String Details(){
        
    }
    // Rest of the class
}
```

## Class Inheritance

The reason why the Area & the Type methods are abstract is because there is no clear definition of how to implement these methods 

### Square Class
```java
public class Square extends Shape {
    //Properties
    private int Width;
    private int Height;

    //Constructor
    public Square(int x, int y, int width, int height) {
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

    // Rest of the class
}
```

### Circle Class
```java
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

    //Rest of class
    
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
```

I was so happy the first time I used the super class.

## Polymorphism

At first, I thought this would be a very challenging thing due to my prior experience with c++. But it was really easy o implement in Java

```java
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
```

The reason why I chose to initialise the objects when making the Shapes array is because in other languages, I would be alerted that you cant make an array of an abstract data type.