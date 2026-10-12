import java.util.Scanner;

public class CelsiusToFarhenheight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celsius value");
        double celsius = sc.nextDouble();
        double farhenheight = (celsius * 9/5) + 32;
        System.out.println("The farhenheight value is : " + farhenheight);

    }
}
