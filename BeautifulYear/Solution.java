/*

A. Beautiful Year
time limit per test2 seconds
memory limit per test256 megabytes
input: standard input
outputst: andard output
It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.

Examples
input
1987
output
2013
input
2013
output
2014



*/


import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true) {
            n ++;
            int a = n % 10;
            int b = (n / 10) % 10;
            int c = (n / 100) % 10;
            int d = (n / 1000) % 10;
            if(a != b && a != c && a != d && b != c && b != d && c != d)
                break;     
        }
        System.out.println(n);
    }
}
















