# The Factory Pattern 
## (the most used design pattern in Java) - creational type

## Goal:
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

## Steps:   
1) Create an interface.
2) Create concrete classes implementing the same interface.
3) Create a Factory to generate object of concrete class based on given information.
4) Use the Factory to get object of concrete class by passing an information such as type.
5) Verify the output.

## My example:
I made a buffet factory where you can create some types of foods or drinks. This design pattern is also great for producing enemies or just NPCs with the same look for a game.