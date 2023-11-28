class RecEx
{
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        //RecEx re = new RecEx();
        System.out.println(fact(5));
    }
}