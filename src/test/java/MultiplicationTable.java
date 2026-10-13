import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number for multiplication table");
        int n =sc.nextInt();
        MultiplicationTable m = new MultiplicationTable();
        String result = m.multiplicationTable(n);
        System.out.println(result);
    }
    public String multiplicationTable(int n)
    {
        int number = n;
        for(int i = 1; i<=10; i++)
        {
            System.out.println(number + " * " + i + " = " + (number*i));
        }
        return "Multiplication Table of " + number + " is printed successfully";
    }
}
