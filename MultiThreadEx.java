class One extends Thread
{
    public void run()
    {
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside ONe  :: SHow");

        }
    }
}
class Two extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Inside Two  :: SHow");

        }
    }
}
class MultiThreadEx
{
    public static void main(String args[])
    {
        One t1= new One();
        Two t2= new Two();
        t1.start();
        t2.start();
    }
}