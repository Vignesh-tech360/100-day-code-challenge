/*
Problem:

Java OutputFormattingJava's System.out.printf function can be used to print formatted output. 
The purpose of this exercise is totest your understanding of formatting output using printf.
To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format: Every line of input will contain a String followed by an integer. 
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
Output Format: In each line of output there should be two columns: The first column contains the String and is left justified using exactly 15 characters. 
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input:
java 100
cpp 65
python 50

Sample Output
================================
java           100
cpp            065
python         050
================================
Explanation: Each String is left-justified with trailing whitespace through the first 15 characters. 
The leading digit of theinteger is the  character, and each integer that was less than  digits now has leading zeroes.
*/

/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*Sample input and Expected output:

test 1:
Input:

java 100
cpp 65
python 50

Output:
================================
java           100 
cpp            065 
python         050 
================================

Result:
Success

Test 2:
Input:

good 80
java 83
program 89

Output:
================================
good           080 
java           083 
program        089 
================================

Result:
Success
-------------------------------------------------------------------------------------------------------------------------------------------------------
explanation:

For formating the output in java we will be using printf
%-15s ----> is used for -15 spaces right side for string
and
%d is used for int
%03d----> used for 3 spaces left side for int , if the value is less then 3 digit then it add 0 in starting to make it 3 digit.

---------------------------------------------------------------------------------------------------------------------------------------------------------*/
Program:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("================================");
     for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);
            }
        System.out.println("================================");

    }
}




