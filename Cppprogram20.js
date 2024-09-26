//***********Inline function************

// program ::>1st  Find out cube using Inline function.

// Inline function to find the cube of a number
const cube = (num) => num * num * num;

// Example usage
let number = 5;
console.log("Cube of", number, "is:", cube(number)); // Output: Cube of 5 is: 125

// program ::> 2 Perform arithmetic operation using Inline function

const arithmeticOperation = (num1, num2, operator) =>{
    switch (operator){

        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        case '/':
            return num1 / num2;
        default:
            return NaN; // Invalid operator
    }
};

// Example usage
let num1 = 10;
let num2 = 5;
let operator = '-';

console.log(`Result of ${num1} ${operator} ${num2} is:`, arithmeticOperation(num1, num2, operator));

