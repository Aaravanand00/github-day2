// class Hello
// {
//     public static void main(String a[])
//     {
//         int num1 = 9;
//         byte by = 127;
//         short sh = 558;
//         long l = 56666l;
// //         float f = 5.8f;
// //         double d = 5.8;
// //         char c = 'k' or '4';
// //         boolean b = true;
// //     }
// // }

// // by default 6.5 jo value hai vo double me rheta hai jo 8 bytes leta hai hum agar ase print krenge to error aayega isliye agar hume float me hi chaiye to last me f lgana prega.
// //  char-> 2 bytes UNICODE char c = 'k'; double quotes me likhne se vo automatically str me le lega isliye char ke liye hume '' single quotes me likhna prega.
// // boolean b=true; hum direct ase hi likhenge jarrurat nhi h usko double ya singlr quotes me likhne ka 

// class Hello
// {
//     public static void main(String a[])
//     {
//         // literals
//         int num1 = 0b101; // binary literal
//         int num2 = 0x7E;// hexadecimal literal 
//         int num3 = 10_00_00_000; // using underscore for better readability
//         double num4 = 34;
//         char c = 'a ';
//         c++;
//         System.out.print(c);
//     }
// }

// class Hello 
// { 
//     public static void main(String args[])
//     {
        //byte b  = 257; // byte range from -128 to 127 
        // byte b = (byte)257; // explicit type casting or byte me sirff 8bits(256 values) store ho skti hai 257%256=1 yaha pr hua 
        // byte b1 = (byte)130; // 130%256=-126
        // System.out.println(b1);
        // byte b = 125;
        // int a = b;
        // int a = 125;
        // byte k = (byte)a; // explicit type casting

        // float f = 5.6f;
        // int a1 = (int)f; // explicit type casting
        // System.out.println(a1);
        // byte a = 10;
//         byte b = 30;

//         int result = a * b;

//         System.out.println(result);
//     }
// }

// class Hello 
// {
//     public static void main(String args[])
//     {
//         int num1 = 7;
//         // int num2 = 5;

//         // int result = num1 % num2;

//         // num1 += 3;
//         // num1++; // post-increment   ++num1; //pre-increment
//         // num1--; //post-decrement  --num1; //pre-decrement

//         //int result = ++num1; // increment and then fetch the value (8)
//         int result = num1++; // fetch the value and then increment (7)
//         System.out.println(result);
//     }
// }

// class Hello{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 20;
//         // boolean res = a > b;
//         // boolean res = a < b;
//         // boolean res = a >= b;
//         // boolean res = a <= b;
//         // boolean res = a == b;
//         boolean res = a != b;
//         System.out.println(res);
//     }
// }

// class Hello{
//     public static void main(String args[]){

//         int x = 7;
//         int y = 5;
//         int a = 5;
//         int b = 9;

        // &,|,! (not short cut method it checks both conditions no matter what)

    //     // boolean result = x > y && a < b; // logical AND (&& is a short cut method it checks the first condition if it is false it will not check the second condition)
    //     // boolean result = x < y || a < b || a > 1; // logical OR (|| is a short cut method it checks the first condition if it is true it will not check the second condition)
    //     boolean result = a > b;
    //     System.out.println(!result);
    // }
// }

// class Hello{
//     public static void main(String args[])
//     {
       
        // int x = 98;

        // if(x>10 && x<=20)
        // System.out.println("Hello");
        // else
        // System.out.println("Hi");

        // int x = 15;
        // int y = 25;

        // if(x>y)
        // System.out.println(x);
        // else
        // // System.out.println(y);

        // int x = 8;
        // int y = 7;
        // int z = 9;

        // if(x>y && x>z)
        // System.out.println(x);
        // else if(y>z)
        // System.out.println(y);
        // else
        // System.out.println(z);

//         int n = 9;
//         int result = 0;
//         // ?: Ternary Opreator

//         result = n%2==0? 10 : 20;
//         System.out.println(result);
//     }
// }

// class Hello{
//     public static void main(String args[])
//     {
//         int n = 8;

//         switch(n){
//             case 1:
//             System.out.println("Monday");
//             break;

//             case 2:
//             System.out.println("Tuesday");
//             break;

//             case 3:
//             System.out.println("Wednesday");
//             break;

//             case 4:
//             System.out.println("Thursday");
//             break;

//             case 5:
//             System.out.println("Friday");
//             break;

