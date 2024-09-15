# Singleton-DesignPattern
Singleton Design Pattern
Singleton class - 

The class objective is to create only 1 and 1 objects.
Establishing the DB Connection using Singleton - 

Different ways of Creating SingleTon class - 

1. Eager Initialization - 
Initialize on the class loading, even though if the object is not used it's loaded in memory when class is loaded (As it's static and initialized).

2. Lazy Initialization - 
Two threads comes in parallel, two objects can be created.

3. Synchronized Method - 
Only One thread is allowed to enter the method, which is very slow as only one thread executes.

4. Double Check Locking-
objects stored in Caching in multi core system. (Use volatile keyword, copy in memory)

5. Bill Pugh 
Create a private static inner class, and initialize object in that and call the object in parent class method.

6. Enum
Private constructor by default for class.



Immutable Class - 
Define data members as private with no setter methods.
