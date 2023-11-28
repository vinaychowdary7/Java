class ArrEx
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        display(arr);
        
    }
    public static void display(int a[])
    {
        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }

        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }

}