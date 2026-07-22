LLD-Journey/
├── Phase1-OOP/
│   ├── 01-Classes/
│   ├── 02-Encapsulation/
│   ├── 03-Inheritance/
│   ├── 04-Polymorphism/
│   └── 05-Abstraction/
├── Phase2-SOLID/QA
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
A class is the blueprint for the objects 
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

**Q.5 What is encapsulation in one line?**
If fields are public, anyone can set invalid values like balance = -99999, and you have no way to stop it. 
Private fields + methods give you control over what values are allowed.

**Q.6 What does private keyword do?**
private keyword restricted the access of that member outside that class.

**Q.7 What is a getter and why do we need it?**
In encapsulation, we restricted access of variable outside that class to access we make public getter setter

**Q.8 Why can't you just keep fields public?**
not everyone can access the data.

**Q.9 What is inheritance in one line?**
Inheritance is used to inherit the property of parent class into the child class no need to re-write or declare 
whole variable again

**Q.10 What does extends do?**
Extends keyword is a keyword that is used to inherit the parent class into child class

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
It hides the implementation and show the functionality. Like area how it is working it hides that but area what is providing 
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
Extends keyword is used to inherit the class we can use override functionality but if a class not use extends
it still can use its member.
extends means "IS A". Library is not a Book. Library is not a Member. Library just USES books and members.
That is called composition — one class uses objects of another class.
Also, you don't need to extend Member to use it in a method. You can just take a Member object as a parameter
directly.
Composition = HAS A relationship. Library HAS A list of Books.
Inheritance = IS A relationship. SavingsAccount IS A BankAccount.

***************************************************PHASE 2, SOLID***************************************************
*************Single Responsibility Principle(SRP)*************

**Q.1 What is Single Responsibility Principle in one line?**
In this one class should have only reason to change.

**Q.2 What was wrong with the old Library class?**
in old library we wre handling all operation, add book, get book, return boo, issued book.

**Q.3 How did splitting into BookRepository and BookIssueService fix it?**
It split operation in two parts we are handling add book, get book in book repo and checkin book availability in bookIssue service we implement in this all book issue methods.

**Q.4 What does "one reason to change" mean in your own words?**
It means one class handle only one service like issue book now all method related to issue book only implemented 
in this class like availability of book only then book can be issue.

***********NOTE***********
In Spring Boot, your UserService should only handle user business logic. 
Your UserRepository should only handle DB queries. Your UserController should only handle HTTP requests. 
Three classes, three jobs, three reasons to change separately.

**************Open/closed Principle(OCP)**************

**Q.5 What is Open/Closed Principle in one line?**
 A class which is open for extension but closed for modification

**Q.6 What was the problem with if-else approach for discounts?**
Have to make multiple if else condition and in future if another discount method need then have to do modification on that.

**Q.7 How did DiscountStrategy interface fix it?**
DiscountStrategy interface made Order independent of which discount type is used. 
Order just calls apply() without knowing the implementation. 
So any new discount class that implements DiscountStrategy automatically works with Order without changing it.

**Q.8 What did you have to change in Order when you added BuyOneGetOneDiscount?**
Nothing, no need to change for another implementations 

************Liskov Substitution Principle (LSP)************

**Q.9 What is Liskov Substitution Principle in one line?**
Child class should be replaceable for the parent class without breaking the program's behavior.

**Q.10 What was the violation with Square extending Rectangle?**
If we were changing height then it was changing width also and vice versa. So if we were calling sq as a rect, but
it was den that behavior.

**Q.11 What was the fix?**
We made a interface so without extending class , classes implements that interface and behave accordingly.

**Q.12 One line to remember when inheritance is wrong to use?**
When one class doesn't need anything from another class or both the classes have different behavior.


********************Interface Segregation Principle(ISP)********************

**Q.13 What is Interface Segregation Principle in one line?**
In this we made multiple interfaces rather then 1 sp that a class can implement only needed interface.

**Q.14 What was wrong with the fat Printer interface?**
There were 3 methods in that but after making print class that only need only print print method but we have to implement
other methods also like scan and fax.

**Q.15 How did splitting into Printable, Scannable, Faxable fix it?**
Printable have print method scannable have scan method and faxable have fax method so in future after creating class
if we need only one class then have to just implement that interface. so what method we will need we will just implement that interface.

**Q.16 Real world example from Spring Boot where ISP applies?**
In Spring Boot you have JpaRepository, CrudRepository, PagingAndSortingRepository. 
Each has different methods. You pick only the one that has what you need. That is ISP in action.


******************Dependency Injection Principle(DIP)******************

**Q.17 What is Dependency Inversion Principle in one line?**
In this we don't have to directly depend on the specific implementation rather it depends on interface.

**Q.18 What was wrong with directly using EmailSender inside NotificationService?**
It will send only email msg and for sms msg either we have to change it or we have to implement another service

**Q.19 How did MessageSender interface fix it?**
As interface implement in both(sms,email) then we don't have to make multiple classes at the run time we can directly
call which method we want to call sms or email.

**Q.20 Where have you already used DIP without knowing it?**
In your spiritual-habit-tracker Spring Boot project, your Service classes don't directly create Repository objects. 
Spring injects them automatically via @Autowired.Your Service only depends on the Repository interface,
not the concrete implementation. That is DIP — Spring is doing the dependency injection for you.











