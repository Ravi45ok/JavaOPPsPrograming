// ! if a class is decleared final or its constructor is private then it cannot be inherited

// ! Private and Static members cannot be inherited 

// ! Final varibles and methods can be Inhehited but varibles in hidden but methods cannot be overriden


// ! Data Hiding is importat because it give controled access and valildation while protacting the internal state of object, basically we can put some validation logic getters and setters, data hiding is related to encapaculation.

// ! “In multilevel inheritance, a subclass inherits from a superclass and itself acts as a superclass for another subclass.” in other words inheritance happens level by level, where one subclass becomes the superclass for another class.”

// ! In multipule inheritace when two superclass have same methods or members are there at compile time compiler didn't understand that which method or member to bind before execution. this is called diamond ambiquity problem.that the reason classes in java don't allow multipul inheritance. Also Multiple inheritance would require multiple super calling statements, which Java does not support.

// ! Generalization

 // *Generalization is the process of extracting common features from multiple classes and putting into a single superclass.
 // *Collection is a generalized interface, while List and Set are specialized forms of it.

// ! Specialization

//* Specialization is the process of extending a superclass to add specific features in a subclass.For ex

// ! Upcasting + Generalization
// * Upcasting enables generalization by allowing a child object to be treated as its parent type.”
 
// ! Generalization + Loose Coupling
  
// * Generalization helps achieve loose coupling by making code depend on abstractions rather than concrete implementations.
  
// ! Downcasting + Specialization
  
// * Downcasting is used to access the specialized behavior of a child object from a generalized reference.
 
// !instanceof
 
// * The instanceof keyword checks the actual runtime class  type of an object, not the reference type.

// !ClassCastException 
// * ClassCastException occurs when an object is cast to a type that it is not an instance of at runtime.”

// ! Annotations

// * Annotations in Java are a form of metadata that provide information to the compiler, tools, or frameworks without changing the actual program logic. They are mainly used to enforce rules, catch errors at compile time, and provide instructions to frameworks. 

// * For example, @Override  ensures at compile time that the method is correctly overriding a parent class method.  If the method signature is  wrong, the compiler throws an error, preventing silent bugs.
// ! @Deprecated
// * it will work but This method should not be used anymore.

// ! Static variables and Static methods binds at compile time, so there is no overriding and no polymorphism only method hiding and variable hiding will be there.

// ! Non-Static varibles are resolve/bind at runtime but they don't show overriding and polymorphism. which value of varible will be used will depened only on reference type even though any type of object is assingned to the ref varible.
/*
    A a= new A()
    a.x will give the value for x defined in class A
    A a= new B()
    here also, a.x will give the value for x defined in class A
 */

// ! Non-static Methods are bind at runtime, so they shows overriding and polymorphism.
/*
    A a= new A()
    a.fun() will bind the defination of fun() defined in class A
    A a= new B()
    but, a.fun() will bind the defination of fun() defined in class B. Because of overriding.
 */