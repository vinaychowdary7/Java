interface Hello
{
    public abstract void getInfo();

    default  void getDetails()
     {
         System.out.println("Dummy message");
     }
}
class Testing12 implements Hello{

    // public void getDetails()
    // {
    //     System.out.println("Original message");
    // }

    public void getInfo()
    {
        System.out.println("Hello message");
    }
    public static void main(String args[])
    {
        Testing12 obj = new Testing12();
        obj.getInfo(); 
        obj.getDetails();
    }

}