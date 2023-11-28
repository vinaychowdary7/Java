interface Demo
{  
    abstract public void display();  
    public int sum(int x, int y);
    
}  
class DemoT implements  Demo
{  
    public void display()
    {  
        System.out.println("Hello, It is Interface Method");
    }  
    public int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {  
        DemoT d = new DemoT();  
        d.display();  
        System.out.println("The sum of given numbers is:" +d.sum(10,15));
    }  
}
