// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41

import java.util.Scanner;

public class Main
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int count = 0;
for(int i=1; count<n;i++)
{
int ap = 3*i+2;
if(ap%4!=0)
{
System.out.print(ap+" ");
count++;
}

}

}

}
