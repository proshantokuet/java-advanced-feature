# java-advanced-feature
## Annonymous class 
Annonymous class is a inner class without a name. A nested class without name is called anonymous class.
It is an inner class without a name and for which only a single object is created.

## Difference between regular class(normal classes) and Anonymous Inner class:

1. A normal class can implement any number of interfaces but the anonymous inner class can implement only one interface at a time.
2. A regular class can extend a class and implement any number of interfaces simultaneously. But anonymous Inner class can extend a class or can implement an interface but not both at a time.
3. For regular/normal class, we can write any number of constructors but we can’t write any constructor for anonymous Inner class because the anonymous class does not have any name and while defining constructor
class name and constructor name must be same.

#functional interface
A functional interface is an interface that contains only one abstract method and any number of static and default methid.
Runnable, ActionListener, Comparable are some of the examples of functional interfaces. 



Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations. These are:
Consumer: The consumer interface of the functional interface is the one that accepts only one argument and nothing return:Example DoubleConsumer, IntConsumer, and LongConsumer
Predicate:A function that accepts an argument and, in return, generates a boolean value as an answer is known as a predicate .
Example: IntPredicate, DoublePredicate, and LongPredicate
Function 
Supplier.





# Lamda
lamda experession is enhancement of anonymous class.
We can reduce the code using lamda expression.
Lamda expression is a clean and concise way of implementing of single method interface.
