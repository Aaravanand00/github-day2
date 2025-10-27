// What is java script?
// JS is a programming language.We use it to give instructions to the computer. 

// Console.log is used to log(print) a messeage to the console 

//    console.log("Apna College");

// Variables in JS 
// Variables are container  for data 
// Variables Rules 
// 1) Variable name are case sensitive;"a"&"A" is different.
// 2) Only letters,underscore(_) and $ is allowed.(not even space)
// 3)Only a letter,underscore(_) or $ should be 1st Character . 
// 4)Reserved words cannot be variable names. 

// let,const&var 
// var: Variable cannot be re-declared & updated . A global scope variable. 
// let: Variable cannot be re-declared but can be updated.A block scope variable. 
// const:Variable cannot be re-declared or updated. A block scope variable. 

// Data Types in JS 
// Primitive Types: Number,String,Boolean,undefined,Null,BigInt,Symbol 

// Comment in JS 
// //This is a single line comment

// /* this is a multi-line 
// comment.*/

// Opreators in JS 
// used to perform some opreation on data 
//       Arithmetic Operators 
//       +,-,*,/
//     Modulus
//     Exponentiation
//     Increment 
//     Decrement 
//         Assingment Opreators 
//         =, +=, -=, *=, %=, **=
        
//         Comparision Operators 
//         Equal to ==        Equal to & type ===
//         Not equal to !=     Not equal to & type !== 

//         >,>=,<,<= 

//         Logial Opreators 
//         Logical AND && 
//         Logical OR  !! 
//         Logical NOT  ! 
// Conditional Statement:- 

// To implement some condition in the code 
    
//     if statement 
   
// let color;
// if(mode==="dark-mode") {
//    color = "black";
// }

// if-else-Statement 
// let color;
// if(mode === "dark-mode") {
//    color = "black";
// } else {
//    color = "white";
// }

// // else-if Statement 
// if(age < 18) {
//    console.log("junior");
// }  else if (age > 60) {
//    console.log("senior");
// }  else {
//    console.log("middle");
// }

// // Ternary Opreators 
// condition? true output : false output 
// age > 18 ? "adult" : "not adult";

// Loops in JS:- Loops are used to execute a piece of code again & again 

// for loop 
// for (let i = 1; i<=5;i++){
//     console.log("apna college");
// }

// Infinite Loop: A Loop that never ends 
// While Loop : while(condition){
//     //do some work
// }

// Do-while Loop 

// do{
//     //do some work
// } while(condition);

// For-of Loop 

// for(let val of strVar) {
//     //do some work
// }

// For-in Loop 

// for(let key in objVar) {
//     //do some work
// }

// Strings in JS:- String is a sequence of characters used to repreesent text 

// Create String:- let str = "Apna College";

// String Length :- str.length 

// String Indices:- str[0],str[1],str[2]

// Template Literals in JS:- A way to have embedded expressions in Strings
//         `this is a template literal`

// String Interpolation:- To create strings by doing substitution of placeholders
//       `string text ${expression} string text`

//       STRING METHOD IN JS 

// THESE ARE BUILT-IN FUNCTIONS TO MANIPULATE A STRING 

// str.toUpperXase()
// str.toLowerCase()
// str.trim()// remove whitespaces 
// str.slice(start,end?)// returns part os string 
// str1.concact(str2)// joins str2 with str1
// str.replace(searchVal,newVal)
// str.charAt(idx)

// ARRAYS IN JS:- COLLECTION OF ITEMS 

// Create Array 

// let heroes=["ironman","hulk","thor","batman"];
// let marks = [96,75,48,83,66];
// let info = ["rahul", 86,"Delhi"];

// ARRAY INDICES 
// arr[0],arr[1],arr[2],....

// LOOPING OVER AN ARRAY :- Print all elements of an array 

// ARRAY METHODS

// Push(): add to end 
// Pop(): delete from end & return 
// toString(): converts array to string 
// Concat():joins multiple arrays & return result 
// Unshift(): add to start 
// shift(): delete from start & return 
// Slice(): returns a piece of the array 
//         slice(startIdx,endIdx)
// Splice(): change original array(add,remove,replace)
//         splice(startIdx,dekCount,newEl1...)