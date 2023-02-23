import java.util.*;

public class functions {
    public static void fact(int n) {
            int sum=1;
            for(int i=n;i>=1;i--)
            {
                sum=sum*i;
            }
            System.out.println(sum);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
        sc.close();
    }    
}
