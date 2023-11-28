class ExLocalClass
{
    public static void main(String args[])
    {
        class LocalClass{
            int x;
            LocalClass(int a)
            {
                x=a;
            }
            public void display()
            {
                System.out.println("The cube of x is"+Math.pow(x,3));
            }

        }
        LocalClass lc = new LocalClass(10);
        lc.display(); 
    }
}