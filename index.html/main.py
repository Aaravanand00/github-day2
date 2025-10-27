# PYTHON NOTES 
# What is Python?
# 1-Python is simple and easy 
# 2-Free and open source
# 3-High level language 
# 4-Developed by Guido van Rossum in 1991 
# 5-Portable 

# print("Hello, World!")

# Python Character Set 
# 1-Letters-A to Z,a to z 
# 2-Digits-0to9 
# 3-Special symbols -+-*/etc...
# 4-Whitespaces- Blank Space,tab,carriage return,newline,formfeed 
# 5-Other characters- Python can process all ASCII and Unicode characters as a part of data or literals 

# Variables:-A variable is a name given to a memory location in a program. 
# name="Aarav"
# age=23 
# price=25.99 

# Rules for identifiers 
# 1.Identifiers can be combination of uppercase aand lowercase letters,digits or an underscore(_).So myVariable, variable_1, variable_for_print all are valid python identifiers.
# 2.An identifier can not start with digit. So while variable1 is valid, 1variable is not valid. 
# 3-We can't use special symbols like !,@,#,$,%,^,&,* etc in our identifiers.
# 4-Identifier can be of any length. 

# Data Types 
# 1.Integers 
# 2.String 
# 3.Float 
# 4.Boolean 
# 5.List 

# print(type(age))     <class 'int'> 
# print(type(pi))      <class 'float'>
# print(type(complex_num)) <class 'complex'> 
# print(type(A))   <class 'bool'> 
# print(type(name)) <class 'str'>

# Comments in Python 
# #Single Line Comment 

# """
# Multi Line Comment 
# """

# Types of opreators 
# An opreator  is a symbol that performs a certain opreation between opreands. 
# 1-Arithmetic Opreators(+,-,*,/,//,%,**)
# 2-Relation/Comparision Operators(==,!=,>,<,>=,<=)
# 3-Assingment Operators(=,+=,-=,*=,/=,%=,**=)
# 4-Logical Operators(not,and,or)


# Type Conversion
# a,b = 1,2.0 
# sum=a+b 

# #error
# a,b=1,"2"
# sum=a+b 

# Type Casting 
# a,b=1,"2"
# c=int(b)
# sum=a+c 

# Input in Python 
# input() statement is used to accept values (using keyboard) from user

# input() #result for input() is  always a str 
# int(input())#int
# float(input())#float 

# Strings:- String is data type that stores a sequence of characters. 
# Basic Operations 
# Concentration 
# "hello" + "world" ----> "helloworld"

# length of str 
# len(str)

# Indexing 

# A p n a _ C o l l e g  e
# 0 1 2 3 4 5 6 7 8 9 10 11

# str="Apna_College"
# str[0] is 'A',str[1] is 'p' 
# str[0]='B'#not allowed 


# Slicing 
# Accessing parts of a string 
# str[starting_idx:ending_idx]#ending idx is not included 
# str="Apna College"
# str[1:4] is "pna"
# str[ :4] is same as str[0:4]
# str[1: ]is same as str[1:len(str)]

# Negative Index 
# A   p  p  l  e 
# -5 -4 -3 -2 -1

# str="Apple"
# str[-3:-1] is "pl"


# String Functions 

# str="I am a coder."
# str.endsWith("er.")#returns true if string ends with substr
# str.capitalize()#capitalize 1st char 
# str.replace(old,new)#replaces all occurences of old with new 
# str.count("am")#counts the occurence of substr in string 

# Conditional Statements 
# if-elif-else(SYNTAX)
    
#     if(condition):
#         Statement1
#     elif(condition):
#          Statement2
#     else:
#         StatementN 


# Conditional Statements 

# Grade students based on marks 

# marks>=90,grade="A"
# 90>marks>=80,grade="B"
# 80>marks>=70,grade="C"
# 70>marks,grade="D"

# List in Python 
# A-built-in data type that stores set of values.It can stores
# elements of different types(integer,float,string,etc.)

# marks = [87,64,33,95,76] #marks[0],marks[1]...
# student = ["Karan",85,"Delhi"]#student[0],student[1]...
# student[0] = "Arjun" #allowed in python 
# len(student) #returns length 

# List Slicing 
# Similar to string slicing 

# list_name[starting_idx : ending_idx] #ending idx is not included 
#  marks = [87,64,33,95,76]
# marks[1:4] is [64,33,95]
# marks[ :4] is same as marks[0:4]
# marks[1: ] is same as marks[1:len(marks)]
# marks[-3:-1] is [33,95] 

# List Methods
# list = [2,1,3]
# list.append(4)


# a = 15
# print(str(a))
# print(type(a))
# print(type(str(a)))

