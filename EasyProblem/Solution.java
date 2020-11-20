/*


A. In Search of an Easy Problem
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
When preparing a tournament, Codeforces coordinators try treir best to make the first problem as easy as possible. This time the coordinator had chosen some problem and asked
n people about their opinions. Each person answered whether this problem is easy or hard.

Input
The first line contains a single integer n (1≤𝑛≤100) — the number of people who were asked to give their opinions.

The second line contains n integers, each integer is either 0 or 1. If i-th integer is 0, then 𝑖-th person thinks that the problem is easy; if it is 1, then 𝑖-th person thinks that the problem is hard.

Output
Print one word: "EASY" if the problem is easy according to all responses, or "HARD" if there is at least one person who thinks the problem is hard.

You may print every letter in any register: "EASY", "easy", "EaSY" and "eAsY" all will be processed correctly.

Examples
input
3
0 0 1
output
HARD
input
1
0
output
EASY


*/


import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 1; i <= n; i++) {
            if(sc.nextInt() == 1) {
                flag = false;
                break;
            }  
        }
        if(flag)
            System.out.println("EASY");
        else
            System.out.println("HARD");
        
    }
}

































