/*

A. Is your horseshoe on the other hoof?
time limit per test 2 seconds
memory limit per test 256 megabytes
input: standard input
output: standard output

Valera the Horse is going to the party with friends. He has been following the fashion trends for a while, and he knows that it is very 
popular to wear all horseshoes of different color. Valera has got four horseshoes left from the last year, but maybe some of them have the 
same color. In this case he needs to go to the store and buy some few more horseshoes, not to lose face in front of his stylish comrades.

Fortunately, the store sells horseshoes of all colors under the sun and Valera has enough money to buy any four of them. However, in 
order to save the money, he would like to spend as little money as possible, so you need to help Valera and determine what is the 
minimum number of horseshoes he needs to buy to wear four horseshoes of different colors to a party.

Input
The first line contains four space-separated integers s1, s2, s3, s4 (1 ≤ s1, s2, s3, s4 ≤ 109) — the colors of horseshoes Valera has.

Consider all possible colors indexed with integers.

Output
Print a single integer — the minimum number of horseshoes Valera needs to buy.

Examples
input
1 7 3 3
output
1
input
7 7 7 7
output
3

*/



import java.io.*;
import java.util.*;
 
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[4];
        int count = 0;
        for(int i = 0; i < 4; i++)
            s[i] = sc.nextInt();
        Arrays.sort(s);
        for(int i = 0; i < 3; i++) {
            if(s[i] == s[i + 1])
                count++;
        }
        System.out.println(count);
        
    }
}






















