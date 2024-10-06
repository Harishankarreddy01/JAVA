package ClassesAndObjects;

/*Note: Parameters refers to the list of variables in a method declaration. 
Arguments are the actual values that are passed in when the method is invoked. 
When you invoke a method, the arguments used must match the declaration's parameters in type and order. */

/*PARAMETER TYPES:
 * You can use primitive data types, such as doubles, floats, and integers. Also you can use reference data types,
 * such as objects and arrays.
 * 
 * Example: 
 * In this example, the method creates a new Polygon object and initializes it from an array of Point objects 
 * (assume that Point is a class that represents an x, y coordinate):
 
 * public Polygon polygonFrom(Point[] corners) {
    // method body goes here
    }

 */

 /*Arbitrary Number of Arguments:
  * You can use a construct called varargs to pass an arbitrary number of values to a method. 
  You use varargs when you don't know how many of a particular type of argument will be passed to the method. 
  It's a shortcut to creating an array manually (the previous method could have used varargs rather than an array).

  To use varargs, you follow the type of the last parameter by an ellipsis (three dots, ...), then a space, and the parameter name. 
  The method can then be called with any number of that parameter, including none.

  Example:
  public Polygon polygonFrom(Point... corners) {}

  note: Inside the method, corners is treated like an array. The method can be called either with an array or 
  with a sequence of arguments. The code in the method body will treat the parameter as an array in either case.
  */

/*PASSING PRIMITIVE DATA TYPE ARGUMENTS
 * -> Primitive arguments, such as an int or a double, are passed into methods by value.
 * -> This means that any changes to the values of the parameters exist only within the scope of the method. 
 *    When the method returns, the parameters are gone and any changes to them are lost.
 * 
 *  Example:
 *   int x = 3;
 *   passMethod(x);
 *   System.out.println("After invoking passMethod, x = " + x);
 *   public static void passMethod(int p) {
        p = 10;
    }

    Output: After invoking passMethod, x = 3
 */

/*PASSING REFERENCE DATA TYPE ARGUMENTS
 * -> Reference data type parameters, such as objects, are also passed into methods by value.
 * -> This means that when the method returns, the passed-in reference still references the same object as before. 
 *    However, the values of the object's fields can be changed in the method, if they have the proper access level.
 * 
 * Example:
 * public void moveCircle(Circle circle, int deltaX, int deltaY) {
    // code to move origin of circle to x+deltaX, y+deltaY
    circle.setX(circle.getX() + deltaX);
    circle.setY(circle.getY() + deltaY);
        
    // code to assign a new reference to circle
    circle = new Circle(0, 0);
    }

    Let the method be invoked with these arguments:
    moveCircle(myCircle, 23, 56)

    ->Modifying the object’s internal state (using methods like setX() and setY()) will affect the 
    original object (myCircle) because both circle and myCircle are pointing to the same object.
    ->Reassigning the reference (circle = new Circle(0, 0)) only affects the local reference 
    (circle inside the method). It does not change what myCircle refers to.

    "own words: just imagine a circle object in air, and the name of object is mycircle, you are passing this
    as an argument to a method, and the parameter name is circle. you can imagine this as not a copy of circle
    object is passed, the copy of reference is passed. means, you can imagine like two arrows are pointing towards
    that imagined circle object one arrow name is mycircle(the original object) and circle(parameter name).
    here we are not copying the circle object, we are just copying the name "mycircle". both refers to the same object.
    whereas, in primitive datatype, the value itself is copied, for suppose x=3 is passed to a method, and parameter
    name is p, this means you create a copy of 3 and assigns it to p, but not both x and p refers to same 3.
 */

 /*conclusion:
  * -> For primitive types, the value itself is copied, and changes inside the method don't affect the original variable.
    -> For reference types, a copy of the reference (not the object) is passed, so changes to the object through this reference affect the original object.
  */