public class pattrens {
    public static void main(String[] args)
    {
        int n=4;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=n-i+1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }    
}
