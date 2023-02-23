import java.util.*;
class B
{
 void data()
{
  Scanner sc =new Scanner(System.in);
  String name,branch;
  name=sc.next();
  branch=sc.next();
  System.out.println("Name is:"+name);
  System.out.println("Branch is:"+branch);
  sc.close();
}
}
class C
{
    public static void main(String args[])
    {
      B k=new B();
      k.data();
    }
}