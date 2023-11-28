class ExceptionTest
{
    public static void main(String args[])
    {
        try {
            int a[]={1,2};
            
            try{
                int x=10/0;
            }
            catch(ArithmeticException e)
            {
                e.printStackTrace();
            }  
            System.out.println(a[10]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        
        System.out.println("Next line ");
    }
}