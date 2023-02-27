# CS4773-HW5

This assignment is a program which simulates an elevator's functionality.

# Overview

The elevator can travel to the floors: 1, 2, and 3. The inside of the elevator has buttons to correspond to these floor numbers.

Pressing a floor number when on the respective floor outputs "Nothing happens" to the console. All other buttons that are not of that floor's number move the elevator to those respective choices' floor.

When the elevator arrives to it's destination, the doors open. Pressing a button closes the doors. 

The elevator starts on floor 1 at program initialization. Messages are output to the console whenever: a button is pushed, the elevator moves, doors are opened or closed, the elevator arrives at a new floor, and whenever the elevator doesn't move.

The state design pattern is utilized for this assignment. A UML state diagram and class diagram will be viewable below. The state design pattern's general functionalities can be observed at this website: https://refactoring.guru/design-patterns/state

# Diagrams

![alt text](https://github.com/Jalyn-Merritt/CS4773-HW5/blob/main/assignment5UMLstate.jpg?raw=true)

![alt text](https://github.com/Jalyn-Merritt/CS4773-HW5/blob/main/assignment5UMLclass.jpg?raw=true)

# Input

This program will read input from an input file whose name is passed in at the command line. The file is to contain a series of integers from 1 to 3 to correspond to button presses. Any other integer will yield no result.

# Example Input

```shell
1 2 3 3 1 2
```

# Misc.

This program is a Maven project, the zip file 'hw5.zip' within the repository will contain the pom.xml file, UML diagrams, and source code for the program.
