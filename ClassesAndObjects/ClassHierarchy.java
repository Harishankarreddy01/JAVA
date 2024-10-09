package ClassesAndObjects;

/* Here’s a simple, easy-to-understand note on class hierarchy, focusing on Object, Number, and a custom 
ImaginaryNumber class, along with some code examples.

Java Class Hierarchy: Object, Number, and ImaginaryNumber

1. Object Class (Root of All Classes)
The Object class is the root class in Java, which means every other class directly or indirectly inherits from Object.
Object provides important methods that all classes can use, such as:
toString() → Converts an object to a string.
equals(Object obj) → Compares two objects for equality.
hashCode() → Returns a hash code for the object.
Default Constructor → Every class in Java gets a no-argument constructor if none is provided explicitly.

2. Number Class (Abstract Class in java.lang)
Number is an abstract class in the java.lang package. It is a direct subclass of Object.
Number provides methods to return numeric values as different primitive types (e.g., int, double):
intValue() → Returns the value as an integer.
doubleValue() → Returns the value as a double.
Classes like Integer, Double, and Float extend Number.

3. ImaginaryNumber Class (Custom Subclass of Number)
ImaginaryNumber is a custom class that extends Number.
It adds new functionality for representing complex numbers (numbers with a real and imaginary part).
Since Number is abstract, ImaginaryNumber must implement its abstract methods (e.g., intValue(), doubleValue()).
*/

/*
Class Hierarchy Diagram:
Object
   |
 Number (Abstract Class)
   |
 ImaginaryNumber (Custom Class)
*/

/*
Code Examples:
Object Class in Action:
Here’s how the Object class is the root of every class:


public class ExampleObject {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString()); // Default Object toString()
    }
}
*/

/*
Number Class (Abstract):
The Number class is abstract, and other classes (like Integer) extend it:

public class ExampleNumber {
    public static void main(String[] args) {
        Number num = new Integer(10); // Integer is a subclass of Number
        System.out.println(num.intValue());  // Output: 10
        System.out.println(num.doubleValue()); // Output: 10.0
    }
}
*/

/*
Custom ImaginaryNumber Class:
Now let’s extend Number to create a custom ImaginaryNumber class that handles complex numbers.

// Custom class ImaginaryNumber that extends Number
public class ImaginaryNumber extends Number {
    private double real;       // Real part of the complex number
    private double imaginary;  // Imaginary part of the complex number

    // Constructor to initialize real and imaginary parts
    public ImaginaryNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Implementing abstract methods from Number class
    @Override
    public int intValue() {
        return (int) real;  // Just an example, returns real part as int
    }

    @Override
    public double doubleValue() {
        return real;  // Returns real part as double
    }

    // Method to get the imaginary part
    public double getImaginaryPart() {
        return imaginary;
    }

    // Overriding the toString() method from Object class
    @Override
    public String toString() {
        return real + " + " + imaginary + "i"; // Returns a string like "3.0 + 4.0i"
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of ImaginaryNumber
        ImaginaryNumber num = new ImaginaryNumber(3.0, 4.0);
        
        // Using methods from ImaginaryNumber
        System.out.println(num);                // Output: 3.0 + 4.0i
        System.out.println(num.intValue());     // Output: 3 (real part as int)
        System.out.println(num.doubleValue());  // Output: 3.0 (real part as double)
        System.out.println(num.getImaginaryPart()); // Output: 4.0 (imaginary part)
    }
}
*/

/*
Key Points:
Object is the root class of all Java classes and provides basic methods like toString() and equals().
Number is an abstract class that extends Object. It requires subclasses to implement methods like intValue() 
and doubleValue().
ImaginaryNumber is a custom class that extends Number and adds functionality for imaginary numbers while also 
overriding/implementing methods from Number and Object.
*/

/*
This note summarizes how class hierarchies work in Java and how you can create custom classes by extending 
existing ones like Number. You can now see how Object is at the root of everything and how you can override 
methods in any subclass!
*/