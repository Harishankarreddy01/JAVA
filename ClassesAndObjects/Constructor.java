package ClassesAndObjects;

/*CONSTRUCTOR DECLARATION
    -> looks like method declaration, except that they use the name of the class and have no return type.
    -> You don't have to provide any constructors for your class, but you must be careful when doing this. 
    -> The compiler automatically provides a no-argument, default constructor for any class without constructors. 
    -> This default constructor will call the no-argument constructor of the superclass. 
    -> In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor so you must verify that it does. 
 */

 //EXAMPLE:

 // Superclass with only parameterized constructor
 class SuperClass{
    public SuperClass(int x){
        System.out.println("Parameterized constructor of SuperClass: " + x);
    }
 }

 class ChildClass{
    //No constructor defined here.
 }

 class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass(); //This will cause a compile-time error.
    }
 }

 /*
  * If a child class does not explicitly define a constructor and its superclass only has a parameterized constructor,
    attempting to instantiate the child class will result in a compile-time error.
  */

  /*
   * If your class has no explicit superclass, then it has an implicit superclass of Object, 
   * which does have a no-argument constructor.
   */