//             case 6:
//             System.out.println("Saturday");
//             break;

//             case 7:
//             System.out.println("Sunday");
//             break;

//             default:
//             System.out.println("Invalid Input");
//         }
// //     }
// // }

// class Hello{
//         public static void main(String args[]){

//         int i = 1;

//         while(i<=5){
//                 System.out.println("Hi " + i);
//                 int j = 1;
//                 while(j<=3){
//                     System.out.println("Hello " + j);
//                     j++;
//                 }
                
//                 i++;
//                 }

//                 System.out.println("Bye "+ i);
        

//         }
// }

// class Hello{
//         public static void main(String args[]){
           
//            int i = 1;

//            do{
//                 // i++;
//                 System.out.println("Hi " + i);
//                 i++;
//            }while(i<=10);
//         }
// }

// class Hello{
//         public static void main(String args[]){

//            for(int i=1; i<7; i++)
//            {
//                 System.out.println("DAY " + i);

//                 for(int j=1; j<=9; j++)
//                 {
//                         System.out.println( "  " + (j+8) + " - " + (j+9) );
//                 }
//            }
//         }
// }

// class Calculator{
//         // int a;

        // public int add(int n1,int n2)
//         {
//                 int r = n1 + n2;
//                 return r;
//         }
// }
// class Hello{
//         public static void main(String args[])
//         {
//              int num1=4;
//              int num2=0;
             
//              Calculator calc = new Calculator();
             
//              int result = calc.add(num1,num2);
             
//              System.out.println(result);


//         }
// }

// JDK- Java Development Kit
// JRE- Java Runtime Environment
// JVM- Java Virtual Machine
//JDK-->JRE-->JVM 

// class Computer
// {
//         public void playMusic()
//         {
//                 System.out.print("Music Playing..");
//         }

//         public String getMeAPen(int cost)
//         {
//                 if(cost>=10) 
//                    return "Pen";
                
// //                 return "No Pen";
//         }
// }

// class Hello
// {
//         public static void main(String a[])
//         {
//                 Computer obj = new Computer();
//                 obj.playMusic();
//                 String str = obj.getMeAPen(9);
//                 System.out.print(str);
//         }
// }

// class Calculator
// {
//         public int add(int n1, int n2)
//         {
//                 return n1 + n2;
//         }
//         public int add(int n1, int n2, int n3)
//         {
//                 return n1 + n2+ n3;
//         }
//         public double add(double n1,int n2)
//         {
//                 return n1 + n2;
//         }
// }

// class Hello{
//         public static void main(String args[])
//         {
//                 Calculator obj = new Calculator();
//                 int r1 = obj.add(3,4,7);
//                 System.out.println(r1);
//         }
// }

               //Stack and Heap Memory
// class Calculator 
// {
//         int num = 5;

//         public int add(int n1,int n2)
//         {
//                 System.out.println(num);
//                 return n1+n2;
//         }
// }


// class Hello{
//         public static void main(String args[])
//         {
//                 int data = 10;

//                 Calculator obj = new Calculator();
//                 Calculator obj1 = new Calculator();
//                 int r1 = obj.add(7,5);
//                 // System.out.println(r1);

//                 obj.num = 20; 

//                 System.out.println(obj.num);
//                 System.out.println(obj1.num);
//         }
// } 

                 //ARRAY 

// class Hello{
//         public static void main(String args[])
//         {
//                 int nums[] = {3,7,2,4};
//                 nums[2]=9;

//                 System.out.println(nums[2]);
//         }
// } 

// class Hello{
//         public static void main(String args[]){
//                 int nums[] = new int[5];
//                 nums[0]=3;
//                 nums[1]=7;
//                 nums[2]=2;
//                 nums[3]=4;
//                 nums[4]=9;

//                 for(int i=0;i<nums.length;i++)
//                 {
//                         System.out.println(nums[i]);
//                 }
//         }
// }

               // Multidimensional Array
// class Hello{
//         public static void main(String args[]){
//                 int nums[][] = new int[3][4];

                
//                 for(int i=0;i<3;i++)
//                 {
//                         for(int j=0;j<4;j++)
//                         {
//                                 nums[i][j] = (int)(Math.random()*10);// math.random se value generate hua *10 se single digit and *100 se double digit (* isliye kr rhe kyuki nhi krenge to decimal me value aayega)
//                         }
                
//                 }

