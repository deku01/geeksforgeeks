/*
Given two positive integers N and X, where N is the number of total patients and X is the time duration(in minutes) after which 
a new patient arrives. Also, doctor will give only 10 minutes to each patient. The task is to calculate the time (in minutes) the 
last patient needs to wait.

Input:
The first line of input contains the number of test cases T. The next subsequent lines denote the total number of patients N and time interval X(in minutes) in which the next patients are visiting.

Output:
Output the waiting time of last patient.

Constraints:
1 <= T <= 100
0 <= N <= 100
0 <= X <= 30

Example:
Input:            Output:
5
4 5                15
5 3                28 
6 5                25 
7 6                24 
8 2                56
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    System.out.println((n-1)*(10-x));
		}
	}
}
