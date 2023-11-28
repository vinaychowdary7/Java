class Outer
{
    private int l;
    private int w;
    Outer(int x,int y)
    {
        this.l=x;
        this.w=y;
    }
    public int area()
    {
        return l*w;
    }
    public void displayOutter()
    {
        Inner inr = new Inner();
        inr.dispalyInner();
    }

    class Inner
    {
        int rate=10;
        int per= 2*(l+w);
        int fencecost = rate*per;
        void dispalyInner()
        {
            System.out.println("Fencing cost is "+fencecost);
        }
    }
}
class NestedClass
{
    public static void main(String args[])
    {
        Outer outr = new Outer(4, 5) ;
        outr.displayOutter();
        System.out.println("Area is "+outr.area());

    }
    
}
