# The Singleton Pattern 
## (one of the simplest design patterns in Java) - creational type

## Goal:
It involves one single class, which is responsibe to create an object and makes sure that only one object is created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

## Steps:   
1) Create a (Singleton) class.
2) Get the only object from the singleton class.
3) Verify the output.
	
## My example:
We can agree, that in most games it is necessary, that the player has HP(health) and coins. It's important, that most of the methods in our game can reach and modify those things (the player got hurt, his hp must be decreased). We must be careful and pay attention that there is just one class for game mechanics, because there would be a trouble if multiple objects are storing and managing the player's HP and gold.