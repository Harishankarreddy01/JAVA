package ClassesAndObjects;

/*
 * Along with primitive data types,  A method can also return a reference data type. 
 * For example, in a program to manipulate Bicycle objects, we might have a method like this:

public Bicycle seeWhosFastest(Bicycle myBike, Bicycle yourBike,
                              Environment env) {
    Bicycle fastest;
    // code to calculate which bike is 
    // faster, given each bike's gear 
    // and cadence and given the 
    // environment (terrain and wind)
    return fastest;
}
 */


/*RETURNING A CLASS OR A INTERFACE

When a method uses a class name as its return type, such as whosFastest does, the class of the type of the 
returned object must be either a subclass of, or the exact class of, the return type. 
Suppose that you have a class hierarchy in which ImaginaryNumber is a subclass of java.lang.Number, 
which is in turn a subclass of Object, as illustrated in the following figure.

The class hierarchy for ImaginaryNumber:
Object
   |
Number
   |
Imaginary Number

Now suppose that you have a method declared to return a Number:

public Number returnANumber() {
    ...
}
IMP: "The returnANumber method can return an ImaginaryNumber but not an Object. ImaginaryNumber is a Number 
because it's a subclass of Number". However, an Object is not necessarily a Number — it could be a String or another type.

You can override a method and define it to return a subclass of the original method, like this:

public ImaginaryNumber returnANumber() {
    ...
}

This technique, called covariant return type, means that the return type is allowed to vary in the same direction as the subclass.

Note: You also can use interface names as return types. In this case, the object returned must implement the specified interface.
  */