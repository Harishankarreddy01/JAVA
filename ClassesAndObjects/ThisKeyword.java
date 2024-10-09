package ClassesAndObjects;

/*USING THIS WITH A FIELD
 * The most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter.

For example, the Point class was written like this

public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
but it could have been written like this:

public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
Each argument to the constructor shadows one of the object's fields — inside the constructor x is a local copy 
of the constructor's first argument. To refer to the Point field x, the constructor must use this.x.
 */

/* USING THIS WITH A CONSTRUCTOR
 * From within a constructor, you can also use the this keyword to call another constructor in the same class. 
 * Doing so is called an explicit constructor invocation. 
 * 
 * EXAMPLE:
    public class Rectangle {
        private int x, y;
        private int width, height;
            
        public Rectangle() {
            this(0, 0, 1, 1);
        }
        public Rectangle(int width, int height) {
            this(0, 0, width, height);
        }
        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    ...
}
This class contains a set of constructors. Each constructor initializes some or all of the rectangle's member 
variables. The constructors provide a default value for any member variable whose initial value is not provided 
by an argument. For example, the no-argument constructor creates a 1x1 Rectangle at coordinates 0,0. 
The two-argument constructor calls the four-argument constructor, passing in the width and height but always 
using the 0,0 coordinates. As before, the compiler determines which constructor to call, based on the number and 
the type of arguments.
 */

/*
 * -> The this() call must be the first statement in the constructor when used.
 * -> The this() constructor call is related to the current object, 
 *    and it ensures that the current object is initialized through another constructor in the same class.
   -> It allows constructors to call each other to streamline initialization without redundant code, 
    while still working on the same object instance.
 */