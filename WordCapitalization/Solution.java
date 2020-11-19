/*

A. Word Capitalization
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

Note, that during capitalization all the letters except the first one remains unchanged.

Input
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.

Output
Output the given word after capitalization.

Examples
input
ApPLe
output
ApPLe
input
konjac
output
Konjac

*/


import java.io.*;
import java.util.*;

 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(cap);
    }
}






