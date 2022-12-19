public class RunRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(2,3);
        Rectangle r4 = new Rectangle(3,3,"Hello");

        System.out.println(r1.getArea());
        r2.getAreaNonReturning();
        System.out.println(r3.getArea());
        System.out.println(r4.getArea());
        System.out.println(r1.height);
    }
    
}
