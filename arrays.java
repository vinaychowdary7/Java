import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[20][20];
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i  =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }   
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int key = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==key)
                {
                    System.out.print("element is found at:"+i+" "+j);
                }
            }
        }
        sc.close();
    }    
}
