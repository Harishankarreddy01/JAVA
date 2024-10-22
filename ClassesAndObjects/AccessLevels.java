package ClassesAndObjects;

/*
 * The following table shows the access to members permitted by each modifier.

Access Levels
Modifier	Class	Package	Subclass	World
public	      Y	       Y	   Y	     Y
protected	  Y	       Y	   Y	     N
no modifier	  Y	       Y	   N	     N
private	      Y	       N	   N	     N

-> The first data column indicates whether the class itself has access to the member defined by the access level. 
As you can see, a class always has access to its own members.
-> The second column indicates whether classes in the same package as the class (regardless of their parentage) have access to the member. 
-> The third column indicates whether subclasses of the class declared outside this package have access to the member.
-> The fourth column indicates whether all classes have access to the member.
 */

/*EXAMPLE:
 * Package 1    Package 2
    Alpha        AlphaSub
    Beta         Gamma

The following table shows where the members of the Alpha class are visible for each of the access modifiers that can be applied to them.

Visibility:
Modifier	Alpha	Beta	Alphasub	Gamma
public	    Y	    Y	    Y	        Y
protected	Y	    Y	    Y	        N
no modifier	Y	    Y	    N	        N
private	    Y	    N	    N	        N
 */

/*
Tips on Choosing an Access Level: 
If other programmers use your class, you want to ensure that errors from misuse cannot happen. Access levels can help you do this.

-> Use the most restrictive access level that makes sense for a particular member. Use private unless you have a good reason not to.
-> Avoid public fields except for constants.Public fields tend to link you to a particular implementation and limit your flexibility in changing your code.
-> The preferred approach is to make fields private and provide getter and setter methods for controlled access, allowing future flexibility and encapsulation
 */
