package ClassesAndObjects;
/* DECLARING CLASSES:
    Modifiers such as public, privates and a number of others
    The class name, with the initial letter capitalized by convention.
    The name of the class's parent(superclass), if any, preceded by the keyword extends. A class can only extend one parent.
    A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    A class body surrounded by braces, {}.

    Example:
    public class MyClass extends MySuperClass implements YourInterface {
        field, constructor, and
        method declarations.
    }

    constructor: initializing new objects
    fields: provide the state of the class and its objects
    methods: To implement the behavior of the class and its objects.
 */

class Bicycle{
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

    public void setCadence(int newValue){
        cadence = newValue;
    }
    
    public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedup(int increment){
        speed += increment;
    }
}