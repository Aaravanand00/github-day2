#Sets question

# my_sets = {1,2,3,4}
# print(my_sets)

# a = {1,2,3}
# b = {3,4,5}
# print(b.union(a))
# print(b.intersection(a))
# print(a.difference(b))

# a = {1,2,3}
# a.add(4)
# a.add(5)
# print(a)

# a = {1,2,3}
# b = {3,4,5}
# print(a.union(b))


# a = [10,20,30,40]  
# a.remove(20)
# print(a)

# a = {1,2,3,4,5,6,7}
# print(7 in a)
# print(10 in a)

# list = [1,2,2,3,3,3,4]
# s = set(list)
# print(s)

# A = {1,2,3,4,5}
# B = {4,5,6,7,}

# print(A.union(B))
# print(A.intersection(B))
# print(A.difference(B))
# print(B.difference(A))  
# print(A.symmetric_difference(B))
# print(B.issubset(A))
# print(B.issuperset(A))
# print(A.isdisjoint(B))
# print(B.isdisjoint(A))
# print(A.copy())
# print(B.copy())

# #SQUARES RANGE FROM 1 TO 10
# A = set()
# for i in range(1,100):
#     A.add(i**0.5)
# print(A)

#frozen set:

# frozen_empty_set= frozenset()#it creates a immutable versionn of an empty set
# print(frozen_empty_set)


# word = "apple" 
# unique_chars = set(word)
# print(unique_chars)

# list1 = [1,2,3,4,5,6]
# list2 = [4,5,6,7,8]

# common = set(list1).intersection(set(list2))
# print(common)

#Functions 

# def add_numbers(a,b):
#     return a + b

# print(add_numbers(5,3)) 
# print(add_numbers(1,2))

# def check_even_odd(num): 
#     if num % 2 == 0:
#         return "Even"
#     else:
#         return "Odd"

# print(check_even_odd(19))  

# def square_cube(n):
#     return n**2,n**3
# sq,cu = square_cube(3)
# print("Square:", sq, "Cube:", cu)

# def max_in_list(num):
#     return max(num)
# print(max_in_list([10,122,5,99,45]))    


# def greet(name):
#     return f"Hello {name}!"
# print(greet("Aarav"))


# def reverse_string(s):
#     return s[::-1]
# print(reverse_string("Aarav Anand"))

# def factorial_iter(n):
#     result = 1
#     for i in range(1, n+1):
#         result *= i 
#     return result
# print(factorial_iter(10))

# def count_vowels(s):
#     vowels ="aeiouAEIOU"
#     count = 0
#     for ch in s:
#         if ch in vowels:
#             count += 1
#         return count 
# print(count_vowels("Aarav Anand"))



# def square_cube (n):
#     return n**2, n**3 
# sq, cu = square_cube(4)
# # sq, cu = square_cube(15)
# print("Square:", sq, "Cube:", cu)

# def max_in_list(nums):
#     return max(nums)
# print(max_in_list([10,22,5,99,45]))

# for i in range(0,4):
#     for j in range  (i,4):
#         for k in range (j,4):
#             print(i,j,k)

# i =1
# while(i<5):
#  i = i>5
#  print(i)
#  print("completed")