// ********** OPERATER***********

// program :: 1st WAP to find the min and max number using ternary operator in c++. (two and three variable)
/*let a = 10, b = 20;
let min = (a < b)? a : b;
let max = (a > b)? a : b;
console.log("minimum number ==>",min);
console.log("maximum number ==>", max);*/

// program ::> 2nd WAP to check whether the number is odd or even using ternary operator.

/*let num = 10, num1 = 11;
let result = (num % 2 === 0) ? "Even" : "odd";
let result1 = (num1 % 2 === 0) ? "Even" : "odd";
console.log("number 1 is ==>"+ result);
console.log("number 1 is ==>"+ result1);*/

// program ::> 3rd WAP to using scope resolution operator.
// globalVariable
/*let globalVariable = 10;

function outerFunction(){
    // outer function scope
    let outerVariable = 20;


function innerFunction(){

    // innner Function scope
    let innerVariable = 30;

    // Access Variable from diffrent scope
    console.log("global variable ==>", globalVariable);
    console.log("outer Variable ==>", outerVariable);
    console.log("Inner variable ==>", innerVariable);
}
// call inner function
innerFunction();
}
// call outer function
outerFunction();*/

// program ::> 4th Find out addition, subtraction, multiplication and division operators with scope resolution operator
// of two integer number.

// NOTE ::>>> JavaScript doesn't have a scope resolution operator (::) like some other languages do, such as 

/*let num1 = 10;
let num2 = 5;

// Addition
let addition = num1 + num2;
console.log("Addition:", addition);

// Subtraction
let subtraction = num1 - num2;
console.log("Subtraction:", subtraction);

// Multiplication
let multiplication = num1 * num2;
console.log("Multiplication:", multiplication);

// Division
let division = num1 / num2;
console.log("Division:", division);*/

// ************ Manipulator **************
// program ::> 5 WAP to illustrates the use of manipulator. in js

// Function to pad a number with leading zeros
/*function padWithZeros(number, width) {
    number = number.toString();
    while (number.length < width) {
        number = "0" + number;
    }
    return number;
}

// Main function
function main() {
    let num = 12345;
    let pi = 3.14159;

    // Using string formatting to achieve similar effects as manipulators
    console.log("Using string formatting:");
    console.log("Number: " + num.toString().padStart(10)); // Using padStart to set width
    console.log("Pi: " + pi.toFixed(2)); // Using toFixed to set precision
}

// Calling the main function
main();*/

// program ::>6 WAP to print format output using manipulators.
// ___34
//  693
// 34.69

// Function to pad a number with leading spaces
/*function padWithSpaces(number, width) {
    number = number.toString();
    while (number.length < width) {
        number = " " + number;
    }
    return number;
}

// Main function
function main() {
    let num1 = 34;
    let num2 = 693;
    let num3 = 34.69;

    // Using string formatting to achieve the desired output format
    console.log(padWithSpaces(num1, 5));
    console.log(padWithSpaces(num2, 5));
    console.log(num3.toFixed(2));
}

// Calling the main function
main();*/

//program ::> 7 WAP to print format output using manipulators
// *****Basic*****1000
// #Allowance######700
// +++++total+++++17000

/*function formatOutput(label, value){
    // calculate the number of padding characters needed
    let padding = 21 - label.length;
    // create the formatted string
    let formattedOutput = label.padStart(label.length + padding, '*') + value;
    return formattedOutput;
}
// Main function
function main(){
    let basic = 1000;
    let allowance = 700;
    let total = 17000;

    // print the formate output
    console.log(formatOutput("basic",basic));
    console.log(formatOutput("#Allowance#",allowance));
    console.log(formatOutput("+++++total++++++",total));
}
main();*/

// program ::>8  WAP to use of manipulators setw( ), setfill( ),setpricision( ) in js
// In JavaScript, there are no manipulators like setw(), setfill(), and setprecision() in place use by leftPad,rightpad,formatnumber,

// Function to left pad a string with spaces
/*function leftPad(str, len) {
    return ' '.repeat(len - str.length) + str;
}

// Function to right pad a string with spaces
function rightPad(str, len) {
    return str + ' '.repeat(len - str.length);
}

// Function to format a number with a specific precision
function formatNumber(num, precision) {
    return num.toFixed(precision);
}

let str = "Hello";
let num = 3.14159;

// Using setw() equivalent
console.log(leftPad(str, 10), "|", rightPad(str, 10)); // Output: "     Hello | Hello     "

// Using setfill() equivalent
console.log(str.padStart(10, '*'), "|", str.padEnd(10, '*')); // Output: "***Hello | Hello****"

// Using setprecision() equivalent
console.log(formatNumber(num, 2)); // Output: "3.14"*/

// program ::> 9 WAP that show use ofReference variable

// Creating an object
/*let person1 = {
    name: "John",
    age: 30
};

// Assigning the reference of person1 to person2
let person2 = person1;

// Modifying person2
person2.name = "Jane";
person2.age = 25;

// Outputting both variables
console.log("Person 1:", person1); // Output: Person 1: { name: 'Jane', age: 25 }
console.log("Person 2:", person2); // Output: Person 2: { name: 'Jane', age: 25 }*/

// program ::> 10 WAP to sum of all digit of given no using call by value

// function to calculate the sum of digits number

function sumOfDigits(number){
    let sum = 0;
    let num = number;//creating a local copy of the number

    // Iterate through each digit of the number
    while(num > 0){
        // extract the last digit
        let digit = num % 10;
        // add the digit to thesum
        sum += digit;
        // remove the last digit
        num = Math.floor(num/10);
    }
    return sum;
}
let num = 12345;
let sum = sumOfDigits(num);
console.log("sum of digits of", num, "is::>", sum);

// program ::> 11.. swape value by call by value and call by refrence
// function to swap two variable by value
 function swapByValue(a, b){
    let temp = a;
    a = b;
    b = temp;
    console.log("inside swapbyvalue function ==>");
    console.log("a =",a);
    console.log("b =",b);
 }

//  function to swap two variable by refrence
function swapByRefrence(obj){
    let temp = obj.a;
    obj.a = obj.b;
    obj.b = temp;
    console.log("inside swapbyrefrence function:");
    console.log("obj.a =",obj.a);
    console.log("obj.b =",obj.b);
}

// call by value
let a = 10, b = 20;
console.log(`before swap a ::> is ${a} and b ::> ${b}`);
swapByValue(a, b);
console.log(`after swap a::>`,a);
console.log(`after swap b::>`,b);


// call by refrence
let obj = { a:30, b:40};
console.log(`before swap a==> is ${obj.a} and b==> ${obj.b}`);
swapByRefrence(obj);
console.log(`after swap a==> is ${obj.a} and b==> ${obj.b}`);