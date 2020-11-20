/*

A. Mishka and Game
time limit per test 1 second
memory limit per test 256 megabytes
inputstandard input
outputstandard output
Mishka is a little polar bear. As known, little bears loves spending their free time playing dice for chocolates. 
Once in a wonderful sunny morning, walking around blocks of ice, Mishka met her friend Chris, and they started playing the game.

Rules of the game are very simple: at first number of rounds n is defined. In every round each of the players throws a cubical dice
with distinct numbers from 1 to 6 written on its faces. Player, whose value after throwing the dice is greater, wins the round. 
In case if player dice values are equal, no one of them is a winner.

In average, player, who won most of the rounds, is the winner of the game. In case if two players won the same number of rounds, the result of the game is draw.

Mishka is still very little and can't count wins and losses, so she asked you to watch their game and determine its result. Please help her!

Input
The first line of the input contains single integer n n (1 ≤ n ≤ 100) — the number of game rounds.
The next n lines contains rounds description. i-th of them contains pair of integers mi and ci (1 ≤ mi,  ci ≤ 6) — values on 
dice upper face after Mishka's and Chris' throws in i-th round respectively.

Output
If Mishka is the winner of the game, print "Mishka" (without quotes) in the only line.
If Chris is the winner of the game, print "Chris" (without quotes) in the only line.
If the result of the game is draw, print "Friendship is magic!^^" (without quotes) in the only line.

Examples
input
3
3 5
2 1
4 2
output
Mishka

input
2
6 1
1 6
output
Friendship is magic!^^

input
3
1 5
3 3
2 2
output
Chris


*/

import java.io.*;
import java.util.*;
 
 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countm = 0, countc = 0;
        for(int i = 1; i <= n ; i++) {
            int m = sc.nextInt();
            int s = sc.nextInt();
            if(m > s)
                countm ++;
            else if(m < s)
                countc++;
        }
        if(countm > countc)
            System.out.println("Mishka");
        else if(countm < countc)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
        
    }
}






















