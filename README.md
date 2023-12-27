# Second-Order Linear Recurrence Solver

## Overview
This Java application efficiently solves second-order linear recurrence relations. Leveraging the algorithm from Section 3.2 of a specified textbook, it computes the closed form of a given second-order recurrence relation and outputs the series' values for the first ten terms.

## Features
- **Standard Input Reading**: Processes input directly from the standard input (System.in).
- **Quadratic Formula Implementation**: Utilizes the quadratic formula to compute the roots of the recurrence relation.
- **System of Equations Solver**: Solves a system of two equations to determine the coefficients of the series.
- **Series Computation and Display**: Calculates and prints the values for the first ten terms of the series.

## Input Format
The program expects input in the following format:  
S(1) [value]  
S(2) [value]  
c1 [coefficient]  
c2 [coefficient]  

These values are the defining parameters of a second-order linear recurrence relation.

## Example
Input:
S(1) 3  
S(2) 1  
c1 2  
c2 3  

Output:  
r1 = 3.0  
r2 = -1.0  
p = 1.0  
q = 2.0  
S(n) = (1.0)(3.0)^(n-1) + (2.0)(-1.0)^(n-1)  
S(1) = 3.0  
S(2) = 1.0  
...  
S(10) = 19681.0  

## Usage
To use this application:
1. Compile the Java code.
2. Run the program.
3. Enter the required values (`S(1)`, `S(2)`, `c1`, `c2`) when prompted.

## Contributing
Contributions are welcome. Please adhere to the existing code style and include tests for any new features or changes.
