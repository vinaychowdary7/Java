class NestFunEx
{
    public  void funn()
    {
        System.out.println("Inside Fun N");
    }
    public  void funm()
    {
        funn();
        System.out.println("Inside Fun M");
    }

    public static void main(String args[])
    {
        NestFunEx nf = new NestFunEx();
        nf.funm();
    }
}