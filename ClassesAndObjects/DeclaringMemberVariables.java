package ClassesAndObjects;

/* DECLARING MEMBER VARIABLES:
    Types of variables:
        -> Member variables in a class - called fields.
        -> Variables in a method or block of code - called local variables.
        -> variables in method declarations - called parameters

    Field declarations are composed of three components, in order:
        1. Zero or more modifiers, such as public or private.
        2. Field's type. 
        3. Field's name.
    Example: public int speed;

    ACCESS MODIFIERS:

    The first(left-most) modifier used lets you control what other classes have access to a member field.
        -> public: The field is accessible from all classes.
        -> private: THe field is accessible only within its own class.

    For encapsulation, it is common to make fields private. This means that they can only be accessed within its own class.
    we still need access to these variables, however. This can be done indirectly by adding public methods that obtain the field values for us.

*/

class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
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
