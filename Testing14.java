class HelloTest
{
    public void getInfo()
    {
        System.out.println("Super Hello");
    }
}
class Testing14 extends HelloTest
{
    @Override
    public void getInfo()
    {
        System.out.println("Base Hello");
    }
    public static void main(String args[])
    {
        Testing14 obj = new Testing14();
        obj.getInfo();
        obj.getInfo();
    }
}