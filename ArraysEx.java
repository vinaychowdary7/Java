import java.util.*;
class ArraysEx
{
    public static void main(String args[])
    {
        char ch[]={'f','s','t','a'};
        Arrays.sort(ch);
        displayChar(ch);
        
    }
    public static void displayChar(char a[])
    {
        for(char x:a)
        {
            System.out.print(x+" ");
        }
    }
}