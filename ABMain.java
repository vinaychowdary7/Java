class A
{
    public void m()
    {
        System.out.println("Inside M");
    }
    
    public void n()
    {
        System.out.println("Inside N");
    }
}
class B extends A
{
    public void p()
    {
        System.out.println("Inside P");
    }
}
class ABMain
{
    public static void main(String args[])
    {
        A obj= new B();
        obj.n();
    }
}