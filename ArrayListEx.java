import java.util.*;
class ArrayListEx
{
    public static void main(String args[])
    {
     
        Vector vc = new Vector(2,5);
        vc.add(new Integer(10));
        vc.add(new Float(20.0f));
       // vc.add(new String("Raghu"));
        System.out.println(vc);
        System.out.println(vc.size());
        System.out.println(vc.capacity());
    }
}