//                 for(int i=0;i<3;i++)
//                 {
//                         for(int j=0;j<4;j++)
//                         {
//                                 System.out.print(nums[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//                    // enhanced for loop
//                 for(int n[] : nums)
//                 {
//                         for(int m: n)// m represents each element in the array n
//                         {
//                                 System.out.print(m + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

// class Hello{
//         public static void main(String args[]){
//                 int nums[][] = new int[3][]; // jagged array

//                 nums[0] = new int[3];
//                 nums[1] = new int[4];
//                 nums[2] = new int[2];

                
//                 for(int i=0;i<nums.length;i++)
//                 {
//                         for(int j=0;j<nums[i].length;j++)
//                         {
//                                 nums[i][j] = (int)(Math.random()*10);
//                         }
                
//                 }


//                 for(int n[] : nums)
//                 {
//                         for(int m: n)
//                         {
//                                 System.out.print(m + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

// Drawbacks of Array in Java:
// 1--> Array is an object that holds multiple values of same data type.
// 2--> Array is stored in heap memory.
// 3--> Array is fixed in size.
// 4--> Array Transverselationally is time consuming.

                //Array Of Object 

// class Student
// {
//         int rollno;
//         String name;
//         int marks;
// }

// class Hello{
//         public static void main(String args[])
//         {
//                 // int num[] = new int[5];
//                 // num[0] = 4;
//                 // num[1] = 8;
//                 // num[2] = 3;
//                 // num[3] = 9;


// //                 for(int i=0;i<num.length;i++)
// //                 {
// //                         System.out.println(num[i]);
// //                 }

//                 //   for(int n : num)
//                 //   {
//                 //          System.out.println(n);   // enhanced for loop
//                 //   }
                   
//                 Student s1 = new Student();
//                 s1.rollno = 1;
//                 s1.name = "Navin";
//                 s1.marks = 88;

//                 Student s2 = new Student();
//                 s2.rollno = 2;
//                 s2.name = "Amit";
//                 s2.marks = 98;

//                 Student s3 = new Student();
//                 s3.rollno = 3;
//                 s3.name = "Sahil";
//                 s3.marks = 78;

                
//                 Student students[] = new Student[3];
//                 students[0] = s1;
//                 students[1] = s2;
//                 students[2] = s3;

// //                 for(int i=0;i<students.length;i++)
// //                 {
// //                        System.out.println(students[i].name + " : " + students[i].marks);

// //                 }

// //                 for(Student s : students)
// //                 {
// //                         System.out.println(s.name + " : " + s.marks);
// //                 }

// //         } 
// // }

// class Hello{
//         public static void main(String a[])
//         {
//                 String name = "Navin";
//                 System.out.println( "hello " + name);
//                 System.out.println(name.length());
//                 System.out.println(name.toUpperCase());
//                 System.out.println(name.toLowerCase());
//                 System.out.println(name.charAt(3));
//                 System.out.println(name.indexOf('v'));
//                 System.out.println(name.substring(2));
//                 System.out.println(name.substring(1,4));
//                 System.out.println(name.replace('a','o'));
//                 System.out.println(name.contains("vin"));
//                 System.out.println(name.equals("navin"));
//                 System.out.println(name.concat("Reddy"));
//         }
// }

// class Mobile
// {
//         String brand;
//         int price;
//         static String name;  //static variable se jo last me name likha hoga vahi name sbke liye aa jayega and static variable jo uske class name se likha jayega.

//         public void show()
//         {
//                 System.out.println(brand + " : " + price + " : " + name);
//         }
        
//         public static void show1(Mobile m)
//         {
//                 System.out.println(m.brand + " : " + m.price + " : " + name); // static method me non-static variable ko access nhi kr skte hai.yaha static me sirf name hi acess hoga.
//         }


// }

// class Hello{
//         public static void main(String args[])
//         {
//                 Mobile m1 = new Mobile();
//                 m1.brand = "Apple";
//                 m1.price = 90000;
//                 Mobile.name = "Iphone"; // static variable ko class name se access krte hai.

//                 Mobile m2 = new Mobile();
//                 m2.brand = "Samsung";
//                 m2.price = 50000;
//                 Mobile.name = "Galaxy";

//                 m1.show();
//                 m2.show();
//                 Mobile.show1(m1);
      
//         }
// }

//class Mobile
// {
//         String brand;
//         int price;
//         static String name;  //static variable se jo last me name likha hoga vahi name sbke liye aa jayega and static variable jo uske class name se likha jayega.

