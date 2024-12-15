import java.io.IOException;
import java.util.Scanner;

/***
 Richard and Vicent are crazy about football collectable cards. In their spare time, they arrange a way of playing
 some game involving such cards. Both also have the habit of exchanging the repeated cards with their friends,
 and one day they thought about a different game.  They called all their friends and proposed the following:

 with the cards in hand, each one tried to make an exchange with his closest friend following this simple rule:
 each one must count how many cards he owned. After this, they had to split these cards into stacks, all of it with
 the same size, as large as it was possible for both players. Then, each one choose one of the friend's card stacks to receive.
 For example, if Richard and Vincent would change the cards with respectively 8 and 12 cards each, both must put his cards
 in stacks of four cards (Richard would have two stacks and Vincent had three stacks), and both choose a stack
 from his friend to receive it.

 Input
 The first input line contains a single integer N (1 ≤ N ≤ 3000), indicating the number of test cases.
 Each test case contains two integer numbers F1 (1 ≤ F1 ≤ 1000) and F2 (1 ≤ F2 ≤ 1000)
 indicating, respectly, the among of collectable cards that Richard and Vicent have to change.

 Output
 For each test case there will be an integer number at the output, representing the maximum size
 of the stack of cards which can be exchanged between two players.

 Input Sample	Output Sample
 8 12           4
 9 27           9
 259 111        37

***/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate and print the GCD using Euclid's algorithm
        while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        System.out.println(a);
        scanner.close();
    }
}

/*** Function to calculate GCD using Euclid's algorithm

 Example with a = 8 and b = 12:

 First step:

 a = 8, b = 12
 a % b = 8 % 12 = 8 (remainder is 8)
 Now: a = 12 and b = 8.


 Second step:

 a = 12, b = 8
 a % b = 12 % 8 = 4 (remainder is 4)
 Now: a = 8 and b = 4.


 Third step:

 a = 8, b = 4
 a % b = 8 % 4 = 0 (remainder is 0)
 Now, b = 0, and the algorithm terminates. The GCD is a = 4

 ***/
