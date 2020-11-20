/*


A. New Year Candles
time limit per test 1 second
memory limit per test 256 megabytes
input: standard input
output: standard output

Vasily the Programmer loves romance, so this year he decided to illuminate his room with candles.
Vasily has a candles.When Vasily lights up a new candle, it first burns for an hour and then it goes out. 
Vasily is smart, so he can make b went out candles into a new candle. As a result, this new candle can be used like any other new candle.

Now Vasily wonders: for how many hours can his candles light up the room if he acts optimally well? Help him find this number.

Input
The single line contains two integers, a and b (1 ≤ a ≤ 1000; 2 ≤ b ≤ 1000).

Output
Print a single integer — the number of hours Vasily can light up the room for.

Examples
inputCopy
4 2
outputCopy
7
inputCopy
6 3
outputCopy
8


*/


import java.io.*;
import java.util.*;
 
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a;
        while(a >= b) {
            sum += (a / b);
            a = (a / b) + (a % b);;
            
        }
        System.out.println(sum);
    }
}






















