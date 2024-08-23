public class Shape{
    float length;
    float breath;
    Shape(float l,float b){
        this.length=l;
        this.breath=b;
    }
    Shape(float a) {
        this.length=a;
    }
    float area(){
        return 0;
    }
}

class Rectagle extends Shape{
    Rectagle(float l,float b){
        super(l,b);
    }
    float area(){
        return length*breath;
    }
}

class Square extends Shape{
    Square(float a){
        super(a);
    }
    float area(){
        return length*length;
    }
}

class ShapeDemo{
    public static void main(String[] args) {
        Shape shape1=new Square(15);
        System.out.println(shape1.area());
        Shape shape2=new Rectagle(23.5f, 24.5f);
        System.out.println(shape2.area());

    }
}