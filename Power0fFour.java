import java.util.*;
public class Power0fFour
{
    public static void main(String args[])
    {
        int a=12;
        if((a&(a-2))==0)
        {
        System.out.println("Power of 4");
        }
        else
        {
        System.out.println("Not a Power of 4");
        }
    }    
}
