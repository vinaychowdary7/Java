class OverloadinExample
{
    OverloadinExample(int x)
    {
        System.out.println("Inside One INt param");
    }
    OverloadinExample(float x)
    {
        System.out.println("Inside One float param");
    }
    OverloadinExample(int x,int y)
    {
        System.out.println("Inside Two INt param");
    }
}

public class Overloading {

    public static void main(String args[])
    {
        OverloadinExample obj = new OverloadinExample(10.0f);
       // System.out.println(obj.add(10));
       // System.out.println(obj.add(10,40));


    }
    
}
