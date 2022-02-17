# The Visitor Pattern
## - behavior pattern category

## Goal:
In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. By this way, execution algorithm of element can vary as and when visitor varies.

## Steps:   
1) Define an interface to represent element.
2) Create concrete classes extending the above class.
3) Define an interface to represent visitor.
4) Create concrete visitor implementing the above class.
5) Use the FamilyVisitor to request visits to the animals in the Zoo.
6) Verify the output.

## My example:
A family is visiting the animals in the zoo. First they need to request a visit then if the animal accepts the visit can the family visit the specific animal.