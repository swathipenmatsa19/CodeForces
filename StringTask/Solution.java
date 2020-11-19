/*

A. String Task
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

Output
Print the resulting string. It is guaranteed that this string is not empty.

Examples
input
tour
output
.t.r
input
Codeforces
output
.c.d.f.r.c.s
input
aBAcAba
output
.b.c.b


*/


import java.io.*;
import java.util.*;

 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = new String();
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) != 'A') && (s.charAt(i) != 'E') && (s.charAt(i) != 'I') && (s.charAt(i) != 'O') && (s.charAt(i) != 'U') && (s.charAt(i) != 'Y') && (s.charAt(i) != 'a') && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o') && (s.charAt(i) != 'u') && (s.charAt(i) != 'y')) {
                str += s.charAt(i);
            }
        }
        
        String sb = new String();
        for(int i = 0; i < str.length(); i++) {
            sb += '.';
            sb += str.charAt(i);
        }
        
        String sf = sb.toLowerCase();
        System.out.println(sf);
        
        
    }
}







