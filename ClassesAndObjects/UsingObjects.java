package ClassesAndObjects;

class Point {
    public int x = 0;
    public int y = 0;
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}



class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }
}



class CreateObjectDemo {

    public static void main(String[] args) {
		
        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
		
        // display rectOne's width, height, and area
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());
		
        // set rectTwo's position
        rectTwo.origin = originOne;
		
        // display rectTwo's position
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
		
        // move rectTwo and display its new position
        rectTwo.move(40, 72);
        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}


/* REFERENCING AN OBJECT'S FIELDS:
 * Code that is outside the object's class must use an object reference or expression, followed by the dot (.) operator, 
 * followed by a simple field name, as in:
            objectReference.fieldName

    Because these fields exists only within an object.
 */

 /*
  * To access a field, Recall that the new operator returns a reference to an object. 
    So you could use the value returned from new to access a new object's fields:

            int height = new Rectangle().height;
  */

/* REFERENCING AN OBJECT'S METHODS:
 * You also use an object reference to invoke an object's method. 
 *          objectReference.methodName(argumentList);
 */

/*
 * The new operator returns an object reference, 
 * so you can use the value returned from new to invoke a new object's methods:
 *          new Rectangle(100, 50).getArea()
 * 
 * Remember, invoking a method on a particular object is the same as sending a message to that object. 
 * In this case, the object that getArea() is invoked on is the rectangle returned by the constructor.
 */