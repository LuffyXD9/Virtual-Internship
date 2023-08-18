class Shape {

    public void display(){
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape {
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    double area;
    public void calculateArea(){
        area = 3.14*radius*radius;
    }
    public void display(){
        System.out.println("AREA of Circle for radius "+ radius +" is: "+area);
    }
}
class Rectangle extends Shape {
    int width, height;
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    double area;
    public void calculateArea(){
        area = width*height;
    }
    public void display(){
        System.out.println("AREA of Rectangle: "+ area);
    }
}