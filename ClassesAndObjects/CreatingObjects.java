package ClassesAndObjects;

/* CREATING OBJECTS
Example:
Point originOne = new Point(23, 94);
Declaration: associate a variable name with an object type.
Instantiation: The new keyword is a Java operator that creates the object.
Initialization: The new operator is followed by a call to a constructor, which initializes the new object.
 */

/* Declaring a Variable to Refer to an Object
 * You declare a reference variable like this:
 * point originOne;
 * ->if you declare originOne like this, its value will be undetermined until a object is created and assigned to it.
 * -> Simply declaring a reference variable does not create an object.
 * -> You must assign an object to originOne before you use it in your code. Otherwise, you will get a compiler error.
 * -> it is just a reference that is pointing to nothing.
 */

 /*
  * Instantiating a Class
    -> The new operator instantiates a class by allocating memory for a new object and "returning a reference" to that memory. 
    The new operator also invokes the object constructor.
    -> The new operator requires a single, postfix argument: a call to a constructor. 
    The name of the constructor provides the name of the class to instantiate.
    -> The new operator returns a reference to the object it created. This reference is usually assigned to a variable of the appropriate type, like:
    Point originOne = new Point(23, 94);

    ***Note: originOne is a variable of type Point, which is a "reference data type". 
    This means originOne will hold a reference (or pointer) to the Point object, not the object itself.***
*/
