/*
In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept,it's only enabled in certain 
languages. Check out the Tutorial tab for learning materials and an instructional video!

Task
Write a Person class with an instance variable,age , and a constructor that takes an integer, InitialAge, as a parameter. The constructor must assign IntialAge to age  after confirming the 
argument passed as InitalAge is not negative; if a negative argument is passed as , the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, 
you must write the following instance methods:

yearPasses() should increase the age instance variable by 1.
amIOld() should perform the following conditional actions:
If age<13 , print You are young..
If age>=13 and age <18, print You are a teenager..
Otherwise, print You are old..
To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates 
each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!

Note: Do not remove or alter the stub code in the editor.

Input Format

Input is handled for you by the stub code in the editor.

The first line contains an integer, T (the number of test cases), and the T subsequent lines each contain an integer denoting the age of a Person instance.

Constraints
1<-T<=4
-5<=Age<=30

Output Format

Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor. If your
methods are implemented correctly, each test case will print 2 or 3 lines (depending on whether or not a valid initial was passed to the constructor).
===========================================================================================================================================================

Sample Input

4
-1
10
16
18
Sample Output

Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.

Result= Success;
=========================================================================================================================================================
Explanation:
As given in question we created a class and constructor to assign the variable
if age <0 then assign age = 0 and printing age is not valid
Created method yearPasses() to increase age by 1
amiold() method to check age and appropriate messege

In main()
created obj to access Person class
using forloop to get value for no of time as given in question and ececute the code
Using inner for loop to increse age by 3 as given in question
printing the message after increasing age by 3
======================================================================================================================================================*/
import java.io.*;
import java.util.*;

public class Solution {
    static class Person{
    private int age;
    public Person(int initialAge){
        age=initialAge;
        
        if(age<0){
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
        
        void yearPasses(){
            age=age+1;
        }
        void amiold(){
            if(age<13){
              System.out.println("You are young."); 
            }
            else if(age>=13 && age<18){
              System.out.println("You are a teenager.");  
            }
            else{
                System.out.println("You are old.");
            }
        }
    
}

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amiold();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amiold();
            System.out.println();
        }
        sc.close();
    

    }
}
