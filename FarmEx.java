class Farm
{
    int width;
    int height;
    public int area()
    {
        return width*height;
    }
}
public class FarmEx
{
    public static void main(String args[])
    {
        Farm f1= new Farm();
        f1.width=20;
        f1.height =30;
        System.out.println("Area of obj1:"+f1.area());
        Farm f2= new Farm();
        f2=f1;
        System.out.println("Area of obj2:"+f2.area());
        f1.width=90;
        System.out.println("Area of obj2:"+f2.area());
    }
}