/*
Task
Given a string, S,of length N that is indexed from 0 to N-1 , print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the 
Sample below for more detail).

Note: 0 is considered to be an even index.

Example
s=adbecf
Print abc def

Input Format
The first line contains an integer, T(the number of test cases).
Each line i of the T subsequent lines contain a string, S.

Constraints
1<=T<=10
2<=length of S<=10000

Output Format
For each String Sj (where 0<=j<=T-1), print Sj‘s even-indexed characters, followed by a space, followed by Sj‘s odd-indexed characters.
================================================================================================================================================================

Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak

Result:Success;

Sample Input
1
hello

Sample output
hlo el

Result:success;

Sample Input
-1

Enter positive number greater then 0

Result:success;

Sample Input
0

Enter positive number greater then 0

Result:success;

If i miss any test case pls add you comment.
==================================================================================================================================================================
Implementation:

after geting N input from user
Checking whether N>0 and the proceeds else it print else message.
we are iterating the loop N times
here we are geting string input from user and spliting them 
we are using 2 for loop one to check even and another to check even:
In loop one we are using if statement to check i is even if it is even the print string[i].
In loop two we are using if statement to check i is odd if it is even the print string[i].
=====================================================================================================================================================================*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        if(n>0){
        for (int i=1;i<=n;i++){
            
            String s=sc.nextLine();
            String[] string=s.split("");
        for(int k=0;k<string.length;k++){
            if(k%2==0){
            System.out.print(string[k]);
            }
        }
          System.out.print(" ");
        for(int k=0;k<string.length;k++){
            if(k%2!=0){
            System.out.print(string[k]);
            }
        }
        System.out.println();
        }
        }
        else{
            System.out.println("Enter positive number greater then 0");
        }
        sc.close();
    }
}


