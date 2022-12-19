class Rectangle {

//attributes @ data fields
double height = 4; // default modifier
double width = 4;

//1. default constructor - no constructor is defined explicitly

//2. no-argument constructor
Rectangle(){

    //System.out.println("This is a no-argument constructor");
    //height = 5;
    //width = 5;

}

//3. Parameterized constructor

Rectangle(double h, double w){

    height = h;
    width = w;

}

Rectangle(double h, double w, String message){

    height = h;
    width = w;
    System.out.println(message);

}



//behaviours @ functions @ methods
//returning type function
double getArea(){

    double area;
    area = height*width;
    return area;

}

//non-returning type function
void getAreaNonReturning(){

    double area;
    area = height*width;
    System.out.println(area);

}

}