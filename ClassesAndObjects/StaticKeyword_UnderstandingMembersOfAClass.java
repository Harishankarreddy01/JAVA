package ClassesAndObjects;

/*CLASS VARIABLES:-
 * ->When a number of objects are created from the same class blueprint, they each have their own distinct copies of instance variables.
 * -> Sometimes, you want to have variables that are common to all objects. This is accomplished with the static modifier. 
 *  Fields that have the static modifier in their declaration are called static fields or class variables.
 *  They are associated with the class, rather than with any object. Every instance of the class shares a class variable, which is in one fixed location in memory.
 *  Any object can change the value of a class variable, but class variables can also be manipulated without creating an instance of the class.
 * 
 * -> EXAMPLE: For example, suppose you want to create a number of Bicycle objects and assign each a serial number, beginning with 1 for the first object. 
 *  This ID number is unique to each object and is therefore an instance variable. At the same time, you need a field to keep track of how many 
 *  Bicycle objects have been created so that you know what ID to assign to the next one. Such a field is not related to any individual object, but to the class as a whole. 
 *  For this you need a class variable
 * 
 * ->Class variables are referenced by the class name itself, as in
 *          Bicycle.numberOfBicycles
 *   You can also refer to static fields with an object reference, But it is discouraged because it does not make it clear that they are class variables.
 *  
 *  Example code i will provide at the end
 */

 /*CLASS METHODS:-
  * Static methods, which have the static modifier in their declarations, should be invoked with the class name, without the need for creating an instance of the class, as in
            ClassName.methodName(args)
    You can also refer to class methods with an object reference, but it is discouraged because it does not make it clear that they are class methods.

    A common use for static methods is to access static fields. For example, we could add a static method to the Bicycle class to access the numberOfBicycles static field:

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    Not all combinations of instance and class variables and methods are allowed:

    Instance methods can access instance variables and instance methods directly.
    Instance methods can access class variables and class methods directly.
    Class methods can access class variables and class methods directly.
    Class methods **CANNOT** access instance variables or instance methods directly—they must use an object reference. Also, class methods cannot use the this keyword as there is no instance for this to refer to.
  */

  /*CONSTANTS
   * The static modifier, in combination with the final modifier, is also used to define constants. The final modifier indicates that the value of this field cannot change.

    For example, the following variable declaration defines a constant named PI, whose value is an approximation of pi (the ratio of the circumference of a circle to its diameter):

    static final double PI = 3.141592653589793;
    Constants defined in this way cannot be reassigned, and it is a compile-time error if your program tries to do so. 
    By convention, the names of constant values are spelled in uppercase letters. If the name is composed of more than one word, the words are separated by an underscore (_).

    Note:
    Note: If a primitive type or a string is defined as a constant and the value is known at compile time, the compiler replaces the constant name everywhere in the code with its value. 
    This is called a compile-time constant. If the value of the constant in the outside world changes (for example, if it is legislated that pi actually should be 3.975), 
    you will need to recompile any classes that use this constant to get the current value.
   */

class Bicycle{
    private int cadence;
    private int gear;
    private int speed;

    private int id;

    private static int NumberOfBicycles = 0;

    public Bicycle(int startCadence, int startGear, int startSpeed){
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;

        id = ++NumberOfBicycles;
    }

    public int getID(){
        return id;
    }

    public int getNumberOfBicycles(){
        return NumberOfBicycles;
    }

    public int getCadence(){
        return cadence;
    }

    public void setCadence(int newValue){
        cadence = newValue;
    }

    public int getGear(){
        return gear;
    }

    public void setGear(int newValue){
        gear = newValue;
    }

    public int getSpeed(){
        return speed;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedup(int increment){
        speed += increment;
    }
    
}
