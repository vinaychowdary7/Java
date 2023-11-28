class OuterClass
{
    private int x=10;
    class InnerClass
    {
        public void display()
        {
            System.out.println("Inside Inner class value of x is"+x);
        }
    }

    public static void main(String args[])
    {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner  = outer.new InnerClass();
        inner.display();
    }
}