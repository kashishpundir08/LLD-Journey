LLD-Journey/
├── Phase1-OOP/
│   ├── 01-Classes/
│   ├── 02-Encapsulation/
│   ├── 03-Inheritance/
│   ├── 04-Polymorphism/
│   └── 05-Abstraction/
├── Phase2-SOLID/
│   ├── S-SingleResponsibility/
│   ├── O-OpenClosed/
│   ├── L-LiskovSubstitution/
│   ├── I-InterfaceSegregation/
│   └── D-DependencyInversion/
├── Phase3-Patterns/
│   ├── 01-Singleton/
│   ├── 02-Factory/
│   ├── 03-Strategy/
│   ├── 04-Observer/
│   ├── 05-Builder/
│   └── 06-Decorator/
├── Phase4-MiniSystems/
│   ├── ParkingLot/
│   ├── ATM/
│   └── ShoppingCart/
└── Notes/
└── patterns-notes.md   

*************************************************PHASE 1 **********************************************************
**Q.1 What is a class?**
A class is this blueprint for the objects 
It doesn't take physical memory because it is a virtual implementation.

**Q.2 What is an object?**
Objects are the actual implementation of a class. it takes physical memory 

**Q.3 What did this mean?**
this refers to the current object. When the constructor parameter name and the field name are the same, 
this.owner means "the field of this object" and owner alone means "the parameter that was passed in."

**Q.4 What did the constructor do?**
A constructor is used to initialize the objects.
It has no return type.
Class name and constructor name should be same

Day 2
**Q.5 What is encapsulation in one line?**
If fields are public, anyone can set invalid values like balance = -99999 and you have no way to stop it. 
Private fields + methods give you control over what values are allowed.

**Q.6 What does private do?**
private keyword restricted the access of that member outside that class.

**Q.7 What is a getter and why do we need it?**
In encapsulation we restricted access of variable outside that class to access we make public getter setter

**Q.8 Why can't you just keep fields public?**
not everyone can access the data.

**Q.9 What is inheritance in one line?**
Inheritance is used to inherit the property of parent class into the child class no need to re write or declare 
whole variable again

**Q.10 What does extends do?**
Extends is a keyword that is used to inherit the parent class into child class

**Q.11 What does super() do and why is it needed?**
super() is used to call the parent class constructor no need to define again

**Q.12 What is the benefit — what would you have had to do without it?**
I don't have to rewrite or define whole variable again.

**Q.13 What is polymorphism in one line?**
Same method name but can use in different ways , method overloading and method overriding

**Q,14 Difference between overloading and overriding?**
overloading is compile time polymorphism happens within the same class and overriding is run time polymorphism
happens in child class, class should have parent child relationship

**Q.15 What is @Override and why use it?**
This keyword is used to override parent method into child class.

**Q.16 What surprised you about BankAccount ba = new SavingsAccount(...) — which showBalance got called and why?**
Here run time polymorphism happen as we make object of parent class but on calling method of showBalance child method will be call
because savingsAccount override the method showBalance of BankAccount

**Q.17 What is abstraction in one line?**
It hide the implementation and show the functionality. Like area how it is working it hides that but area what is providing 
that shows

**Q.18 Difference between abstract class and interface?**
Abstract class = what you ARE. Interface = what you CAN DO.
Circle IS a Shape. Circle CAN BE Printable.

**Q.19 When would you use abstract class vs interface?**
Abstract can have both method abstract and normal method with body and interface can have only abstract before java 8
a class can only extend one abstract class but can implement multiple interface

**Q.20 What does implements mean vs extends?**
implements is used to implement the interface and extend is used to inherit the parent class into child class 

**What is the difference between a class that USES another class vs a class that EXTENDS another class? 
Give an example from today.**
Extends is used to inherit the class we can use override functionality but if a class not use extends
it still can use its member.
extends means "IS A". Library is not a Book. Library is not a Member. Library just USES books and members.
That is called composition — one class uses objects of another class.
Also you don't need to extend Member to use it in a method. You can just take a Member object as a parameter
directly.
Composition = HAS A relationship. Library HAS A list of Books.
Inheritance = IS A relationship. SavingsAccount IS A BankAccount.


******************************************************PHASE 2 ******************************************************************


























