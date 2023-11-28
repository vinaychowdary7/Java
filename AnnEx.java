class Polygon
{
    public void display()
    {
        System.out.println("Inside Polygon");
    }
}
class AnnEx
{
    public static void main(String args[])
    {
        Polygon first = new Polygon();
        first.display();

        Polygon p1 = new Polygon(){
            public void display()
            {
                System.out.println("Inside Anonymous Polygon");
            }
        };
        p1.display();
    }
}