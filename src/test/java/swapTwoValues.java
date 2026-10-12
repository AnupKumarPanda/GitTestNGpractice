import org.testng.annotations.Test;

public class swapTwoValues {
    @Test
    public void swapTwoValues()
    {
        int a =10;
        int b = 20;
        System.out.println("Variables Before Swappings are "+"a : "+ a +", b : " + b);
        a = a + b; // 30
        b = a - b; // 20-30 = 10
        a = a - b; // 30-10 = 20
        System.out.println("Variables After Swapping the values are " + "a :"+ a + ", b : " +b);
    }
}
