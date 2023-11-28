class Table
{
    public  void showTable(int n)
    {
            synchronized(this)
            {
                for (int i = 1; i < 5; i++) {
                    System.out.println(n + "*" + i + "=" + n * i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             }
        }
    }

class ThreadSynOne extends Thread
{
    Table t;
    ThreadSynOne(Table t)
    {
        this.t =t;
    }
    public void run()
    {
        t.showTable(5);
    }
}
class ThreadSynTwo extends Thread
{
    Table t;
    ThreadSynTwo(Table t)
    {
        this.t =t;
    }
    public void run()
    {
        t.showTable(9);
    }
}
public class MainSyncThread
{
    public static void main(String args[])
    {
        Table t = new Table();
        ThreadSynOne one = new ThreadSynOne(t);
        ThreadSynTwo two =new ThreadSynTwo(t);
        one.start();
        two.start();
    }
}



