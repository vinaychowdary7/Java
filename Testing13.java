@FunctionalInterface  
interface HelloMes
{
    public abstract  void getHello();
    
}
class Testing13
{
    public static void main(String args[])
    {
        Testing13 obj = new Testing13();   
    }
    public void getHello()
    {
        System.out.println("Hello mesage");
    }
}