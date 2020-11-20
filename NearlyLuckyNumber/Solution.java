/*


A. Nearly Lucky Number
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Petya loves lucky numbers. We all know that lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Unfortunately, not all numbers are lucky. Petya calls a number nearly lucky if the number of lucky digits in it is a lucky number. He wonders whether number n is a nearly lucky number.

Input
The only line contains an integer n (1 ≤ n ≤ 1018).

Please do not use the %lld specificator to read or write 64-bit numbers in С++. It is preferred to use the cin, cout streams or the %I64d specificator.

Output
Print on the single line "YES" if n is a nearly lucky number. Otherwise, print "NO" (without the quotes).

Examples
input
40047
output
NO
input
7747774
output
YES
input
1000000000000000000
output
NO


*/


import java.io.*;
import java.util.*;
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '4' || s.charAt(i) == '7')
                count++;
        }
        if(count == 4 || count == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
















