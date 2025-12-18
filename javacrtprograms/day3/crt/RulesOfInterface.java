package day3.crt;
/*
 * Rule 1
 * An Interface is like a contract which when implemented helps to achieve the standardization.
 * 
 *Rule 2
 *Interface promotes polymorhism.An Interface type reference can point to implementing class objects.
 *This achieves loose coupling code reduction and code flexibility
 *
 *Rule 3
 *Methods within an interface are automatically public abstract.
 *
 *Rule 4
 *Specialized methods can't be accessed by interface type reference.
 *
 *Rule 5
 *If a class partially implements interface it must declare itself as abstract.
 *
 *Rule 6
 *A class can implement multiple interfaces because diamond shape problem doesn't exist as interface will not have parent.
 *
 *Rule 7
 *An interface can't implement another interface because interface can't provide methods with bodies inside it.
 *
 *Rule 8
 *An interface can extend another interface not only this it can indirect from multiple interfaces 
 *because diamond shape problem doesn't exist multiple inheritance in java can be indirectly achieved by making use of interface.
 *
 *Rule 9
 *A class can both extend and another class as well as implement an interface however order should be extebd first implement later.
 *
 * Rule 10
 * An interface can contain constant variables and method signatures.a variable within an interface
 *  is automatically become public static final.
 *  
 *  Rule 11
 *  An empty interface in java is refer to as marker interface or tagged interface,it is used to provide special properties 
 *  to the object after class.
 *  
 *  Rule 12
 *  An object of an interface can't be created because an interface is a collection of abstract methods however reference 
 *  can be created so that loose coupling, polymorphism and its advantages can be achieved.
 */
public class RulesOfInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
