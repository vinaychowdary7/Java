class CallByValue
{
    public int updateValue(int x)
    {
        return x+2;
    }

}

class CallByRef{
    int x;
    CallByRef(int a)
    {
        x=a;
    }
    public int updateValue(CallByRef obj)
    {
        return obj.x+2;
    }


}
public class CallByValAndRef
{
    public static void main(String args[])
    {
        CallByValue cbv= new CallByValue();
        System.out.println("The value of x after function call is "+cbv.updateValue(10));
        CallByRef obj = new CallByRef(10);
        System.out.println("Address of Obj"+obj);
        System.out.println("Call By Ref"+obj.updateValue(obj));
    }
}