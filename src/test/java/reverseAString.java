import org.testng.annotations.Test;

public class reverseAString
{
    @Test
    public void reverASting()
    {
        String s1 = "Hello World";
        String reverseSting = "";
        for(int i = 0; i< s1.length() ; i++)
        {
            reverseSting = s1.charAt(i) + reverseSting;
        }
        System.out.println("Reverse of the string is: " + reverseSting);
    }
}