//         static{
//                 name = "Phone";
//                 System.out.println("Static Block Called");
//               }
//         public Mobile()
//         {
//                 brand = "";
//                 price = 200;
//                 System.out.println("Constructor Called");
//         }

//         public void show()
//         {
//                 System.out.println(brand + " : " + price + " : " + name);
//         }
        
       

// class Hello{
//         public static void main(String a[]) throws ClassNotFoundException
//         {
//                 Class.forName("Mobile"); // static block ko call krne ke liye hum Class.forname ka use kr skte hai.
                
//                 // Mobile m1 = new Mobile();
//                 // m1.brand = "Apple";
//                 // m1.price = 90000;
//                 // Mobile.name = "Iphone"; // static variable ko class name se access krte hai.
                
//                 // Mobile m2 = new Mobile();
//         }
// // }
// // } 

             // Encapsulation
// class Human
// {
//    private int age = 11;
//    private String name = "Navin";

//    public int getAge()
//    {
//         return age;
//    }

//    public String getName()
//    {
//         return name;
//    }
// }

// class Hello{
//         public static void main(String a[])
//         {
//                 Human obj = new Human();
//                 // obj.age = 11;
//                 // obj.name = "Navin";
//                 System.out.println(obj.getName() + " : " + obj.getAge());
//         }
// }

                   // Encapsulation with Setter Method
// }  
// class Human
// {
//    private int age;
//    private String name;

//    public int getAge()    getters
//    {
//         return age;
//    }

//    public void setAge(int a)   setters
//    {
//         age = a;
//    }

//    public String getName()
//    {
//         return name;
//    }
//    public void setName(String n)
//    {
//         name = n;
//    }

// }

// class Hello{
//         public static void main(String a[])
//         {
//                 Human obj = new Human();
//                 obj.setAge (30);
//                 obj.setName ("Reddy");
//                 System.out.println(obj.getName() + " : " + obj.getAge());
//         }
// }

// class Human
// {
//    private int age;
//    private String name;

//    public int getAge()    //getters
//    {
//         return age;
//    }
//    public void setAge(int age)   //setters
//    {
//         this.age = age;
//    }
//    public String getName()
//    {
//         return name;
//    }
//    public void setName(String name)
//    {
//         this.name = name;
//    }


// }

// class Hello{
//         public static void main(String a[])
//         {
//                 Human obj = new Human();
//                 obj.xyz(30);
//                 obj.setName ("Reddy");
//                 System.out.println(obj.getName() + " : " + obj.abc());
//         }
// }

                  // Using this keyword
// class Human
// {
//    private int age;
//    private String name;

//    public int getAge()   
//    {
//         return age;
//    }
//    public void setAge(int age)   
//    {
//         this.age = age;  // this keyword is used to refer to the current object instance variable.
//    }
//    public String getName()
//    {
//         return name;
//    }
//    public void setName(String name)
//    {
//         this.name = name;
//    }


// }

// class Hello{
//         public static void main(String a[])
//         {
//                 Human obj = new Human();
//                 obj.setAge(30);
//                  obj.setName ("Reddy");
                // System.out.println(obj.getName() + " : " + obj.getAge());
        // }
// }

       // Constructor
// class Human
// {
//    private int age;
//    private String name;


//    public Human()
//    {       
//         age = 12;
//         name = "Jhon";
        
//         // System.out.println("in constructor");// every time we will create new obj it will call the constructor if line 781 repeat two times or more it will create the no of times will be created.
//    }

//    public int getAge()    
//    {
//         return age;
//    }
//    public void setAge(int age)   
//    {
//         this.age = age;
//    }
//    public String getName()
//    {
//         return name;
//    }
//    public void setName(String name)
//    {
//         this.name = name;
//    }


// }

// class Hello{
//         public static void main(String a[])
//         {
//                 Human obj = new Human();
//                 Human obj1 = new Human();
//                 System.out.println(obj.getName() + " : " + obj.getAge());
//                 // obj.setAge(30);
//                 // obj.setName ("Reddy");


//                 // System.out.println(obj.getName() + " : " + obj.abc());
//         }
// } 


// class Human
// {
//    private int age;
//    private String name;


//    public Human()
//    {       
//         age = 12;    // default constructor
//         name = "Jhon";
        
//    }

