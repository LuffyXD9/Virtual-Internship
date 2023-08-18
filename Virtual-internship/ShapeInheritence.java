class ShapeInheritence {
        public static void main(String[] args) {
            Shape s = new Shape();
            s.display();
            Circle c = new Circle(3);
            c.calculateArea();
            c.display();
            Rectangle r = new Rectangle(4, 6);
            r.calculateArea();
            r.display();
        }
}
