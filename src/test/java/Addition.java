import org.testng.annotations.Test;

import java.util.Scanner;

public class Addition
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a =sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two number is : "+ sum);
    }
}