//    public Human(int a, String n) //Parameterized Constructor
//    {
//         age = a;
//         name = n;
//    }
//    public int getAge()    
//    {
//         return age;
//    }
//    public void setAge(int age)   
//    {
//         this.age = age;
//    }
//    public String getName()
//    {
//         return name;
//    }
//    public void setName(String name)
//    {
//         this.name = name;
//    }


// }

// class Hello{
//         public static void main(String a[])
//         {
//                 Human obj = new Human();
//                 Human obj1 = new Human(18,"Navin");
//                 System.out.println(obj.getName() + " : " + obj.getAge());
//                 System.out.println(obj1.getName() + " : " + obj1.getAge());
//                 // obj.setAge(30);
//                 // obj.setName ("Reddy");


//                 // System.out.println(obj.getName() + " : " + obj.abc());
//         }
// } 


// Camel Casing

// class and interface - Calc , Runable    (Capital letters)
// variable and method - marks,show()      (Small letters)
//constants - PIE , BRAND (ALL CAPITAL LETTERS)

// showMyMarks() this is camel casing 
//show_my_marks() this is snake casing 

//Human() this is constructor bcz H starting me capital h to class and last me () jo ki method me use hota hai

// class A
// {
//     public A()
//     {
//         System.out.println("object created");
//     }

//     public void show()
//     {
//        System.out.println("in A show");
//     }
// }

// class Hello 
// {
//         public static void main(String a[])
//         {
//                 new A().show(); // anonymous object 
//                 new A().show();
//         }
// }


            //Inheritence in java 


// public class Hello {
//     public static void main(String[] args) {
//         AdvCalc obj = new AdvCalc();

//         int r1 = obj.add(4, 5);   // from Calc class
//         int r2 = obj.multi(3, 2); // from AdvCalc class      if we make one more veryadvcaclc jisme power kiya ja ske to usko extends AdvCalc likh ke bnayenge or usko multi-level inheritence khete h. 

//         System.out.println("Add: " + r1);
//         System.out.println("Multiply: " + r2);
//     }
// }
//  This and Super method in Java
// class A extends Object    // extends obj likho na likho baat brabar hai 
// {       

//         public A()
//         {
//         super();
//         System.out.println("in A");
//         }
//         public A(int n)
//         {
//         super();
//         System.out.println("in A int");
//         }
// }
// class B extends A 
// {
//         public B()
//         {
//                 super();
//                 System.out.println("in B");
//         }
//         public B(int n)                           // ye automatically apne superclass A ko call krega 
//         {
//                 // super(n);
//                 this();   // this keyword se apne constructor public b me dono print krega
//                 System.out.println("in B int");   // yaha pe super n likha hai isliye A int print ho jayega nhi to upar wala by default print hota hai 
//         }
// }
// class Hello
// {
//         public static void main(String a[])
//         {
//                 B obj = new B(7);
//         }
// }

              //Method Overriding

// class Calc{
//         public int add(int n1,int n2)
//         {
//                 return n1+n2;
//         }
// }
// class AdvCalc extends Calc
// {
//      public int add(int n1,int n2)   // ye adv calc wala class likha jayega over write ho jayega 
//      {
//         return n1+n2+1;
//      }
// }

// class Hello{
//         public static void main(String a[])
//         {
//             AdvCalc obj = new AdvCalc();
//             int r1 = obj.add(3,4);
//             System.out.println(r1);
//         }
// }


               //------TOOLS AND PACKAGES TOPIC------ 


// Polymorphism:- Poly{many} morphism{behaviour} and is has two types compile time and run time 
                                                                //       (overloading)    (overridding)
                                                                //       add(int,int)
                                                                //       add(int,int,int)   A 
                                                                //                            add(int,int)
                                                                //                         B 
                                                                //                            add(int,int,int)
         //Dynamic method dispatch
// class Computer 
// {

// }
// class Laaptop extends Computer
// {


// }

// class A 
// {
//     public void show()
//     {
//         System.out.println("in A show");
//     } 
// }
// class B extends A 
// {
//      public void show()
//      {
//         System.out.println("in B show");
//      }
// }
// class C extends A 
// {
//         public void show()
//         {
//            System.out.println("in C show");     
//         }
// }

// class Hello
// {
//     public static void main(String a[])
//     {
//         A obj = new A();
//         obj.show();
 
//         obj = new B();
//         obj.show();

//         obj = new C();
//         obj.show();
//    }
// }


             //Final Keyword